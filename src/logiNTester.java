public class logiNTester {
    class LoginValidationException extends Exception {
        LoginValidationException() {
        }
    }

    void validateLogin(String login) throws LoginValidationException {
        if (login.length() > 20) throw new LoginValidationException();
        for (int i = 0; i < login.length(); i++) {
            char lm = login.charAt(i);
            boolean a;
            if (lm > 64 && lm < 91) a = true;
            else if (lm > 96 && lm < 123) a = true;
            else if (lm > 47 && lm < 58) a = true;
            else if (lm == 95) a = true;
            else a = false;
            if (a == false) throw new LoginValidationException();
        }
        boolean c = false;
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) == 95) c = true;
        }
        if (c == false) throw new LoginValidationException();
        boolean d = false;
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) > 96 && login.charAt(i) < 123) d = true;
        }
        if (d == false) throw new LoginValidationException();
        boolean e = false;
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) > 64 && login.charAt(i) < 91) e = true;
        }
        if (e == false) throw new LoginValidationException();
    }

    boolean isLoginValid(String l) {
        try {
            validateLogin(l);
        } catch (LoginValidationException e) {
            return false;
        }
        return true;
    }
}
