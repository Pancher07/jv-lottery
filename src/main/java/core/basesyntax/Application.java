package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = lottery.getRandomBall();
        System.out.println(ball);
    }
}
