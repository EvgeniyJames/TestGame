package WeaponDecorators;

import Weapons.Weapon;

public class WeaponWithOptic extends WeaponDecorator {
	
	public WeaponWithOptic(Weapon w){
		this.weapon = w;
		this.description = w.getDescription();
	}
	
	public String getDescription(){
		return this.description + " + optical zoom";
	}
	
}
