package converter;

public class DollarConverter implements Converter<Double, Double> {

    @Override
    public Double convert(Double from) {
        return from * 0.015;
    }
}
