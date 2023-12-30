public class Main {
    public static void main(String[] args) throws CustomEmptyStackException {

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {};
        String[] arr3 = {"first", "gdg"};

        ArrayAverage.average(arr1);
        ArrayAverage.average(arr2);
        ArrayAverage.average(arr3);

        CopyFile.copyFile("src\\1.txt", "src\\2.txt");
        CopyFile.copyFile("src\\4.txt", "src\\2.txt");
        CopyFile.copyFile("src\\1.txt", "src\\3.txt");


        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(12);
        stack.push(15);
        stack.push(19);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());





    }
}