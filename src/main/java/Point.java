public class Point implements IPoint{
    private int x;
    private int y;
    private int countRef;

    public void countInc() {
        countRef++;
    }

    public void countDec() {
        countRef--;
    }

    public int getCountRef() {
        return countRef;
    }

    public Point() {
        x = 0;
        y = 0;
        countRef = 1;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        countRef = 1;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int[] getXY() {
        return new int[] {x, y};
    }
}
