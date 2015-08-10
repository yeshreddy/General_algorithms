/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonalgos;
import java.util.HashMap;
/**
 *
 * @author yeswanth
 */
public class Lcs {
    
    /// lcs using dp recursion 
    public int lcsnaive(String s1,String s2){
        return auxlcsnaive(s1,s2,s1.length(),s2.length());
    }
    
    private int auxlcsnaive(String s1,String s2,int m,int n){
        if(m==0||n==0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return 1+auxlcsnaive(s1,s2,--m,--n);
        return (int)Math.max(auxlcsnaive(s1,s2,m,n-1),auxlcsnaive(s1,s2,m-1,n));
    }
    /// lcs using dp memoization
    public int lcsdp(String s1,String s2){
        HashMap<Integer,HashMap<Integer,Integer>> temp= new HashMap<>();
        return auxlcsdp(s1,s2,s1.length(),s2.length(),temp);
    }
    private int auxlcsdp(String s1,String s2,int m,int n,HashMap<Integer,HashMap<Integer,Integer>> ht){
        
        if(m==0||n==0) return 0;
        /// memoziation part
        if(ht.containsKey(m)){ 
            if(ht.get(m).containsKey(n)){
                return ht.get(m).get(n);
            }
        }
        else{
            HashMap<Integer,Integer> temp= new HashMap<>();
            temp.put(n,0);
            ht.put(m, temp);
        }
        /////////////////////       
        if(s1.charAt(m-1)==s2.charAt(n-1)) 
        {   
            ht.get(m).put(n,1);
            return 1+auxlcsnaive(s1,s2,--m,--n);
        }
        return (int)Math.max(auxlcsnaive(s1,s2,m,n-1),auxlcsnaive(s1,s2,m-1,n));
        
    }
    /// lcs using dp tabulation method
    public int lcsdptab(String s1,String s2){
        int arr[][]=new int[s2.length()+1][s1.length()+1];
        for(int i=1;i<arr.length;i++){
            char buf=s2.charAt(i-1);
            for(int j=1;j<arr[i].length;j++){
                if(buf==s1.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=(int)Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        print(arr);
        return arr[arr.length-1][arr[0].length-1];
    }
    private void print(int arr[][]){
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}
