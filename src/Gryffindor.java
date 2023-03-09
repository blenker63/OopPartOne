public class Gryffindor extends Hogwarts {
    private final String name;
    private final int nobility;
    private final int honor;
    private final int bravery;

//    public Gryffindor() {
    public Gryffindor(int power, int transgress, String name, int nobility, int honor, int bravery) {
        super(power, transgress);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
//        System.out.println(gryffindor());
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
//            public String studentGryffindor() {
//                Gryffindor studentGryffindor = new Gryffindor();
//                return "Факультет Гриффиндор, " + "ученик - " + getName()
//                        + "; благородство - " + getNobility()
//                        + "; честь - " + getHonor()
//                        + "; храбрость - " + getBravery();
////                return null;
//            }

                @Override
    public String toString() {
        return"Факультет Гриффиндор, " + "ученик - " + getName()
                + "; благородство - " + getNobility()
                + "; честь - " + getHonor()
                + "; храбрость - " + getBravery()
                + "; мощность - " + getPower()
                + "; трансгрессирование - " + getTransgress();
    }

//    public String studentGryffindor(String name, int nobility,
//                                    int honor,
//                                    int bravery) {
//        return "Факультет Гриффиндор, " + "ученик - " + getName()
//                + "; благородство - " + getNobility()
//                + "; честь - " + getHonor()
//                + "; храбрость - " + getBravery();
//    }
}

