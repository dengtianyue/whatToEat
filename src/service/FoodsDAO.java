package service;

import java.util.List;

import entity.Foods;
import entity.Likelist;
import entity.Users;

//菜品的业务逻辑接口
public interface FoodsDAO 
{
	//随机挑选菜品
	public List<Foods>queryWhatoeat(int uid);
	//随机挑选菜品(无登录)
	public List<Foods>queryWhatoeat2();
	//查询用户喜欢吃的菜
	public List<Foods>queryLikeList(int uid);
	//查询用户不喜欢吃的菜
	public List<Foods>queryDislikeList(int uid);
	//用户添加喜欢吃的菜
	public boolean addLikeList(int fid,int uid);
	//用户添加不喜欢吃的菜
	public boolean addDislikeList(int fid,int uid);
	//用户删除喜欢吃的菜
	public boolean deleteLikeList(int fid,int uid);
	//用户删除不喜欢吃的菜
	public boolean deleteDislikeList(int fid,int uid);
	//通过用户名查找用户id
	public Users queryUsersByUsername(String username);
	//通过菜品名查找菜品id
	public Foods queryFoodsByFoodsname(String foodname);
}
