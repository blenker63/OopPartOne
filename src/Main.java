public abstract class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Потер",60,  75, 80, 80, 60);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 40, 37, 85, 40, 50);
        Gryffindor ron = new Gryffindor("Рон Уизли", 40, 45, 30, 60, 90);
        System.out.println("Гриффиндор");
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        harry.determineBestStudentGryffindor(germiona);
        System.out.println();

        System.out.println("Пуффендуй");
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 55,  60, 44, 36, 42);
        Hufflepuff sedric = new Hufflepuff("Седрик Дигтори",25,  66, 72, 56, 53);
        Hufflepuff djastin = new Hufflepuff("Маркус Белби", 48,  33,22, 48, 61);
        System.out.println(zaharia);
        System.out.println(sedric);
        System.out.println(djastin);
        zaharia.determineBestStudentHufflepuff(sedric);
        System.out.println();

        System.out.println("Когтевран");
        Ravenclaw chgou = new Ravenclaw("Чжоу Чанг", 44,  33,66, 48, 56);
        Ravenclaw padma = new Ravenclaw("Падма Пагил",66,  55, 68, 33, 43);
        Ravenclaw markus = new Ravenclaw("Маркус Белби",43,  48, 55, 22, 33);
        System.out.println(chgou);
        System.out.println(padma);
        System.out.println(markus);
        padma.determineBestStudentRavenclaw(markus);
        System.out.println();

        System.out.println("Слизерин");
        Slytherin drako = new Slytherin("Драко Малфой",66,  46, 42, 33, 55);
        Slytherin grekhem = new Slytherin("Грэхэм Монтегю",28,  33, 44, 66, 77);
        Slytherin gregory = new Slytherin("Грегори Гойл", 54,  66,38, 51, 61);
        System.out.println(drako);
        System.out.println(grekhem);
        System.out.println(gregory);
        drako.determineBestStudentSlytherin(gregory);
        System.out.println();

        harry.determineBestStudentHogwarts(drako);
    }
}
