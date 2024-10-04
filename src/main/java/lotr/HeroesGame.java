package lotr;

public class HeroesGame {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        System.out.println("Character 1: " + c1.getClass().getSimpleName() + " (Power: " + c1.power + ", HP: " + c1.hp + ")");
        System.out.println("Character 2: " + c2.getClass().getSimpleName() + " (Power: " + c2.power + ", HP: " + c2.hp + ")");

        gameManager.fight(c1, c2);
    }
}