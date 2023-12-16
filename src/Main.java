public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 12;
        if (age >= 18) {System.out.println ( "Если возраст человека равен " + age + " он совершеннолетний.");}
        else {System.out.println ( "Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");}

        int temperature = 2;
        if (temperature >= 5) {System.out.println ( " На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки" );}
        else {System.out.println ( " На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");}

        int speed = 60;
        if (speed <= 60) {System.out.println ( " Если скорость " + speed + " ,то можно ездить спокойно." );}
        else {System.out.println ( " Если скорость " + speed + " ,то придется заплатить штраф");}

        if (age >= 2 && age <= 6 ) {System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");}
        if (age >= 7 && age <= 17 ) {System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");}
        if (age >= 18 && age <= 23 ) {System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в институт");}
        if (age >= 24 ) {System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");}

        int kidAge = 15;
        if (kidAge < 5 ) {System.out.println("Если возраст ребенка равен " + kidAge + " , то ему кататься на атракционе нельзя");}
        if (kidAge >= 5 && kidAge < 14 ) {System.out.println("Если возраст ребенка равен " + kidAge + " , то ему можно кататься на атракционе в сопровождении взрослого");}
        if (kidAge >= 14 ) {System.out.println("Если возраст ребенка равен " + kidAge + " , то ему можно кататься на атракционе без сопровождения взрослого");}

        int trainCapacity = 102;
        int seatPlaces = 60;
        int standPlaces = trainCapacity - seatPlaces;
        int seatTicketsSold = 60;
        int standTicketsSold = 42;
        int freeSeatPlaces = seatPlaces - seatTicketsSold;
        int freeStandPlaces = standPlaces - standTicketsSold;
        int freePlaces = trainCapacity - seatTicketsSold -standTicketsSold;

        if (freePlaces >= 1) {System.out.println( "В вагоне есть " + freeSeatPlaces + " свободных сидячих мест и " + freeStandPlaces + " свободных стоячих мест");}
        else {System.out.println( "В вагоне нет свободных мест");}

        int one = 8;
        int two = 9;
        int three = 1;
        if (one > two && one > three) {System.out.println(one);}
        if (two > one && two > three) {System.out.println(two);}
        if (three > one && three > one) {System.out.println(three);}





            }
}