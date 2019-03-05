package buzzfeedquiz;

import java.util.Scanner;

public class Check {
    public int finalGrade = 0;

    //depends on users' input, will give this user different grade
    //reason that using this as a private int is that we can modify in the future due to different situation
    private int a_mark = 15;
    private int b_mark = 10;
    private int c_mark = 8;
    private int d_mark = 5;
    private int e_mark = 3;

    //same as above
    //base on the finalGrade, this program will give this user a finalGrade base on which answer he/she choose
    //can modify these numbers when the question bank changed
    private int typeOne = 65;
    private int typeTwo = 50;
    private int typeThree = 40;
    private int typeFour = 30;
    private int typeFive = 20;


    //checkValid function will check the users input whether is valid or not, will let the user type the answer
    //until is in "[abcde]", if not will keep asking to type
    public void checkValid() {
        Scanner sc = new Scanner(System.in);     //using the Scanner library

        //check is in range [abcde]
        while (!sc.hasNext("[abcde]")) {
            System.out.println("That's not the valid answer,please type again! Input must be a, b, c, d,or e!");
            sc.next();
        }

        // userValidInput will get the right answer, which is a,b,c,d,e
        // then base on the input give the user grade
        String userValidInput = sc.next();
        if (userValidInput.equals("a")) finalGrade += a_mark;
        else if (userValidInput.equals("b")) finalGrade += b_mark;
        else if (userValidInput.equals("c")) finalGrade += c_mark;
        else if (userValidInput.equals("d")) finalGrade += d_mark;
        else finalGrade += e_mark;
    }

    //base on the final grade, check the input is in which range
    //given a comments to the user when the program is about to finish
    public void checkGrade() {
        System.out.printf("You total finalGrade is %d, According to the test, You are a: \n", finalGrade);
        if (finalGrade >= typeOne) System.out.println("Strong willpower, calm mind, strong desire for leadership, strong sense of professionalism, do not give up without reaching the goal.\n");
        else if (finalGrade < typeOne && finalGrade >= typeTwo) System.out.println("Smart, lively, good-natured, good at making friends, deep in mind.\n");
        else if (finalGrade < typeTwo && finalGrade >= typeThree) System.out.println("Love fantasy, thinking more emotionally, choose friends with whether or not to vote for themselves.\n");
        else if (finalGrade < typeThree && finalGrade >= typeFour) System.out.println("Curiosity, adventurous, good governance, good at work, good at compromise.\n");
        else if (finalGrade < typeFour && finalGrade >= typeFive) System.out.println("The temperament is good, the friendship is strong, the character is solid and steady, but sometimes it is more embarrassing.\n");
        else System.out.println("Loose, love to play, full of fantasy. Smart and smart, treat people with enthusiasm, love to make friends, but there is no strict selection criteria for friends.\n");
    }
}
