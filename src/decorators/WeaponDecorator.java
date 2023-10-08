package decorators;

import interfaces.ICharacter;

public class WeaponDecorator implements ICharacter {
    ICharacter character;
    String weapon;
    int weaponStrengthBonus;
    int weaponAgilityBonus;
    int weaponIntellectBonus;

    public WeaponDecorator(ICharacter character, String weapon, int weaponStrengthBonus, int weaponAgilityBonus, int weaponIntellectBonus) {
        this.character = character;
        this.weapon = weapon;
        this.weaponStrengthBonus = weaponStrengthBonus;
        this.weaponAgilityBonus = weaponAgilityBonus;
        this.weaponIntellectBonus = weaponIntellectBonus;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + ", Weapon: " + weapon;
    }

    @Override
    public int getStrength() {
        return character.getStrength() + weaponStrengthBonus;
    }

    @Override
    public int getAgility() {
        return character.getAgility() + weaponAgilityBonus;
    }

    @Override
    public int getIntellect() {
        return character.getIntellect() + weaponIntellectBonus;
    }
}
