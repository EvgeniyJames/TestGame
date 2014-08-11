import Person.Person;
import WeaponDecorators.WeaponWithOptic;
import WeaponDecorators.WeaponWithSpecialBullets;
import Weapons.MyRifle;
import Weapons.SniperRifle;
import Weapons.Weapon;


public class Main {

	public static void main(String[] args) {
		Person myPerson = new Person("Francis");
		myPerson.eqipWeapon(new WeaponWithSpecialBullets(new MyRifle()));
		myPerson.shoot();
		
		Weapon sniperRifle = new SniperRifle();
		
		myPerson.eqipWeapon(sniperRifle);
		myPerson.shoot();
		
		sniperRifle = new WeaponWithOptic(sniperRifle);
		
		myPerson.eqipWeapon(sniperRifle);
		myPerson.shoot();
	}

}
