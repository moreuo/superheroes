package controller;

import java.util.List;
import model.Character;

public class CharacterController {
    private Database database;

    public CharacterController() {
        database = new Database();
    }

    public void createCharacter(Character character) {
        database.create(character);
    }

    public List<Character> readCharacters() {
        return database.read();
    }
}