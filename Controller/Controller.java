package Controller;

import View.BaseView;

/*
      класс, обрабатывает запросы пользователя из консоли
*/
public class Controller {


    public void appStart(BaseView[] view, String args) {

        if (args.equals("--help") || args.equals("-h")) {
            System.out.println("\tДля работы в режиме администратора, введите аргумент:\n\tadmin (требуется пароль)");
            System.out.println("\tДля работы в режиме потребителя, введите аргумент:\n\tuser");
            return;
        }

        if (args.equals("admin")) {
            System.out.println("Режим работы: Администратора");
            System.out.println("============ Лотерея игрушек ===============");

            view[0].action();
            return;
        }

        if (args.equals("user")) {
            System.out.println("Режим работы: Потребитель");
            System.out.println("============ Лотерея игрушек ===============");

            view[1].action();
            return;
        }

        System.out.println("============ Лотерея игрушек ===============");
        System.out.println("Вызов справки, введите аргумент: --help, -h");
        System.out.println("============================================");
    }
}
