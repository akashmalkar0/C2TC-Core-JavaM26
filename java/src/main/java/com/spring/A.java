package com.spring;

public class A {
	private static final A obj = new A();

	private A() {
		System.out.println("Private constructor");
	}

	public static A getA() {
		System.out.println("Factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hello user");
	}
}
