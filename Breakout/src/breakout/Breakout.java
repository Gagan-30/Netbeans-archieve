/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author 10471
 */
public class Breakout extends Application {

    private Circle ball;
    private Rectangle Paddle;
    private int ballX, ballY, PaddleX, PaddleY;
    private Scene scene;
    private int xspeed = 3;
    private int yspeed = -3;
    Rectangle[][] blocks = new Rectangle[6][10];
    private Group root;
    private int score;
    Label label ;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new Group();
        scene = new Scene(root, 800, 800, Color.PURPLE);

        primaryStage.setTitle("my Mnd");
        primaryStage.setScene(scene);
        primaryStage.show();
         label = new Label("score" + score);
        label.setLayoutX(500);
        label.setLayoutY(550);
        label.setTextFill(Color.GREEN);
        label.setFont(new Font("Times New Roman",30));
        root.getChildren().add(label);
 
        createblocks();

        ball = new Circle(15, Color.DARKRED);
        ballX = 300;
        ballY = 400;
        ball.setCenterY(ballY);
        ball.setCenterX(ballX);
        root.getChildren().add(ball);

        Paddle = new Rectangle(80, 20, Color.BLACK);
        PaddleX = 350;
        PaddleY = 500;
        Paddle.setY(PaddleY);
        Paddle.setX(PaddleX);
        root.getChildren().add(Paddle);
        Keylisteners();

        startGameloop();

        primaryStage.show();

    }

    private void Keylisteners() {

        scene.setOnKeyPressed((event) -> {
            if (event.getCode() == KeyCode.LEFT && PaddleX > 5) {
                PaddleX = (PaddleX) - 20;
                Paddle.setX(PaddleX);
            }

            if (event.getCode() == KeyCode.RIGHT && PaddleX < 720) {
                PaddleX = (PaddleX) + 20;
                Paddle.setX(PaddleX);
            }
        });

    }

    private void startGameloop() {
        new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (ball.getBoundsInParent().intersects(Paddle.getBoundsInParent())) {
                    yspeed = -yspeed;
 
                }

                ballX = ballX + xspeed;
                ballY = ballY - yspeed;

                if (ballY < 0 || ballY > 600) {
                    yspeed = -yspeed;
                }
                if (ballX < 0 || ballX > 790) {
                    xspeed = -xspeed;

                }

                ball.setCenterX(ballX);
                ball.setCenterY(ballY);
       
               
               
                for (int row = 0; row < 6; row++) {
                    for (int column = 0; column < 10; column++) {

                        if (ball.getBoundsInParent().intersects(blocks[row][column].getBoundsInParent())) {
                            root.getChildren().remove(blocks[row][column]);
                            yspeed = -yspeed;
                            blocks[row][column].setX(5000);
                            score++;
                           
                        }
                    }
                }
                label.setText("Score " + score);

            }
        }.start();

    }

    public void createblocks() {

        int spacing = 13;
        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 10; column++) {
                blocks[row][column] = new Rectangle(50, 20, Color.WHITE);
                root.getChildren().add(blocks[row][column]);
                blocks[row][column].setLayoutX((column * (65 + spacing)) + spacing);
                blocks[row][column].setLayoutY((row * (20 + spacing)) + spacing);
               
               
                       
           
        }
    }

}
   
}