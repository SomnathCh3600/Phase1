package com.simplilearn.collection.studentList;

public class Songs {
	
	private int songId=0;
	private String songName=null;
	private String lyricist=null;
	private String singer=null;
	private String genre=null;
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Songs(int songId, String songName, String lyricist, String singer, String genre) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.lyricist = lyricist;
		this.singer = singer;
		this.genre = genre;
	}
	
	

}
