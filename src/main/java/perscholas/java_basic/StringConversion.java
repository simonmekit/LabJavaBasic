package perscholas.java_basic;

public class StringConversion {
    public static void main(String[] args) {
        String intString = "19";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);

        Integer integerWrapperV = Integer.valueOf(intString);
        Float floatWrapper = Float.valueOf(intString);
        Double doubleWrapper = Double.valueOf(intString);

        System.out.println(integerWrapperV);
        System.out.println(floatWrapper);
        System.out.println(doubleWrapper);


    }
}
