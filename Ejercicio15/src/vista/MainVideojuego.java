package vista;

import entidades.Arma;
import entidades.Espada;
import entidades.Guerrero;
import entidades.Personaje;

public class MainVideojuego {
	public static void main(String[] args) {
		
	
	Personaje p = new Guerrero();
	p.setNombre("Beowulf");
	
	Arma a = new Espada();
	p.setArma(a);
	
	p.setEspecialidad(10);
}

}
