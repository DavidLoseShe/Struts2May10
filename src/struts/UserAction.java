package struts;

import Service.UserService;
import com.opensymphony.xwork2.ActionSupport;



/**
 * Created by d on 2017/5/10.
 */
public class UserAction extends ActionSupport{
private String  username;//与表单 name 属性名 一样 即可获得 表单中  username数据

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String Add() {

        System.out.println("Action 使用成功");
       if( new UserService().Add(this.getUsername()))

        return "12";
       else  return "0" ;
    }
}
