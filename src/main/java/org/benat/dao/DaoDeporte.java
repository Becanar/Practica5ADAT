package org.benat.dao;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import org.benat.model.ModeloDeporte;

public class DaoDeporte {

	public static void insertar(ModeloDeporte dep, ObjectContainer db) {
		db.store(dep);
	}

	public static ModeloDeporte conseguirPorNombre(String nombre, ObjectContainer db) {
		ModeloDeporte dep=new ModeloDeporte();
		dep.setNombre(nombre);
		ObjectSet<ModeloDeporte> set=db.queryByExample(dep);
		return set.hasNext() ? set.next() : null;
	}
	
}
