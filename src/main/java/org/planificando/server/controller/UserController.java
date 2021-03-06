package org.planificando.server.controller;

import org.planificando.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//Para que lo gestione pring
@Controller
@RequestMapping("/UserController")		//Definimos la URL, se suele tener una URL por cada controlador
public class UserController
{
	@Autowired
	private UserService userService;		//Spring se encargará de este atributo

	@RequestMapping(value = "/fetch", method = RequestMethod.POST)
	public @ResponseBody String fetchUserPost(@RequestBody String json)
	{
		//Coje una determinada petición en String y genera un String de respuesta de tipo UserService
		return userService.fetchUsers(json);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody String saveUserPost(@RequestBody String json)
	{
		return userService.saveUsers(json);
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public @ResponseBody String removeUserPost(@RequestBody String json)
	{
		return userService.removeUsers(json);
	}
}
