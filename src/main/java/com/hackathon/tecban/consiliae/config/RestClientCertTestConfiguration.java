package com.hackathon.tecban.consiliae.config;

import java.util.function.Supplier;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

public class RestClientCertTestConfiguration {

    private char[] allPassword = "allpassword".toCharArray();

    public RestTemplate restTemplate(RestTemplateBuilder builder) throws Exception {

        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadKeyMaterial(ResourceUtils.getFile("classpath:cert/client_certificate.crt"), allPassword, allPassword)
                .loadTrustMaterial(ResourceUtils.getFile("classpath:cert/client_private_key.key"), allPassword)
                .build();

        HttpClient client = HttpClients.custom()
                .setSSLContext(sslContext)
                .build();

        return builder
                .requestFactory((Supplier<ClientHttpRequestFactory>) new HttpComponentsClientHttpRequestFactory(client))
                .build();
    }
}