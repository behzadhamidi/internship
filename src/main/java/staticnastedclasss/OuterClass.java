package staticnastedclasss;

public class OuterClass {
    private static String staticOuterField = "Static outer field";

    static class StaticNestedClass {
        void display() {

            System.out.println("Accessing from static nested class: " + staticOuterField);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}

