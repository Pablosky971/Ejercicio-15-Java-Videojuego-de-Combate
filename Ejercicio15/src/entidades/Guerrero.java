package entidades;

public class Guerrero extends Personaje {
	
	public Guerrero() {
		
		this.poder = Poder.FUERZA;
		
		
	}

	@Override
	public void atacar(Personaje p) {
		
		if(this.arma instanceof Espada || this.arma instanceof Arco) {
			p.restarVida(this.arma.damage + especialidad);
		} else {
			p.restarVida(this.arma.damage);
		}
		
		
		
	}

	@Override
	public void restarVida(double resta) {
		this.vida -= resta;
		
	}

}
