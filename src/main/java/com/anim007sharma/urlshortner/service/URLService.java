package com.anim007sharma.urlshortner.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class URLService {
	 
//	@Autowired
//	private URLRepository repo;
	@Autowired
	private RedisTemplate<String, String> template;
//	public String covertToShortUrl(String originalUrl) {
//		String hashedUrl = DigestUtils.sha256Hex(originalUrl);
//		String shortUrl = hashedUrl.substring(0, 5);
//		Calendar cal = Calendar.getInstance();
//		Date created = cal.getTime();
//		cal.add(Calendar.DATE, 3);
//		Date expired = cal.getTime();
//		URL url = new URL(originalUrl, shortUrl, created, expired);
//		repo.save(url);
//		return shortUrl;
//	}
//	public String convertToOriginalUrl(String shortUrl) {
//		
//	}
	
	public String convertToShortUrl(String originalUrl) {
		String hashedUrl = DigestUtils.sha256Hex(originalUrl);
		String shortUrl = hashedUrl.substring(0, 5);
		System.out.println(hashedUrl);
		template.opsForValue().set(shortUrl, originalUrl);
		return shortUrl;
	}
	public String convertToOriginalUrl(String shortUrl) {
		String originalUrl = template.opsForValue().get(shortUrl);
		return originalUrl;
	}
}
