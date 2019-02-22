package com.Amee;

public class Methods {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        int highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("Your final score was: " + highscore);

        highscore = calculatescore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highscore);

        int highscoreposition = calculatehighscoreposition(1500);
        displayHighScorePosition("Tim",highscoreposition);

        highscoreposition = calculatehighscoreposition(900);
        displayHighScorePosition("Antony",highscoreposition);


        highscoreposition = calculatehighscoreposition(400);
        displayHighScorePosition("Bob",highscoreposition);


        highscoreposition = calculatehighscoreposition(50);
        displayHighScorePosition("Percy",highscoreposition);

    }

    public static int calculatescore(boolean gameover, int score, int levelcompleted, int bonus) {

        if (gameover) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
            return finalscore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playername, int playerposition) {
        System.out.println(playername + " managed to get into position " + playerposition + " on the high score table.");
    }

    public static int calculatehighscoreposition(int playerscore)
    {
        int position = 4;
        if (playerscore >= 1000) {
            position=1;
        }
        else if (playerscore >= 500 )
        {
            position=2;
        }
        else if (playerscore >= 100 )
        {
            position=3;
        }

        return position;
    }
}