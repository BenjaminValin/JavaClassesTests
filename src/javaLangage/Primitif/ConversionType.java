package javaLangage.Primitif;

public class ConversionType {
    public static void main(String[] args) {
        {
            byte b = 100;
            int i = b;                              //Un int peut accueillir de base un byte
            b = (byte) i;                            //transformation de type pour que le int i rentre dans un byte

            i = Byte.MAX_VALUE + 10;                 //Donne au int la valeur max autorisée par un byte + 10
            b = (byte) i;

            System.out.println(i);
            System.out.println(b);
        }
        {
            long l = Long.MAX_VALUE;

            for (int i = 0; i < 50; i++) {
                double d = l;
                //System.out.println(d + " - " + l);
                long l2 = (long) d;
                System.out.println(l + " - " + l2);
                l-=500;
            }
        }
    }
}
