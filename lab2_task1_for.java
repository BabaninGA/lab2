import java.util.InputMismatchException;
import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        int n = 0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое неотрицательное число");
            n = in.nextInt();
            in.close();}
        catch (InputMismatchException e) {
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
        int s = 1;
        if (n >= 0 & n < 15) {
            for (int i = 1; i <= n; i++) {
                s = s * i;}
            System.out.println("Факториал данного числа равен " + s);}
        else if (n<0){
            System.out.println("Факториала отрицательно числа не существует");}
        else{
            System.out.println("Данная программа не может вычислить факториал введенного числа");
        }
    }
}
