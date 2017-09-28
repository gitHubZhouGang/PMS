package com.redis;

/**
 * 用于存储Redis配置信息的实体Bean
 * 
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年9月28日 下午1:39:27
 */
public class MyRedisConfig {

	private String host;
	private Integer port;
	private String auth;
	private Integer dbIndex;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public Integer getDbIndex() {
		return dbIndex;
	}

	public void setDbIndex(Integer dbIndex) {
		this.dbIndex = dbIndex;
	}

}
