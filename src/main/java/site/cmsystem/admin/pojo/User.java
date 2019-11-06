package site.cmsystem.admin.pojo;

public class User {
    private int id;
    private String username;
    private String password;
    private String phone;
    private String realname;
    private String email;
    private Integer role_id;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public User(String username,String password,String phone,String realname,String email,Integer role_id){
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.realname = realname;
        this.email = email;
        this.role_id = role_id;
    }

    @Override
    public String toString(){
        return "User{" +
                "userId=" + id +
                ", UserName='" + username + '\'' +
                ", PassWord='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", role_id='" + role_id + '\'' +
                '}';
    }

    public Integer getRole_id(){
        return role_id;
    }
}
