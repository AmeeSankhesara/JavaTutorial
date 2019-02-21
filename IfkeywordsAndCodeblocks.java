package com.Amee;

public class IfkeywordsAndCodeblocks {

    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score>1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }
//        else if(score<1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }
        if(gameover) {
            int finalscore = score + (levelcompleted*bonus);
            System.out.println("Your final score was: "+finalscore);
        }

        score = 10000;
        levelcompleted = 8;
        bonus = 200;

        if(gameover) {
            int finalscore = score + (levelcompleted*bonus);
            System.out.println("Your second score was: "+finalscore);
        }

    }
}
