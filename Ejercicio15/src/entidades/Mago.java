package entidades;

public class Mago extends Personaje {
	
public Mago() {
		
		this.poder = Poder.INTELIGENCIA;
	}

	@Override
	public void atacar(Personaje p) {
		if(this.arma instanceof Hechizo) {
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
