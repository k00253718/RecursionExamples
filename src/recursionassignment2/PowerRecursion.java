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
public class PowerRecursion
{

    public static double power(int base, int exponent)
    {
	if (exponent == 0)
	{
	    return 1;
	}
	exponent = exponent - 1;
	return power(base, exponent) * base;
    }
}
