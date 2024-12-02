package org.benat.dao;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import org.benat.model.ModeloEquipo;

public class DaoEquipo {

	public static void insertar(ModeloEquipo e,ObjectContainer db) {
		db.store(e);
	}

	public static ModeloEquipo conseguirPorNombre(String nombre, ObjectContainer db) {
		ModeloEquipo dep=new ModeloEquipo();
		dep.setNombre(nombre);
		ObjectSet<ModeloEquipo> set=db.queryByExample(dep);
		return set.hasNext() ? set.next() : null;
	}
	
}
