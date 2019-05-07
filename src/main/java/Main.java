import java.util.stream.IntStream;

public class Main {

    public static int gps(int s, double[] x) {

        double delta_distance = 0;
        for( int i =1; i<x.length; i++){
            if( x[i]-x[i-1] > delta_distance ){
                delta_distance = x[i]-x[i-1];
            }
        }
        return (int)((3600 * delta_distance) / s);
    }

    //solution from code wars
    public static int gpsFROMCODEWARS(int s, double[] x) {
        return x.length <= 1 ? 0 : (int) Math.floor(IntStream.range(1, x.length)
                .mapToDouble(i -> x[i] - x[i-1])
                .map(i -> i * 3600.0/s)
                .max()
                .getAsDouble());
    }


}
