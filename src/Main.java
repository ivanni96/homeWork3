public class Main {
    public static void main(String[] args) {

        byte otradny = 50;
        System.out.println(otradny);
        short samara = 2000;
        System.out.println(samara);
        int ufa = 1500;
        System.out.println(ufa);
        long moscow = 28000;
        System.out.println(moscow);
        float buzuluk = 2000/20;
        System.out.println(buzuluk);
        double chelyabinsk = 1500.1234;
        System.out.println(chelyabinsk);

        double cucumber = 27.12;
        System.out.println(cucumber);
        long melon = 987_678_965_549L;
        System.out.println(melon);
        double tomato = 2.786;
        System.out.println(tomato);
        boolean cucumberLength = cucumber < 10;
        System.out.println(cucumberLength);
        short waterMelon = 569;
        System.out.println(waterMelon);
        short pumpkin =  - 159;
        System.out.println(pumpkin);
        short onion = 27897;
        System.out.println(onion);
        byte garlic = 67;
        System.out.println(garlic);

        byte LP = 23;
        System.out.println(LP);
        byte AS = 27;
        System.out.println(AS);
        byte EA = 30;
        System.out.println(EA);
        short piecesOfPaper = 480;
        System.out.println( piecesOfPaper + " листов");
        int allStudents = LP + AS + EA;
        System.out.println( allStudents + " человек");
        int oneStudentPops = piecesOfPaper / allStudents;
        System.out.println("На каждого ученика рассчитано "+ oneStudentPops + " листов бумаги" );

        byte machinePerformance2minutes = 16;
        float machinePerformanceMin = machinePerformance2minutes / 2;
        float min20p = machinePerformanceMin * 20;
        System.out.println("за 20 минут машина произвела бутылок "+ min20p+ " штук");
        float dayP = machinePerformanceMin * 1440;
        System.out.println("за сутки машина произвела бутылок "+ dayP + " штук");
        float day3p = dayP * 3;
        System.out.println("за три дня машина произвела бутылок "+ day3p + " штук");
        float monthP = dayP * 30;
        System.out.println("за месяц машина произвела бутылок "+ monthP + " штук");

        byte cansOfPaint = 120;
        byte whiteCansOnClassroom = 2;
        byte brownCansOnClassroom = 4;
        int cansOnClassroom = whiteCansOnClassroom + brownCansOnClassroom;
        float numberOfClassrooms = cansOfPaint / cansOnClassroom;
        float whiteCans = numberOfClassrooms * whiteCansOnClassroom;
        float brownCans = numberOfClassrooms * brownCansOnClassroom;
        System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        byte numbersOfBananas = 5;
        float bananaWeight = 80;
        float weightOfBananas = bananaWeight * numbersOfBananas;
        byte milk100mlWeight = 105;
        float milkWeight = (200/100) * milk100mlWeight;
        byte numbersOfiIceCream = 2;
        float iceCreamWeight1 = 100;
        float iceCreamWeight = numbersOfiIceCream * iceCreamWeight1;
        byte numberOfEggs = 4;
        float eggWeight = 70;
        float eggsWeight = numberOfEggs * eggWeight;

        float breakfastWeight = weightOfBananas + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("вес завтрака в граммах, составляет " + breakfastWeight);
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("вес завтрака в килограммах составляет " + breakfastWeightKg);

        byte totalWeightKg = 7;
        float totalWeightGr = totalWeightKg * 1000;
        float dayFit250 = totalWeightGr / 250;
        System.out.println(dayFit250 + " потребуется дней на похудение, если будет терять 250 гр/день");
        float dayFit500 = totalWeightGr / 500;
        System.out.println(dayFit500 + " потребуется дней на похудение, если будет терять 500 гр/день");
        float middleFitGr = (250 + 500) / 2;
        System.out.println(middleFitGr);
        float middleFitDay = totalWeightGr / middleFitGr;
        System.out.println(middleFitDay + " потребуется дней на похудение, если будет терять по среднему значению в день" );
        float middleFit = middleFitDay % totalWeightGr;
        System.out.println(middleFit + " потребуется дней на похудение, если будет терять по среднему значению в день");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        double masha10 = masha + (masha * 0.1);
        System.out.println(masha10);
        double denis10 = denis + (denis * 0.1);
        System.out.println(denis10);
        double kristina10 = kristina + (kristina * 0.1);
        System.out.println(kristina10);


        double difMasha = (masha10 * 12) - (masha * 12);
        System.out.println(difMasha);
        double difDenis = (denis10 * 12) - (denis * 12);
        System.out.println(difDenis);
        double difKristina = (kristina10 * 12) - (kristina * 12);
        System.out.println(difKristina);
        System.out.println("Маша теперь получает "+ masha10 + " рублей. Годовой доход вырос на " + difMasha + " рублей");
        System.out.println("Денис теперь получает "+ denis10 + " рублей. Годовой доход вырос на " + difDenis + " рублей");
        System.out.println("Кристина теперь получает "+ kristina10 + " рублей. Годовой доход вырос на " + difKristina + " рублей");



        }









    }
