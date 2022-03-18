public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return this.x;
    }

    public double getY() {

        return this.y;

    }

    public void FlipVertical() {
        this.y = -y;
    }

    public void FlipHorizontal() {
        this.x = -x;
        this.y = -y;
    }

    public void Translate(double xChange, double yChange){

        this.x = x + xChange;
        this.y = y + yChange;

    }
}