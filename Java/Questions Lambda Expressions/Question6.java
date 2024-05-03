import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface sums{
    public double findAvg (List <Double> list);
}
public class Question6 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(123.32, 3221.32, 3231.23);
        sums s =  (y)->{
            double sum = 0;
            for (double x: list){
                sum+=x;
            }
            return sum/list.toArray().length;
        };
        System.out.println(s.findAvg(list));
        double avg = list.stream().mapToDouble(Double::doubleValue).average().orElse(0.00);
        System.out.println(avg);
    }
}
