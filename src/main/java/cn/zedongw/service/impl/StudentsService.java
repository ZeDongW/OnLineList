package cn.zedongw.service.impl;

import cn.zedongw.dao.IStudentDao;
import cn.zedongw.dao.impl.StudentsDao;
import cn.zedongw.entity.Students;
import cn.zedongw.service.IStudentsService;

import java.util.List;

/**
 * @Author ZeDongW
 * @ClassName StudentsService
 * @Description 学生类业务逻辑层接口实现
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 7:41
 * @modified By：
 */

public class StudentsService implements IStudentsService {
    //Dao 实例
    IStudentDao dao = new StudentsDao();
    @Override
    public List<Students> getAllStudents() {
        return dao.getAllStudents();
    }
}
