package ex3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class Exercise3 {

	private final List<Recording> recordings = new ArrayList<>();

	public void exportRecordings(String fileName) {

	}

	public void importRecordings(String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader in = new BufferedReader(file);
			String line = in.readLine();
			int numRecs = Integer.parseInt(line);
			
			for(int i = 0; i < numRecs; i++) {
				line = in.readLine();
				String[] items = line.split(";");
				int year = Integer.parseInt(items[2]);
				line = in.readLine();
				Set<String> genres = new HashSet<>();
				int numGenres = Integer.parseInt(line);
				for(int j = 0; j < numGenres; j++) {
					line = in.readLine();
					genres.add(line);
				}
			}
			
		}catch(NumberFormatException e){
			System.err.println("Fel i filen " + fileName + "!");	
		}catch(FileNotFoundException e) {
			System.err.println("Filen " +fileName+ " kan inte öppnas!");
		}catch(IOException e) {
			System.err.println("IO-fel har inträffat!");
		}
	}

	public Map<Integer, Double> importSales(String fileName) {
		return null;
	}

	public List<Recording> getRecordings() {
		return Collections.unmodifiableList(recordings);
	}

	public void setRecordings(List<Recording> recordings) {
		this.recordings.clear();
		this.recordings.addAll(recordings);
	}
}

