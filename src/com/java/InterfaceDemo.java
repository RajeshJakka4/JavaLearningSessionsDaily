package com.java;

class B implements A{
	public void a() {
		System.out.println("i am a");
	}
	public void b() {
		System.out.println("i am b");
	}
	public void c() {
		System.out.println("i am c");
	}
	public void d() {
		System.out.println("i am d");
	}
}
public class InterfaceDemo {
	
	public static void main(String...args) {
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
