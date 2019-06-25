package cn.zedongw.dao.impl;

import cn.zedongw.dao.IAdminDao;
import cn.zedongw.entity.Admin;
import cn.zedongw.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @Author ZeDongW
 * @ClassName AdminDao
 * @Description 管理员数据访问层接口实现类
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 6:46
 * @modified By：
 */

public class AdminDao implements IAdminDao {
    /**
     * @Author: ZeDongW
     * @Description: 根据用户名密码查找管理员
     * @Date: 2019/6/25 0025 6:58
     * @Param: [admin]
     * @return: cn.zedongw.entity.Admin
     */
    @Override
    public Admin findAdByUNAndPwd(Admin admin) {
        //SQL
        String sql = "Select * from admin where userName = ? and passWord = MD5(?)";
        //获取DBUtil组件对象
        QueryRunner queryRunner = JDBCUtils.getQueryRunner();
        //执行查询并封装结果集返回
        try {
            return queryRunner.query(sql, new BeanHandler<>(Admin.class), admin.getUserName(), admin.getPassWord());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
