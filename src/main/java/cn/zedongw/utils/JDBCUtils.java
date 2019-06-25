package cn.zedongw.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @Author ZeDongW
 * @ClassName JDBCUtils
 * @Description 数据库连接工具
 * @Version 1.0
 * @date ：Created in 2019/6/24 0024 20:05
 * @modified By：
 */

public class JDBCUtils {
    //DBUtil对象
    private static QueryRunner queryRunner;

    //初始化数据库
    static {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        queryRunner = new QueryRunner(dataSource);
    }

    /**
     * @Author: ZeDongW
     * @Description: 获取DBUtil对象
     * @Date: 2019/6/24 0024 20:06
     * @Param: []
     * @return: org.apache.commons.dbutils.QueryRunner
     */
    public static QueryRunner getQueryRunner(){
        return queryRunner;
    }
}
