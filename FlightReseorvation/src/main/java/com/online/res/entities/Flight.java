package com.online.res.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	
	@Column(name = "Flight_Number")
	private String flightNumber;
	@Column(name = "Operating_Air_Lines")
	private String opreratingAirlines;
	@Column(name = "Departure_City")
	private String departureCity;
	@Column(name = "Arrival_City")
	private String arrivalCity;
	@Column(name = "Date_OF_Departure")
	private Date dateOfDeparture;
	@Column(name = "Estimated_Departure_Time")
	private Timestamp estimatedDepartureTime;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOpreratingAirlines() {
		return opreratingAirlines;
	}
	public void setOpreratingAirlines(String opreratingAirlines) {
		this.opreratingAirlines = opreratingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	
	
	
}
