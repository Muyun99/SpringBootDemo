package site.cmsystem.admin.dao;

import org.apache.ibatis.annotations.Param;
import site.cmsystem.admin.pojo.User;

public interface UserMapper {
    User checkUser(@Param("user") User user);
    User checkManager(@Param("user") User user);
    Integer addUser(@Param("user") User user);
}
