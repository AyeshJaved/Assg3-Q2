package Hospital;
import Generalpkg.Date;
import Generalpkg.Time;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class InDoorPatient extends Patient
{
private
int wardno,roomno,bedno,fee;
Date date;
Doctor doctor;
Time Atime;
public 
InDoorPatient()
{
 wardno=0;
 roomno=0;
 bedno=0;
 fee=0;
 date=new Date();
 doctor=new Doctor();
 Atime=new Time();
 //date.getday();
 /*date.getmonth();
 date.getyear();*/
 /*doctor.getname();
 doctor.getcnic();
 doctor.getphone_no();
 doctor.getdepartment();
 doctor.getspecialization();
 doctor.getgender();*/
 /*Atime.gethours();
 Atime.getmins();
 Atime.getdayNight();*/
}
InDoorPatient (int w,int r,int b,int f)
{
 wardno=w;
 roomno=r;
 bedno=b;
 fee=f;
}
public int getwardno()
{
	return wardno;
}
public int getroomno()
{
	return roomno;
}
public int getbedno()
{
	return bedno;
}
public int getfee()
{
	return fee;
}
public void setbedno(int a)
{
	bedno=a;
  }
public void setfee(int b)
  {
	fee=b;
  }
public void setroomno(int c)
  {
	roomno=c;
  }
public void setwardno(int d)
  {
	wardno=d;
  }
public void Iinput()
  {
	super.Pinput();
	String wardNo = JOptionPane.showInputDialog("Enter ward no : ");
	wardno =Integer.parseInt(wardNo); 
	String roomNo = JOptionPane.showInputDialog("Enter room no : ");
	roomno =Integer.parseInt(roomNo); 
	String bedNo = JOptionPane.showInputDialog("Enter bed no : ");
	bedno =Integer.parseInt(bedNo);
	String Fee = JOptionPane.showInputDialog("Enter doctor fee : ");
	fee =Integer.parseInt(Fee); 
  }
public void Docinput()
{
	 doctor.Dinput();
}
void AddindoorPatient()
{
	 for(int i=0;i<=5;i++)
	 {
		 Pinput();
	 }
}
public int ggetdate()
{
	return (date.getday());
}
public String ggetname()
{
	return (super.getPname());
}
public String toString()
  {
	return("Pward No :"+wardno+" Proom No:"+roomno+" Pbed No:"+bedno+" fee:"+fee+super.toString()+doctor.toString());
  }
void updateDateandTime()
{
	date.input();
	Atime.input();
	//date.setday(11);
	//date.setmonth(2);
	//date.setyear(4);
	//Atime.sethours(7);
	 //Atime.setmins(9);
	 //Atime.setdayNight("pm");
	
}
}