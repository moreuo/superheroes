package controller;

import java.util.ArrayList;
import java.util.List;
import model.Character;

public class Database {
    private List<Character> characters = new ArrayList<>();

    public void create(Character character) {
        characters.add(character);
    }

    public List<Character> read() {
        return characters;
    }
}
