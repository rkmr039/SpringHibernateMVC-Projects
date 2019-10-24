package com.rishab.userservice;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserserviceApplicationTests {

	@LocalServerPort
	int randomServerPort;
	
	@Test
	public void getUdserByUsername() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = "http://localhost:" + randomServerPort + "/findByUsername/rishab";
		URI uri = new URI(baseUrl);
		try {
			ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
		} catch (HttpClientErrorException ex) {
			// Verify bad request and missing header
			Assert.assertEquals(400, ex.getRawStatusCode());
		}
		
	}

}
