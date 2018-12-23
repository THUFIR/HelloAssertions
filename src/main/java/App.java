
public class App {

    public String getGreeting() {
        boolean foo = false;
        assert foo;
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
