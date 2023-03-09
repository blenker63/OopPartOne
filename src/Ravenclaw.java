public class Ravenclaw extends Hogwarts {
    private final String name;
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Ravenclaw(int power, int transgress, String name, int nobility, int honor, int bravery) {
        super(power, transgress);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public String getName() {
        return name;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return"Факультет Когтевран, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }
}
