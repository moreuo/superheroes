package controller;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
