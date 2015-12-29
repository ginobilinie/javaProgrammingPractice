package mp.commands;


import grail.shape.AvatarInterface;
import util.annotations.Tags;
@Tags({ "RotateLeftArmCommand" })
public class ARotateLeftArmCommand implements Runnable{
	AvatarInterface avatar;
	int r;

	public ARotateLeftArmCommand(AvatarInterface a, int y) {
		
		avatar = a;
		r = y;

	}

	@Override
	public void run() {
		avatar.getArms().getLeftLine().rotate(r);		
	}
	
	
	
	
	
	
}
