package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
	
//This is the hash and the file and code   
	       

	@RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException{

    	String data = "Hello Batthew Bartrum!";
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data.getBytes());
        byte[] hash = md.digest();      

        return "<p>data:"+data + "This is SHA256"  + hash;
    
	

}
}


