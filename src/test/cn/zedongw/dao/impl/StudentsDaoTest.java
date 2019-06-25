package cn.zedongw.dao.impl;

import cn.zedongw.dao.IStudentDao;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsDaoTest {
    IStudentDao dao = new StudentsDao();
    @Test
    public void getAllStudents() {
        System.out.println(dao.getAllStudents());
    }
}