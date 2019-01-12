package com.amaduse.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @LocalServerPort
    private int port;
    private URL base;
    private String method;
    @Autowired
    private TestRestTemplate template;

    public void setUp() throws Exception{
        this.method = "index";
//        this.base = new URL("http://localhost"+this.port+"/"+method);
        this.base = new URL("http://localhost:8080/"+method);
    }

    @Test
    public void testMethod(){
        ResponseEntity<String> response = template.getForEntity(this.base.toString(),String.class);
        assertThat(response.getBody(), equalTo("Greetions from Spring Boot!"));
    }

    @Test
    public void contextLoads() {

    }

}

