import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class testClass 
{
	public static void main(String[] args) throws IOException
	{
		String info0 = "Her Majesty; Beatles; 1:00:00";
		String info1 = "Johnny B. Goode; Rush; 30:00";
		String info2 = "A Farewell to Kings; Rush; 30:00";
//		String info3 = "Can't You"
//				+ " Hear Me Knocking; The Rolling Stones; 7:15";
//		String info4 = "Stairway to Heaven; Led Zeppelin; 8:02";
//		String info5 = "Close to the Edge; Yes; 18:42";
//		String info6 = "Supper's Ready; Genesis; 23:06";
//		String info7 = "Symphony No. 9; Ludwig van Beethoven; 1:09:00";
		
		Playlist playlist = new Playlist();
		playlist.addSong(new Song(info0));
		playlist.addSong(new Song(info1));
		playlist.addSong(new Song(info2));
//		playlist.addSong(new Song(info5));
//		playlist.addSong(new Song(info3));
		
//		playlist.addSong(new Song(info4));
//		playlist.addSong(new Song(info7));
		
//		playlist.addSong(new Song(info6));
		
		
		System.out.println(playlist.getFavoriteArtist());
		
		
		
//	System.out.println(playlist.getTotalTime()[1]);
//	System.out.println(playlist.getTotalTime()[2]);
//	System.out.println(playlist.getTotalTime().length);
//	System.out.println(playlist.getTotalTime()[2]);
	
	
	
	}
}
