package IDao.Dao;

import IDao.IUserDao;

/**
 * Created by d on 2017/5/10.
 */
public class UserDao implements IUserDao{

    @Override
    public boolean Add(String a) {
        //操作数据库，返回值
        System.out.println("dao使用成功");
        System.out.println("获取传入的值是"+a);
        return true;
    }
}
