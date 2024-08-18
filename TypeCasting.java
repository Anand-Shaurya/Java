// Type Conversion, Type Casting and Type Promotion

public class TypeCasting {
    public static void main(String a[]) {
        int b;
        byte c = 49;
        byte d = 121;
        b = c; // Type Conversion:
        b = 389;
        c = (byte) b;
        float f = 15.6f;
        byte g = (byte) f; // Type Casting:
        System.out.println(b);
        System.out.println(c);
        System.out.println(d * g); // Type Promotion: from byte to int
        System.out.println(g);
    }

}
