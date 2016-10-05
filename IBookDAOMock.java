-package src.library.interfaces.daos;

import java.util.List;

import javax.annotation.Generated;

import src.library.interfaces.entities.IBook;

/** Mock for { @link IBookDAO } */
@Generated(value = "org.junit-tools-1.0.3")
public class IBookDAOMock implements IBookDAO {

	private IBook addBookResult = null;
	private IBook getBookByIDResult = null;
	private List<IBook> listBooksResult = null;
	private List<IBook> findBooksByAuthorResult = null;
	private List<IBook> findBooksByTitleResult = null;
	private List<IBook> findBooksByAuthorTitleResult = null;


	public void setAddBookResult(IBook addBookResult) {
		this.addBookResult = addBookResult;
	}

	@Override
	public IBook addBook(String author, String title, String callNo) {
		return addBookResult;
	}

	public void setGetBookByIDResult(IBook getBookByIDResult) {
		this.getBookByIDResult = getBookByIDResult;
	}

	@Override
	public IBook getBookByID(int id) {
		return getBookByIDResult;
	}

	public void setListBooksResult(List<IBook> listBooksResult) {
		this.listBooksResult = listBooksResult;
	}

	@Override
	public List<IBook> listBooks() {
		return listBooksResult;
	}

	public void setFindBooksByAuthorResult(List<IBook> findBooksByAuthorResult) {
		this.findBooksByAuthorResult = findBooksByAuthorResult;
	}

	@Override
	public List<IBook> findBooksByAuthor(String author) {
		return findBooksByAuthorResult;
	}

	public void setFindBooksByTitleResult(List<IBook> findBooksByTitleResult) {
		this.findBooksByTitleResult = findBooksByTitleResult;
	}

	@Override
	public List<IBook> findBooksByTitle(String title) {
		return findBooksByTitleResult;
	}

	public void setFindBooksByAuthorTitleResult(List<IBook> findBooksByAuthorTitleResult) {
		this.findBooksByAuthorTitleResult = findBooksByAuthorTitleResult;
	}

	@Override
	public List<IBook> findBooksByAuthorTitle(String author, String title) {
		return findBooksByAuthorTitleResult;
	}
}