package com.care.controller;

interface TestInter{
	public void test();
}
interface TestInter2{
	public void test(Object ob);
}

//public class test {
//	public static void main(String[] args) {
//		
//		TestInter2 b = (ob)->
//		System.out.println("람다식 실행 + "+ob);
//		b.test("람다 인수");
//		
//		/*TestInter2 b = new TestInter2() {
//			public void test(Object ob) {
//				System.out.println("인터페이스2 실행"+ob);
//			}
//		};
//		b.test("Object");*/
//		
//		TestInter a = ()->System.out.println("람다식 실행");
//		a.test();
//		/*TestInter a = new TestInter() {
//			public void test() {
//				System.out.println("인터페이스 실행");
//			}
//		};*/
//	}
//}
