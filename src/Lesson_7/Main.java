package Lesson_7;

public class Main {

    public static void main(String[] args) {

        BankAccount alex = new BankAccount();
        alex.setId(1);
        alex.setMoneyAmount(10);
        alex.setName("Alex");

        BankAccount bankAccount1 = new BankAccount(2, "Alex", 10);

        BankAccount bankAccount3 = new BankAccount();

        bankAccount3 = alex;
        // System.out.println(bankAccount3.getName());
        BankAccount ivan = new BankAccount("Ivan", 3, 10);

        alex.printInfo();
        alex.addMoneyToAccount(10);
        alex.getMoneyFromAccount(50);

        System.out.println("Тестируем перевод");
        alex.printInfo();
        ivan.printInfo();
        alex.sendMoneyFromAccountToAccount(ivan,5);
        alex.printInfo();
        ivan.printInfo();

        System.out.println();


        //System.out.println(bankAccount.name);

    }

}
