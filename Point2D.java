public class Point2D
{
    private int x;
    private int y;

    //Accessors methods (getters)
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    //Mutator functions (setters)
    public void setX(int inputX){
        x = inputX;
    }

    public void setY(int inputY){
        y = inputY;
    }

    public String toString(){
        return ("A point at (" + x + ", " + y + ").");
    }

    public boolean equals(Point2D other){
        return (x==other.x) && (y==other.y);
    }
}
