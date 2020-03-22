package fr.uvsq21506437.lsp;


public class RobotType2  extends Robot{
	public int position;
	public RobotType2(int position) {
		super(position);
	}
	
	@Override
	public void avance() {
		super.position += 10;
	}
	
}
