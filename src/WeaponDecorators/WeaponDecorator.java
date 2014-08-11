package WeaponDecorators;

import res.Weapon;

public abstract class WeaponDecorator extends Weapon {

	protected Weapon weapon;
	
	@Override
	public String getDescription() {
		return this.description;
	}

}
