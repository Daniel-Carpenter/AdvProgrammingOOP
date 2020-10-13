
public class SongEntry 
{
	private String uniqueID;
	private String songName;
	private String artistName;
	private int songLength = 0;
	SongEntry nextNode = null;
	
	public SongEntry()
	{
		
	}
	
	public SongEntry(String uniqueID, String songName, String artistName, int songLength)
	{
		this.uniqueID = uniqueID;
		this.songName = songName;
		this.artistName = artistName;
		this.songLength = songLength;
	}
	
	public void insertAfter(SongEntry currNode)
	{
		
	}
	public void setNext(SongEntry nextNode)
	{
		this.nextNode = nextNode;
	}
	
	public String getID()
	{
		return uniqueID;
		
	}
	public String getSongName()
	{
		return songName;
		
	}
	public String getArtistName()
	{
		return artistName;
		
	}
	public int getSongLength()
	{
		return songLength;
		
	}
	public SongEntry getNext()
	{
		return nextNode;
		
	}
	public void printPlaylistSongs()
	{
		
	}

}
