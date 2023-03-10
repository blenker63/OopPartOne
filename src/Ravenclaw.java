public class Ravenclaw extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Ravenclaw(String name, int power, int transgress, int nobility, int honor, int bravery) {
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
        return"Факультет Когтевран, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }
    public void determineBestStudentRavenclaw(Ravenclaw ravenclaw) {

        int studentPowerOne = getNobility() + getHonor() + getBravery();
        int studentPowerTwo = ravenclaw.getNobility() + getHonor() + getBravery();
        if (studentPowerOne>studentPowerTwo) {
            System.out.println(getName() + " лучший Когтевранец, чем " + ravenclaw.getName());
        }  else if (studentPowerOne < studentPowerTwo) {
            System.out.println(ravenclaw.getName() + " лучший Когтевранец, чем " + getName());
        }
        else
            System.out.println(ravenclaw.getName() +  " и " + getName() + " имеют одинаковое количествотв свойств");
    }
}
