
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {

        System.out.print("请输入您的身高(单位为m)：");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("请输入您的体重(单位为kg)：");
        double weight = new Scanner(System.in).nextDouble();


        getBMI(height, weight);
    }

    public static void getBMI(double h, double w) {

        double bmi = w / (h * h);

        String r = "";


        if (bmi < 18.5) {
            r = "过轻";
        } else if (bmi <= 22.9) {
            r = "正常";
        } else if (bmi <= 24.9) {
            r = "偏胖";
        } else if (bmi <= 29.9) {
            r = "肥胖";
        } else if (bmi <= 40) {
            r = "重度肥胖";
        } else {
            r = "极度肥胖";
        }

        System.out.println("您的BMI指数：" + bmi);

        System.out.println("您的体重属于：" + r);
    }
}
