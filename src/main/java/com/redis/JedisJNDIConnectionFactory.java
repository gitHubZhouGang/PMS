package com.redis;

public class JedisJNDIConnectionFactory extends org.springframework.data.redis.connection.jedis.JedisConnectionFactory{
	
	private MyRedisConfig redisConfig;

	public MyRedisConfig getRedisConfig() {
		return redisConfig;
	}

	public void setRedisConfig(MyRedisConfig redisConfig) {
		//在这里把JNDI注入属性放到 JedisConnectionFactory中
		if(redisConfig != null) {
			setHostName(redisConfig.getHost());
			setPassword(redisConfig.getAuth());
			setPort(redisConfig.getPort());
		}
		this.redisConfig = redisConfig;
	}
	
}
