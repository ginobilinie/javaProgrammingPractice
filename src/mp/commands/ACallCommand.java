package mp.commands;

import grail.ds.Table;
import grail.ds.TableInterface;
import util.annotations.Tags;
@Tags({ "CallCommand" })
public class ACallCommand implements Runnable {

	String name;
	TableInterface table;

	public ACallCommand(String s, TableInterface t) {
		table = t;
		name = s;
	}

	@Override
	public void run() {

		Runnable command = (Runnable) (table.get(name));
		command.run();
	}

}
