public abstract class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gryffindor harry = new Gryffindor(60,  75,"Гарри Потер", 80, 80, 60);
        Gryffindor germiona = new Gryffindor(40, 37, "Гермиона Грейнджер", 75, 40, 50);
        Gryffindor ron = new Gryffindor(40, 45, "Рон Уизли", 30, 60, 90);
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);

//        Gryffindor Gryffindor = new Gryffindor();
//        Gryffindor gryffindor = new Gryffindor();
//        gryffindor.studentGryffindor("Гарри Потер", 80, 20, 60);
//        gryffindor gryffindor("Гарри Потер", 80, 20, 60);
////        Gryffindor Gryffindor("Гарри Потер", 80, 20, 60);
//        Gryffindor.studentGryffindor("Гермиона Грейнджер", 40, 40, 50);
//        gryffindor.studentGryffindor("Рон Уизли", 30, 50, 90);
//        System.out.println(gryffindor.studentGryffindor());

    }
}
