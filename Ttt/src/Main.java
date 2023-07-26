import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String targetQuads[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };

        menu();
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        if (key == 1) {
            menu2();
            key = scan.nextInt();
            if (key == 1) {
                playWithComputer();
            }
            if (key == 2) {
                playWithAi();
            }
        }

        if (key == 2) {
            infoMenu();
        }

        if (key == 3) {
            exitMenu();
        }
    }
    private static void exitMenu() {
        System.out.println("""
                                                
                        Good Luck Chaw
                                                
                        """);
    }
    private static void infoMenu() {
        System.out.println("""
                        1.Game Name: Tic Tac Toe
                                                
                        2.Author : NIma Tavana
                                                
                        3.Email : Nimatavana9207@gmail.com
                                                
                        """);

        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }
    private static void playWithAi() {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int n = 0;
        Boolean player1 = false;
        Boolean player2 = false;
        Boolean positionMessage = false;
        Boolean quadFound = false;
        String answer;
        String player;
        String quadrants[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
        String targetQuads[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };


        random();
        lock(targetQuads);


        System.out.println("---*** TIC-TAC-TOE ***---");

        // Prints array field
        for (int i = 0; i < targetQuads.length; i++) {
            System.out.print(targetQuads[i] + ",");
            if ((i + 1) % 4 == 0) {
                System.out.println("");
            }
        }

        while (a <= 13) {

            // Alternate player turns
            if (n % 2 == 0) {
                player = "x";
                System.out.println("It's your turn Player 1. (X)");
                answer = input.nextLine();
            } else {
                player = "o";
                System.out.println("It's your turn Player 2. (O)");
                answer = oneRandom();
            }
            // Input player quadrant


            int i;                                         // deleted
            outerloop:                                     // deleted
            for (i = 0; i < quadrants.length; i++) {
                if (answer.equals(quadrants[i]) && " " != targetQuads[i].intern()) {
                    positionMessage = true;
                    quadFound = true;
                    a--;
                    break outerloop;                      // deleted
                }
                if (answer.equalsIgnoreCase(quadrants[i])) {
                    targetQuads[i] = player;
                    quadFound = true;
                }
            }


            // checking the chances of  wining Player1
            if (targetQuads[0] == "x" && targetQuads[1] == "x" && targetQuads[2] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[4] == "x" && targetQuads[8] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[5] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[2] == "x" && targetQuads[3] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[5] == "x" && targetQuads[9] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[6] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[2] == "x" && targetQuads[6] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[2] == "x" && targetQuads[5] == "x" && targetQuads[8] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[3] == "x" && targetQuads[7] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[3] == "x" && targetQuads[6] == "x" && targetQuads[9] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[5] == "x" && targetQuads[6] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[8] == "x" && targetQuads[12] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[9] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[5] == "x" && targetQuads[6] == "x" && targetQuads[7] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[5] == "x" && targetQuads[10] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[2] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[10] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[9] == "x" && targetQuads[12] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[7] == "x" && targetQuads[11] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[7] == "x" && targetQuads[10] == "x" && targetQuads[13] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[8] == "x" && targetQuads[9] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[9] == "x" && targetQuads[10] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[9] == "x" && targetQuads[5] == "x" && targetQuads[13] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[12] == "x" && targetQuads[13] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[13] == "x" && targetQuads[14] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[1] == "x" && targetQuads[2] == "x") {
                player1 = true;
                a = 17;
            }


            // checking the chances of wining player2
            if (targetQuads[0] == "o" && targetQuads[1] == "o" && targetQuads[2] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[4] == "o" && targetQuads[8] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[5] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[2] == "o" && targetQuads[3] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[5] == "o" && targetQuads[9] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[6] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[2] == "o" && targetQuads[6] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[2] == "o" && targetQuads[5] == "o" && targetQuads[8] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[3] == "o" && targetQuads[7] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[3] == "o" && targetQuads[6] == "o" && targetQuads[9] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[5] == "o" && targetQuads[6] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[8] == "o" && targetQuads[12] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[9] == "o" && targetQuads[14] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[5] == "o" && targetQuads[6] == "o" && targetQuads[7] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[5] == "o" && targetQuads[10] == "o" && targetQuads[15] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[2] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[10] == "o" && targetQuads[14] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[9] == "o" && targetQuads[12] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[7] == "o" && targetQuads[11] == "o" && targetQuads[15] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[7] == "o" && targetQuads[10] == "o" && targetQuads[13] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[8] == "o" && targetQuads[9] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[9] == "o" && targetQuads[10] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[9] == "o" && targetQuads[5] == "o" && targetQuads[13] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[12] == "o" && targetQuads[13] == "o" && targetQuads[14] == "o") {
                player2= true;
                a = 17;
            }
            if (targetQuads[13] == "o" && targetQuads[14] == "o" && targetQuads[15] == "o") {
                player2= true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[1] == "o" && targetQuads[2] == "o") {
                player2 = true;
                a = 17;
            }

            // Prints array field
            for (i = 0; i < targetQuads.length; i++) {
                System.out.print(targetQuads[i] + ",");
                if ((i + 1) % 4 == 0) {
                    System.out.println("");
                }
            }

            // Prints out error messages if the player does not follow rules

            if(positionMessage == true) {
                System.out.println("That position is already used.");
            }
            if(quadFound == false && positionMessage == false) {
                System.out.println("The string " + '"' + answer + '"' + " did not match any quadrant number. (1-16)");
                a--;
            }

            n++;
            a++;

        }

        // Checks the winner
        if (player1) {
            System.out.println("Player 1 wins!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithAi();
            }

            else {
                System.exit(0);
            }
        }
        if (player2) {
            System.out.println("Player 2 wins!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithAi();
            }

            else {
                System.exit(0);
            }
        }
        else {
            System.out.println("It's a draw!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithAi();
            }

            else {
                System.exit(0);
            }
        }
    }

    public static void random() {

        int[] locked = new int[3];

        // Choosing The Random Numbers
        for (int i = 0; i < 3; i++) {
            int result = (int) Math.round(Math.random() * 15);
            result = result + 1;
            locked[i] = result;
        }
    }

    public static void menu() {
        System.out.println("""
                    w e l c o m e
                       1.play
                       2.info
                       3.exit          
                """);
    }

    public static void menu2() {
        System.out.println("""
                            1.Player VS Player
                                                    
                            2.player VS AI
                            """);
    }

    public static void lock(String[] targetSquare){

        int i =0;
        while (i !=3){
            int result = (int) Math.round(Math.random() * 15);

            if(targetSquare[result]!="#"){
                targetSquare[result] = "#";
                i++;
            }
        }
    }

    public static String oneRandom(){

        int result = (int) Math.round(Math.random() * 15);
        result = result + 1;
        String str = Integer.toString(result);
        return str;
    }

    public static void playWithComputer() {

        Scanner input = new Scanner(System.in);
        int a = 1;
        int n = 0;
        Boolean player1 = false;
        Boolean player2 = false;
        Boolean positionMessage = false;
        Boolean quadFound = false;
        String answer;
        String player;
        String quadrants[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
        String targetQuads[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };


        random();
        lock(targetQuads);


        System.out.println("---*** TIC-TAC-TOE ***---");

        // Prints array field
        for (int i = 0; i < targetQuads.length; i++) {
            System.out.print(targetQuads[i] + ",");
            if ((i + 1) % 4 == 0) {
                System.out.println("");
            }
        }

        while (a <= 13) {

            // Alternate player turns
            if (n % 2 == 0) {
                player = "x";
                System.out.println("It's your turn Player 1. (X)");
            } else {
                player = "o";
                System.out.println("It's your turn Player 2. (O)");
            }
            // Input player quadrant
            System.out.println("What quadrant do you want? (1-16)");
            answer = input.nextLine();

            int i;                                         // deleted
            outerloop:                                     // deleted
            for (i = 0; i < quadrants.length; i++) {
                if (answer.equals(quadrants[i]) && " " != targetQuads[i].intern()) {
                    positionMessage = true;
                    quadFound = true;
                    a--;
                    break outerloop;                      // deleted
                }
                if (answer.equalsIgnoreCase(quadrants[i])) {
                    targetQuads[i] = player;
                    quadFound = true;
                }
            }


            // checking the chances of  wining Player1
            if (targetQuads[0] == "x" && targetQuads[1] == "x" && targetQuads[2] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[4] == "x" && targetQuads[8] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[5] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[2] == "x" && targetQuads[3] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[5] == "x" && targetQuads[9] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[1] == "x" && targetQuads[6] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[2] == "x" && targetQuads[6] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[2] == "x" && targetQuads[5] == "x" && targetQuads[8] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[3] == "x" && targetQuads[7] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[3] == "x" && targetQuads[6] == "x" && targetQuads[9] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[5] == "x" && targetQuads[6] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[8] == "x" && targetQuads[12] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[4] == "x" && targetQuads[9] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[5] == "x" && targetQuads[6] == "x" && targetQuads[7] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[5] == "x" && targetQuads[10] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[2] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[10] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[6] == "x" && targetQuads[9] == "x" && targetQuads[12] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[7] == "x" && targetQuads[11] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[7] == "x" && targetQuads[10] == "x" && targetQuads[13] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[8] == "x" && targetQuads[9] == "x" && targetQuads[10] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[9] == "x" && targetQuads[10] == "x" && targetQuads[11] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[9] == "x" && targetQuads[5] == "x" && targetQuads[13] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[12] == "x" && targetQuads[13] == "x" && targetQuads[14] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[13] == "x" && targetQuads[14] == "x" && targetQuads[15] == "x") {
                player1 = true;
                a = 17;
            }
            if (targetQuads[0] == "x" && targetQuads[1] == "x" && targetQuads[2] == "x") {
                player1 = true;
                a = 17;
            }


            // checking the chances of wining player2
            if (targetQuads[0] == "o" && targetQuads[1] == "o" && targetQuads[2] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[4] == "o" && targetQuads[8] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[5] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[2] == "o" && targetQuads[3] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[5] == "o" && targetQuads[9] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[1] == "o" && targetQuads[6] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[2] == "o" && targetQuads[6] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[2] == "o" && targetQuads[5] == "o" && targetQuads[8] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[3] == "o" && targetQuads[7] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[3] == "o" && targetQuads[6] == "o" && targetQuads[9] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[5] == "o" && targetQuads[6] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[8] == "o" && targetQuads[12] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[4] == "o" && targetQuads[9] == "o" && targetQuads[14] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[5] == "o" && targetQuads[6] == "o" && targetQuads[7] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[5] == "o" && targetQuads[10] == "o" && targetQuads[15] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[2] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[10] == "o" && targetQuads[14] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[6] == "o" && targetQuads[9] == "o" && targetQuads[12] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[7] == "o" && targetQuads[11] == "o" && targetQuads[15] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[7] == "o" && targetQuads[10] == "o" && targetQuads[13] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[8] == "o" && targetQuads[9] == "o" && targetQuads[10] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[9] == "o" && targetQuads[10] == "o" && targetQuads[11] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[9] == "o" && targetQuads[5] == "o" && targetQuads[13] == "o") {
                player2 = true;
                a = 17;
            }
            if (targetQuads[12] == "o" && targetQuads[13] == "o" && targetQuads[14] == "o") {
                player2= true;
                a = 17;
            }
            if (targetQuads[13] == "o" && targetQuads[14] == "o" && targetQuads[15] == "o") {
                player2= true;
                a = 17;
            }
            if (targetQuads[0] == "o" && targetQuads[1] == "o" && targetQuads[2] == "o") {
                player2 = true;
                a = 17;
            }

            // Prints array field
            for (i = 0; i < targetQuads.length; i++) {
                System.out.print(targetQuads[i] + ",");
                if ((i + 1) % 4 == 0) {
                    System.out.println("");
                }
            }

            // Prints out error messages if the player does not follow rules

            if(positionMessage == true) {
                System.out.println("That position is already used.");
            }
            if(quadFound == false && positionMessage == false) {
                System.out.println("The string " + '"' + answer + '"' + " did not match any quadrant number. (1-16)");
                a--;
            }

            n++;
            a++;

        }

        // Checks the winner
        if (player1) {
            System.out.println("Player 1 wins!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithComputer();
            }

            else {
                System.exit(0);
            }
        }
        if (player2) {
            System.out.println("Player 2 wins!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithComputer();
            }

            else {
                System.exit(0);
            }
        }
        else {
            System.out.println("It's a draw!");
            System.out.println("Want To Rematch?");
            System.out.println("yes or no");
            String prompt = input.next();
            if (prompt.toLowerCase().equals("yes")) {
                playWithComputer();
            }

            else {
                System.exit(0);
            }
        }
    }
}
