package model;
public class City
{
	private static long cityid;
	private static String cityname;
	
	public City(long cityid, String cityname) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
	}
	public static long getCityid() {
		return cityid;
	}
	public void setCityid(long cityid) {
		this.cityid = cityid;
	}
	public static String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
}
