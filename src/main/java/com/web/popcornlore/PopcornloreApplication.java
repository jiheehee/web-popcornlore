package com.web.popcornlore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopcornloreApplication {

	// 1. return 값에 대하여
	public static void main(String[] args) {

//		자료형 함수(){ 	~> 자료형은 return값의 자료형, return값이 없을땐 void
//			로직~
//			로직~
//			return @@

//		}

		SpringApplication.run(PopcornloreApplication.class, args);

		String animal="돌고래!!";
		//System.out.println(animal);

		// 2. class에 대하여
		// var test = new Test(); -> 방법1 (var는 어떤 자료형이든 다 포괄하는? 역할)
		Test test = new Test(); // -> 방법2 (Test는 class인데, class도 일종의 자료형의 역할을 함)
		System.out.println(test.name);

		// 2-1. class 실습
		//Friend friend = new Friend();
//		System.out.println(friend.friendName);
//		System.out.println(friend.friendAge);

		// 2-2. parameter 실습
		new Friend("jang"); // -> new Friend를 뽑아 주세요, 근데 파라미터 자리에(구멍 자리에) jang인 것으로
		var testParameter=new Friend("jang");
		System.out.println(testParameter.name);
	}


}
	// 2 class의 부분
	// class를 쓰는 이유
	// 1) class는 변수, 함수 보관함임
	// 2) class의 변수, 함수 쓰려면 new클래스()로 복사해서(본사본을 만들어서->이렇게 만든게 새로운 보관함) 써야함

	// Q) 왜 class를 쓰는 것임?
	// -> 1) Java는 클래스를 강요하기 때문!
	// -> 2) 관련있는 변수, 함수들 한 곳에 정리 가능함
	// -> 3) 중요한 변수, 함수 원본 지킬 수 있음

	class Test {
		String name = "Kim";
		void hello(){
			System.out.println("Kim class입니다");
		}
	}

// 2-1. 실습1 _ 친구1의 이름과 나이를 변수로 저장하려면?
class Friend {
	String name = "장하리";
	int friendAge = 24;
//	Friend(){  // 슈퍼 울트라 스페셜 함수~! / 위에서 new Friend() 할 때 자동실행 됨
	// 이 스페셜 함수를 constructor 이라고 부름 !
	// constructor 사용은 object를 뽑을 때 초기값을 맘대로 뽑을 수 있음

	//	this.name = "jang"; //새로 생성될 object에 name 변수에는 jang을 넣어주세요
		// 이렇게 하는 것의 장점은 -> 잘 쓰면 매번 다른 변수값으로 object 뽑을 수 있음
		Friend(String 구멍){
			this.name=구멍;
		}
}


//}
class Friend2 {
	String friendName = "하지수";
	int friendAge = 25;
}


// 요악
//1. class는 변수, 함수 보관함
//2. class에 있던 변수, 함수 쓰려면 복사본 부터 만들면 됨!
//		-> 그러면 clss 안에 있던 변수랑 함수가 복사가 되기 때문에 갖다 쓸 수 있음
//		=> 이거를 object라고 부름
//		-> 가져다 쓰는 방법은 object.변수명 ex) test.name
//3. object를 뽑을 때 마다 각각 다른 값을 부여 하고 싶다?
//	-> constructor, this, 파라미터 사용 가능