public class PointWrapper implements IPoint{
    private Point point;

    public PointWrapper(Point point){
        this.point = point;
    }

    public PointWrapper clone() {
        point.countInc();
        System.out.println("countRef: " + point.getCountRef());
        return new PointWrapper(point);
    }

    public int getCountRef() {
        return point.getCountRef();
    }

/*    private void pointRemove() {
        if(point.getCountRef() < 1){
            point = null;
            System.out.println("Объект будет удалён");
        }
    }

    public void pointCountDec(){
        point.countDec();
        pointRemove();
    }*/

    protected void finalized(){
        point.countDec();
        if(point.getCountRef() < 1){
            point = null;
            System.out.println("Объект будет удалён");
        }
    }

    @Override
    public void setX(int x) {
        point.setX(x);
    }

    @Override
    public void setY(int y) {
        point.setY(y);
    }

    @Override
    public void setXY(int x, int y) {
        point.setXY(x, y);
    }

    @Override
    public int getX() {
        return point.getX();
    }

    @Override
    public int getY() {
        return point.getY();
    }

    @Override
    public int[] getXY() {
        return point.getXY();
    }
}
