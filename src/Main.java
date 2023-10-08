import decorators.ClassDecorator;
import decorators.RaceDecorator;
import decorators.WeaponDecorator;
import interfaces.ICharacter;

public class Main {
    public static void main(String[] args) {
        ICharacter character = new Character("Mage", 3, 3, 3);
        System.out.println(character.getDescription() + ", Strength: " + character.getStrength() +
                ", Agility: " + character.getAgility() +
                ", Intellect: " + character.getIntellect()
        );

        ICharacter elfMageWithStaff = new RaceDecorator(new ClassDecorator(new WeaponDecorator(character,
                "staff", 4, 3, 6 ),
                "Mage", 2, 2, 10),
                "elf", 5, 8, 9
        );

        System.out.println(elfMageWithStaff.getDescription() + ", Strength: " + elfMageWithStaff.getStrength() +
                ", Agility: " + elfMageWithStaff.getAgility() +
                ", Intellect: " + elfMageWithStaff.getIntellect()
        );

    }
}