package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateUtil.HibernateUtil;
import entity.Food;
import entity.Foodstyle;
import entity.Foodtype;
import entity.StyleLink;
import entity.TypeLink;
import entity.User;


public class Test01 {
	public static void main(String[] args) {
		
		//save();
		find();
}
	
	public static void save(){
		Food f = new Food("红烧肉");
		Foodstyle fs = new Foodstyle("江浙菜");
		Foodtype ft = new Foodtype("肉类");
		StyleLink sl = new StyleLink();
		TypeLink tl = new TypeLink();
		User u = new User("青青","123456");
		//设置关联关系
		f.getStyleLink().add(sl);
		f.getTypelink().add(tl);
		f.setUser(u);
		u.getLikeFood().add(f);
		u.getDislikeFood().add(f);
		fs.getStyleLink().add(sl);
		ft.getTypelink().add(tl);
		sl.setFood(f);
		sl.setFoodstyle(fs);
		tl.setFood(f);
		tl.setFoodtype(ft);
		
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(f);
		session.save(u);
		session.save(fs);
		session.save(ft);
		//session.save(stu1);
		//session.save(stu2);
		tx.commit();
		HibernateUtil.closeSession(session);
		for(Food food:u.getLikeFood()){
		System.out.println(u.getUsername().toString()+"喜欢"+food.getFoodname());
		}
		for(Food food:u.getDislikeFood()){
			System.out.println(u.getUsername().toString()+"不喜欢"+food.getFoodname());
		}
	}
	
	public static void find(){
		Session session = HibernateUtil.getSession();
		Food f = (Food) session.get(Food.class, 1);
		User u = f.getUser();
		u.getLikeFood().add(f);
		u.getDislikeFood().add(f);
		StyleLink sl = (StyleLink) session.get(StyleLink.class, 1);
		TypeLink tl = (TypeLink) session.get(TypeLink.class, 1);
		Foodstyle fs = sl.getFoodstyle();
		Foodtype ft = tl.getFoodtype();
		System.out.println(f.getFoodname()+"属于"+fs.getStyleName()+"菜系,是"+ft.getTypeName());
		for(Food food:u.getLikeFood()){
			System.out.println(u.getUsername().toString()+"喜欢"+food.getFoodname());
			}
		HibernateUtil.closeSession(session);
	}
}
