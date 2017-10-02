package com.kent;
import java.util.List;
import java.util.ArrayList;


public class Album {
	
	private String name;
	private String artist;
	private List<Song> songs;
	
	
	public Album(String name, String artist) {

		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}
	
	public boolean addSong(Song newSong) {
		if( findSong(newSong.getName()) == null ) {
			songs.add(newSong);
				return true;
		}
		
		System.out.println("Existing song in the album");
		return false;
	}
	
	public boolean addToPlayList(String title, List<Song> playList) {
		Song checkSong = findSong(title);
		if(checkSong != null) {
			playList.add(checkSong);
			return true;
		}
		
		System.out.println("the song " + title + " is not in the album");
		return false;
	}
	public boolean addToPlayList(int trackNumber, List<Song> playList) {
		
		int index = trackNumber - 1;
		if((index >= 0) && (index <= this.songs.size())) {
			playList.add(this.songs.get(index));
			return true;
		}
		
		System.out.println("This album " + this.name + " does not have a track Number " + trackNumber);
		return false;
		
		

	}
	
	private Song findSong(String name) {
		for(Song checkedSong: songs) {
			if(checkedSong.getName().equals(name)) {
				return checkedSong;
			}
		}
		return null;
	}
	


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the albumList
	 */
	public List<Song> getAlbumList() {
		return songs;
	}
	
	
	
	

	
	
	
}
