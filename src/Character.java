import interfaces.ICharacter;

public class Character implements ICharacter {
    String name;
    int strength;
    int agility;
    int intellect;

    public Character(String name, int strength, int agility, int intellect) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
    }

    @Override
    public String getDescription() {
        return "Character: " + name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getIntellect() {
        return intellect;
    }
}
