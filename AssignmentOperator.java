public class AssignmentOperator {
    public static void main(String a[]) {
        int num = 3;
        System.out.println(num);
        num += num;
        System.out.println(num);
        num -= ++num;
        System.out.println(num);
        num *= num;
        System.out.println(num);
        System.out.println(num++); // Post-increment: First fetch the value and then increment.
        System.out.println(++num); // Pre-increment: First increment and then fetch the value.
        // Guess the outputs before running the program.
    }
}
