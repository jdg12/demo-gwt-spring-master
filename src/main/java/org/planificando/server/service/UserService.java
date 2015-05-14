//Interfaz que nos permitirá añadir, recoger o eliminar usuarios a partir de información de JSON
package org.planificando.server.service;

public interface UserService
{
	public String saveUsers(String json);

	public String fetchUsers(String json);

	public String removeUsers(String json);
}
