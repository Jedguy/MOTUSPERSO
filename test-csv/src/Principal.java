import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		String fileName = "animaux.csv";
		File file = new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.nextLine();//ignore la première ligne
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				String[] values = data.split(";"); // supprime la virgule
				//System.out.println(values[0]); //choisi la colonne des mots
				String x = values[0];
				int n = 7;
				
				for (int i = 0; i < n; i++){
					String t = x.substring(i,i+1);
					System.out.println(t);
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
