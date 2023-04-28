package org.howard.edu.finals.problem;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;


class SongsDatabaseTest {
	
	@Test
    public void testaddSongs() {
        SongsDatabase db1 = new SongsDatabase();
        db1.addSong("AfroBeats", "INJURE ME");
        db1.addSong("Old School R&B", "Understanding");
        db1.addSong("AfroBeats", "Electricity");
        db1.addSong("Old School R&B" , "Halfcrazy");
        db1.addSong("AfroBeats", "Girlfriend");
        db1.addSong("Old School R&B" , "Forthenight");
        
        Set<String> afroB_songs = db1.getSongs("AfroBeats");
        Set<String> rb_songs = db1.getSongs("Old School R&B");
        
        assertFalse(afroB_songs.contains("Halfcrazy"));
        assertFalse(rb_songs.contains("Electricity"));
        assertTrue(afroB_songs.contains("INJURE ME"));
        assertTrue(rb_songs.contains("Understanding"));
        assertTrue(rb_songs.contains("Forthenight"));
        
    }
	
	@Test
	public void testGetSongs() {
		SongsDatabase db2 = new SongsDatabase();
		db2.addSong("Country", "Chicken Fried");
		db2.addSong("Country", "Chasin' You");
		db2.addSong("Rap", "Love Yourz");
		db2.addSong("Rap", "Freestyle");
		
		Set<String> country_songs = db2.getSongs("Country");
		assertTrue(country_songs.contains("Chicken Fried"));
		assertTrue(country_songs.contains("Chasin' You"));
	}
	
	@Test
	public void testGetGenreOfSong() {
		SongsDatabase db3 = new SongsDatabase();
		db3.addSong("Pop", "Thriller");
		db3.addSong("Pop", "Rock With You");
		db3.addSong("Reggae", "No Woman No Cry");
		db3.addSong("Reggae", "Redemption Song");
				
		assertEquals("Pop", db3.getGenreOfSong("Rock With You"));
		assertEquals("Reggae", db3.getGenreOfSong("No Woman No Cry"));
		assertEquals("This song is not in the Database.", db3.getGenreOfSong("Unthinkable"));
		
		System.out.println(db3.getGenreOfSong("Thriller")); //Prints Pop
		System.out.println(db3.getGenreOfSong("Redemption Song")); //Prints Reggae

	}

}