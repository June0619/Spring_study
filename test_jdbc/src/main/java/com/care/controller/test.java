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
//		System.out.println("���ٽ� ���� + "+ob);
//		b.test("���� �μ�");
//		
//		/*TestInter2 b = new TestInter2() {
//			public void test(Object ob) {
//				System.out.println("�������̽�2 ����"+ob);
//			}
//		};
//		b.test("Object");*/
//		
//		TestInter a = ()->System.out.println("���ٽ� ����");
//		a.test();
//		/*TestInter a = new TestInter() {
//			public void test() {
//				System.out.println("�������̽� ����");
//			}
//		};*/
//	}
//}