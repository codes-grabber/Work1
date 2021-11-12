public class Point {
    private int x; // сокрытие данных в точке входа нельзя получить доступ через p1.x
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public static double getDistance(Point p1, Point p2) {
        int dx = (p1.x - p2.x);
        int dy = (p1.y - p2.y);

        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getDist(Point another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
