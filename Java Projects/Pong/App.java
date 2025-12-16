package com.mycompany.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    private static final int appwidth = 1360;
    private static final int appheight = 768;
    private static final int paddleheight = 100;
    private static final int paddlewidth = 15;
    private static final double ballrad = 15;
    private Paddle p1, p2;
    private Ball ball;
    private int p1score = 0;
    private int p2score = 9;
    private boolean gameStart = false;

    @Override
    public void start(Stage stage) {
        
        p1 = new Paddle(0, appheight / 2, paddlewidth, paddleheight);
        p2 = new Paddle(appwidth - paddlewidth, appheight / 2, paddlewidth, paddleheight);
        ball = new Ball(appwidth / 2, appheight / 2, ballrad, 1, 1);
        
        
        stage.setTitle("Pong");
        Canvas c = new Canvas(appwidth, appheight);
        GraphicsContext gc = c.getGraphicsContext2D();

        Timeline t1 = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));
        t1.setCycleCount(Timeline.INDEFINITE);

        c.setOnMouseMoved(e -> p1.y = e.getY());
        c.setOnMouseClicked(e -> gameStart = true);

        stage.setScene(new Scene(new StackPane(c)));
        stage.show();
        t1.play();
    }

    private void run(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, appwidth, appheight);

        gc.setFill(Color.WHITE);
        gc.setFont(Font.font(25));
        if (gameStart) {
            ball.update();

            if (ball.x < appwidth * 0.75) {
                p2.y = ball.y - paddleheight / 2;
            } else {
                if(ball.y > p2.y + paddleheight / 2) p2.y += 1;
                else p2.y -= 1;
            }
            gc.fillOval(ball.x, ball.y, ballrad, ballrad);
        } else {
            gc.setStroke(Color.WHITE);
            gc.setTextAlign(TextAlignment.CENTER);
            gc.strokeText("Click to Start", appwidth / 2, appheight / 2);
           ball.reset(appwidth / 2, appheight / 2);

        }

        if (ball.y < 0 || ball.y > appheight) {
            ball.bounceY();
        }

        if (ball.x < -paddlewidth) {
            p2score++;
            scoreHandle(gc);
            gameStart = false;

        }

        if (ball.x > appwidth + paddlewidth) {
            p1score++;
            scoreHandle(gc);
            gameStart = false;

        }

        if(p1.collides(ball)|| p2.collides(ball))  {
            ball.xSpeed += (int) Math.signum(ball.xSpeed);
            ball.ySpeed += (int) Math.signum(ball.ySpeed);
            ball.bounceX();
            ball.bounceY();

        }
        gc.fillText(p1score + "\t\t\t\t\t\t\t\t" + p2score, appwidth / 2, 100);
        gc.fillRect(p2.x, p2.y, paddlewidth, paddleheight);
        gc.fillRect(p1.x, p1.y, paddlewidth, paddleheight);

    }

    private void scoreHandle(GraphicsContext gc) {
        if (p1score == 10) {
            gameStart = false;
            scoreReset();
        } else if (p2score == 10) {
            gameStart = false;
            scoreReset();
        }
    }

    private void scoreReset() {
        p1score = 0;
        p2score = 0;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
