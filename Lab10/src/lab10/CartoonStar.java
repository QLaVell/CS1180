
package lab10;

/**
* A class that describes a cartoon star including a rating from 0-100
* @author Quintin Oliver
*/
public class CartoonStar {
    // Instance variables
    private String cartoonStarName;
    private CartoonType cartoonType;
    private int popularityIndex;
    
    // Constructors
    /**
     * Creates a new and empty CartoonStar.
     */
    public CartoonStar(){
    }//end no argument constructor
    
    public CartoonStar(String cartoonStarName, CartoonType cartoonType, 
            int popularityIndex){
        setCartoonStarName(cartoonStarName);
        setCartoonType(cartoonType);
        setPopularityIndex(popularityIndex);
    }//end full constructor

    public String getCartoonStarName() {
        return cartoonStarName;
    }

    public void setCartoonStarName(String cartoonStarName) {
        this.cartoonStarName = cartoonStarName;
    }

    public CartoonType getCartoonType() {
        return cartoonType;
    }

    public void setCartoonType(CartoonType cartoonType) {
        this.cartoonType = cartoonType;
    }

    public int getPopularityIndex() {
        return popularityIndex;
    }

    public void setPopularityIndex(int popularityIndex) {
        this.popularityIndex = popularityIndex;
    }
    
    public String toString(){
        return getCartoonStarName() + ' ' + getCartoonType() + ' ' + 
                getPopularityIndex();
    }
}//end class
