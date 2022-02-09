package git.main;

import Entidad.Direccion;
import Entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestra versiones con Git");
		System.out.println("Esto Es Otro Cambio en el Proyecto");

		Persona p = new Persona();
		p.setNombre("Steve Rogers");
		p.setEdad(45);
		
		System.out.println(p);
		
		Direccion d = new Direccion();
<<<<<<< HEAD
		d.setNombreVia("calle mar del plata");
		d.getTipoVia("calle");
		d.setPais("Argentina");
		
=======
		d.setNombreVia("Trece Rue de Percebe");
		d.setTipoVia("calle");
		d.setCuidad("Madrid");
>>>>>>> desarrollo
		
	}

}
