import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Album;
import beans.Artist;
import config.SpringConfig;
import db.AlbumDBDAO;
import db.ArtistDBDAO;

public class Program {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfig.class)) {

			AlbumDBDAO albumDB = ctx.getBean(AlbumDBDAO.class);
			ArtistDBDAO artistDB = ctx.getBean(ArtistDBDAO.class);
			
//			artistDB.addArtist(new Artist("Adel", "UK")); // Java Java
//			artistDB.addArtist(ctx.getBean(Artist.class, "Metallica", "USA")); // Spring Java
			
//			System.out.println(artistDB.getAllArtists());
			
			//albumDB.addAlbum(new Album("Hello", 2010, artistDB.getOneArtist(1)));
			
//			System.out.println(albumDB.getAllAlbums());
			
//			System.out.println(artistDB.getOneArtist(1).getAlbums());
			
			
			/*
			Artist adel = artistDB.getOneArtist(1);
			Album byeAlbum = new Album("Bye", 2019, adel);
			System.out.println("Id before save: " + byeAlbum.getId());
			albumDB.addAlbum(byeAlbum); // save to album DB
			System.out.println("Id AFTER save: " + byeAlbum.getId());
			adel.getAlbums().add(byeAlbum);
			artistDB.updateArtist(adel);
			
			System.out.println(artistDB.getOneArtist(1).getAlbums());
			*/
			
//			System.out.println(albumDB.getAlbumsByYear(2019));
			
//			System.out.println(albumDB.getAlbumsBetweenYears(2000, 2018));
			
			System.out.println(albumDB.getAlbumsByTitle("e"));
			
		}

	}

}















