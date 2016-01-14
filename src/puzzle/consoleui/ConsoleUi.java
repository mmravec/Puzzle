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
		Scanner scener = new Scanner(System.in);
		System.out.print("Stlac smer: ");
		String option = "";
		
		while (!option.equals("x")) {
			option = scener.next();
			switch (option) {
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
				continue;
			}
			//field.generateField();
			//field.generateNumbers();
			show();
			if(isEnd())
				return;
		}
		scener.close();
	}
	
	private void show(){
		for (int row = 0; row < field.getRowCount(); row++) {
			for (int column = 0; column < field.getColumnCount(); column++) {
				System.out.print(field.tiles[row][column] + "\t");
			}
			System.out.println();
		}
		
	}
	
	

	private boolean isEnd() {
		/*if(field.isFinished()){
			try{
				hallOfFame.addScore(name, field.getPlayingSeconds(), 2);
			}catch (Exception e){
				System.err.println("Nepodarilo sa ulozit score");
				e.printStackTrace();
			}*/
			//System.out.println("Vyhral si!");
			//System.out.println(hallOfFame);
		//	return true;
		//}
		return false;
	}

}
