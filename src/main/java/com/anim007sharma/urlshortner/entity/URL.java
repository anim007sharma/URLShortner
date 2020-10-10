package com.anim007sharma.urlshortner.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("url")
public class URL {
	
	@Id
	private String id;
	private String originalUrl;
	private String shortUrl;
	private Date createdDate;
	private Date expiredDate;
	
	public URL(String originalUrl, String shortUrl, Date createdDate, Date expiredDate) {
		this.originalUrl = originalUrl;
		this.shortUrl = shortUrl;
		this.createdDate = createdDate;
		this.expiredDate = expiredDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	

}
