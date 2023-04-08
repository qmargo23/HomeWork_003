public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1  (про теннисные мячики)");
        byte packingBalls = 100;
        System.out.println("Значение переменной packingBalls (количество  мячей в упаковке) с типом (byte) равно  " +packingBalls);
        short palletBalls = 12000;
        System.out.println("Значение переменной palletBalls (количество  мячей в поддоне) с типом (short) равно  " +palletBalls);
        int containerBalls = palletBalls * 9;
        System.out.println("Значение переменной containerBalls (количество  мячей в контейнере) с типом (int) равно " +containerBalls);
        long cargoBalls = 2000000000;
        System.out.println("Значение переменной cargoBalls (количество  мячей в грузе) с типом (long) равно " +cargoBalls);
        float diameterBall = 2.63F;
        System.out.println("Значение переменной diameterBall (диаметр  мяча в дюймах) с типом (float) равно  " +diameterBall);
        double deformationBall = 0.495675456;
        System.out.println("Значение переменной deformationBall (прямая деформация мяча) с типом (double) равно  " +deformationBall);
        System.out.println("_____________________________________________________________");
    }

    public static void task2 () {
        //System.out.println("_____________________________________________________________");
        System.out.println("Задача 2 (Инициализация переменных)");
        float packageWeight = 27.12f;
        System.out.println("тип (float)  "+packageWeight+"  - возможно - вес посылки");
        long charactersInText = 987_678_965_549L;
        System.out.println("тип (long)   "+charactersInText+"  - возможно - количество символов в тексте");
        double remainderDivision = 2.786;
        System.out.println("тип (double)  "+remainderDivision+"  - возможно - результат деления");
        short cvc = 569;
        System.out.println("тип (short)  "+cvc+"  - возможно - значение cvc карты");
        short balance = -159;
        System.out.println("тип (short)  "+balance+"  - возможно - значение сальдо");
        int voting = 27_897;
        System.out.println("тип (int)  "+voting+"  - возможно - число проголосовавших");
        byte regionRF = 67;
        System.out.println("тип (byte)   "+regionRF+"  - возможно - Код субъекта Российской Федерации ");
        System.out.println("_____________________________________________________________");
    }
    public static void task3 () {
        System.out.println("Задача 3 (про закупку)");
        short LyudmilaPavlovna = 23;
        short AnnaSergeevna = 27;
        short EkaterinaAndreevna = 30;
        short procurement  = 480;

        short amountPaper = (short) ((procurement)/(LyudmilaPavlovna+AnnaSergeevna+EkaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано  по "+ amountPaper+"  листов бумаги");
        System.out.println("_____________________________________________________________");
    }

    public static void task4 () {
        System.out.println("Задача 4 ( про производительность машины)");
        // efficiency  bottle  time  task
        byte bottle = 16;
        byte time = 2;
        int efficiency = bottle/time;// вычисляем эфективность в минуту

        byte task_01 = 20;
        int calculation_20min = task_01*efficiency; // вычисляем эфективность за 20 мин
        System.out.println("За "+task_01+" мин машина произвела "+calculation_20min+" штук бутылок");

        short task_02 = 24*60;//  в сутках 24 часа по 60 мин
        int calculation_Day = task_02*efficiency;// вычисляем эфективность за сутки
        System.out.println("За сутки машина произвела "+calculation_Day+" штук бутылок");

        int task_03 = task_02*3;
        int calculation_3Day = task_03*efficiency;//вычисляем эфективность за 3 дня
        System.out.println("За 3 дня машина произвела "+calculation_3Day+" штук бутылок");

        int task_04 = task_02*30;//принимаем что в месяце 30 дней
        int calculationMonth = task_04*efficiency;//вычисляем эфективность за месяц
        System.out.println("За месяц машина произвела "+calculationMonth+" штук бутылок");
        System.out.println("_____________________________________________________________");
    }
    public static void task5 () {
        System.out.println("Задача 5 (про школу)");
        // quantity whitePaint  blackPaint   oneClass   totalClass
        short quantity = 120;
        byte whitePaint = 2;
        byte blackPaint = 4;
        int oneClass = whitePaint+blackPaint;//количество краски на 1 класс
        int totalClass = quantity/oneClass;// количество классов в школе
        int quantityWhitePaint = totalClass * whitePaint;// банки с белой краской
        int quantityBlackPaint = totalClass * blackPaint;// банки с черной краской
        System.out.println("В школе, где "+totalClass+"  классов, нужно "+quantityWhitePaint+" банок белой краски и "+quantityBlackPaint+" банок коричневой краски");
        System.out.println("_____________________________________________________________");
    }


    public static void task6 () {
        System.out.println("Задача 6 (завтрак спортсменов)");
        // Bananas Milk Ice cream   eggs  weight breakfast convert
        byte bananas = 5;
        byte weightBananas = 80;
        short totalWeightBananas = (short) (bananas*weightBananas);// общий вес бананов в граммах

        short milk = 200;
        short weightMilk = 105;
        short totalWeightMilk = (short) (milk/100*weightMilk);// вес молока в граммах

        byte iceCream  = 2;
        byte weightIceCream = 100;
        short totalWeightIceCream = (short) (iceCream*weightIceCream);// вес мороженого в граммах

        byte eggs = 4;
        byte weightEggs = 70;
        short totalWeightIceEggs = (short) (eggs*weightEggs);// вес яйца в граммах

        int breakfastGR = totalWeightBananas+totalWeightMilk+totalWeightIceCream+totalWeightIceEggs;// вес завтрака в гр
        //System.out.println(breakfastGR);//проверка1
        float convert = breakfastGR/1000f;// перевод в кг
        //System.out.println(convert);//проверка2

        System.out.println("завтрак спортсменов в гр = "+breakfastGR+" (гр) состав: Бананы — 5 штук, Молоко — 200 мл, Мороженое-пломбир — 2 брикета, Яйца сырые – 4 яйца");
        System.out.println("завтрак спортсменов в кг =  "+convert+" (кг) состав: Бананы — 5 штук, Молоко — 200 мл, Мороженое-пломбир — 2 брикета, Яйца сырые – 4 яйца");
        System.out.println("_____________________________________________________________");
    }
    public static void task7 () {
        System.out.println("Задача 7 (надо похудеть на 7 кг)");
        // achieve (7) lose weight (250-500) fastValue slowValue  middleValue
        byte achieve = 7;// цель похудения
        short fastValue = 500;//похудеть быстро в день
        short slowValue = 250;//похудеть медленно в день

        short loseWeightFast = (short) (achieve*1000/fastValue);// количество дней  быстрого похудения
        System.out.println("можно похудеть быстро за "+loseWeightFast+" дней (теряя по "+fastValue+"гр в день)");

        short loseWeightSlow = (short) (7*1000/slowValue);// количество дней  медленного похудения
        System.out.println("можно похудеть медленно за "+loseWeightSlow+" дней (теряя по "+slowValue+"гр в день)");

        short middleValueDays = (short) ((loseWeightFast+loseWeightSlow)/2);
        short middleValueGr = (short) ((fastValue+slowValue)/2);
        System.out.println("в среднем можно похудеть  за "+middleValueDays+" дней (теряя по "+middleValueGr+"гр в день)");
        System.out.println("_____________________________________________________________");
    }

    public static void task8 () {
        System.out.println("Задача 8 (повышение зарплаты 3 сотрудникам)");
        // Masha(67 760) Denis(83 690) Christina(76 230) salary  indexRise  payRise improve
        float salaryMasha = 67_760f;// текущая зарплата Маши
        //System.out.println(salaryMasha);
        float salaryDenis = 83_690f;//текущая зарплата Дениса
        float salaryChristina = 76_230f;//текущая зарплата Кристины
        float indexRise = 10f;// индекс повышение зарплаты

        float payRiseMasha = salaryMasha/100*indexRise;// зарплата Маши повысилась на payRiseMasha
        //System.out.println(payRiseMasha);
        float payRiseDenis = salaryDenis/100*indexRise;// зарплата Дениса повысилась на payRiseDenis
        float payRiseChristina = salaryChristina/100*indexRise;// зарплата Кристины повысилась на payRiseChristina

        float payRiseMashaImprove = salaryMasha + payRiseMasha;//зарплата Маши после повышения
        //System.out.println(payRiseMashaImprove);
        float payRiseDenisImprove = salaryDenis + payRiseDenis;//зарплата Дениса после повышения
        float payRiseChristinaImprove = salaryChristina + payRiseChristina;//зарплата Кристины после повышения

        System.out.println("Зарплата Маши до повышения - ("+salaryMasha+")р. Зарплата Маши после повышения  - ("+payRiseMashaImprove+") р. в месяц. Годовой доход вырос на ("+payRiseMasha*12+")р.");
        System.out.println("Зарплата Дениса до повышения - ("+salaryDenis+")р. Зарплата Дениса после повышения  - ("+payRiseDenisImprove+") р. в месяц. Годовой доход вырос на ("+payRiseDenis*12+")р.");
        System.out.println("Зарплата Кристины до повышения - ("+salaryChristina+")р. Зарплата Кристины после повышения  - ("+payRiseChristinaImprove+") р. в месяц. Годовой доход вырос на ("+payRiseChristina*12+")р.");
        System.out.println("_____________________________________________________________");

    }

}