/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonalgos;

/**
 *
 * @author yeswanth
 */
public class Commonalgos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Fibonacci fib=new Fibonacci();
        //System.out.println(fib._find_nth_fibonacci_dp(9));
        Lcs l=new Lcs();
        int len=l.lcsdptab("agatab","xgatb");
        System.out.println("lcs is "+len);
    }
    
}
