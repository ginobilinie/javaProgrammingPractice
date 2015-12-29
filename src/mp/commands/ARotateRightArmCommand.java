package mp.commands;


import grail.shape.AvatarInterface;
import util.annotations.Tags;
@Tags({ "RotateRightArmCommand" })
public class ARotateRightArmCommand implements Runnable {
	AvatarInterface avatar;
	int r;

	public ARotateRightArmCommand(AvatarInterface a, int y) {
		avatar = a;
		r = y;

	}

	@Override
	public void run() {
		avatar.getArms().getRightLine().rotate(r);
	}
}
