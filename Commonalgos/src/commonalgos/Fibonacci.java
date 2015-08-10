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
    public int _find_nth_fibonacci_recursive(int n){
        if(n<=1) return n;
        return  _find_nth_fibonacci_recursive(n-1)+ _find_nth_fibonacci_recursive(n-2);
    }
    public int _find_nth_fibonacci_dp(int n){
        if(n<=1) return n;
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;++i){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    
}
