package com.example.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserInfo;

@Repository
@Transactional
public interface UserDetailsRepository extends CrudRepository<UserInfo, String> {
	public UserInfo findByUserNameAndEnabled(String userName, short enabled);

	public List<UserInfo> findAllByEnabled(short enabled);

	public UserInfo findById(Integer id);

	@Override
	public UserInfo save(UserInfo userInfo);

	public void deleteById(Integer id);
}
