public class Validation {

    private String login;
    private String password;
    private String confirmPassword;

    public void setLogin(String login) {
        String arr = "^ [a-zA-Z0-9_]+$";
        try {
            if (login.length() <= 20 || login.matches(arr)) {
                this.login = login;
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин не соответсвует правилам.");
        } finally {
            System.out.println("Проверка логина завершена.");
        }
    }


    public void setPassword(String password) {
        String arr = "^ [a-zA-Z0-9_]+$";
        try {
            if (password.length() < 20 || password.matches(arr)) {
                this.password = password;
            }
        } catch (WrongPasswordEception e) {
            System.out.println("Пароль не соответсвует правилам.");
        } finally {
            System.out.println("Проверка пароля завершена.");
        }
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void passEquals() {
        try {
            if (password.equals(confirmPassword)) {
            }
        } catch (WrongPasswordEception e1) {
            System.out.println("Пароли не совпадают.");
        } finally {
            System.out.println("Проверка закончена.");
        }
    }
}
