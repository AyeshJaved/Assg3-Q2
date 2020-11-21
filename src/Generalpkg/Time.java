package Generalpkg;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Time 
{

private
int hours,mins;
String dayNight;
public
Time()
{
	hours=0;
	mins=0;
	dayNight="";
}
Time(int h,int m,String x)
{
	hours=h;
	mins=m;
	dayNight=x;
}
public int gethours()
{
	return hours;
}
public  int getmins()
{
	return mins;
}
public  String getdayNight()
{
	return dayNight;
}		
public void sethours(int x)
{
	hours=x;
}
public  void setmins(int y)
{
	mins=y;
}
public  void setdayNight(String z)
{
	dayNight=z;
}	
public void input()
{
	String hours1 = JOptionPane.showInputDialog("Enter hours: ");
	hours =Integer.parseInt( hours1 ); 
	String mins1 = JOptionPane.showInputDialog("Enter minute : ");
	mins =Integer.parseInt(mins1); 
	String dayNight1 = JOptionPane.showInputDialog("Enter Am/Pm : ");
	dayNight =dayNight1; 
}
public String toString()
{
	return(hours+":"+mins+":"+dayNight);
}
}