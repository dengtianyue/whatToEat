package action;

import java.util.ArrayList;
import java.util.List;

import entity.Foods;
import entity.Users;
import service.FoodsDAO;
import serviceimpl.FoodsDAOImpl;



//菜品action类
public class JsonFoodsAction extends SuperAction {
	private static final long serialVersionUID = 1L;
	private List<Foods> list = new ArrayList<Foods>();
	//实现随机推荐菜品的动作
    public String queryWhatoeat()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	Users u = fdao.queryUsersByUsername(uname);
    	list = fdao.queryWhatoeat(u.getUid());
    	//放进session中
    	if(list!=null&&list.size()>0)
    	{
    		session.setAttribute("Whatoeat_list", list);
    	}
    	/*for(int i =0;i<list.size();i++)
    	{
    		System.out.println(list.toString());
    	}*/
    	return "queryWhatoeat_success";
    }
	public List<Foods> getList() {
		return list;
	}
	public void setList(List<Foods> list) {
		this.list = list;
	}
	
	
}


