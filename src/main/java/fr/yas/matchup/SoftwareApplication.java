package fr.yas.matchup;

import java.util.Locale;

import com.github.javafaker.Faker;

import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.managers.ViewsManager;

/**
 * @author Audrey
 *
 */
public class SoftwareApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty( "file.encoding", "UTF-8" );
		ViewsManager.getInstance().start();	

//		Faker faker = new Faker(new Locale("fr"));
//		
//		for (int i = 0; i < 5; i++) {
//			Candidate candidate = new Candidate();
//			candidate.setAddress(faker.streetAddress(true)+faker.zipCode());
//			candidate.setFirstname(faker.firstName());
//			candidate.setLastname(faker.lastName());
//			candidate.setPresentation(faker.paragraph());
//			System.out.println(candidate.toString());
//		}
	}

}
