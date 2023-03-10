public class Hogwarts {
    private String name;
    private final int power;
    private final int transgress;

    public Hogwarts(String name, int power, int transgress) {
        this.name = name;
        this.power = power;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                ", power=" + getPower() +
                ", transgress=" + getTransgress() +
                '}';
    }
    public void determineBestStudentHogwarts(Hogwarts hogwarts) {

        int studentPowerOne = getPower() + getTransgress();
        int studentPowerTwo = hogwarts.getPower() + getTransgress();
        if (studentPowerOne>studentPowerTwo) {
            System.out.println(getName() + " лучший Хогвардец, чем " + hogwarts.getName());
        }  else if (studentPowerOne < studentPowerTwo) {
            System.out.println(hogwarts.getName() + " лучший Хогвардец, чем " + getName());
        }
        else
            System.out.println(hogwarts.getName() +  " и " + getName() + " имеют одинаковое количествотв свойств");
    }
}
