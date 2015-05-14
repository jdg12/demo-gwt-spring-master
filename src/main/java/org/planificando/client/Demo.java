package org.planificando.client;

import org.planificando.client.widgets.CRUDToolStrip;
import org.planificando.client.widgets.UserGrid;

import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class Demo implements EntryPoint
{
	public void onModuleLoad()
	{
		//Para poner los botones por encima ponemos que sea vertical
		VLayout hLayout = new VLayout();
		
		//Voy a probar a añadir una serie de pestañas verticales
		TabSet topTabSet = new TabSet(); 
		topTabSet.setWidth(400);  
        topTabSet.setHeight(200);  
        Tab tTab1 = new Tab("Blue");
        topTabSet.addTab(tTab1);

		UserGrid usuariosGrid = new UserGrid();
		
		CRUDToolStrip barraHerramientas = new CRUDToolStrip(usuariosGrid);

		hLayout.addMember(topTabSet);
		hLayout.addMember(barraHerramientas);
		hLayout.addMember(usuariosGrid);
		hLayout.setWidth100();
		hLayout.setHeight100();
		hLayout.setPadding(50);
		hLayout.setMembersMargin(20);

		hLayout.draw();
	}
}
