package lotr;

import java.util.Random;

import lotr.Character;



public class King extends Character {
    private static final Random random = new Random();

    public King() {
        super(random.nextInt(11) + 5, random.nextInt(11) + 5);
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power) + 1;
        c.setHp(c.getHp() - damage);
        System.out.println(this + " deals " + damage + " damage to " + c);
    }
}

