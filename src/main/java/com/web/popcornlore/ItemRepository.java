package com.web.popcornlore;

import org.springframework.data.jpa.repository.JpaRepository;

// 1. repository만들기
public interface ItemRepository extends JpaRepository<Item, Long>{ //<Entity명,id컬럼타입>
    // 같은 이름의 class ItemRepository도 생성해줌
    // -> 이 클래스 안에는 DB입출력 하는 함수가 잔뜩 들어있음!

}

//2. 원하는 클래스에 repository 등록














