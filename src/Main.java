public abstract class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gryffindor harry = new Gryffindor(60,  75,"Гарри Потер", 80, 80, 60);
        Gryffindor germiona = new Gryffindor(40, 37, "Гермиона Грейнджер", 75, 40, 50);
        Gryffindor ron = new Gryffindor(40, 45, "Рон Уизли", 30, 60, 90);
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        System.out.println();
        Hufflepuff zaharia = new Hufflepuff(55,  60,"Захария Смит", 44, 36, 42);
        Hufflepuff sedric = new Hufflepuff(25,  66,"Седрик Дигтори", 72, 56, 53);
        Hufflepuff djastin = new Hufflepuff(48,  33,"Маркус Белби", 22, 48, 61);
        System.out.println(zaharia);
        System.out.println(sedric);
        System.out.println(djastin);
        System.out.println();
        Ravenclaw chgou = new Ravenclaw(44,  33,"Чжоу Чанг", 66, 48, 56);
        Ravenclaw padma = new Ravenclaw(66,  55,"Падма Пагил", 68, 33, 43);
        Ravenclaw markus = new Ravenclaw(43,  48,"Маркус Белби", 55, 22, 33);
        System.out.println(chgou);
        System.out.println(padma);
        System.out.println(markus);
        System.out.println();
        Slytherin drako = new Slytherin(66,  46,"Драко Малфой", 42, 33, 55);
        Slytherin grekhem = new Slytherin(28,  33,"Грэхэм Монтегю", 44, 66, 77);
        Slytherin gregory = new Slytherin(54,  66,"Грегори Гойл", 38, 51, 61);
        System.out.println(drako);
        System.out.println(grekhem);
        System.out.println(gregory);


    }
}
