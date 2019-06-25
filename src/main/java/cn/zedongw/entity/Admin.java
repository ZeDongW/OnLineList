package cn.zedongw.entity;

import java.util.Objects;

/**
 * @Author ZeDongW
 * @ClassName Admin
 * @Description 管理员实体对象
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 6:14
 * @modified By：
 */

public class Admin {

    private int id;  //管理员编号

    private String userName;  //管理员用户名

    private String passWord; //管理员密码

    public Admin() {
    }

    public Admin(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Admin(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return userName.equals(admin.userName) &&
                passWord.equals(admin.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord);
    }
}
