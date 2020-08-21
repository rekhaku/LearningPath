package com.tech.pandemic.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.ExceptionUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.pandemic.dto.LoginDTO;
import com.tech.pandemic.dto.UserRegistrationDTO;
import com.tech.pandemic.model.User;
import com.tech.pandemic.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private PasswordEncoder passwordEncoder;

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public long registerUser(UserRegistrationDTO userDTO) throws Exception {

		User user = new User();
		try {
			user.setEmail(userDTO.getUserName());
			user.setContactNo(userDTO.getContactNo());
			user.setUserName(userDTO.getUserName());
			user.setRole(userDTO.getRole());
			String encodedPwd = passwordEncoder.encode(userDTO.getPassword());
			user.setPassword(encodedPwd);
			user.setEmail(user.getUserName());
			user.setActiveInd(true);
			userRepository.save(user);
		} catch (Exception e) {
			Throwable cause = e.getCause();
			while (cause != null && !(cause instanceof SQLIntegrityConstraintViolationException)) {
				cause = cause.getCause();
			}
			throw new Exception(cause.getLocalizedMessage(), cause);
		}
		return user.getId();

	}

	@Override
	public User fetchUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void updateUser(long id, User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inactivateUser(User user) {
		user.setActiveInd(false);
		// org.springframework.security.core.userdetails.User userde = new
		// org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),false,false,false,false,null);
		userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(userName);

		if (user == null) {
			throw new UsernameNotFoundException(
					"User details does not exist in our repository.Kindly proceed with registration!!!");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				this.getGrantedAuthorities(user));

	}

	@Override
	public User validateLogin(LoginDTO loginUser) throws UsernameNotFoundException, Exception {
		UserDetails userFromRepository = loadUserByUsername(loginUser.getUserName());

		if (passwordEncoder.matches(loginUser.getPassword().trim(), userFromRepository.getPassword().trim())) {
//			logger.info("id from repo:<", userFromRepository.);
		} else {
			throw new Exception("Password is incorrect");
		}

		return populateUserDetails(userFromRepository);
	}

	public User populateUserDetails(UserDetails userDetails) {
		User user = new User();
		user.setUserName(userDetails.getUsername());
		user.setPassword(userDetails.getPassword());
		user.setActiveInd(userDetails.isEnabled());
		return user;
	}

	public List<GrantedAuthority> getGrantedAuthorities(final User user) {
		List<GrantedAuthority> role_name = new ArrayList<GrantedAuthority>();
		role_name.add(new GrantedAuthority() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String getAuthority() {
				// TODO Auto-generated method stub
				return user.getRole();
			}
		});
		return role_name;
	}
}
