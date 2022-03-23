package calculator;
import java.util.Scanner;

/*Калькулятор
умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
 a + b, a - b, a * b, a / b.
 Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
 Калькулятор должен принимать на вход числа от 1 до 10 включительно,
 не более. На выходе числа не ограничиваются по величине и могут быть любыми.
 Калькулятор умеет работать только с целыми числами.
 Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
 при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
 При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно,
 при вводе арабских - ответ ожидается арабскими.
 При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
 При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
 приложение выбрасывает исключение и завершает свою работу.
 Результатом операции деления является целое число, остаток отбрасывается.
 Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.
 Результатом работы калькулятора с римскими числами могут быть только положительные числа,
 если результат работы меньше единицы, выбрасывается исключение
 */

public class Calculator {

    int a, b, c;

    int summa (int a, int b){
        int c = a+b;
        return c;
    }
    int raznost (int a, int b){
        int c = a-b;
        return c;
    }
    int umnojit (int a, int b){
        int c = a*b;
        return c;
    }

    int delenie (int a, int b){
        int c = a/b;
        return c;
    }

   }
class ArabskieChisla {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 2 числа и операцию, которую вы хотите с ними совершить: ");
        String name = in.nextLine();
        String[] split = name.split(" ");
        String sa = split[0];
        String ss = split[1];
        String sb = split[2];
        String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C",};
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
                "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
                "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
                "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
                "81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
                "91", "92", "93", "94", "95", "96", "97", "98", "99", "100",};

        if ((sa.equals("I"))||(sa.equals("II"))||(sa.equals("III"))||(sa.equals("IV"))||(sa.equals("V"))||(sa.equals("VI"))||(sa.equals("VII"))||(sa.equals("VIII"))||(sa.equals("IX"))||(sa.equals("X"))) {

               switch (sb){
                   case "I":
                   case "II":
                   case "III":
                   case "IV":
                   case "V":
                   case "VI":
                   case "VII":
                   case "VIII":
                   case "IX":
                   case "X":
                       break;
                   default:
                       try {
                           throw new RumenException("Вы ввели римское число не верного формата.");
                       } catch (RumenException e) {
                           e.printStackTrace();
                                                }
                        System.exit(0);
               }
                int j = 0;
                int i ;

                for (i = 0; i < rim.length; ++i) {
                    if (rim[i].equals(sa))
                        j = i;
                    if (rim[i] == sa) ;
                }
                String sa1 = arab[j];
                for (i = 0; i < rim.length; ++i) {
                    if (rim[i].equals(sb))
                        j = i;
                    if (rim[i] == sb) ;
                }
                String sb1 = arab[j];

                Calculator c2 = new Calculator();
                int a1 = Integer.parseInt(sa1);
                int b1 = Integer.parseInt(sb1);
                if (ss.equals("+")) {
                    int c = c2.summa(a1, b1);
                    String sum = Integer.toString(c);
                    for (j = 0; j < arab.length; ++j) {
                        if (arab[j].equals(sum)) {
                            i = j;
                            System.out.println(rim[i]);
                        }
                    }

                } else if (ss.equals("-")) {
                    int c = c2.raznost(a1, b1);
                    String raz = Integer.toString(c);
                    for (j = 0; j < arab.length; ++j) {
                        if (arab[j].equals(raz)) {
                            i = j;
                            System.out.println(rim[i]);
                        }
                    }
                } else if (ss.equals("*")) {
                    int c = c2.umnojit(a1, b1);
                    String um = Integer.toString(c);
                    for (j = 0; j < arab.length; ++j) {
                        if (arab[j].equals(um)) {
                            i = j;
                            System.out.println(rim[i]);
                        }
                    }
                } else if (ss.equals("/")) {
                    int c = c2.delenie(a1, b1);
                    String del = Integer.toString(c);
                    for (j = 0; j < arab.length; ++j) {
                        if (arab[j].equals(del)) {
                            i = j;
                            System.out.println(rim[i]);
                        }
                    }
                } else {
                    System.out.println("ВНИМАНИЕ!!! Вы не ввели знак действия!");
                }
            } else {
                Calculator c1 = new Calculator();
                int a = Integer.parseInt(sa);
                int b = Integer.parseInt(sb);

                if ((a <= 10) && (b <= 10)) {
                    if ((a >= 1) && (b >= 1)) {

                        if (ss.equals("+")) {
                            int c = c1.summa(a, b);
                            System.out.println(c);
                        } else if (ss.equals("-")) {
                            int c = c1.raznost(a, b);
                            System.out.println(c);
                        } else if (ss.equals("*")) {
                            int c = c1.umnojit(a, b);
                            System.out.println(c);
                        } else if (ss.equals("/")) {
                            int c = c1.delenie(a, b);
                            System.out.println(c);
                        } else {
                            System.out.println("ВНИМАНИЕ!!! Вы не ввели знак действия!");
                        }
                       }
                    try {
                        throw new RumenException("Вы ввели число меньше 1!");
                    } catch (RumenException e) {
                        e.printStackTrace();
                        System.exit(0);
                    }
                }
            try {
                throw new RumenException("Вы ввели число больше 10!");
            } catch (RumenException e) {
                e.printStackTrace();
            }
        }
    }
}





