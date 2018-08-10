public class CastDemo {
    public static void main(String[] args) {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0l;
        float f = 3.1f;
        double d = 2.3;
        boolean truthy = true;
        char c1 = 'A';
        char c2 = 65;

        // cast examples
        short byteToShort = b; // implicitly cast since byte is smaller than short
        byte shortToByte = (byte) s; // have to be explicit since byte is smaller than short

        int doubleToInt = (int) d; // explicit cast since int is smaller than double

        int charToInt = c1;

        byte charToByte = (byte) c1; // has to be explicit

        // int booleanToInt = (int) truthy; - doesn't work because can't cast boolean to a number

        System.out.println(doubleToInt);
        System.out.println(charToInt);
        System.out.println(charToByte);
    }
}