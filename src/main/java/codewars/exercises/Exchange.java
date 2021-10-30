package codewars.exercises;

//The new "Avengers" movie has just been released!
// There are a lot of people at the cinema box office standing in a huge line.
// Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
//
//Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
//
//Can Vasya sell a ticket to every person and give change if he initially has no money and
// sells the tickets strictly in the order people queue?
//
//Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment.
// Otherwise return NO.

public class Exchange {
    public static void main(String[] args) {

        int[] test1 = {25, 25, 50};
        int[] test2 = {25, 100};
        int[] test3 = {25, 25, 50, 50, 100};

        System.out.println(isPossibleToSellTicketsToTheEntireLine(test1));
        System.out.println(isPossibleToSellTicketsToTheEntireLine(test2));
        System.out.println(isPossibleToSellTicketsToTheEntireLine(test3));

    }


    public static String isPossibleToSellTicketsToTheEntireLine(int[] billsInTheLine) {
        int moneyInHand = 0;
        int ticketPrice = 25;
        String result = "";

        for (int j : billsInTheLine) {
            int moneyToReturn = j - ticketPrice;

            if (moneyToReturn <= moneyInHand) {
                moneyInHand = moneyInHand + ticketPrice;
                moneyInHand = moneyInHand - moneyToReturn;
                result = "yes";
            } else{
                result = "no";
                break;
            }
        }
        return result;
    }
}
