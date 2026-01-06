package boardgame;

public class Position {
	
	private int row;
	private int collumn;
	
	public Position(int run, int collumn) {
		this.row = run;
		this.collumn = collumn;
	}

	public int getRun() {
		return row;
	}

	public void setRun(int run) {
		this.row = run;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}

	@Override
	public String toString() {
		return "Position [run=" + row + ", collumn=" + collumn + "]";
	}
	
	
}
