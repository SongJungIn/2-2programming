import java.util.Scanner;
public class Homework4 {
    public int gcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcdRecursive(n, m % n);
        }
    }
    public int gcdLoop(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homework4 hw = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int resultRecursive = hw.gcdRecursive(num1, num2);
        System.out.printf("(재귀호출) 두 수의 최대공약수는 %d입니다.\n", resultRecursive);

        int resultLoop = hw.gcdLoop(num1, num2);
        System.out.printf("(반복문) 두 수의 최대공약수는 %d입니다.\n", resultLoop);
    }
}
