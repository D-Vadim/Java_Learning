public class ArrayAverage {
    public static <T> void average(T[] arr) {
        int sum = 0;
        double ave;

        try {
            for (int i = 0; i < arr.length; ++i) {
                sum += (int) arr[i];
            }

            if (arr.length == 0) { throw new ArithmeticException();}

            ave = (double) sum / arr.length;
            System.out.println("Average = " + ave);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Array length = 0");
        } catch (ClassCastException e) {
            System.out.println("The array element is not a numeric type");
        }
    }
}
