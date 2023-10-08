package decorators;

import interfaces.ICharacter;

public class ClassDecorator implements ICharacter {
    ICharacter character;
    String chClass;
    int classStrengthBonus;
    int classAgilityBonus;
    int classIntellectBonus;

    public ClassDecorator(ICharacter character, String chClass, int classStrengthBonus, int classAgilityBonus, int classIntellectBonus) {
        this.character = character;
        this.chClass = chClass;
        this.classStrengthBonus = classStrengthBonus;
        this.classAgilityBonus = classAgilityBonus;
        this.classIntellectBonus = classIntellectBonus;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + ", Class: " + chClass;
    }

    @Override
    public int getStrength() {
        return character.getStrength() + classStrengthBonus;
    }

    @Override
    public int getAgility() {
        return character.getAgility() + classAgilityBonus;
    }

    @Override
    public int getIntellect() {
        return character.getIntellect() + classIntellectBonus;
    }
}
