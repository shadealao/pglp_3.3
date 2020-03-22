package fr.uvsq21506437.lsp;

public class Robot {
	public int position;

	public Robot(int position) {
		this.position = position;
	}

	public void avance() {
		position += 10;
	}

	public int getPosition() {
		return this.position;
	}

}
