public class Hogwarts {
    private final int power;
    private final int transgress;

    public Hogwarts(int power, int transgress) {
        this.power = power;
        this.transgress = transgress;
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
}
