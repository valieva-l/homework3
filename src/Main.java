public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 200000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 99;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 28453;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = -47857412;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 2.9642f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = -0.9878256358;
        System.out.println("Значение переменной f с типом double равно " + f);
        //Задача 2
        float astra = 27.12f;
        System.out.println(astra);
        long adenium = 987678965549L;
        System.out.println(adenium);
        float lily = 2.786f;
        System.out.println(lily);
        short dandelion = 569;
        System.out.println(dandelion);
        short iris = -159;
        System.out.println(iris);
        short chamomile = 27897;
        System.out.println(chamomile);
        byte azalea = 67;
        System.out.println(azalea);
        //Задача 3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short sheetsOfPaper = 480;
        int numberOfSheets = sheetsOfPaper / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + numberOfSheets + " листов бумаги");
        // Задача 4
        byte numberOfBottles = 16;
        byte numberOfMinutes = 2;
        byte minutes1 = 20;
        int machinePerformance1 = minutes1 * (numberOfBottles / numberOfMinutes);
        System.out.println("За 20 минут машина произвела " + machinePerformance1 + " штук бутылок");
        short minutes2 = 1440;
        int machinePerformance2 = minutes2 * (numberOfBottles / numberOfMinutes);
        System.out.println("За сутки машина произвела " + machinePerformance2 + " штук бутылок");
        short minutes3 = 4320;
        int machinePerformance3 = minutes3 * (numberOfBottles / numberOfMinutes);
        System.out.println("За 3 дня машина произвела " + machinePerformance3 + " штук бутылок");
        int minutes4 = 44640;
        int machinePerformance4 = minutes4 * (numberOfBottles / numberOfMinutes);
        System.out.println("За 1 месяц машина произвела " + machinePerformance4 + " штук бутылок");

    }
}
