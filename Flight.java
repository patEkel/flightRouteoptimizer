package assignment13;

import java.util.HashSet;
import java.util.LinkedList;

public class Flight {
	Airport destination;
	String carrier;
	double delay = 0;
	double canceled = 0;
	double time = 0;
	double distance = 0;
	double cost = 0;
	int count = 0;
	String flightName;
	HashSet<String> carriers = new HashSet<String>();

	//FlightCriteria flightCriteria;
	
	public Flight(Airport destination, String carrier, int delay, int canceled, int time, int distance, int cost){
	//public Flight(Airport destination,  int delay, int canceled, int time, int distance, double cost){
	this.destination = destination;
		this.carriers.add(carrier);
		this.carrier = carrier; // add in Graph class every time, no duplicates
		this.delay = (double) delay;
		this.canceled = (double) canceled;
		this.time = (double) time;
		this.distance = (double) distance;
		this.cost = (double) cost;
		this.count=1;
		this.flightName = destination.name;
	}	
	
}
