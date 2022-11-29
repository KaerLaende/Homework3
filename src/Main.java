public class Main {
    public static void main(String[] args) {
        // Переменные.Часть 2
        // Задача 1
        System.out.println("Задача 1");
        byte firstByte= 127;
        short firstShort = 32767;
        int firstInt= 2147483647;
        long firstLong= 1L;
        double firstDouble= 1.1;
        float firstFloat=  0.1f;
        System.out.println("Значение переменной firstByte с типом byte равно "+firstByte);
        System.out.println("Значение переменной firstShort с типом short равно "+firstShort);
        System.out.println("Значение переменной firstInt с типом int равно "+firstInt);
        System.out.println("Значение переменной firstLong с типом Long равно "+firstLong);
        System.out.println("Значение переменной firstDouble с типом double равно "+firstDouble);
        System.out.println("Значение переменной firstFloat с типом float равно "+firstFloat);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        /*Значения:

    27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
    Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).*/
        byte a =67;
        short b=-159;
        int c=569;
        int d=27897;
        long e=987678965549L;
        float f=27.12f;
        double g =2.786;
        boolean wtf=false; //=))

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(wtf);
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        byte lydmilaPavlovna = 23;
        short annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        long paper = 480L;
        int list = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + (paper/list) + " листов бумаги.");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");

        byte performance = 16/2;
        int perf20Min = performance * 20;
        System.out.println("За 20 минут работы машина произвела бутылок - " + perf20Min + " штук.");
        int perfDay= performance * 60*24;
        System.out.println("За сутки работы машина произвела бутылок - " + perfDay + " штук.");
        int perf3Days = perfDay * 3;
        System.out.println("За три дня работы машина произвела бутылок - " + perf3Days + " штук.");
        int perfMonth = perfDay * 30;
        System.out.println("За месяц работы машина произвела бутылок - " + perfMonth + " штук.");
        System.out.println();

        //задача 5
        System.out.println("Задача 5");

        short allPaint = 120;
        byte WhitePaint = 2;
        byte BrownPaint = 4;
        int classroomPaints = BrownPaint + WhitePaint;
        int classroom = allPaint / classroomPaints;
        System.out.println("В школе, где " + classroom + " классов, нужно " + (classroom * WhitePaint) + " банок белой краски и " + (classroom * BrownPaint) + " банок коричневой краски.");
        System.out.println();

        // задача 6
        System.out.println("Задача 6");
        /*
        Бананы – 5 штук (1 банан - 80 грамм);
    Молоко – 200 мл (100 мл = 105 грамм);
    Мороженое пломбир – 2 брикета по 100 грамм;
    Яйца сырые – 4 яйца (1 яйцо - 70 грамм).*/
        int weightBanana = 80 * 5;
        int weightMilk = 105 * 2;
        int weightPlombir = 100 * 2;
        int weightEgs = 4 * 70;
        int weightAllGr = weightBanana + weightMilk + weightPlombir + weightEgs;
        float weightAllKg = weightAllGr/ 100f;
        System.out.println("Общий вес спорт-завтрака нашего спортсмена составляет " + weightAllGr + " грамм, (или " + weightAllKg + " килограмм)." );
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");

        int weight = 7;
        double firstDiet = 0.250;
        double secondDiet = 0.500;
        var dayFirstDiet=weight/firstDiet;
        var daySecondDiet=weight/secondDiet;
        var midleDiet=(dayFirstDiet+daySecondDiet)/2;
        System.out.println("Если спортсмен будет худеть на " + firstDiet*1000 + " грамм в день, то он похудеет на " + weight + "кг через " + dayFirstDiet + " дней.");
        System.out.println("Если спортсмен будет худеть на " + secondDiet*1000 + " грамм в день, то он похудеет на " + weight + "кг через " + daySecondDiet + " дней.");
        System.out.println("В среднем спортсмену потребуется "+ midleDiet+ " дeнь худеть");
        System.out.println();

        //Задача 8
        System.out.println("Задача 8");

        int mashaIncome = 67760;
        int denisIncome = 83690;
        int kristinaIncome = 76230;
        double mashaIncome110 = mashaIncome + (mashaIncome * 0.1);
        double denisIncome110 = denisIncome + (denisIncome * 0.1);
        double kristinaIncome110 = kristinaIncome + (kristinaIncome * 0.1);
        double mashaIncomeYears =mashaIncome110 *12;
        double denisIncomeYears =denisIncome110 *12;
        double kristinaIncomeYears = kristinaIncome110*12;
        System.out.println("Маша теперь получает " + mashaIncome110 + " рублей. Годовой доход вырос на " + (mashaIncomeYears - (mashaIncome*12)) + " рублей");
        System.out.println("Денис теперь получает " + denisIncome110 + " рублей. Годовой доход вырос на " + (denisIncomeYears - (denisIncome*12)) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncome110 + " рублей. Годовой доход вырос на " + (kristinaIncomeYears - (kristinaIncome*12)) + " рублей");
        System.out.println("\n");
        System.out.println("Конец!");
    }

}