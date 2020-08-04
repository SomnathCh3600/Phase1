package com.simplilearn.collection.studentList;

import java.util.ArrayList;
import java.util.List;

public class TestSongList {

	public static void main(String[] args) {

		Songs song1=new Songs(201,"Freedom","Akon","Akon","HipHop");
		Songs song2=new Songs(202,"Hello Seattle","Owl City","Adam Young","Pop Music");
		Songs song3=new Songs(203,"Memories","Maroon 5","Barbra Streisand","Pop Music");
		Songs song4=new Songs(204,"Faded","Alan Walker","Alan Walker","RnB");
		Songs song5=new Songs(205,"Without Me","Halsey","Halsey","HipHop");
		Songs song6=new Songs(206,"Love Yourself","Justin Beiber","Justin Beiber","HipHop");
		
		List<Songs> songList =new ArrayList<Songs>();
				
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		songList.add(song5);
		songList.add(song6);
		
		System.out.println("Welcome to the US Billboard Song's List");
		
		for(Songs song : songList) {
			System.out.println("===================||===================");
			System.out.println("Song Id: "+song.getSongId());
			System.out.println("Song Name: "+song.getSongName());
			System.out.println("Singer: "+song.getSinger());
			System.out.println("Lyricist: "+song.getLyricist());
			System.out.println("Genre: "+song.getGenre());
		}
		

	}

}
