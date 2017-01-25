/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maharishi;

import java.util.Arrays;

/**
 *
 * @author Tesfit
 */
public class TestOne {
    
    //function one
    int a(int[]a)
    {
        return 0;
    }
    
    int f(int[]a){
        int largest=-1;
        int secondLargest=-1;
        for(int i=0;i<a.length;i++){
                if(a[i]>largest)
                    largest=a[i];
            }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<largest && a[i]>secondLargest)
            {
                secondLargest = a[i];
            }
        }
        return secondLargest;
        
    }
    
    //function 2
    
    
    int f2(int a[])
            {
                int oddSum=0;
                int evenSum=0;
            for (int i=0;i<a.length;i++)   
            {
                if(a[i]%2==0)
                  evenSum+=a[i];
                else 
                        oddSum+=a[i];
            }
            return oddSum-evenSum;
            }
    
    //function 4
    
    
    char[] f3(char[] a, int start, int len)
    {
        char[]x= new char[len];
        if(len<=a.length && start<a.length && (len+start)<=a.length)
        {
            for(int i=start,j=0;j<x.length;i++,j++)
            {
                x[j]=a[i];
            }
            return x;
        }
        else return null;
    }
    public static void main(String args[]){
        TestOne one = new TestOne();
        char a[]= {'a','b','c'};
        char b[]= {'a','b','c'};
        char c[]= {'a','b','c'};
//        char d[]= {1,2};
//        char e[]= {1};
//        char fe[]={};
        System.out.println(Arrays.toString(one.f3(a,0,4)));
        System.out.println(Arrays.toString(one.f3(a,0,3)));
        System.out.println(Arrays.toString(one.f3(a,0,2)));
        System.out.println(Arrays.toString(one.f3(a,0,1)));
        System.out.println(Arrays.toString(one.f3(a,1,3)));
        System.out.println(Arrays.toString(one.f3(a,1,2)));
        System.out.println(Arrays.toString(one.f3(a,1,1)));
        System.out.println(Arrays.toString(one.f3(a,2,2)));
        System.out.println(Arrays.toString(one.f3(a,2,1)));
        System.out.println(Arrays.toString(one.f3(a,3,1)));
        System.out.println(Arrays.toString(one.f3(a,1,0)));
        
    }
}
