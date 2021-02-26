package edu.bit.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bit.ex.mapper.UserMapper;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

	@Autowired
	private BCryptPasswordEncoder passEncoder;

	@Autowired
	private UserMapper userMapper;

	@Transactional(rollbackFor = Exception.class)
	public void addUser(UserVO userVO) {
		String password = userVO.getPassword();
		String encode = passEncoder.encode(password);

		userVO.setPassword(encode);

		userMapper.insertUser(userVO);
		userMapper.insertAuthorities(userVO);
	}
}