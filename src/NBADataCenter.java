// Driver Method that the Concrete Subject pulls the data from

public class NBADataCenter {
	public static void main(String[] args) {
		NBAData nbaData = new NBAData();
		
		ZachLavine gamePerformance = new ZachLavine(nbaData);
		
		System.out.println("Welcome to the Fantasy Application, Statistics Are Updated After Each Period");
		nbaData.setMeasurements(1, 0, 2, 1, 0, 0, 0);
		nbaData.setMeasurements(1, 6, 3, 3, 1, 0, 1);
		nbaData.setMeasurements(1, 12, 4, 3, 2, 1, 3);
		nbaData.setMeasurements(1, 21, 5, 3, 2, 1, 3);
		
		System.out.println("");
		
		nbaData.setMeasurements(2, 3, 0, 0, 2, 0, 0);
		nbaData.setMeasurements(2, 13, 3, 0, 2, 1, 1);
		nbaData.setMeasurements(2, 30, 4, 1, 2, 1, 2);
		nbaData.setMeasurements(2, 41, 5, 3, 4, 2, 3);
	}
}
