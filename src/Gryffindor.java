public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int power, int transgress, int nobility, int honor, int bravery) {
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
        return"Факультет Гриффиндор, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }
public void determineBestStudentGryffindor(Gryffindor gryffindor) {

    int studentPowerOne = getNobility() + getHonor() + getBravery();
    int studentPowerTwo = gryffindor.getNobility() + getHonor() + getBravery();
//    System.out.println(studentPowerOne);  // проверка подсчета свойств студента 1
//    System.out.println(studentPowerTwo);  // проверка подсчета свойств студента 2
    if (studentPowerOne>studentPowerTwo) {
        System.out.println(getName() + " лучший Гриффендорец, чем " + gryffindor.getName());
    }  else if (studentPowerOne < studentPowerTwo) {
        System.out.println(gryffindor.getName() + " лучший Гриффендорец, чем " + getName());
    }
    else
        System.out.println(gryffindor.getName() +  " и " + getName() + " имеют одинаковое количествотв свойств");
}

}

