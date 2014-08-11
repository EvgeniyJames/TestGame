package WeaponDecorators;

import Weapons.Weapon;


public class WeaponWithSpecialBullets extends WeaponDecorator {

	public WeaponWithSpecialBullets(Weapon w){
		this.weapon = w;
		this.description = this.weapon.getDescription();
	}
	
	@Override
	public String getDescription() {
		return this.description + " + specail bullets";
	}

}
