package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
    public static int BadFibo(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return BadFibo(num - 1) + BadFibo(num - 2);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Arraylist test = new Arraylist();
        
        System.out.println("please choose method (BadFibo = 0,Fibo = 1)");
        int method = input.nextInt();
        System.out.println("please enter parameter(x>0)");
        int parameter = input.nextInt();
        switch(method){
        
        case 0:System.out.println(BadFibo(parameter));
            break;
            
        case 1:System.out.println(test.Fibo(parameter, test));
            break;
            
        default:System.out.println("invalid methods");
            break;
        }
        input.close();

    }

}
