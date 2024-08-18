// Data types, type conversion and interesting way of representation.

public class DataTypes {
    public static void main(String a[]) {
        int ab = 12;
        byte bc = 23;
        short cd = 32;
        long de = 4_0;
        int xyz = 0xABC;
        int pqr = 0b101010;

        System.out.println(cd + de);
        System.out.println(xyz);
        System.out.println(pqr);
        float ef = 4.567f;
        float fg = 9.876f;
        double gh = 9.876;
        System.out.println(ef + fg);
        System.out.println(gh + ef);
        ab = bc;
        System.out.println(ab);

        // Increment of a character
        char c = 'd';
        c++;
        System.out.println(c);

        // System.out.println(ab);
        // System.out.println(bc);
        // System.out.println(cd);
        // System.out.println(de);
    }
}
