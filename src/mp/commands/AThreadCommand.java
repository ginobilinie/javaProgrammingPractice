package mp.commands;

import grail.ds.Table;
import grail.ds.TableInterface;

public class AThreadCommand implements Runnable {

	String name;
	TableInterface table;

	public AThreadCommand(String s, TableInterface t) {
		name = s;
		table = t;
	}

	@Override
	public void run() {

		Runnable command = (Runnable) (table.get(name));
		Thread thread1 = new Thread(command);
		thread1.start();
		
	}

}
