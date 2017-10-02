package com.kent;

public class Song {
	
	private String name;
	private double duration;
	
	public Song(String name, double duration) {
		
		this.name = name;
		this.duration = duration;
	}
	
	public static Song createSong(String name, double duration) {
		return new Song(name, duration);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Song Title: " + getName() + " Duration: " + getDuration();
	}
	
	
	
	

}
