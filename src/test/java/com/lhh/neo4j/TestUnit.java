package com.lhh.neo4j;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lhh.neo4j.domain.common.NUnit;
import com.lhh.neo4j.repository.NUnitRepository;

@ContextConfiguration(locations = { "classpath:spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUnit {
	@Resource
	private NUnitRepository nUnitRepository;
	@Test
	public void test() {
//		List<NUnit> list = nUnitRepository.findSuppliers("430002");
//		System.out.println(list);
//		if(list==null || list.size()==0) return;
//		for (NUnit nUnit : list) {
//			System.out.println(nUnit.getName());
//		}
		System.out.println("OK");
	}
}
