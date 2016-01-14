package puzzle;

import java.io.IOException;
import puzzle.consoleui.ConsoleUi;
import puzzle.core.Field;

public class Puzzle {

	public static void main(String[] args) throws IOException {

		System.out.println("Vytvaram hraciu plochu...");
		Field field = new Field(4, 4);
		ConsoleUi ui = new ConsoleUi(field);

		//field.generateField();
		ui.play();

	}

}
