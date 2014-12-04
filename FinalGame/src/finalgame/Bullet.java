
/**
 * [describe class here]
 */

package finalgame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class Bullet extends Pane{
    private final double height = 5;
    private final double width = 5;
    private double x = 100;
    private double y = 500;
    private double dx = 0, dy = -5;
    private Circle rectangle;
    private Timeline animation;
    
    public Bullet(){
        rectangle = new Circle(x, y, width);
        rectangle.setFill(Color.GOLD);
        
        getChildren().add(rectangle);
        
        animation = new Timeline(new KeyFrame(Duration.millis(10),
        e -> {
            if(rectangle != null){
                moveBullet();
        }}));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }
    
    protected void moveBullet(){
        if(rectangle.getCenterY() == 0){
            getChildren().remove(rectangle);
            Main.hud.miss();
            rectangle = null;
        }else{
            x += dx;
            y += dy;
            rectangle.setCenterX(x);
            rectangle.setCenterY(y);
        }
    }
}
