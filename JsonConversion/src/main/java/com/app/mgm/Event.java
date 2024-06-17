package com.app.mgm;

public class Event {

	private String eventDate ;
	private String eventTz;
	private String eventId;
	private String eventCode;
	private String eventTime;
	private String seasonId;
	private String programId;
	private boolean offerAvailable;
	
//	"eventDate": "2023-01-04",
//  "eventTz": "2023-01-04T18:00Z",
//  "eventId": "694e0fd3-49fc-4413-aaf4-4b46b19f7277",
//  "eventCode": "RCD0104E",
//  "eventTime": "10:00 AM",
//  "seasonId": "507f9d3c-863a-4bf5-a6bb-eaa40c9db9e6",
//  "programId": "dd8946d2-ffe6-41d9-b7ed-547bd661fa3d",
//  "offerAvailable": true
	
	
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventTz() {
		return eventTz;
	}
	public void setEventTz(String eventTz) {
		this.eventTz = eventTz;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public boolean isOfferAvailable() {
		return offerAvailable;
	}
	public void setOfferAvailable(boolean offerAvailable) {
		this.offerAvailable = offerAvailable;
	}
	@Override
	public String toString() {
		return "Event [eventDate=" + eventDate + ", eventTz=" + eventTz + ", eventId=" + eventId + ", eventCode="
				+ eventCode + ", eventTime=" + eventTime + ", seasonId=" + seasonId + ", programId=" + programId
				+ ", offerAvailable=" + offerAvailable + "]";
	}


	
	
}
