
public class NBADataCenter {
	public static void main(String[] args) {
		NBAData nbaData = new NBAData();
		
		NBAWebsite currentStatistics = new NBAWebsite(nbaData);
		
		nbaData.setMeasurements(23, 11, 13, 9, 0, 88);
		nbaData.setMeasurements(11, 22, 49, 0, 8, 4);
		nbaData.setMeasurements(99, 99, 99, 99, 99, 99);
	}
}
