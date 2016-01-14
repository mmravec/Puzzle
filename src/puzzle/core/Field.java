package puzzle.core;


public class Field {

	private final int rowCount;
	private final int columnCount;
	private static final int GAP = 0;
	
	private int[][] tiles;
	private int actulaColumn;
	private int actualRow;

	public Field(int rowCount, int columnCount) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;

		tiles = new int[rowCount][columnCount];
		generate();
	}

	private void generate() {
		generateNumbers();
		generateField();
	}

	private void generateField() {
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				System.out.print(tiles[row][column] + "\t");
			}
			System.out.println();
		}
	}

	private void generateNumbers() {
		int number = 1;
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				tiles[row][column] = number;
				number++;
			}
		}
		tiles[rowCount - 1][columnCount - 1] = GAP;
	}

	private void getActualZero() {
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				if (tiles[rowCount - 1][columnCount - 1] == 0) {
					actulaColumn = row;
					actualRow = column;

				}
			}
		}
		// System.out.println(actulaColumn + " " + actualRow);
	}

	public void moveDown() {
		getActualZero();
		if (actualRow <= rowCount - 1) {
			tiles[actualRow][actulaColumn] = tiles[actualRow + 1][actulaColumn];
			tiles[actualRow + 1][actulaColumn] = GAP;
		}
		
	}

	public void moveUp() {
		getActualZero();
		if (actualRow >= 1) {
			tiles[actualRow][actulaColumn] = tiles[actualRow - 1][actulaColumn];
			tiles[actualRow - 1][actulaColumn] = GAP;
		}
		
	}

	public void moveRight() {
		getActualZero();
		if (actulaColumn <= columnCount - 1) {
			tiles[actualRow][actulaColumn] = tiles[actualRow][actulaColumn + 1];
			tiles[actualRow][actulaColumn + 1] = GAP;
		}
		
	}

	public void moveLeft() {
		getActualZero();
		if (actulaColumn >= 1) {
			tiles[actualRow][actulaColumn] = tiles[actualRow][actulaColumn - 1];
			tiles[actualRow][actulaColumn - 1] = GAP;
		}
		
	}
}
