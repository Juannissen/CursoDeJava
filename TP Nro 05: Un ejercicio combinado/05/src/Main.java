public class Main {

    public static void main(String[] args) {

        float num1  = 6;
        float num2  = 5;
        float num3  = 2;
        float num4  = 3;
        float num5  = 7;
        float num6  = 2;
        float num7  = 2;
        float num8  = 30;
        float num9  = 1;
        float num10 = 3;
        float num11 = 5;

        float R1 = num1/num2;
        float R2 = num3/num4;
        float R3 = num5/num6;
        float R4 = num7/num8;
        float R5 = num9/num10;

        float R6 = R2 * R3;
        float R7 = R1 - R6 + R4;

        float R8 = R5 / num11;

        float RFinal = R7 / R8;

        System.out.println(R7);

        System.out.println(R8);

        System.out.println("El resultado es "+RFinal);
    }
}