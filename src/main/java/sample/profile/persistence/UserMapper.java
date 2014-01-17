package sample.profile.persistence;

import org.apache.ibatis.annotations.Select;

import sample.profile.domain.User;

public interface UserMapper {
	@Select("SELECT * FROM users WHERE id = #{userId}")
	public User getUser(long userId);
}
