public class GameUi {
    static int startMenu() {
        Data.ps.println("<---Бункер--->");
        Data.ps.println("1. Почати гру");
        Data.ps.println("2. Вийти");

        return Data.sc.nextInt();
    }
    static int changeChoiceMenu() {
        Data.ps.println("<---Змінити--->");
        Data.ps.println("1. Всім");
        Data.ps.println("2. Одному гравцю");
        Data.ps.println("3. Назад");

        return Data.sc.nextInt();
    }
    static int changeMenu() {
        Data.ps.println("<---Змінити--->");
        Data.ps.println("1. Професія");
        Data.ps.println("2. Стать");
        Data.ps.println("3. Вік");
        Data.ps.println("4. Сексуальна орієнтація");
        Data.ps.println("5. Плодючість");
        Data.ps.println("6. Стан здоров'я");
        Data.ps.println("7. Фобія");
        Data.ps.println("8. Риса характеру");
        Data.ps.println("9. Хобі");
        Data.ps.println("10. Дод. інформація");
        Data.ps.println("11. Багаж");
        Data.ps.println("12. Назад");

        return Data.sc.nextInt();
    }
}
