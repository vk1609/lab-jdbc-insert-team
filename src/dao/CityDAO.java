package dao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws IOException, SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM CITY";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet result = st.executeQuery();
		
		while(result.next()) {
			String checkName = result.getString("name");
			if(name.equals(checkName))
				System.out.println("Equal");
		}
		return null;
		
	}
	@SuppressWarnings("static-access")
	public void createCity(City city) throws SQLException, IOException, ClassNotFoundException {
		String sql = "INSERT INTO CITY VALUES (?,?)";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setLong(1, city.getCityid());
		st.setString(2, city.getCityname());
		
		int x = st.executeUpdate();
		
		System.out.println(x);

	}

}