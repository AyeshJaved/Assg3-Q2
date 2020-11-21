package Hospital;
import javax.swing.JOptionPane;
public class Patient 
{

private
String name,gender,address;
int cnic,phone_no,age;
public
Patient()
{
	name="";
	gender="";
	address="";
	cnic=0;
	phone_no=0;
	age=0;
}
Patient(String n,int c,String a,int p,String g, int A)
{
	name=n;
	gender=g;
	address=a;
	cnic=c;
	phone_no=p;
	age=A;
}
public String getPname()
{
	return name;
}
public void setPname(String a)
{
	name=a;
}
public int getPcnic()
{
	return cnic;
}
public void setPcnic(int b)
{
	cnic=b;
}
public int getAge()
{
	return age;
}
public void setAge(int b)
{
	age=b;
}
public int getPphone_no()
{
	return cnic;
}
public void setPphone_no(int c)
{
phone_no=c;
}
public String getPgender()
{
	return gender;
}
public void setPgender(String d)
{
	gender=d;
}
public String getPaddress()
{
	return address;
}
public void setPaddress(String d)
{
	address=d;
}
public void Pinput()
{
	String name1 = JOptionPane.showInputDialog("Enter patient name: ");
	name =name1; 
	String phone1 = JOptionPane.showInputDialog("Enter patient phone no : ");
	phone_no =Integer.parseInt(phone1); 
	String cnic1 = JOptionPane.showInputDialog("Enter patient cnic : ");
	cnic =Integer.parseInt(cnic1); 
	String gender1 = JOptionPane.showInputDialog("Enter patient gender: ");
	gender =gender1;
	String address1 = JOptionPane.showInputDialog("Enter patient address4: ");
	address=address1;
	String age1 = JOptionPane.showInputDialog("Enter patient cnic : ");
	age =Integer.parseInt(age1); 
}
public String toString()
{
	return("Pname is :"+name+" Pgender is :"+gender+" Paddress is :"+address+" Page is:"+age+" PphoneNo :"+phone_no+" Pcnic :"+cnic);
}
}