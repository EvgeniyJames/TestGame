import WeaponDecorators.WeaponWithSpecialBullets;
import Weapons.MyRifle;
import Weapons.Weapon;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon myWeapon = new MyRifle();
		System.out.println(myWeapon.getDescription());
		myWeapon = new WeaponWithSpecialBullets(myWeapon);
		System.out.println(myWeapon.getDescription());

	}

}
