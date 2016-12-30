package com.ddb.mvn.demo;

import com.ddb.mvn.HelloWorldDemo;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class HelloMvnDemo {
	private String name;
	
	
	public HelloMvnDemo() {
		
	}
	public HelloMvnDemo(String name) { 
		super();
		this.name = name;
	}
	
	public String sayHello() {
		if (this.name !=null) {
			return "Hello Maven!" + "My name is " + this.getName();
		}
		return "Hello Maven!";
	}

	public static void main(String[] args) {
		HelloWorldDemo helloWorldDemo = new HelloWorldDemo();
		System.out.println("Hello Maven!");
		System.out.println(helloWorldDemo.sayHelloWorld());
	}


}
