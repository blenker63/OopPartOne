public class Hufflepuff extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Hufflepuff(String name, int power, int transgress, int nobility, int honor, int bravery) {
        super(name, power, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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
        return"Факультет Пуффендуй, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }
    public void determineBestStudentHufflepuff(Hufflepuff hufflepuff) {

        int studentPowerOne = getNobility() + getHonor() + getBravery();
        int studentPowerTwo = hufflepuff.getNobility() + getHonor() + getBravery();
        if (studentPowerOne>studentPowerTwo) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
        }  else if (studentPowerOne < studentPowerTwo) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + getName());
        }
        else
            System.out.println(hufflepuff.getName() +  " и " + getName() + " имеют одинаковое количествотв свойств");
    }
}

