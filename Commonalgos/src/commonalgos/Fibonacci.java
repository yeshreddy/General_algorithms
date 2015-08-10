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
public class Fibonacci {
    public int _find_nth_fibonacci_general_method(int n){
        if(n<=1) return n;
        int one=0;
        int two=1;
        int sum=1;
        for(int i=1;i<n;++i){
            sum=one+two;
            one =two;
            two=sum;
        }
        return sum;
    }
    
}
