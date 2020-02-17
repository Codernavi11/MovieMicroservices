package com.naveen.naveenprojectconsumer.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.naveen.naveenprojectconsumer.model.Movie;

@RestController
@CrossOrigin
@RequestMapping(value="/consumeMovie")
public class PMovieAPI {
	
	@RequestMapping(value="/getMovieList",produces= {"application/JSON","application/XML"},method=RequestMethod.GET)
	private ResponseEntity<List<Movie>> getMovieList(){
		RestTemplate restTemplate=new RestTemplate();
		String[] arrayOfMovieString= restTemplate.getForObject("http://localhost:8085/consumeMovieNameList/getList", String[].class);
		List<String> listOfMovieString= Arrays.asList(arrayOfMovieString);
		List<Movie> listOfMovies=new  ArrayList<Movie>();
		for(int i=0;i<listOfMovieString.size();i++) {
			Movie movie=restTemplate.getForObject("http://localhost:8081/movie/"+listOfMovieString.get(i), Movie.class);
			if(movie!=null) {
				listOfMovies.add(movie);
			}
		}
//		List<Movie> listOfMovies=listOfMovieString.stream().filter(Objects::nonNull).map( movie->
//		restTemplate.getForObject("http://localhost:8081/movie/"+movie, Movie.class)
//		).collect(Collectors.toList());
		if(listOfMovies.isEmpty()) {
			return new ResponseEntity<List<Movie>>(listOfMovies,HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<List<Movie>>(listOfMovies,HttpStatus.OK);
		}	
	}
	@RequestMapping(value="/getMovieNameList",produces= {"application/JSON","application/XML"},method=RequestMethod.GET)
	private ResponseEntity<String[]> getMList(){
		RestTemplate restTemplate=new RestTemplate();
		String stringList[]=restTemplate.getForObject("http://localhost:8081/movie/getMList", String[].class);
		for(int i=0;i<stringList.length;i++) {
			System.out.println(stringList[i]);
		}
		return new ResponseEntity<String[]>(stringList,HttpStatus.OK);	
	}
	@RequestMapping(value="/getSortedMovieList",produces= {"application/JSON","application/XML"},method=RequestMethod.GET)
	private ResponseEntity<List<Movie>> getSortedMovieList(@RequestParam String type,@RequestParam String title){
		RestTemplate restTemplate=new RestTemplate();
		String[] arrayOfMovieString= restTemplate.getForObject("http://localhost:8085/consumeMovieNameList/getList", String[].class);
		List<String> listOfMovieString= Arrays.asList(arrayOfMovieString);
		List<Movie> listOfMovies=listOfMovieString.stream().map(movie->
		restTemplate.getForObject("http://localhost:8081/movie/"+movie, Movie.class)
		).collect(Collectors.toList());
		List<Movie> listOfMoviesSorted=null;
		if(type!=null && type.toLowerCase().equals("ascending")) {
			listOfMoviesSorted=listOfMovies.stream().filter(value -> value != null).sorted((o1,o2)-> o1.getMovieTitle().compareTo(o2.getMovieTitle())
			)
		.collect(Collectors.toList());
			}else {
				listOfMoviesSorted=listOfMovies.stream().sorted((o1,o2)-> o2.getMovieTitle().compareTo(o1.getMovieTitle())
						)
					.collect(Collectors.toList());			
			}
		if(listOfMoviesSorted.isEmpty()) {
			return new ResponseEntity<List<Movie>>(listOfMoviesSorted,HttpStatus.BAD_REQUEST);
		}else {
		return new ResponseEntity<List<Movie>>(listOfMoviesSorted,HttpStatus.OK);
		}
	}
	
}
