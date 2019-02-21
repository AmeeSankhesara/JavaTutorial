public class ByteShortInt {
    public static void main(String[] args) {
        // int has width of 32
        int myMinValue = -2_147_483_648 ;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myinttotal = " + myTotal);

        // byte has width of 8
        byte myMinbyte = -128;
        byte myMaxbyte = 127;
        byte myNewByte = (byte) (myMinbyte/2);
        System.out.println("mynewbyte = " + myNewByte);

        // short has width 16
        short myMinshort = -32768;
        short myMaxshort = 32767;

        // long has width 64
        long mylongvalue = 100L;

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 50000L + 10L*(b+s+i);
        short finaltotal = (short) (1000 + 10*(b+s+i));

        System.out.println("Final total for long value = " + l);
        System.out.println("Final total for short value = " + finaltotal);
    }
}
