package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring-redis.xml") 
public class TestRedis {

	@Autowired
	RedisTemplate<String, String>  t;
	
	@Test 
	public void add(){
		t.opsForValue().set("TEST", "spring-data-redis-test-1");  
	}
}
