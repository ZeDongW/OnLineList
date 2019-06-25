package cn.zedongw.dao;

import cn.zedongw.entity.Students;

import java.util.List;

/**
 * 学生类数据访问层接口
 */
public interface IStudentDao {
    /**
     * @Author: ZeDongW
     * @Description: 查找所有学生
     * @Date: 2019/6/25 0025 6:20
     * @Param: []
     * @return: java.util.List<cn.zedongw.entity.Students>
     */
    List<Students> getAllStudents();
}
