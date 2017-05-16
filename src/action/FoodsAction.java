package action;

import java.util.List;

import entity.Foods;
import entity.Users;
import service.FoodsDAO;
import serviceimpl.FoodsDAOImpl;



//菜品action类
public class FoodsAction extends SuperAction {
	private static final long serialVersionUID = 1L;
	
	//实现随机推荐菜品的动作
    public String queryWhatoeat()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	Users u = fdao.queryUsersByUsername(uname);
    	List<Foods> list = fdao.queryWhatoeat(u.getUid());
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
    
    //实现随机推荐菜品的动作(未登录)
    public String queryWhatoeat2()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	List<Foods> list = fdao.queryWhatoeat2();
    	//放进session中
    	if(list!=null&&list.size()>0)
    	{
    		session.setAttribute("Whatoeat_list", list);
    	}
    	return "queryWhatoeat2_success";
    }
	
	//实现查询喜欢菜品的动作
    public String queryLikeFoods()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	Users u = fdao.queryUsersByUsername(uname);
    	System.out.println(u.getUid()+ u.getUserName()+u.getPassword());
    	System.out.println("查询喜欢的菜品");
    	List<Foods> list = fdao.queryLikeList(u.getUid());
    	//放进session中
    	if(list!=null&&list.size()>0)
    	{
    		session.setAttribute("LikeFoods_list", list);
    	}
    	return "queryLikeFoods_success";
    }
    
	//实现查询讨厌菜品的动作
    public String queryDislikeFoods()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	Users u = fdao.queryUsersByUsername(uname);
    	System.out.println(u.getUid()+ u.getUserName()+u.getPassword());
    	System.out.println("查询不喜欢的菜品");
    	List<Foods> list = fdao.queryDislikeList(u.getUid());
    	//放进session中
    	if(list!=null&&list.size()>0)
    	{
    		session.setAttribute("DislikeFoods_list", list);
    	}
    	return "queryDislikeFoods_success";
    }
    
    //实现添加至喜欢动作
    public String addLikeFoods()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	String fname = (String) request.getParameter("foodName");
    	Users u = fdao.queryUsersByUsername(uname);
    	Foods f = fdao.queryFoodsByFoodsname(fname);
    	//String fid = request.getParameter("fid");
    	fdao.addLikeList(f.getFid(),u.getUid());
    	return "addLikeFoods_success";
    }

    
    //实现添加至不喜欢动作
    public String addDislikeFoods()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	String fname = (String) request.getParameter("foodName");
    	Users u = fdao.queryUsersByUsername(uname);
    	Foods f = fdao.queryFoodsByFoodsname(fname);
    	//String fid = request.getParameter("fid");
    	fdao.addDislikeList(f.getFid(),u.getUid());
    	return "addDislikeFoods_success";
    }
    
    //实现删除喜欢菜品动作
    public String deleteLikelist()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String fname = (String) request.getParameter("foodName");
    	String uname = (String) session.getAttribute("loginUserName");
    	Users u = fdao.queryUsersByUsername(uname);
    	Foods f = fdao.queryFoodsByFoodsname(fname);
    	fdao.deleteLikeList(f.getFid(), u.getUid());
    	return "deleteLikeFoods_success";
    }
    
    //实现删除不喜欢菜品动作
    public String deleteDislikeList()
    {
    	FoodsDAO fdao = new FoodsDAOImpl();
    	String uname = (String) session.getAttribute("loginUserName");
    	String fname = (String) request.getParameter("foodName");
    	Users u = fdao.queryUsersByUsername(uname);
    	Foods f = fdao.queryFoodsByFoodsname(fname);
    	fdao.deleteDislikeList(f.getFid(), u.getUid());
    	return "deleteDislikeFoods_success";
    }
}


