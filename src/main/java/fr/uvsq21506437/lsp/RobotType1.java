package fr.uvsq21506437.lsp;

public class RobotType1 extends Robot{
	public int position;
	public RobotType1(int position) {
		super(position);
	}
	
	@Override
	public void avance() {
		super.position += 5;
	}

}
