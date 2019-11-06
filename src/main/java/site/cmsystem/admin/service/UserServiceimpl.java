package site.cmsystem.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.cmsystem.admin.dao.UserMapper;
import site.cmsystem.admin.pojo.User;

@Service
public class UserServiceimpl implements UserService{
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public User checkUser(User user){
        return userMapper.checkUser(user);
    }

    @Override
    public Integer addUser(User user){
        System.out.println(user.toString());
        return userMapper.addUser(user);
    }
}
