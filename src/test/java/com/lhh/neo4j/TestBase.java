package com.lhh.neo4j;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ContextConfiguration(classes = {QdyxConfiguration.class})
@ContextConfiguration(locations = { "classpath:spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class TestBase {
	
}
