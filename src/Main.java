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
        //Задача 5
        byte numberOfCans = 120;
        byte brownPaint = 2;
        byte whitePaint = 4;
        int numberOfClasses = numberOfCans / (whitePaint + brownPaint);
        int amountOfWhitePaint = numberOfClasses * whitePaint;
        int amountOfBrownPaint = numberOfClasses * brownPaint;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + amountOfWhitePaint + " банок белой краски и " + amountOfBrownPaint + " банок коричневой краски");
        // Задача 6
        byte banana = 5;
        short milk = 200;
        byte iceCream = 2;
        byte egg = 4;
        byte gramBanana = 80;
        byte oneMlMilk = 105;
        byte gramIceCream = 100;
        byte gramEgg = 70;
        int gramMilk = milk / 100;
        int justGrams = (banana * gramBanana) + (oneMlMilk * gramMilk) + (iceCream * gramIceCream) + (egg * gramEgg);
        System.out.println("Количество грамм в спортзавтраке составляет " + justGrams + " грамм");
        int grPerKg = 1000;
        float weightKg = justGrams / (float) grPerKg;
        System.out.println("Количество кг в спортзавтраке составляет " + weightKg + " кг");
        //Задача 7
        byte weight = 7;
        short gramWeight1 = 250;
        short gramWeight2 = 500;
        int day1 = weight * 1000 / gramWeight1;
        System.out.println(day1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        int day2 = weight * 1000 / gramWeight2;
        System.out.println(day2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int daysOnAverage = (day1 + day2) / 2;
        System.out.println(daysOnAverage + " дней может потребоваться в среднем, чтобы добиться результата похудения");
        // Задача 8
        int wagesMasha = 67760;
        int wagesDenis = 83690;
        int wagesKristina = 76230;
        byte month = 12;
        float percentageIncrease = 0.10f;
        //Маша
        float increaseMasha = wagesMasha * percentageIncrease;
        float increaseWagesMasha = wagesMasha + increaseMasha;
        int annualIncomeMashaOld = wagesMasha * month;
        float annualIncomeMashaNew = increaseWagesMasha * month;
        float annualIncomeDifferenceMasha = annualIncomeMashaNew - annualIncomeMashaOld;
        System.out.println("Маша теперь получает " + increaseWagesMasha + " рублей. Годовой доход вырос на " + annualIncomeDifferenceMasha + " рублей");
       //Денис
        float increaseDenis = wagesDenis * percentageIncrease;
        float increaseWagesDenis = wagesDenis + increaseDenis;
        int annualIncomeDenisOld = wagesDenis * month;
        float annualIncomeDenisNew = increaseWagesDenis * month;
        float annualIncomeDifferenceDenis = annualIncomeDenisNew - annualIncomeDenisOld;
        System.out.println("Денис теперь получает " + increaseWagesDenis + " рублей. Годовой доход вырос на " + annualIncomeDifferenceDenis + " рублей");
        //Кристина
        float increaseKristina = wagesKristina * percentageIncrease;
        float increaseWagesKristina = wagesKristina + increaseKristina;
        int annualIncomeKristinaOld = wagesKristina * month;
        float annualIncomeKristinaNew = increaseWagesKristina * month;
        float annualIncomeDifferenceKristina = annualIncomeKristinaNew - annualIncomeKristinaOld;
        System.out.println("Кристина теперь получает " + increaseWagesKristina + " рублей. Годовой доход вырос на " + annualIncomeDifferenceKristina + " рублей");


















    }
}
