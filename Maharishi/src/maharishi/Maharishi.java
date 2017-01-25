/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maharishi;
import java.util.Scanner;
/**
 *
 * @author Tesfit
 */
public class Maharishi {

    /**
     * @param args the command line arguments
     */
    public int fibonancy(int x){
        int sum = 1;
        int prevsum =0,prev=1;
        for(int i=1; i<x;){
            prevsum=sum;
            sum=sum+prev;
            prev=prevsum;
            i=sum;
        }
        if(x==sum|| x==0||x==1)
            return 1;
        else return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Maharishi ma = new Maharishi();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(ma.fibonancy(x));
    }
    
}
