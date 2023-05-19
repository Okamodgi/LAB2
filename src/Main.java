import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("N");
        int N = in.nextInt();
        System.out.println("X");
        int X = in.nextInt();
        double res = -Math.PI/2; //объявление переменной типа double с именем "res" и присвоение ей начального значения -Math.PI/2.
        for(int i=0; i<=N; i++){ //объявление цикла for, который будет выполняться от 0 до N включительно с шагом 1.
            res = res+((Math.pow((-1), (i+1)))/(((2*i+1)*(Math.pow(X, (2*i+1)))))); //вычисление значения и добавление его к переменной res.
        }
        System.out.println(res);
    }
}