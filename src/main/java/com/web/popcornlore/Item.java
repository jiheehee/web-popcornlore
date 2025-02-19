package com.web.popcornlore;

import jakarta.persistence.*;

@Entity // @Entity를 붙이면 item이라는 이름으로 테이블을 하나 생성해줌 -> jpa 라이브러리를 사용한 것
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    //id 컬럼에는(PK값) @Id 꼭 붙이기
//    @GeneratedValue(strategy = GenerationType.IDENTITY) -> id 값을 1씩 증가시켜서 넣어줌

    @Column(nullable = false)  //제약조건 설정하는 것 -> ex) 이 컬럼 비어있으면 테이블에 입력 막아주세요 =
    public String title;   //title 컬럼 추가
    public Integer price;

//    var object = new inform();



}
