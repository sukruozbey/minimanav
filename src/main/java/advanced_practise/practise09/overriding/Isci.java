package advanced_practise.practise09.overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinanKredi) {
        return alinanKredi*0.15;
    }
}
