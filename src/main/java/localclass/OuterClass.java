package localclass;

public class OuterClass {
    void method() {
        class LocalClass {
            void display() {
                System.out.println("Local class method");
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.method();
    }
}
