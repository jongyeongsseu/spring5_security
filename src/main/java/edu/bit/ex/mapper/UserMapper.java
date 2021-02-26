package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Insert;

import edu.bit.ex.vo.UserVO;

// 클래스를 사용: 질의(쿼리) 수행
public interface UserMapper {
	@Insert("insert into users(username,password,enabled) values(#{username},#{password},#{enabled})")
	public int insertUser(UserVO userVO);

	@Insert("insert into AUTHORITIES (username,AUTHORITY) values(#{username},'ROLE_USER')")
	public void insertAuthorities(UserVO UserVO);
}
