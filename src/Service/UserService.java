package Service;

import IDao.Dao.UserDao;
import IDao.IUserDao;

/**
 * Created by d on 2017/5/10.
 */
public class UserService {

    public boolean Add(String a) {
    System.out.println("Service使用成功");
    boolean re;
        IUserDao userDao = new UserDao();
        re=userDao.Add(a);
    return re;
}
}
