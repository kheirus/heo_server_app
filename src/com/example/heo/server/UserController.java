package com.example.heo.server;

import java.util.ArrayList;
import java.util.List;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.example.heo.model.User;


public class UserController extends ServerResource implements
		UserControllerInterface {

	//@Override
	@Put
	public void AddUser(User user) {

		ObjectifyService.register(User.class);
		Objectify objectify = ObjectifyService.begin();

		User u = new User();
		u.setId(user.getId());
		u.setNom(user.getNom());
		u.setPrenom(user.getPrenom());
		u.setMail(user.getMail());
		u.setAge(user.getAge());
		u.setPresentation(user.getPresentation());
		u.setMdp(user.getMdp());
		u.setConfirmMdp(user.getConfirmMdp());

		objectify.put(u);

	}

	//@Override
	@Get
	public Container getUsers() {

		List<User> list = new ArrayList<User>();
		Container content = new Container();

		ObjectifyService.register(User.class);
		Objectify objectify = ObjectifyService.begin();

		Query<User> q = objectify.query(User.class).order("nom");

		for (User user : q) {

			list.add(user);

		}

		content.setUserList(list);

		return content;
	}

	

}
