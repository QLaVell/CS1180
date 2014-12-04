
/**
 * [describe class here]
 */

package finalgame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class Enemy extends Pane{
    private final double width = 20, height = 20;
    private double x = width, y = height;
    private double dx = 1 , dy = 0;
    private Rectangle rectangle;
    private Timeline animation;
    
    public Enemy(){
        rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(Color.RED);
        
        getChildren().add(rectangle);
        
        animation = new Timeline(new KeyFrame(Duration.millis(10),
                e -> move()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }
    
    private void move(){
        if(x < 0 || x > Config.WINDOW_WIDTH - width){
            dx *= -1;
        }
        x += dx;
        rectangle.setX(x);
    }
}
