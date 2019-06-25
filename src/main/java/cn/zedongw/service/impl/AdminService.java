package cn.zedongw.service.impl;

import cn.zedongw.dao.IAdminDao;
import cn.zedongw.dao.impl.AdminDao;
import cn.zedongw.entity.Admin;
import cn.zedongw.service.IAdminService;

/**
 * @Author ZeDongW
 * @ClassName AdminService
 * @Description 管理员业务逻辑层接口实现
 * @Version 1.0
 * @date ：Created in 2019/6/25 0025 6:55
 * @modified By：
 */

public class AdminService implements IAdminService {
    //实例化数据访问层
    IAdminDao dao = new AdminDao();
    /**
     * @Author: ZeDongW
     * @Description: 根据用户名密码查找管理员
     * @Date: 2019/6/25 0025 6:57
     * @Param: [admin]
     * @return: cn.zedongw.entity.Admin
     */
    @Override
    public Admin findAdByUNAndPwd(Admin admin) {
        return dao.findAdByUNAndPwd(admin);
    }
}
