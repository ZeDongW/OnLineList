package cn.zedongw.service;

import cn.zedongw.entity.Admin;

/**
 * @Author: ZeDongW
 * @Description: 管理员业务逻辑层接口
 * @Date: 2019/6/25 0025 6:54
 * @Param:
 * @return:
 */
public interface IAdminService {
    /**
     * @Author: ZeDongW
     * @Description: 根据用户名密码查找管理员
     * @Date: 2019/6/25 0025 6:57
     * @Param: [admin]
     * @return: cn.zedongw.entity.Admin
     */
    Admin findAdByUNAndPwd(Admin admin);
}
