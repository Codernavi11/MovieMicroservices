package com.naveen.movie;

import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.movie.service.MovieService;
@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
class MovieApplicationTests {
	@Mock
	MovieService service;
//	@Test
//	void getMovieList() {
//		List<Movie> a=new ArrayList<Movie>();
//		Movie m=new Movie();
//		m.setDirectedBy("naveen");
//		m.setBoxOffice("200");
//		a.add(m);
//		Mockito.when(service.getMovieList(a)).thenReturn(Mockito.anyList());
//		assertEquals(Mockito.anyList(),service.getMovieList(a));
//	}
//	@Test
//	void getMovie() {
//		Movie m=new Movie();
//		m.setDirectedBy("naveen");
//		m.setBoxOffice("200");
//		Mockito.when(service.getMovie(m)).thenReturn(Mockito.anyObject());
//		assertEquals(Mockito.anyList(),service.getMovie(m));
//	}
//	@Test
//	void getSortedMovieList() {
//		List<Movie> a=new ArrayList<Movie>();
//		Movie m=new Movie();
//		m.setDirectedBy("naveen");
//		m.setBoxOffice("200");
//		a.add(m);
//		Mockito.when(service.getSortedMovieList(a)).thenReturn(Mockito.anyList());
//		assertEquals(Mockito.anyList(),service.getSortedMovieList(a));
//	}
//	@Test
//	void getList() {
//		List<String> a=new ArrayList<String>();
//		a.add("Transformer");
//		Mockito.when(service.getList(a)).thenReturn(Mockito.anyList());
//		assertEquals(Mockito.anyList(),service.getList(a));
//	}

}
