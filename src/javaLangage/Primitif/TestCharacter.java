package javaLangage.Primitif;

public class TestCharacter {
    public static void main(String[] args) {
        char c = 125;
        System.out.println(c);
        System.out.println((int)c);

        char c2 = 'a';
        c2 = (char) (c2 + 'b');
        System.out.println(c2); //A fait une addition avec le code Unicode du a + le code Unicode du b, ce qui donne le code Unicode du Ã
        System.out.println((int)c2);
    }
}
