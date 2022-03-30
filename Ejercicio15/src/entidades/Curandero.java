package entidades;

public class Curandero extends Personaje {

public Curandero() {
		
		this.poder = Poder.SABIDURIA;
	}
	@Override
	public void atacar(Personaje p) {
		if(this.arma instanceof Rezo) {
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
