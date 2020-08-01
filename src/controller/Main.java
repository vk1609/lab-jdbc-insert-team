package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {

	public static void main(String[] args) throws Exception {

		CityDAO citydao = new CityDAO();
		TeamDAO teamdao = new TeamDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter city name");
		String cityName=br.readLine();
		
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		
		City city=new City(id ,cityName);
		
		System.out.println("Enter Your Id");
		int id1 = Integer.parseInt(br.readLine());

		System.out.println("Enter the name");
		String name=br.readLine();
		
		System.out.println("Enter coach name");
		String coach = br.readLine();
		
		System.out.println("Enter home_city");
		String home_city = br.readLine();
		
		System.out.println("Enter captain name");
		String captain = br.readLine();
		
		Team team = new Team(id1 , name, coach, home_city , captain);
		
		citydao.createCity(city);
		teamdao.createTeam(team);

	}}


