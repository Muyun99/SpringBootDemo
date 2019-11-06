package site.cmsystem.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import site.cmsystem.admin.pojo.User;
import site.cmsystem.admin.service.UserService;

public class UserController {
    @Autowired
    UserService userService;


    //登录页面
    @GetMapping(value = "/login")
    public String login(){
        System.out.println("login!");
        return "login";
    }

    //注册页面
    @GetMapping(value = "/register")
    public String register(){
        System.out.println("register!");
        return "register";
    }


    @GetMapping(value = "/index")
    public String index(Model model,HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username == null) return "login";
        User user = new User(username,password);
        User u =  userService.checkUser(user);
        if(u == null) return "login";
        model.addAttribute("user",u);
        request.getSession().setAttribute("user",u);

        Integer role_id = u.getRole_id();


        if(role_id == 0)
            return "index_admin";
        else if(role_id == 1)
            return "index_teacher";
        else if(role_id == 2)
            return "index_student";
        else
            return "login";
    }

    @GetMapping(value = "/index1")
    public String index1(Model model,HttpServletRequest request){

        UserService userService = null;

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("mail");
        String type = request.getParameter("type");

        int role_id = -1;
        if(type.equals("教师"))
            role_id = 1;
        else if(type.equals("学生"))
            role_id = 2;

        if(role_id == -1)
            return "register";

        User newuser = new User(username,password,name,phone,mail,role_id);
        userService.addUser(newuser);

        model.addAttribute("user",newuser);
        request.getSession().setAttribute("user",newuser);


        if(role_id == 1)
            return "index_teacher";
        else if(role_id == 2)
            return "index_student";
        else
            return "register";
    }
}
