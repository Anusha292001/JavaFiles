class Vivekananda implements ProgressReportInterface{
	
	public void getProgressReport(){
		System.out.println("A,B,D");
	}
	
	public void getProgressReport1(){
		System.out.println("A,B,C");
	}
	
	public void getProgressReport3(){
		System.out.println("A,B,C");
	}
}
class SriSaiVidyaNikethan implements ProgressReportInterface{
	public void getProgressReport(){
		System.out.println("DEF");
	}
	
}

class AnuEMSchool implements ProgressReportInterface{
	public void getProgressReport(){
		System.out.println("Bad,Good,Excellent");
	}
	
}

class ProgressReport{
	public static void getObject(String className) throws Exception{
		Class a=Class.forName(className);
		Object o=a.newInstance();
		ProgressReportInterface reportInterface=(ProgressReportInterface)o;
		//ProgressReportInterface reportInterface=(ProgressReportInterface)Class.forName(className).newInstance();
		reportInterface.getProgressReport();
	}
	
	public static void main(String anu[]) throws Exception{
		//Vivekananda vivekananda=new Vivekananda();
		//SriSaiVidyaNikethan sriSaiVidyaNikethan=new SriSaiVidyaNikethan();
		//vivekananda.getProgressReport();
		//sriSaiVidyaNikethan.getProgressReport();
		getObject("Vivekananda");
		getObject("SriSaiVidyaNikethan");
		getObject("AnuEMSchool");
	}
}
