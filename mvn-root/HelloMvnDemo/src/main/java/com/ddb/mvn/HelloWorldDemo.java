package com.ddb.mvn;

public class HelloWorldDemo {
	public String sayHelloWorld() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		HelloWorldDemo helloWorldDemo = new HelloWorldDemo();
		System.out.println(helloWorldDemo.sayHelloWorld());
	}

}
