public class Calculadora{
    public static void main(String[] args) {
        Float num1=Float.valueOf(args[0]);
        Float num2=Float.valueOf(args[1]);
        Float suma=num1+num2;
        Float resta=num1-num2;
        Float multi=num1*num2;
        Float divi=num1/num2;
        System.out.println("La suma es:" + suma);
        System.out.println("La resta es:" + resta);
        System.out.println("La multiplicacion es:" + multi);
        System.out.println("La division es:" + divi);
    }
}
