package dao;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
		public void createTeam(Team team) throws ClassNotFoundException, SQLException, IOException {
				
				String sql="INSERT INTO TEAM VALUES(?,?,?,?,?)";
				PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
				st.setLong(1, team.getId());
				st.setString(2, team.getName());
				st.setString(3, team.getCoach());
				st.setString(4, team.getCity());
				st.setString(5, team.getCaptain());
				
				int x = st.executeUpdate();
				
				System.out.println(x);
			}
		}