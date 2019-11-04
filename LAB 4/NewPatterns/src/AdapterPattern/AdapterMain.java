package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        Moveable Lamburgini = new Lamburgini();
        MoveableAdapter speedadapter = new MoveableAdapterImpl(Lamburgini);
        System.out.println(speedadapter.speed());
    }
}
