package kourosh.calgaryhacks.Classes;


public class Question {

    public String id;
    public String sessionID;
    public String body;
    public int score;
    public Boolean isClicked;

    public Question() {
        this.id = Double.toString(Math.random());
        this.sessionID = "";
        this.body = "";
        this.score = 0;
        this.isClicked = false;
    }

    public Question(String id, String sessionID, String body, Boolean isClicked) {
        this.id = id;
        this.sessionID = sessionID;
        this.body = body;
        this.score = 0;
        this.isClicked = isClicked;
    }

    public void upVote() {
        score++;
    }

    public void askQuestion(String question) {
        this.body = question;
    }
}