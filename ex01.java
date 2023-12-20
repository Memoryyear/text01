public class ex01 {
    public static void main(String[] args) {


        for (int Dig_1 = 0;Dig_1 < 10;Dig_1 ++)
            for (int Dig_2 = 0 ;Dig_2 <10 ;Dig_2 ++)
                for (int Dig_3 = 1 ;Dig_3 <10 ;Dig_3 ++)
                    if (Math.pow((double) Dig_1,3)+ Math.pow((double) Dig_2,3) + Math.pow((double) Dig_3,3) == Dig_1 + Dig_2 * 10 + Dig_3 * 100 )
                        System.out.print(Dig_3 + "" + Dig_2 + "" + Dig_1 + "    ");
    }
}
