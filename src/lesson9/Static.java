package lesson9;

public class Static {
    public static void method(String login, String password, String confirmPassword) {

        if (login.length() > 20 || login.isEmpty() || login.contains(" ")) {
            throw new WrongLoginException("Логин не соответсвует необходимым требованиям ");
        }

        if (password.length() > 20 || password.isEmpty() || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не соотвествует необходимым требованиям");
        }
    }
}
