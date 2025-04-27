package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@SpringBootApplication
@RestController //Will allow the main class to handle the Web requests
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	
	@GetMapping("/hash")
	public String getChecksum() {
		String data = "Hello World Check Sum!";
		String checksum = "";

		try {
			// SHA-256 is the hashing algorithm we're using
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = sha.digest(data.getBytes(StandardCharsets.UTF_8));

			// Convert the bytes to a readable hex string
			StringBuilder hex = new StringBuilder();
			for (byte b : hashBytes) {
				hex.append(String.format("%02x", b));
			}

			checksum = hex.toString();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}

		return "Original Data: " + data + "<br>SHA-256 Checksum: " + checksum;
	}
}


