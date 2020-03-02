/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionassignment2;

/**
 *
 * @author k00253718
 */
public class factorialRecursion
{
    
    public static int factorial(int n)
    {
	if(n==1){
	    return 1;
	}
	if(n>0){
	    return n * factorial(n-1);
	}
	return 0;
    }
}
