public class Main {
    public static void main(String[] args) {
     //Задание 1

     byte cat = 1;
     short mouse = 3;
     int dog = 7;
     long elephant = 110L;
     float saltWeight = 1.5f;
     double sugarWeight = 4.5;
     char bar = 35;
     boolean dogIsAdult = dog > 10;
     System.out.println(dogIsAdult);

     //Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxerWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + boxerWeight + " кг");
        double weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг");

        //Задание 3

        short bananas = 5;
        short weightOneBananas = 80;
        int totalBananas = bananas * weightOneBananas;
        short milk = 200;
        short weightOfOneHundredMillilitersOfMilk = 105;
        int totalMilk = weightOfOneHundredMillilitersOfMilk * 2;
        short iceCreamSundae = 2;
        short weightOneBriquetteIceCreamSundae = 100;
        int totalIceCreamSundae = iceCreamSundae * weightOneBriquetteIceCreamSundae;
        short eggs = 4;
        short weightOneEggs = 70;
        int totalEggs = eggs * weightOneEggs;
        int weightGr = totalBananas + totalMilk + totalIceCreamSundae + totalEggs;
        System.out.println("Вес завтрака " + weightGr + " грамм");
        int grPerKg = 1000;
        float weightKg = weightGr / (float)grPerKg;
        System.out.println("Вес завтрака " + weightKg + " кг");

        //Задача 4

        int excessWeight = 7;
        double loseWeight1 = 0.250;
        double loseWeight2 = 0.500;
        double dayToLoseWeight1 = excessWeight / loseWeight1;
        System.out.println("При первом условии понадобится " + dayToLoseWeight1 + " дней");
        double dayToLoseWeight2 = excessWeight / loseWeight2;
        System.out.println("При втором условии понадобится " + dayToLoseWeight2 + " дней");
        double averageDayToLoseWeight = (dayToLoseWeight1 + dayToLoseWeight2) / 2;
        System.out.println("В среднем понадобится " + averageDayToLoseWeight + " дней");

        //Задача 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaNew = masha * 0.1 + masha;
        double denisNew = denis * 0.1 + denis;
        double kristinaNew = kristina * 0.1 + kristina;
        double yearMasha = masha * 12;
        double yearDenis = denis * 12;
        double yearKristina = kristina * 12;
        double yearMashaNew = mashaNew * 12;
        double yearDenisNew = denisNew * 12;
        double yearKristinaNew = kristinaNew * 12;
        double differenceMasha = yearMashaNew - yearMasha;
        double differenceDenis = yearDenisNew - yearDenis;
        double differenceKristina = yearKristinaNew - yearKristina;
        System.out.println("Маша теперь получает " + mashaNew + " рублей");
        System.out.println("Годовой доход Маши вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + differenceKristina + " рублей");




    }
    }



