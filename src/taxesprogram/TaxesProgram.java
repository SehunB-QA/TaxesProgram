package taxesprogram;

//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TaxesProgram {
	int salary;
	int taxPercentage;
	double taxTake;
	
    private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	public int CalculateSalaryTaxRate(int salary)
	{
		
		if(salary <= 0 || salary <= 14999 )
		{
			taxPercentage = 0;
			//System.out.println("Your tax rate for your salary is : " + taxPercentage + "%" );
			return taxPercentage;
			
		}
		
		if(salary == 15000 || salary <=  19999 )
		{
			taxPercentage = 10;
			//System.out.println("Your tax rate for your salary is : " + taxPercentage + "%" );
			return taxPercentage;
			
		}
		
		if(salary == 20000 || salary <=  29999 )
		{
			taxPercentage = 15;
			//System.out.println("Your tax rate for your salary is : " + taxPercentage + "%" );
			return taxPercentage;
		}
		
		if(salary == 300000 || salary <=  449999 )
		{
			taxPercentage = 20;
			//System.out.println("Your tax rate for your salary is : " + taxPercentage  + "%" );
			return taxPercentage;
			
		}
		
		if(salary >= 450000)
		{
			taxPercentage = 25;
			//System.out.println("Your tax rate for your salary is : " + taxPercentage + "%" );
			return taxPercentage;
		}
		
		return taxPercentage;
		
	}
	
	
	public double CalculateSalaryTaxTake(int salary)
	{
		
		if(salary <= 0 || salary <=  14999 )
		{
			taxPercentage = 0;
			taxTake =  salary / 100 * taxPercentage;
			//System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
			return taxTake;
		}
		
		if(salary == 15000 || salary <=  19999 )
		{
			taxPercentage = 10;
			taxTake =  salary / 100 * taxPercentage;
			//System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
			return taxTake;
			
		}
		
		if(salary == 20000 || salary <=  29999 )
		{
			taxPercentage = 15;
			taxTake =  salary / 100 * taxPercentage;
			//System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
			return taxTake;
			
			
			
		}
		
		if(salary == 300000 || salary <=  449999 )
		{
			taxPercentage = 20;
			taxTake =  salary / 100 * taxPercentage;
			//System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
			return taxTake;
			
			
		}
		
		if(salary >= 450000)
		{
			taxPercentage = 25;
			taxTake =  salary / 100 * taxPercentage;
			//System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
			return taxTake;
			
		}
		
		//System.out.println("The amount of your salary will be taxed by " + taxTake); 
		return taxTake;
	}
	
	
	public double SuperTaxMethod(int salary)
	{
		double taxPercentage = CalculateSalaryTaxRate(salary);
		double taxTake  =  CalculateSalaryTaxTake(salary);
		System.out.println("You Tax rate is: " + taxPercentage + "%"); 
		System.out.println("The amount of your salary that will be taxed is: " + "£" + df2.format(taxTake)); 
		
//		
//		if(salary <= 0 || salary <=  14999 )
//		{
//			taxTake =  salary / 100 * taxPercentage;
//			System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
//			return taxTake;
//		}
//		
//		if(salary == 15000 || salary <=  19999 )
//		{
//			taxTake =  salary / 100 * taxPercentage;
//			System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
//			return taxTake;
//			
//		}
//		
//		if(salary == 20000 || salary <=  29999 )
//		{
//			taxTake =  salary / 100 * taxPercentage;
//			System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
//			return taxTake;
//			
//			
//			
//		}
//		
//		if(salary == 300000 || salary <=  449999 )
//		{
//			taxTake =  salary / 100 * taxPercentage;
//			System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
//			return taxTake;
//			
//			
//		}
//		
//		if(salary >= 450000)
//		{
//			
//			taxTake =  salary / 100 * taxPercentage;
//			System.out.println("Tax will take " + "£" +  df2.format(taxTake)  + " of your total salary." ); 
//			return taxTake;
//			
//		}
//		
		//System.out.println("The amount of your salary will be taxed by " + taxTake); 
		return  taxTake;
	}
	
	
	
	
	
	
	

}
