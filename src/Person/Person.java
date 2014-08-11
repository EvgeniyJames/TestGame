package Person;

import Weapons.Weapon;

public class Person {
	private Weapon weapon;
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void eqipWeapon(Weapon w){
		this.weapon = w;
		System.out.println(this.name + " eqip " + this.weapon.getDescription());
	}
	
	public void shoot(){
		System.out.println(
				this.weapon.getDescription()
				+ " has shoot in "
						+ this.name + 
						" hands");
	}
}
