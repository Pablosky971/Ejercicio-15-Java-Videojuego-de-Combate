package entidades;

public abstract class Arma {
	protected String nombre;
	protected double damage;
	
	

	public double getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
