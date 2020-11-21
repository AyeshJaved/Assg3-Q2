package Hospital;
import javax.swing.JOptionPane;
import Generalpkg.Date;
import Generalpkg.Time;

import javax.swing.JOptionPane;

public class democlass
{
	public static void main(String[] args) 
	{
		int i;
		
		Doctor s2[]=new Doctor[2];
		Patient S3[]=new Patient[2];
		String obj;
		String obj1 = JOptionPane.showInputDialog("enter option which u want to make an object  : ");
		obj =obj1;
		if(obj=="InDoorPatient")
		{
		for(i=0;i<2;i++)
		{
			
			S3[i]=new InDoorPatient();
			
		}
		}
		else
		{
			for(i=0;i<2;i++)
			{
			S3[i]=new OutDoorPatient();	
		    }
		}
		
		int option,option3,b;
		do
		{
			JOptionPane.showMessageDialog (null, "enter option \r\n\" "
					+ "1- Add an indoor patient\r\n"
					+ "2- Add an outdoor patient\r\n"
					+ "3- See the list of all Doctors\r\n"
					+ "4- Search a doctor by name or department\r\n"
					+ "5- See the list of all indoor patients\r\n"
					+ "6- See the list of all appointments on a certain day\r\n"
					+ "7- See the list of appointments of a certain doctor\r\n"
					+ "8- Change the date or time of appointment of a certain patient.\\r\\n\""
					+ "0 for exist : ","Message",  JOptionPane.INFORMATION_MESSAGE);
			String option1 = JOptionPane.showInputDialog("enter option  : ");
			option =Integer.parseInt(option1);
			switch(option)
			{
			case 1:
			{
				
				for(i=0;i<2;i++)
				{
					S3[i]=new InDoorPatient();
		        	S3[i].Pinput();
			    	((InDoorPatient)S3[i]).Iinput();
				}
				break;
			}
			case 2:
			{
				
				for(i=0;i<2;i++)
				{			
					
					((OutDoorPatient)S3[i]).AddoutdoorPatient();
				}
			}
				break;
		case 3:
		{
				for(i=0;i<2;i++)
				{
					s2[i]=new Doctor();
					JOptionPane.showMessageDialog (null,s2[i].toString(),"doctor Display" ,JOptionPane.INFORMATION_MESSAGE);
				}
				
				break;
		}
		case 4:
		{
				for(i=0;i<2;i++)
				{
					s2[i]=new Doctor();
				s2[i].searchDoctor();
				}
				break;
		}
		case 5:
		{
				for(i=0;i<2;i++)
				{
					
					JOptionPane.showMessageDialog (null,((InDoorPatient)S3[i]).toString(),"InDoor Patients",JOptionPane.INFORMATION_MESSAGE);
					
					
				}
				break;
		}
	case 6:
		{
				int x;
				String x1 = JOptionPane.showInputDialog("enter  date  on which u find the record: ");
				x =Integer.parseInt(x1);
				for(i=0;i<2;i++)
				{
					
				if(x==((InDoorPatient)S3[i]).ggetdate())
				{
					JOptionPane.showMessageDialog (null,(S3[i].toString()),"record display",JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog (null, "certain record not found : ","Message",  JOptionPane.INFORMATION_MESSAGE);
				}
				break;
		}
	case 7:
		{
				String y;
				String y1 = JOptionPane.showInputDialog("enter  date  on which u find the record: ");
				y =y1;
				for(i=0;i<2;i++)
				{
					
				if(y==((InDoorPatient)S3[i]).ggetname())
				{
					JOptionPane.showMessageDialog (null,S3[i].toString(),"Appointment timings",JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog (null, "certain record not found : ","Message",  JOptionPane.INFORMATION_MESSAGE);
				}
				
				break;
		}
		case 8:
		{
				for(i=0;i<2;i++)
				{
					
					((InDoorPatient)S3[i]).updateDateandTime();
			    }
			    break;
		}
			}
		}while(option!=0);
	}
}