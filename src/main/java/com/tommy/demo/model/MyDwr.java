package com.tommy.demo.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;

public class MyDwr {
	public String hello(String world) {
		System.out.println("hello "+world);
		return "hello "+world;
	}
	
	public User load() {
		User u = new User(1,"张三",new Group(1,"财务处"));
		return u;
	}
	
	public List<User> list() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"张三",new Group(1,"财务处")));
		users.add(new User(2,"李四",new Group(2,"科技处")));
		users.add(new User(3,"王五",new Group(3,"宣传部")));
		return users;
	}
	
	public void add(User user) {
		System.out.println(user);
	}

	public void deleteUser() {
		throw new MyException("在删除用户的时候有错");
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public String upload(InputStream is,String filename) throws IOException {
		//WebContext可以获取HttpServlet的对象
		WebContext wc = WebContextFactory.get();
		HttpServletRequest req = wc.getHttpServletRequest();
		String realpath = req.getSession().getServletContext().getRealPath("upload");
		String fn = FilenameUtils.getName(filename);
		String filepath = realpath+"/"+fn;
		FileUtils.copyInputStreamToFile(is, new File(filepath));
		return filepath;
	}
}
