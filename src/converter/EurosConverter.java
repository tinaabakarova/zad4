package converter;

public class EurosConverter implements Converter<Double, Double> {
    @Override
    public Double convert(Double from) {
        return from * 0.013;
    }
}
