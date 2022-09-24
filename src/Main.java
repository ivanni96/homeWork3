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



    }}
