import java.util. Scanner;
public class loginparol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");//Вводим логин и пароль. и сохраняем
        String savedLogin = scanner.nextLine();//строка считывается и вводится в переменную
        System.out.print("Введите пароль: ");//Повторно вводится логина пароль
        String savedPassword = scanner.nextLine();

        boolean itoLoggin = false;//объявляется переменная типа boolean и ей присваивается значение фолс

        while (!itoLoggin) {//цикл должен выполняться, пока значение переменной будет равно фолс
            System.out.print("Введите логин еще раз: ");
            String enteredLogin = scanner.nextLine();
            System.out.print("Введите пароль еще раз: ");
            String enteredPassword = scanner.nextLine();


            if (enteredLogin.equals(savedLogin) && enteredPassword.equals(savedPassword)) {//Тут данные проверяются и сравниваются с сохраненными данными
                System.out.println("Вы вошли в аккаунт");
                itoLoggin = true;// значения true, чтобы выйти из цикла while

            } else {//элсе будет выполняться если условиене выполнено
                System.out.println("Логин или пароль неверные.Повторите попытку");
            }
        }

        scanner.close();//закрываем сканер
    }
}
