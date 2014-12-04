
/**
 * [describe class here]
 */

package finalgame;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class HeadsUpDisplay extends VBox{
    public static final int HIT_BIG = 1000;
    public static final int HIT_SMALL = 2000;
    
    private int miss = 0;
    private final Text missesLabel = new Text("Misses: ");
    private Text missesCount = new Text(miss + "");
    private final HBox misses = new HBox(missesLabel, missesCount);
    
    private int point = 0;
    private final Text pointsLabel = new Text("Points: ");
    private Text pointsCount = new Text(point + "");
    private final HBox points = new HBox(pointsLabel, pointsCount);
    
    public HeadsUpDisplay(){
        getChildren().addAll(misses, points);
    }
    
    public void miss(){
        miss++;
        missesCount.setText(miss + "");
    }
    
    public void hit(int hitType){
        switch(hitType){
            case HIT_BIG:
                point += 2;
                break;
            case HIT_SMALL:
                point += 1;
                break;
        }
        pointsCount.setText(point + "");
    }
}
