
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {

        System.out.print("�������������(��λΪm)��");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("��������������(��λΪkg)��");
        double weight = new Scanner(System.in).nextDouble();


        getBMI(height, weight);
    }

    public static void getBMI(double h, double w) {

        double bmi = w / (h * h);

        String r = "";


        if (bmi < 18.5) {
            r = "����";
        } else if (bmi <= 22.9) {
            r = "����";
        } else if (bmi <= 24.9) {
            r = "ƫ��";
        } else if (bmi <= 29.9) {
            r = "����";
        } else if (bmi <= 40) {
            r = "�ضȷ���";
        } else {
            r = "���ȷ���";
        }

        System.out.println("����BMIָ����" + bmi);

        System.out.println("�����������ڣ�" + r);
    }
}
