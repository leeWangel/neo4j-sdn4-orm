package com.lhh.neo4j;

import org.neo4j.ogm.session.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by yejia on 2016/9/18.
 */
@Configuration
@EnableNeo4jRepositories("com.lhh.neo4j.repository")
@EnableTransactionManagement
public class AplicationConfiguration extends Neo4jConfiguration {
	private static final Logger log = LoggerFactory.getLogger(AplicationConfiguration.class);
	public AplicationConfiguration() {
		log.info("QdyxConfiguration loaded.");
	}
    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.lhh.neo4j.domain");
    }
    
}
