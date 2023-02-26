public class Main {
    public static void main(String[] args) {
        logiNTester MainTester = new logiNTester();
        boolean TrueLogin = MainTester.isLoginValid("starboy98");
        if (TrueLogin) System.out.println("Login is suitable");
        else System.out.println("Login does not meet requirements");
    }
}

