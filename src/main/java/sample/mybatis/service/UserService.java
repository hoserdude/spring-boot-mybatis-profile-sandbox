package sample.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.mybatis.domain.User;
import sample.mybatis.persistence.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User userToAdd) {
        return userMapper.addUser(userToAdd);
    }

    public User getUser(int userId) {
        return userMapper.getUser(userId);
    }
}
