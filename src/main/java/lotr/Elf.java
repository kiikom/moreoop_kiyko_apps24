package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            c.setHp(0);
            System.out.println(this + " kills " + c);
        } else {
            c.setHp(c.getHp() - 1);
            System.out.println(this + " decreases the power of " + c + " by 1");
        }
    }
}
