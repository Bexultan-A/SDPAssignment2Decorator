package decorators;

import interfaces.ICharacter;

public class RaceDecorator implements ICharacter {
    ICharacter character;
    String race;
    int raceStrengthBonus;
    int raceAgilityBonus;
    int raceIntellectBonus;

    public RaceDecorator(ICharacter character, String race, int raceStrengthBonus, int raceAgilityBonus, int raceIntellectBonus) {
        this.character = character;
        this.race = race;
        this.raceStrengthBonus = raceStrengthBonus;
        this.raceAgilityBonus = raceAgilityBonus;
        this.raceIntellectBonus = raceIntellectBonus;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + ", Race: " + race;
    }

    @Override
    public int getStrength() {
        return character.getStrength() + raceStrengthBonus;
    }

    @Override
    public int getAgility() {
        return character.getAgility() + raceAgilityBonus;
    }

    @Override
    public int getIntellect() {
        return character.getIntellect() + raceIntellectBonus;
    }
}
