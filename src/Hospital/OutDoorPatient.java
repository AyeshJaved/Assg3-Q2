package Hospital;
import Generalpkg.Date;
import Generalpkg.Time;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class OutDoorPatient extends Patient
{
	
private
		Date Adate;
		Time Atime;
		InDoorPatient Dfee;
		Doctor doc;
public
		OutDoorPatient() {
		Adate=new Date();
		Atime=new Time();
		 Dfee=new InDoorPatient();
		 doc=new Doctor();
		/* Adate.getday();
		 Adate.getmonth();
		 Adate.getyear();*/
		 
		 /*Atime.gethours();
		 Atime.getmins();
		 Atime.getdayNight();*/
		
		 //Dfee.getfee();
}
void AddoutdoorPatient()
{
Adate.input();
Atime.input();
doc.Dinput();
super.Pinput();

}
public String toString()
{
	return(Adate.toString()+Atime.toString()+super.toString());
}
}