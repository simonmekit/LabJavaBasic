package perscholas.java_basic;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Java");
        s.insert(4, " Developer");
        System.out.println(s);

        s.replace(0, 2, "Hello");
        System.out.println(s);
        System.out.println(s.substring(2, 4));
    }
}
