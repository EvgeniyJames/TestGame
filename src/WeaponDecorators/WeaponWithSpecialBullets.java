package WeaponDecorators;

import res.Weapon;

public class WeaponWithSpecialBullets extends WeaponDecorator {

	public WeaponWithSpecialBullets(Weapon w){
		this.weapon = w;
	}
	
	@Override
	public String getDescription() {
		return this.weapon.getDescription() + " + specail bullets";
	}

}
