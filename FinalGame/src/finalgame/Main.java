
/**
* [describe program here]
*/
package finalgame;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class Main extends Application {
    public static HeadsUpDisplay hud = new HeadsUpDisplay();

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Bullet> bullets = new ArrayList<>();
        Image background = new Image("/images/background.jpg"  );
        
        BorderPane game = new BorderPane();
        Pane pane = new Pane();
        pane.setOnKeyPressed(e -> {
            bullets.add(new Bullet());
            pane.getChildren().setAll(bullets);
        });
        game.setCenter(pane);
        game.setRight(hud);
        
        Scene scene = new Scene(game, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
        pane.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
