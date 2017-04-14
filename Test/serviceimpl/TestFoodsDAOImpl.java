package serviceimpl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import entity.Foods;
import entity.Users;
import service.FoodsDAO;

public class TestFoodsDAOImpl {

	@Test
	public void testQueryWhatoeat()
	{
		Users u = new Users(1,"zhangsan","123456");
		FoodsDAO fdao = new FoodsDAOImpl();
		List<Foods> list = fdao.queryWhatoeat(1);
		for(int i =0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
	}
	
	@Test
	public void testQueryLikeList()
	{
		Users u = new Users(1,"zhangsan","123456");
		FoodsDAO fdao = new FoodsDAOImpl();
		List<Foods> list = fdao.queryLikeList(1);
		for(int i =0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
	}
	
	@Test
	public void testQueryDislikeList()
	{
		Users u = new Users(1,"zhangsan","123456");
		FoodsDAO fdao = new FoodsDAOImpl();
		List<Foods> list = fdao.queryDislikeList(1);
		for(int i =0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
	}
	
	@Test
	public void testQueryUsersByUsername()
	{
		String uname = "dengtianyue";
		FoodsDAO fdao = new FoodsDAOImpl();
		Users u =fdao.queryUsersByUsername(uname);
		System.out.println(u.getUid()+ u.getUserName()+u.getPassword());
	}
	
	@Test
	public void testQueryFoodsByfoodsname()
	{
		String fname = "红烧肉";
		FoodsDAO fdao = new FoodsDAOImpl();
		Foods f =fdao.queryFoodsByFoodsname(fname);
		System.out.println(f.getFid()+f.getFoodName()+f.getFoodType());
	}
	
	@Test
	public void testAddLikeFoods()
	{
		int fid = 1;
		int uid = 2;
		FoodsDAO fdao = new FoodsDAOImpl();
		
		System.out.println("已添加编号为"+fid+"的菜品至喜欢");
		Assert.assertEquals(true, fdao.addLikeList(fid, uid));
	}
}
