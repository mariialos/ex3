package ex3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
			
			
		}catch(NumberFormatException e){
			System.err.println("Fel i filen " + fileName);	
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

