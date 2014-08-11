package Weapons;

import res.Weapon;

public class MyRifle extends Weapon {

	public MyRifle(){
		this.damage = 30;
	}
	
	@Override
	public int atack() {
		// TODO Auto-generated method stub
		return this.damage;
	}

}
