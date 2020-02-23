package com.rampage.javacore.java8.defaultmethod;

public interface Interface1 {
	default void defaultMethod() {
		System.out.println("Interface1#sameMethod");
		/**
		 * TIPS:
		 * 4. 接口中的default方法可以调用该接口的static方法，但是接口的static方法不能调用该接口的default方法
		 */
		staticMethod();
		Interface2.staticMethod();
	}
	
	static void staticMethod() {
		// defaultMethod();		// Cannot make a static reference to the non-static method defaultMethod() from the type Interface1
		System.out.println("Interface1#staticMethod");
	}
}
