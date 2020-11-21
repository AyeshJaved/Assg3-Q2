package Hospital;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Doctor {
private	
String name,gender,department,specialization;
int cnic,phone_no;
public
Doctor()
{
	name="";
	gender="";
	department="";
	specialization="";
	cnic=0;
	phone_no=0;
}
Doctor(String n,int c, int p,String g, String d, String s)
{
	name=n;
	gender=g;
	department=d;
	specialization=s;
	cnic=c;
	phone_no=p;
}
public String getname()
{
	return name;
}
public void setname(String a)
{
	name=a;
}
public int getcnic()
{
	return cnic;
}
public void setcnic(int b)
{
	cnic=b;
}
public int getphone_no()
{
	return cnic;
}
public void setphone_no(int c)
{
phone_no=c;
}
public String getgender()
{
	return gender;
}
public void setgender(String d)
{
	gender=d;
}
public String getdepartment()
{
	return department;
}
public void setdepartment(String e)
{
	department=e;
}
public String getspecialization()
{
	return specialization;
}
public void setspecialization(String f)
{
	specialization=f;
}
void Dinput()
{
	String name1 = JOptionPane.showInputDialog("Enter doctor name: ");
	name =name1; 
	String phone1 = JOptionPane.showInputDialog("Enter doctor phone no : ");
	phone_no =Integer.parseInt(phone1); 
	String cnic1 = JOptionPane.showInputDialog("Enter doctor cnic : ");
	cnic =Integer.parseInt(cnic1); 
	String gender1 = JOptionPane.showInputDialog("Enter doctor gender: ");
	gender =gender1;
	String department1 = JOptionPane.showInputDialog("Enter doctor department: ");
	department=department1;
	String specialization1 = JOptionPane.showInputDialog("Enter doctor specialization: ");
	specialization=specialization1;
}
public String toString()
{
	return("Dname is :"+name+" Dgender is :"+gender+" Ddepartment is :"+department+" Dspecialization is:"+specialization+" DphoneNo :"+phone_no+" Dcnic :"+cnic);
}
public void searchDoctor()
{
	String name2 = JOptionPane.showInputDialog("Enter doctor name which u want to search by name  ");
	
	if(name2!=name)
	{
		JOptionPane.showMessageDialog (null, "not Found","Message",  JOptionPane.INFORMATION_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog (null, "Found","Message",  JOptionPane.INFORMATION_MESSAGE);
	}
	
	String department2 = JOptionPane.showInputDialog("Enter doctor name which u want to search by department name  ");
	if(department2==department)
	{
		JOptionPane.showMessageDialog (null, "Found","Message",  JOptionPane.INFORMATION_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog (null, "Not Found","Message",  JOptionPane.INFORMATION_MESSAGE);
	}
}
}