public class Slytherin extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Slytherin(String name, int power, int transgress, int nobility, int honor, int bravery) {
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
        return"Факультет Слизерин, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }
    public void determineBestStudentSlytherin(Slytherin slytherin) {

        int studentPowerOne = getNobility() + getHonor() + getBravery();
        int studentPowerTwo = slytherin.getNobility() + getHonor() + getBravery();
        if (studentPowerOne>studentPowerTwo) {
            System.out.println(getName() + " лучший Слизеринец, чем " + slytherin.getName());
        }  else if (studentPowerOne < studentPowerTwo) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + getName());
        }
        else
            System.out.println(slytherin.getName() +  " и " + getName() + " имеют одинаковое количествотв свойств");
    }
}
