package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.struts2.interceptor.validation.SkipValidation;

import service.UsersDAO;
import serviceimpl.UsersDAOImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

public class UsersAction extends SuperAction implements ModelDriven<Users> {
	
	private Users user= new Users();
	
	private static final long serialVersionUID = 1L;
	
    //添加学生动作
    public String register() throws ParseException
    {
    	UsersDAO udao = new UsersDAOImpl();
    	Users u = new Users();
    	u.setUserName(request.getParameter("userName"));
    	u.setPassword(request.getParameter("password"));
    	udao.usersRegister(u);
    	return "register_success";
    }
	
	//用户登录动作
	public String login(){
		UsersDAO udao = new UsersDAOImpl();
		if(udao.usersLogin(user))
		{
			//在session中保留登录成功的用户名
			session.setAttribute("loginUserName", user.getUserName());
			return "login_success";
		}
		else
		{
			return "login_failure";
		}
	}
	
	@SkipValidation
	public String logout(){
		if(session.getAttribute("loginUserName")!=null)
		{
			session.removeAttribute("loginUserName");
		}
		
		return "logout_success";
	}
	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}

	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//用户名不能为空
		if("".equals(user.getUserName().trim()))
		{
			this.addFieldError("usernameError", "用户名不能为空");
		}
		if(user.getPassword().length()<6)
		{
			this.addFieldError("passwordError","密码长度不少于6位" );
		}
	}
	
	

}
