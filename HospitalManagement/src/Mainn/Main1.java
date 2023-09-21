package Mainn;
import Accounts.*;
import HygieneStaff.*;
import InsuranceDepart.*;
import SeniorDoctors.*;


public class Main1 {
	public static void main(String args[]) {
		Expenditure ex=new Expenditure();
		Invest in=new Invest();
		Salary sa=new Salary();
		Attender att=new Attender();
		Cleaning cl=new Cleaning();
		HelpStaff hs=new HelpStaff();
		Agent a=new Agent();
		Manager m=new Manager();
		Time t=new Time();
		Cardiac c=new Cardiac();
		Gyno g=new Gyno();
		Ortho o=new Ortho();
		System.out.println("ACCOUNTS");
		System.out.println("--->expenditure");
		ex.ambulance();
		ex.forEqup();
		ex.forElectricity();
		System.out.println("--->invest");
		in.Advertisement();
		in.FreeHealthCheck();
        in.forNewBranch();
        System.out.println("--->salary");
		sa.forAttenders();
		sa.forDocs();
		sa.forHygiene();
		System.out.println(".............................................");
		System.out.println("HYGIENE");
		System.out.println("--->attender");
		att.mywork();
		att.workinghrs();
		System.out.println("--->Cleaning");
		cl.Staff();
		cl.elements();
		System.out.println("--->HelpStaff");
		hs.myworkk();
		hs.helpDesk();
		System.out.println(".............................................");
		System.out.println("INSURANCE");
		System.out.println("--->agent");
		a.role();
		a.skill();
		System.out.println("--->manager");
		m.work();
		m.post();
		System.out.println("--->time");
		t.halfy();
		t.quaterly();
		t.yearly();
		System.out.println(".............................................");
		System.out.println("Sr.DOCS");
		System.out.println("--->cardiac");
		c.job();
		c.part();
		System.out.println("--->gyno");
		g.experience();
		g.myjob();
		System.out.println("--->ortho");
		o.job1();
		o.types();
		System.out.println("-------Thank You--------------");
		
		
		
		
		
		
		
	}

}
