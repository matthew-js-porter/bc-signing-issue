package com.example.bc_signing_issue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;

@SpringBootApplication
public class BcSigningIssueApplication {

	public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
		Security.addProvider(new BouncyCastleProvider());
		Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
		SpringApplication.run(BcSigningIssueApplication.class, args);
	}

}
