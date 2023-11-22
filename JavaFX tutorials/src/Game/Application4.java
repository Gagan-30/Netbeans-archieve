package Game;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Application4 extends Application
{
    Rocket rocket;
    Baddie baddie;
    
    @Override
    public void start(Stage primaryStage)
    {
        Group g = new Group();
        Scene scene = new Scene(g, 800, 600);
        
        rocket = new Rocket();
        baddie = new Baddie();
        
        Image imgBack = new Image(getClass().getResourceAsStream("background.png"));
        ImageView ivBack = new ImageView (imgBack);
        
        g.getChildren().add(ivBack);
        g.getChildren().add(rocket.getImageView());
        g.getChildren().add(baddie.getImageView());
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
        {
            @Override
            public void handle(KeyEvent event) 
            {
                switch (event.getCode())
                {
                    case LEFT:
                        rocket.moveLeft();
                        event.consume();
                        break;
                        
                    case RIGHT:
                        rocket.moveRight();
                        break;
                    case SPACE:
                        //not implemented yet
                    default:
                }
            }
        
    });
        
        primaryStage.setTitle("Flyer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
