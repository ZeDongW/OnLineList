package cn.zedongw.entity;

/**
 * @Author ZeDongW
 * @ClassName Students
 * @Description 学生实体类
 * @Version 1.0
 * @date ：Created in 2019/6/24 0024 20:14
 * @modified By：
 */

public class Students {

    private int id;  //学生编号

    private String name;  //学生姓名

    private int age; //学生年龄

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
