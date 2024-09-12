package com.javatest;

import java.util.ArrayList;
import java.util.Collections;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<MovieComp>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(MovieComp m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }

	
}

//Driver class
class MovieComparable
{
	public static void main(String[] args)
	{
		ArrayList<MovieComp> list = new ArrayList<MovieComp>();
		list.add(new MovieComp("Force Awakens", 8.3, 2015));
		list.add(new MovieComp("Star Wars", 8.7, 1977));
		list.add(new MovieComp("Empire Strikes Back", 8.8, 1980));
		list.add(new MovieComp("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (MovieComp movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}
