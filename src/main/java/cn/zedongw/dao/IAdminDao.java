package cn.zedongw.dao;

import cn.zedongw.entity.Admin;

/**
 * 管理员数据访问层接口
 */
public interface IAdminDao {
    /**
     * @Author: ZeDongW
     * @Description: 根据用户名密码查找管理员
     * @Date: 2019/6/25 0025 6:46
     * @Param: [admin]
     * @return: cn.zedongw.entity.Admin
     */
    Admin findAdByUNAndPwd(Admin admin);
}
