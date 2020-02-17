package com.movie.naveenprojectconsumer2.Api;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
@RequestMapping(value="/consumeMovieNameList")
public class ConsumerApi {
	
	@RequestMapping(value="/getList",produces= {"application/JSON","application/XML"},method=RequestMethod.GET)
	private ResponseEntity<List<String>> getList(){
		List<String> movies=new ArrayList<String>();
		movies.add("The Matrix");
		//movies.add("Harry_Potter_(film_series)");
	movies.add("Purani_Jeans");
	//movies.add("DHOOM_2");movies.add("DHOOM_3");movies.add("DHOOM_4");
//		movies.add("Transformer 2");movies.add("Transformer 3");movies.add("Transformer 4");
//		movies.add("Transformer 5");movies.add("Death Race 1");movies.add("Death Race 2");
//		movies.add("Death Race 3");movies.add("Harry Porter 1");movies.add("Harry Porter 2");
//		movies.add("Harry Porter 3");movies.add("Harry Porter 4");movies.add("Harry Porter 5");
//		movies.add("Harry Porter 6");movies.add("Harry Porter 7");movies.add("Harry Porter 8");
//		movies.add("Aachi & Ssipak");movies.add("Aada Paduchu");movies.add("Aadaalla Majaka");
//		movies.add("Aadab Arz");movies.add("Aadamkhor");movies.add("Aadukalam");movies.add("Aadum Koothu");
//		movies.add("Aadyakiranangal");movies.add("Aadyarathrikku Munbu");movies.add("Aadyathe Anuraagam");movies.add("Aadyathe Kanmani");
//		movies.add("Aafat");movies.add("Aag");movies.add("Aag Aandhi Aur Toofan");movies.add("Aag Aur Chingari");
//		movies.add("Aai Bahar");movies.add("Aai Shappath..!");movies.add("Aaina");movies.add("Aaj Ka Arjun");
//		movies.add("Alien");movies.add("Aliens");movies.add("Alien 3");movies.add("Alien 4");
//		movies.add("Alien 5");movies.add("Alien 6");movies.add("Salt of the Earth");movies.add("Salvador Dalí");
//		movies.add("All Is Well");movies.add("Same Kind of Different as Me");movies.add("Santa with Muscles");movies.add("Santa Sangre");
//		movies.add("Le Samouraï");movies.add("Santo Contra los Zombis");movies.add("The Lame Devil");movies.add("Lancelot du Lac");
//		movies.add("Last Exit to Brooklyn");movies.add("Readdy");movies.add("3 Idiots");movies.add("Aadab Arz");
//		movies.add("The Last Exorcism");movies.add("Dabangg 2");movies.add("Dabangg 3");movies.add("Dabangg 4");
//		movies.add("The Last Exorcism Part II");movies.add("Dabangg");movies.add("I Hate Love Story 2");movies.add("I Hate Love Story");
//		movies.add("The Last Five Years");movies.add("Love Story");movies.add("Purani Geans");movies.add("Prirate Of The Carabian 10");
//		movies.add("Last Holiday");movies.add("Prirate Of The Carabian 9");movies.add("Prirate Of The Carabian 8");movies.add("Prirate Of The Carabian 7");
//		movies.add("The Last Horror Movie");movies.add("Prirate Of The Carabian 6");movies.add("Prirate Of The Carabian 5");movies.add("Prirate Of The Carabian 4");
//		movies.add("Land of Plenty");movies.add("Prirate Of The Carabian 3");movies.add("Prirate Of The Carabian 2");movies.add("Prirate Of The Carabian");
//		movies.add("Lammbock");movies.add("The Hobbit 4");movies.add("The Hobbit 3");movies.add("The Hobbit 2");
//		movies.add("Legacy");movies.add("The Hobbit");movies.add("Avengers 3");movies.add("Avengers 2");
//		movies.add("The Legend of Bagger Vance");movies.add("Andaaz Apna Apna");movies.add("Tarzan");movies.add("Avengers");
//		movies.add("Legend of the Guardians: The Owls of Ga'Hoole");
//		movies.add("Legion of the Night");
		if(movies.isEmpty()) {
			return new ResponseEntity<List<String>>(movies,HttpStatus.BAD_REQUEST);
		}else {
		return new ResponseEntity<List<String>>(movies,HttpStatus.OK);
		}
	}
	}
