package com.pjseok.ch07_1;

// 부모클래스
public class People {
	
	// 다른 패키지에 있는 클래스가 다른 패키지의 클래스를 상속받을 때 public 명시하지 않은 필드는 사용할 수 없다.
	public String name; // 이름
	public String ssn; // 주민번호
	private String phone; //
	
	public People(String name, String ssn) { // 필드를 초기화하는 생성자
		//super();
		this.name = name;
		this.ssn = ssn;
	}
	
	public void printName () {
		System.out.println("이름 : "+this.name);
	}

//	public People() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	
}
