package Generalpkg;

import javax.swing.JOptionPane;

public class Date
{
private
int day,month,year;
public
Date()
{
	day=0;
	month=0;
	year=0;
}
Date(int d,int m,int y)
{
	day=d;
	month=m;
	year=y;
}
public int getday()
{
	return day;
}
public  int getmonth()
{
	return month;
}
public  int getyear()
{
	return year;
}		
public void setday(int r)
{
	day=r;
}
public  void setmonth(int w)
{
	month=w;
}
public  void setyear(int s)
{
	year=s;
}	
public void input()
{
	String day1 = JOptionPane.showInputDialog("Enter today  date: ");
	day =Integer.parseInt( day1 ); 
	String month1 = JOptionPane.showInputDialog("Enter month : ");
	month =Integer.parseInt(month1); 
	String year1 = JOptionPane.showInputDialog("Enter year : ");
	year =Integer.parseInt(year1); 
}
public String toString()
{
	return(day+"th/"+month+"/"+year);
}
}