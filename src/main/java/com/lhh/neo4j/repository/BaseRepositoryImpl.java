package com.lhh.neo4j.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.neo4j.ogm.cypher.BooleanOperator;
import org.neo4j.ogm.cypher.ComparisonOperator;
import org.neo4j.ogm.cypher.Filter;
import org.neo4j.ogm.cypher.Filters;
import org.neo4j.ogm.cypher.query.Pagination;
import org.neo4j.ogm.cypher.query.SortOrder;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.lhh.neo4j.domain.Neo4jBaseModel;

@Repository
public class BaseRepositoryImpl<T extends Neo4jBaseModel> {
	
	@Autowired Session session;
	
	public Page<T> findPage(Class<T> clazz, Pageable pageable, String keyword) {
		Collection<T> data = null;
		Filter[] filters = null;
		
		if(StringUtils.isNotBlank(keyword)) {
			keyword = ".*"+keyword +".*";
			Filter codeFilter = new Filter("code",keyword);
			codeFilter.setComparisonOperator(ComparisonOperator.MATCHES);
			Filter nameFilter = new Filter("name",keyword);
			nameFilter.setComparisonOperator(ComparisonOperator.MATCHES);
			nameFilter.setBooleanOperator(BooleanOperator.OR);
			filters = new Filter[]{codeFilter, nameFilter};
		}
		if(filters!=null && filters.length>0) {
			
			data = session.loadAll(clazz, 
					new Filters().add(filters),
					convert(pageable.getSort()), 
					new Pagination(pageable.getPageNumber(), pageable.getPageSize()));
			
		} else {
			
			data = session.loadAll(clazz, 
					convert(pageable.getSort()), 
					new Pagination(pageable.getPageNumber(), pageable.getPageSize()));
			
		}
		
		return updatePage(pageable, new ArrayList<T>(data));
	}
    /*
     * Converts a Spring Data Sort object to an OGM SortOrder
     */
    private SortOrder convert(Sort sort) {

        SortOrder sortOrder = new SortOrder();

        if (sort != null) {
            for (Sort.Order order : sort) {
                if (order.isAscending()) {
                    sortOrder.add(order.getProperty());
                } else {
                    sortOrder.add(SortOrder.Direction.DESC, order.getProperty());
                }
            }
        }
        return sortOrder;
    }
	/*
     * This is a cheap trick to estimate the total number of objects without actually knowing the real value.
     * Essentially, if the result size is the same as the page size, we assume more data can be fetched, so
     * we set the expected total to the current total retrieved so far + the current page size. As soon as the
     * result size is less than the page size, we know there are no more, so we set the total to the number
     * retrieved so far. This will ensure that page.next() returns false.
     */
    private Page<T> updatePage(Pageable pageable, List<T> results) {
        int pageSize = pageable.getPageSize();
        int pageOffset = pageable.getOffset();
        int total = pageOffset + results.size() + (results.size() == pageSize ? pageSize : 0);

        return new PageImpl<T>(results, pageable, total);
    }
}
