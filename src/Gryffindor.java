public class Gryffindor {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;
    private String studentGryffindor;

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

    public String getStudentGryffindor() {
        return studentGryffindor;
    }


    //    public void setName(String name) {
//        this.name = name;
//    }
    public String getStudentGryffindor = "Факультет Гриффиндор, "
            + "ученик - " + getName()
            + "; благородство - " + getNobility()
            + "; честь - " + getHonor()
            + "; храбрость _ " + getBravery();{
        System.out.println(getStudentGryffindor);
    }
}