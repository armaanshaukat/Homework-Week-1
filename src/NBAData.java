import java.util.ArrayList;

public class NBAData implements Subject{
	private ArrayList<Observer> subscribedObservers;
	private int points, rebounds, assists, steals, blocks, turnovers;
	
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
			observer.update(points, rebounds, assists, steals, blocks, turnovers);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(int points, int rebounds, int assists, int steals, int blocks, int turnovers) {
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		measurementsChanged();
	}
}
