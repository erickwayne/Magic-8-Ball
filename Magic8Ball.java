import java.util.Random;

public class Magic8Ball {
    private int random;

    //constructs Magic8ball
    public Magic8Ball(){
        System.out.println("Have a question?");

    }

    //Generates random number for 8 ball
    //Gives a statement 13 statements
    //Prints statement
    public void shake(){
        int random = (int) (Math.random()*14);
        this.random = random;

        String[] answers = new String[14];
        answers[0] = "It is Certain.";
        answers[1] = "It is decidedly so";
        answers[2] = "Without a doubt.";
        answers[3] ="Yes definitely";
        answers[4] ="You may rely on it.";
        answers[5] = "Signs point to yes.";
        answers[6] = "Ask again later.";
        answers[7] = "Better not tell you now.";
        answers[8] = "Reply hazy, try again.";
        answers[9] = "Concentrate and ask again.";
        answers[10] = "My sources say no.";
        answers[11] = "Outlook not so good.";
        answers[12] = "My reply is no.";
        answers[13] = "Don't count on it.";

        System.out.println(answers[random]);
    }


    public static void main(String[] args) {
        Magic8Ball num8 = new Magic8Ball();
        num8.shake();
    }
}
