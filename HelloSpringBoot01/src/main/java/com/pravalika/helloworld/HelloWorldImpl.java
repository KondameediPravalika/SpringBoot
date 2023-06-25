package com.pravalika.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldImpl {

	@RequestMapping(value = "/")
	public String getHelloWorld() {
		return "Good Morning Pravalika";
	}
}

// HelloWorldImpl obj=new HelloWorldImpl(); ==> @RestController
// obj.getHelloWorld(); ==> "Hi Good Morning Every One" ==> @RequestMapping(value="/")


//in these manually we wrote bootstrap class
//pom.xml
//business logic
//* always run these program from bootstrap class

//by default tomcat will start