package AdapterPattern;

public class MoveableAdapterImpl implements MoveableAdapter{
    public Moveable luxuryCars;
    
    MoveableAdapterImpl(Moveable obj){
        this.luxuryCars = obj;
    }
    
    @Override
    public double speed() {
        return convertMPHtoKMPH(luxuryCars.speed());
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
