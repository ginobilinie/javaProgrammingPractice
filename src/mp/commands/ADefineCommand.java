package mp.commands;

import grail.ds.Table;
import grail.ds.TableInterface;
import util.annotations.Tags;

@Tags({ "DefineCommand" })
public class ADefineCommand implements Runnable {

	String name;
	Runnable command;
//	Table table;

	public ADefineCommand(Runnable c, String s) {
		name = s;
		command = c;
//		table = t;

	}

	
//	public Table getTable(){
//		return table;
//	}
	@Override
	public void run() {
		AParser.table.put(name, command);
	}

}
