/**
 * 
 */
package src.library.interfaces.daos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IBookDAOTest {

	@Test

	public final void testAddBook() {
		
		IBookDAOMock test = new IBookDAOMock();
		String title = "Enid";
		String author = "JK";
		String callNo = "call1";
	   
		assertNotNull("BookAdded", test.addBook(author, title, callNo));
	
	}
	
	/**
	 * Test method for {@link src.library.interfaces.daos.IBookDAOMock#setGetBookByIDResult(src.library.interfaces.entities.IBook)}.
	 */
	
	@Test
	public final void testGetBookByID() {
		IBookDAOMock test = new IBookDAOMock();
		int ID = 01;
		assertNotNull("Success",test.getBookByID(ID));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IBookDAOMock#setListBooksResult(java.util.List)}.
	 */
	
	@Test
	public final void testListBooks() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IBookDAOMock#setFindBooksByAuthorResult(java.util.List)}.
	 */
	
	@Test
	public final void testFindBooksByAuthor() {
		
		IBookDAOMock test = new IBookDAOMock();
		String author = "Enid";
		assertNotNull("Author Search Sucess",test.findBooksByAuthor(author));
		
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IBookDAOMock#setFindBooksByTitleResult(java.util.List)}.
	 */
	
	@Test
	public final void testFindBooksByTitle() {
		IBookDAOMock test = new IBookDAOMock();
		String title = "Enid";
		assertNotNull("Book Search Success",test.findBooksByTitle(title))
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IBookDAOMock#setFindBooksByAuthorTitleResult(java.util.List)}.
	 */
	
	@Test
	public final void testFindBooksByAuthorTitle() {
		IBookDAOMock test = new IBookDAOMock();
		String title = "Enid";
		String author = "Enid2";
		assertNotNull("Book Search Success",test.findBooksByAuthorTitle(author, title));
		
	}

}
