package puzzle.consoleui;

import java.io.IOException;
import java.util.Scanner;

import puzzle.core.Field;

public class ConsoleUi {
	private Field field;
	private boolean game = true;

	public ConsoleUi(Field field) {
		this.field = field;
	}

	public void play() throws IOException {
		Scanner csaner = new Scanner(System.in);
		System.out.print("Stlac smer: ");
		String move = csaner.next();
		while (game) {
			switch (move) {
			case "w":
				field.moveUp();
				//field.generateField();
				break;
			case "s":
				field.moveDown();
				//field.generateField();
				break;
			case "d":
				field.moveRight();
				//field.generateField();
				break;
			case "a":
				field.moveLeft();
				//field.generateField();
				break;
			default:
				System.out.println("zly vstup skus A/S/D/W");
				break;
			}
		}
	}

	public void show() {
		
	}
}
