//Concrete Subject implemented from the Subject Interface

import java.util.ArrayList;

public class NBAData implements Subject{
	private ArrayList<Observer> subscribedObservers;
	private int gameNumber, points, rebounds, assists, steals, blocks, turnovers;
	
	public NBAData() {
		subscribedObservers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		subscribedObservers.add(o);
	}
	
	public void removeObserver(Observer o) {
		subscribedObservers.remove(subscribedObservers.indexOf(o));
	}
	
	public void notifyObserver() {
		for (int i = 0; i < subscribedObservers.size(); i++) {
			Observer observer = (Observer)subscribedObservers.get(i);
			observer.update(gameNumber, points, rebounds, assists, steals, blocks, turnovers);
		}
	}
	
	public void setMeasurements() {
		notifyObserver();
	}
	
	public void setMeasurements(int gameNumber, int points, int rebounds, int assists, int steals, 
								int blocks, int turnovers) {
		this.gameNumber = gameNumber;
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		setMeasurements();
	}
}
