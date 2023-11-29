package com.pjseok.ch07_1;

public class Student extends People{
	
	String grade; //학년
	String studentNum; //학번
	
	public Student(String name, String ssn) {
		super(name, ssn); // 부모 생성자 호출
		// TODO Auto-generated constructor stub
	}
	
	@Override // annotation : 명시, 주석문과 비슷한 개념
	public void printName() {
		System.out.println("학생이름 : "+this.name);
		//super.printName();
	}
	
	
}
