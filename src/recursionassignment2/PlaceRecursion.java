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
public class PlaceRecursion
{

    public static int place(int number)
    {
	return place(number, 0);
    }

    public static int place(int number, int power)
    {
	if(number<Math.pow(10, power)){
	    return power;
	}
	else{
	    return place(number, power+1);
	}
    }

}
