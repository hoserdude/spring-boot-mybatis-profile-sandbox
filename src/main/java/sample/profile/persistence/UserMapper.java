package sample.profile.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import sample.profile.domain.User;

public interface UserMapper {
	@Select("SELECT * FROM user WHERE id = #{userId}")
	public User getUser(long userId);

    @Insert("insert into user (email, userName) values(#{email}, #{userName})")
    public int addUser(User user);
}
