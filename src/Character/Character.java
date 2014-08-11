package Character;

import Weapons.Weapon;

public class Character {
	private Weapon weapon;
	private String name;
	
	public Character(String name){
		this.name = name;
	}
	
	public void eqipWeapon(Weapon w){
		this.weapon = w;
	}
	
	public void shoot(){
		System.out.println(
				this.weapon.getDescription()
				+ " has shoot in "
						+ this.name + 
						" hands");
	}
}
