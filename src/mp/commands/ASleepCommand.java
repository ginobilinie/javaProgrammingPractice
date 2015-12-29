package mp.commands;

import util.annotations.Tags;
import util.misc.ThreadSupport;
@Tags({ "SleepCommand" })
public class ASleepCommand implements Runnable{

	long time;
	
	public ASleepCommand(long s){
		time=s;
	}
	@Override
	public void run() {
		ThreadSupport.sleep(time);
	}

}
