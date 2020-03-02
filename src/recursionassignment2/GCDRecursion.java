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
public class GCDRecursion
{

    public static int gcd(int m, int n)
    {
	if (m == n)
	{
	    return m;
	}
	else if (m > n)
	{
	    return gcd(m - n, n);
	}
	else
	{
	    return gcd(m, n - m);
	}
    }
}
