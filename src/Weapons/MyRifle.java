package Weapons;


public class MyRifle extends Weapon {

	public MyRifle(){
		this.description = "Rifle";
	}
	
	@Override
	public String getDescription(){
		return this.description;
	}
}
