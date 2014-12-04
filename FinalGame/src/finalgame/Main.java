
/**
* [describe program here]
*/
package finalgame;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class Main extends Application {
    public static HeadsUpDisplay hud = new HeadsUpDisplay();
    public static final int WINDOW_WIDTH = 630;
    public static final int WINDOW_HEIGHT = 350;

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Bullet> bullets = new ArrayList<>();
        Image backgroundPicture = new Image("/images/background.jpg");
        ImageView background = new ImageView(backgroundPicture);
        StackPane sp = new StackPane();
        
        BorderPane game = new BorderPane();
        Pane pane = new Pane();
        pane.getChildren().add(new Enemy());
        pane.setOnMouseClicked(e -> {
            pane.getChildren().removeAll(bullets);
            bullets.add(new Bullet());
            pane.getChildren().addAll(bullets);
        });
        game.setCenter(pane);
        game.setRight(hud);
        
        sp.getChildren().addAll(background, game);
        Scene scene = new Scene(sp, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
        primaryStage.setResizable(false);
        pane.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
