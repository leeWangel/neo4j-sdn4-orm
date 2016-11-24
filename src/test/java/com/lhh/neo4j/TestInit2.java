package com.lhh.neo4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lhh.neo4j.repository.NTestRepository;


public class TestInit2  extends TestBase{
	
	@Autowired private NTestRepository nTestRepository;
	
	@Test public void test(){
		System.out.println("----------->"+nTestRepository.count());
	}
}
