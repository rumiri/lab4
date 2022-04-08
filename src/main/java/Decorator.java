import java.util.ArrayList;
import java.util.List;

public class Decorator {
    List<PointWrapper> pointWrapperList = new ArrayList<>();

    public void add(PointWrapper pointWrapper){
        pointWrapperList.add(pointWrapper);
    }

    public void add(int x, int y){
        pointWrapperList.add(new PointWrapper(new Point(x, y)));
    }

    public void removePointWrapper(PointWrapper pointWrapper){
            if(pointWrapperList.contains(pointWrapper)) {
                pointWrapperList.remove(pointWrapper);
                pointWrapper.finalized();

                System.out.println("removed");
            }
    }


    public void removePointWrapper(int index){
        PointWrapper pw = pointWrapperList.get(index);
        pointWrapperList.remove(index);
        pw.finalized();
    }

    public boolean checkPointWrapper(PointWrapper pointWrapper){
        return pointWrapperList.contains(pointWrapper);
    }

    public PointWrapper getPointWrapper(int index){
        return pointWrapperList.get(index);
    }


}
