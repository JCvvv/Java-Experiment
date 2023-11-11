package exp2;
import java.util.Scanner;

public class exp2task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一元二次方程的系数：");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        // 判断是否为一元二次方程
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("方程有无穷多解");
                } else {
                    System.out.println("方程无解");
                }
            } else {
                // 求解一元一次方程
                double root = -c / b;
                System.out.println("方程为一元一次方程，有一个实根：root = " + root);
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("方程有两个实根：\nroot1 = " + root1 + "\nroot2 = " + root2);
                System.out.println();
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("方程有一个实根：\nroot = " + root);
            } else {
                // 复数根
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

                System.out.println("方程存在两个复数根：");
                System.out.println("根1： " + realPart + " + " + imaginaryPart + "i");
                System.out.println("根2： " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}
