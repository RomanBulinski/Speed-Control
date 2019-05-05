public class Main {

    public static int gps(int s, double[] x) {


        double delta_distance = 0;

        for( int i =1; i<x.length; i++){
            if( x[i]-x[i-1] > delta_distance ){
                delta_distance = x[i]-x[i-1];
            }
        }

        int speed = (int)((3600 * delta_distance) / s);

        return speed;



    }


}
