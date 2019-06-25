package cn.zedongw.service;

import cn.zedongw.entity.Students;

import java.util.List;

/**
 * 学生类业务逻辑层接口
 */
public interface IStudentsService {
    /**
     * @Author: ZeDongW
     * @Description: 查询所有学生
     * @Date: 2019/6/25 0025 7:41
     * @Param: []
     * @return: java.util.List<cn.zedongw.entity.Students>
     */
    List<Students> getAllStudents();
}
