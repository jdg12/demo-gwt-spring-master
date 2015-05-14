//Esta clase sirve para establecer el formato de los diferentes campos
//Asi como las URL tanto al enviar como al recibir datos

package org.planificando.client.datasource;

import com.smartgwt.client.data.fields.DataSourceBooleanField;
import com.smartgwt.client.data.fields.DataSourceDateTimeField;
import com.smartgwt.client.data.fields.DataSourceIntegerField;
import com.smartgwt.client.data.fields.DataSourcePasswordField;
import com.smartgwt.client.data.fields.DataSourceTextField;

public class UserDS extends JSONRestDataSource
{
	//Formato de las URL cuando estemos realizando operaciones
	private static final String FETCH_URL = "UserController/fetch";		

	private static final String SAVE_URL = "UserController/save";

	private static final String REMOVE_URL = "UserController/remove";

	public UserDS()
	{
		//Fuentes de datos
		
		//La primera de tipo entero para el código de usuario
		DataSourceIntegerField codUser = new DataSourceIntegerField("codUser");

		//Fuente de texto puesto que es un nick
		DataSourceTextField nick = new DataSourceTextField("nick", "Nick");
		
		//Contraseá puesto que es lo que es
		DataSourcePasswordField pass = new DataSourcePasswordField("pass", "Password");
		
		//El email se tratará como un texto
		DataSourceTextField email = new DataSourceTextField("email", "E-mail");
		
		//Baneado como un boolean
		DataSourceBooleanField banned = new DataSourceBooleanField("banned", "Banned");

		DataSourceDateTimeField registered = new DataSourceDateTimeField("registered", "Registered");

		DataSourceTextField username = new DataSourceTextField("username", "Name");
		DataSourceTextField surname = new DataSourceTextField("surname", "Surname");

		codUser.setHidden(true);			//ocutamos la posibilidad de poner el código de usuario
		codUser.setPrimaryKey(true);		//indicamos que en todos los datos solo permitiremos un único valor

		nick.setRequired(true);				//Obligaotio poner nick, contraseña y email
		pass.setRequired(true);
		email.setRequired(true);

		registered.setCanEdit(false);		//La fecha no se puede modiciar

		setFetchDataURL(FETCH_URL);			//Establecemos las url
		setAddDataURL(SAVE_URL);
		setRemoveDataURL(REMOVE_URL);
		setUpdateDataURL(SAVE_URL);
		setFields(nick, pass, email, banned, registered, username, surname);
	}
}
