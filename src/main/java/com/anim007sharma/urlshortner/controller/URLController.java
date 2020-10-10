package com.anim007sharma.urlshortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import com.anim007sharma.urlshortner.service.URLService;


@RestController
@RequestMapping("/api/v1")
public class URLController {
	
	@Autowired
	private URLService urlService;

	@RequestMapping(value="get/{shortUrl}", method=RequestMethod.GET)
	public RedirectView getOriginalUrl(@PathVariable String shortUrl) {
		String originalUrl = urlService.convertToOriginalUrl(shortUrl);
		return new RedirectView(originalUrl);
	}
	
	@RequestMapping(value="/createUrl", method=RequestMethod.POST)
	public String createShortUrl(@RequestBody String originalUrl) {
		return urlService.convertToShortUrl(originalUrl);
	}

}
