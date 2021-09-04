//Concrete Observer implemented from the Observer Interface

public class ZachLavine implements Observer, FantasyApplication {
	private int gameNumber, points,rebounds, assists, steals, blocks, turnovers;
	private Subject nbaData;
	
	public ZachLavine(Subject nbaData) {
		this.nbaData = nbaData;
		nbaData.registerObserver(this);
	}
	public void update (int gameNumber, int points, int rebounds, int assists, int steals, int blocks, 
						int turnovers) {
		this.gameNumber = gameNumber;
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		display();
	}
	public void display() {
		System.out.println("Zach Lavine's Performance in Game " + gameNumber + "/82 : " + points + " points - " + rebounds + " rebounds - "
							+ assists + " assists - " + steals + " steals - " + blocks + " blocks - "
							+ turnovers + " turnovers.");
	}
}
