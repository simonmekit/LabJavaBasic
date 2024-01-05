package perscholas.generics;

public class GMultDataTypeRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GMultipleDataType<String, Integer> mobj = new GMultipleDataType<>("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDataType<String, String> mobj2 = new GMultipleDataType<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}
