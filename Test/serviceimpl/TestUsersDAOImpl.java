package serviceimpl;

import junit.framework.Assert;

import org.junit.Test;

import service.UsersDAO;
import entity.Users;

public class TestUsersDAOImpl {
	
	@Test
	public void testUsersLogin()
	{
		Users u = new Users(1,"dengtianyue","123456");
		UsersDAO udao = new UsersDAOImpl();
		Assert.assertEquals(true, udao.usersLogin(u));
		
	}
}
