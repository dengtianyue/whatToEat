package serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Dislikelist;
import entity.Foods;
import entity.Likelist;
import entity.Users;
import service.FoodsDAO;

public class FoodsDAOImpl implements FoodsDAO {

	@Override
	public List<Foods> queryLikeList(int uid) {
		Transaction tx = null;
		List<Foods> list = null;
		String hql = "";
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			//hql="select Foods.foodName from Foods , Likelist where Likelist.uid ="+uid+"AND Likelist.fid = Foods.fid";
			//hql="select Foods.foodName from Foods ";
			hql="select foodName from Foods,Likelist where Likelist.Uid = '"+uid+"'AND Likelist.Fid = Foods.Fid";
			Query query = session.createSQLQuery(hql);
			list = query.list();
			tx.commit();
			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return list;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public List<Foods> queryDislikeList(int uid) {
		Transaction tx = null;
		List<Foods> list = null;
		String hql = "";
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			//hql="select Foods.foodName from Foods , Likelist where Likelist.uid ="+uid+"AND Likelist.fid = Foods.fid";
			//hql="select Foods.foodName from Foods ";
			hql="select foodName from Foods,Dislikelist where Dislikelist.Uid = '"+uid+"'and Dislikelist.Fid = Foods.Fid";
			Query query = session.createSQLQuery(hql);
			list = query.list();
			tx.commit();
			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return list;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean addLikeList(int fid,int uid) {
		Transaction tx = null;
		//String hql = "";
		try
		{	
			
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Foods f = (Foods) session.get(Foods.class,fid);
			Users u = (Users) session.get(Users.class,uid);
			Likelist l = new Likelist();
			l.setFoods(f);
			l.setUsers(u);
			session.save(l);
			tx.commit();
			return true;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean addDislikeList(int fid,int uid) {
		Transaction tx = null;
		//String hql = "";
		try
		{	
			
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Foods f = (Foods) session.get(Foods.class,fid);
			Users u = (Users) session.get(Users.class,uid);
			Dislikelist dl = new Dislikelist();
			dl.setFoods(f);
			dl.setUsers(u);
			session.save(dl);
			tx.commit();
			return true;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean deleteLikeList(int fid,int uid) {
		Transaction tx = null;
		String hql = "";
		try
		{	
			
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "Delete from Likelist where Fid = '"+fid+"' AND Uid = '"+uid+"'";
			Query query = session.createSQLQuery(hql);
			query.executeUpdate();
			tx.commit();
			return true;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean deleteDislikeList(int fid,int uid) {
		Transaction tx = null;
		String hql = "";
		try
		{	
			
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "Delete from Dislikelist where Fid = '"+fid+"' AND Uid = '"+uid+"'";
			Query query = session.createSQLQuery(hql);
			query.executeUpdate();
			tx.commit();
			return true;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	
	//由登录用户名得到用户信息
	public Users queryUsersByUsername(String username) {
		Transaction tx = null;
		Users u = null;
		String hql = "";
		String a = username;
		List<Integer> list = null;
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "select uid from Users where username = '"+a+"'";
			Query query = session.createQuery(hql);
			list = query.list();
			u =  (Users) session.get(Users.class,list.get(0));
			tx.commit();
			return u;
		}
		catch(Exception ex){
			ex.printStackTrace();
			//tx.commit();
			return u;
		}
		finally{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}
	
	//由菜品名得到菜品信息
	public Foods queryFoodsByFoodsname(String foodName) {
			Transaction tx = null;
			Foods f = null;
			String hql = "";
			String a = foodName;
			List<Integer> list = null;
			try{
				Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
				tx = session.beginTransaction();
				hql = "select fid from Foods where foodName = '"+a+"'";
				Query query = session.createQuery(hql);
				list = query.list();
				f =  (Foods) session.get(Foods.class,list.get(0));
				tx.commit();
				return f;
			}
			catch(Exception ex){
				ex.printStackTrace();
				//tx.commit();
				return f;
			}
			finally{
				if(tx!=null)
				{
					tx=null;
				}
			}
		}

	@Override
	public List<Foods> queryWhatoeat(int uid) {
		Transaction tx = null;
		List<Foods> list = null;
		String hql = "";
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql="SELECT FoodName FROM Foods where Foods.fid not in(SELECT Dislikelist.fid from Dislikelist where Dislikelist.uid = '"+uid+"')ORDER BY  RAND() LIMIT 6";
			Query query = session.createSQLQuery(hql);
			list = query.list();
			tx.commit();
			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return list;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}
	
}
