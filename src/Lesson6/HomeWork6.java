package Lesson6;
import Lesson7.HomeWork7;


/**
 * Author Shaternik Arsen
 * Made by Shaternik Mikita Miroslavovich
 */


import java.util.Scanner;
import java.util.stream.IntStream;

public class HomeWork6 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Выбирай");
        System.out.println("1 - 1 блок");
        System.out.println("2 - 2 блок");
        System.out.print("Твой выбор: ");
        int start = scanner.nextInt();

        if(start == 1) {
            TaskOne taskOne = new TaskOne();
            taskOne.start();
        } else if(start == 2) {
            TaskTwo taskTwo = new TaskTwo();
            taskTwo.start();
        } else {
            System.out.println("Введи доступное число");
        }
    }

    public static class TaskOne {
        public void start() {
            System.out.println("Ок, Блок 1");
            CreditCard card1 = new CreditCard("3532-3253-7542-1241", 1);
            CreditCard card2 = new CreditCard("3532-3251-7447-1241", 12);
            CreditCard card3 = new CreditCard("3532-3251-7547-1111", 15);
            card1.deposit(50.0);
            card2.deposit(150.0);
            card3.deposit(300);

            card1.Balance();
            card2.Balance();
            card3.Balance();
        }
            static class CreditCard {
                public String number;
                public double balance;

                public CreditCard(String number, double initialsum) {
                    this.number = number;
                    this.balance = initialsum;
                }

                public void deposit(double amount) {
                    balance += amount;
                }

                public void withdraw(double amount) {
                    if(amount <= balance) {
                        balance -= amount;
                    } else {
                        System.out.println("Ты бомж куда тебе столько");
                    }
                }

                public void Balance() {
                    System.out.println("Номер: " + number + " Баланс: " + balance + "$");
                }
            }

    }
    public static class TaskTwo {
        public static void start() {
            /* мы можем так, но я кое чему научился))))))
            System.out.println("--- Блок 2: Банкомат ---");
            ATM myAtm = new ATM(10, 10, 10);
            myAtm.addMoney(5, 2, 1);
            int amountToWithdraw = 370;
            System.out.println("Попытка снять: " + amountToWithdraw);
            boolean success = myAtm.withdraw(amountToWithdraw);
            if (success)
                System.out.println("Операция прошла успешно!");
             else
                System.out.println("Ошибка выполнения операции.");
        }
        static class ATM {
            public int count20;
            public int count50;
            public int count100;
            public ATM(int c20, int c50, int c100) {
                this.count20 = c20;
                this.count50 = c50;
                this.count100 = c100;
            }
            public void addMoney(int c20, int c50, int c100) {
                this.count20 += c20;
                this.count50 += c50;
                this.count100 += c100;
            }
            public boolean withdraw(int amount) {
                int need100 = Math.min(amount / 100, count100);
                int currentAmount = amount - (need100 * 100);

                int need50 = Math.min(currentAmount / 50, count50);
                currentAmount = currentAmount - (need50 * 50);

                int need20 = Math.min(currentAmount / 20, count20);
                currentAmount = currentAmount - (need20 * 20);
                if (currentAmount == 0) {
                    count100 -= need100;
                    count50 -= need50;
                    count20 -= need20;

                    System.out.println("Выдано купюр:");
                    System.out.println("100 руб: " + need100);
                    System.out.println("50 руб: " + need50);
                    System.out.println("20 руб: " + need20);
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

             */




            ATM atm = new ATM(10, 10, 10);
            atm.Deposite(1, 2, 5);
            int amount = 1270;
            System.out.println("Снятие: " + amount);
            String result = atm.withdraw(amount) ? "Операция успешна завершена." : "Ошибка: Бомж";
            System.out.println(result);
            String resultDepos = atm.Deposite(1, 2,2) ? "Пополнено!" : "Ошибка: Бомж а р а ";
            System.out.println(resultDepos);
            System.out.println("у вас: " + "1590");
        }
        static class ATM {
            private int[] safe;
            private final int[] banknote = {100, 50, 20};

            public ATM(int c20, int c50, int c100) {
                this.safe = new int[]{c100, c50, c20};
            }
            public boolean Deposite(int c20, int c50, int c100) {
                if (c20 < 0 || c50 < 0 || c100 < 0) return false;
                int[] incoming = {c100, c50, c20};
                IntStream.range(0, safe.length).forEach(i -> safe[i] += incoming[i]);
                return true;
            }
            public boolean withdraw(int amount) {
                int[] result = new int[3];
                return tryCalculate(amount, 0, result) ? applyChanges(result) : false;
            }

            private boolean tryCalculate(int remain, int idxm, int[] res) {
                if (remain == 0) return true;
                if (idxm >= banknote.length) return false;

                res[idxm] = Math.min(remain / banknote[idxm], safe[idxm]);
                return tryCalculate(remain - (res[idxm] * banknote[idxm]), idxm + 1, res);
            }
            private boolean applyChanges(int[] res) {
                IntStream.range(0, banknote.length).forEach(i ->{
                    safe[i] -= res[i];
                    if (res[i] > 0) {
                        System.out.printf("Выдано купюр купюрой %d: %d шт.%n", banknote[i], res[i]);
                    }
                });
                return true;
            }
        }
    }
}
