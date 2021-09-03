
public class NBAWebsite implements Observer, DisplayStatistics {
	private int points,rebounds, assists, steals, blocks, turnovers;
	private Subject nbaData;
	
	public NBAWebsite(Subject nbaData) {
		this.nbaData = nbaData;
		nbaData.registerObserver(this);
	}
	public void update (int points, int rebounds, int assists, int steals, int blocks, int turnovers) {
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		display();
	}
	public void display() {
		System.out.println("You team currently has: " + points + " points - " + rebounds + " rebounds - "
							+ assists + " assists - " + steals + " steals - " + blocks + " blocks - "
							+ turnovers + " turnovers.");
	}
}
