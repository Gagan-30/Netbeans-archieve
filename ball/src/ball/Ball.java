/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;

/**
 *
 * @author 10373
 */
public class Ball extends Application {

    @Override
    public void start(Stage stage) {
        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 400, 600);
        Circle ball = new Circle(100 , Color.RED);
        ball.relocate(0, 10);

        canvas.getChildren().add(ball);

        stage.setTitle("Moving Ball");
        stage.setScene(scene);
        stage.show();

        Bounds bounds = canvas.getBoundsInLocal();
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(750),
                new KeyValue(ball.layoutYProperty(), bounds.getMaxY() - ball.getRadius())));
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
