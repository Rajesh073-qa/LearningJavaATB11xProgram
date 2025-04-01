package Practice;

public class math_operation {
    public static void main(String[] args) {
        double X = 10, Y = 10, Z = 10, result;
        result = Math.cbrt((Math.pow(X, 2) + Math.pow(Y, 2) - Math.abs(Z)));
        System.out.println(result);
    }
}
