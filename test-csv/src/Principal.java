import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String fileName = "animaux.csv";
		File file = new File(fileName);

		Random r = new Random();
		ArrayList<String> listS = new ArrayList<String>();

		try {
			Scanner inputStream = new Scanner(file);
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				String[] values = data.split(";");
				System.out.println(values[0]);
				listS.add(data);
			}
			int nbrMot = listS.size();
			System.out.println(listS);
			System.out.println(generateRandomInt(nbrMot));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public static int generateRandomInt(int nbrMot){
	    Random random = new Random();
	    return random.nextInt(nbrMot);
	}

}
/*
 * String data = inputStream.next(); String[] values = data.split(";"); //
 * supprime la virgule String x = values[0]; int n = 7;
 * 
 * for (int i = 0; i < n; i++){ String t = x.substring(i,i+1);
 * System.out.println(t);
 */
