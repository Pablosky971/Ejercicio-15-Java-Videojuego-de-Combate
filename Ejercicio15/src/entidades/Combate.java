package entidades;

public class Combate {
	private Personaje p1;
	private Personaje p2;
	
	public void batalla() {
		System.out.println(p1.nombre + "VS" + p2.nombre);
		
		if(p1 instanceof Guerrero) {
			System.out.println("Características del Guerrero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		} 
		
		if(p1 instanceof Mago) {
			
			System.out.println("Características del Mago " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		}
		
		
		if(p1 instanceof Curandero) {
			
			System.out.println("Características del Curandero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		}
		
		if(p2 instanceof Guerrero) {
			System.out.println("Características del Guerrero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		} 
		
		if(p2 instanceof Mago) {
			
			System.out.println("Características del Mago " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		}
		
		
		if(p2 instanceof Curandero) {
			
			System.out.println("Características del Curandero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + " , con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado por especialidad: " + p1.especialidad + ".");
			
		}
		
		
		while(p1.vida > 0.00 || p2.vida > 0.00) {
			p1.atacar(p2);
			System.out.println("");
			p2.atacar(p1);
		}
		
		if(p1.vida < 0) {
			
			System.out.println("El ganador del combate es " + p2.nombre + ".");
			System.out.println("Ha finalizado el combate con " + p2.vida + " puntos de vida.");
			
		} else {
			System.out.println("El ganador del combate es " + p1.nombre + ".");
			System.out.println("Ha finalizado el combate con " + p1.vida + " puntos de vida.");
		}
		
		
		
	}

}
