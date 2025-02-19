package com.web.popcornlore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inform {

    private Integer age;
    private String name;

    public void 한살더하기(){
        this.age=this.age+1;
    }
    public void 나이설정(Integer a){
        if (a > 0 && a<=100) {
            this.age=a;
        }//else{
//            나이설정(age);
//        }
    }
}




