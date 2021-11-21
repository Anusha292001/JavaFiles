import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Digital extends Applet implements Runnable {
	Thread t=null;
	//int hours=0,minutes=0,seconds=0;;
	String timeString=" ",createdBy="created by Anushka";
	public void init() {
		setBackground(Color.white);
	}
	public void start() {
		t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			while(true) {
				Calendar cal=Calendar.getInstance();
				/* hours=cal.get(Calendar.HOUR_OF_DAY);
				if(hours>12)hours=12;
				minutes=cal.get(Calendar.MINUTE);
				seconds=cal.get(Calendar.SECOND); */
				SimpleDateFormat formatter=new SimpleDateFormat("dd@MM@YYYY hh.mm.ss");
				Date date=cal.getTime();
				timeString=formatter.format(date);
				repaint();
				t.sleep(1000);
			}
		}
		catch(Exception e) {}

	}

	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString(timeString,150,150);
		g.drawString(createdBy,400,300);
	}
}
