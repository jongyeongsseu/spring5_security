package edu.bit.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserVO {
   private String username;
   private String password;
   private int enabled;
   
   // 아무 값도 존재하지 않으면 기본적으로 적용
   public UserVO(){
      this("user", "1111", 1);
   }
   
}