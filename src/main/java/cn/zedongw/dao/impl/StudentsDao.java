package cn.zedongw.dao.impl;

import cn.zedongw.dao.IStudentDao;
import cn.zedongw.entity.Students;
import cn.zedongw.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author ZeDongW
 * @ClassName StudentsDao
 * @Description 学生类数据访问层接口实现
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 6:20
 * @modified By：
 */

public class StudentsDao implements IStudentDao {
    /**
     * @Author: ZeDongW
     * @Description: 查找所有学生
     * @Date: 2019/6/25 0025 6:58
     * @Param: []
     * @return: java.util.List<cn.zedongw.entity.Students>
     */
    @Override
    public List<Students> getAllStudents() {
        //SQL
        String sql = "Select * from Students";
        //获取DBUtils工具类
        QueryRunner queryRunner = JDBCUtils.getQueryRunner();
        //执行查询并返回封装结果集
        try {
            return queryRunner.query(sql, new BeanListHandler<>(Students.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
