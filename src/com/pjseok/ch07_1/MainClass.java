package com.pjseok.ch07_1;

import java.net.Socket;

import Test.Solider;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		// 부코클래스에서 상속 받은 필드 값을 초기화
		dmbCellPhone.model = "갤럭시폰";
		dmbCellPhone.color = "검정";
		
		// 부모클래스 선언되어 있는 메소드 호출 가능
		dmbCellPhone.receiveVoice("여보세요"); //부모 클래스 선언되어 있는 메소드 호출 가능
		
		CameraCellPhone cameraCellPhone = new CameraCellPhone();
		cameraCellPhone.model = "아이폰";
		
		People people = new People("홍길동","881102-1234567");
//		People people2 = new People(); 부모클래스에서 private 지정 접근자로 
		Student student = new Student("이순신", "991102-1234567");
		
		
		//student.phone 부모클래세으세ㅓ private 접근 지정된 필드는 자식클래스에서서 불러올 수 없다. 
		Solider solider = new Solider("김유신","001111-12345667");
		solider.name = "강감찬";
		
		people.printName();
		student.printName();
		solider.printName();
		
		People people1 = new Student("강감찬", "881231-1111111");
		People people2 = new Solider("권율", "991231-2222222");
		
		
	}

}
