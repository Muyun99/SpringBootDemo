package site.cmsystem.admin.service;

import site.cmsystem.admin.pojo.User;

public interface UserService {
    User checkUser(User user);
    Integer addUser(User user);
}
