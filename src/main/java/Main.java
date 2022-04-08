public class Main {
    public static void main(String[] args){
        Decorator decorator = new Decorator();
        decorator.add(10, 15);
        PointWrapper pointWrapper = decorator.getPointWrapper(0).clone();
        decorator.add(pointWrapper);
        int count = pointWrapper.getCountRef();
        System.out.println("count: " + count);
        decorator.removePointWrapper(pointWrapper);

        decorator.removePointWrapper(0);

        System.out.println(pointWrapper.getCountRef());
    }
}
