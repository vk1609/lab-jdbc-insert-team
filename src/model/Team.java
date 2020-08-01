package model;
public class Team
{
	private long id;
private String	name;
private  String coach;
private String captain;
private String city;

public Team(long id,String name, String coach, String captain, String city) {
	super();
	this.id = id;
	this.name = name;
	this.coach = coach;
	this.captain = captain;
	this.city = city;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCoach() {
	return coach;
}
public void setCoach(String coach) {
	this.coach = coach;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
