package Weapons;

import res.Weapon;

public class MyRifle extends Weapon {

	public MyRifle(){
		this.description = "My rifle";
	}
	
	@Override
	public String getDescription(){
		return this.description;
	}

}
