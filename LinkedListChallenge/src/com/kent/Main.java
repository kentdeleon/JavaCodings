package com.kent;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static List<Album> albums = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album album = new Album("Storm Bringer", "Deep Purple");
		album.addSong(Song.createSong("Storm Bringer", 4.6));
		album.addSong(Song.createSong("Soldier Fortune", 4.22));
		album.addSong(Song.createSong("Love don't mean a thing", 45.2));
		album.addSong(Song.createSong("Holy Man", 3.23));
		album.addSong(Song.createSong("Holy Shit", 5.56));
		album.addSong(Song.createSong("Hold On", 2.46));
		
		albums.add(album);
		
		album = new Album("For those about to rock", "AC/DC");
		
		album.addSong(Song.createSong("Let's go", 4.6));
		album.addSong(Song.createSong("C.O.D", 3.23));
		album.addSong(Song.createSong("Snowballed", 5.56));
		album.addSong(Song.createSong("Evil walks", 2.46));
		albums.add(album);
		
		List<Song> playList = new LinkedList<>();
		albums.get(0).addToPlayList(1, playList);
		albums.get(0).addToPlayList("Holy Man", playList);
		albums.get(0).addToPlayList(3, playList);
		
		albums.get(1).addToPlayList(1, playList);
		albums.get(1).addToPlayList("Evil walks", playList);
		
		play(playList);
		
	}
	
	public static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		
		System.out.println("PlayList");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	
	public static void play(List<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		
		
		if(playList.size() == 0) {
			System.out.println("No songs in the playList");
			return;
		}
		
	
		System.out.println("Now playing " + listIterator.next().toString());
		while(!quit) {
			
			System.out.println("Enter choice: ");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					
					forward = true;
				}
				
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				}else {
					System.out.println("We are the end of the playList");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					
					forward = true;
				}
				
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				}else {
					System.out.println("We are the start of the playList");
					forward = false;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are the start of the playList");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("We are the end of the playList");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					}else if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					}
				}
			}
		}
	}

}
