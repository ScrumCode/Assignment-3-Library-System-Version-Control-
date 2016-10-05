package src.library.interfaces.entities;

import javax.annotation.Generated;

/** Mock for { @link IBook } */
@Generated(value = "org.junit-tools-1.0.3")
public class IBookMock implements IBook {

	private ILoan getLoanResult = null;
	private EBookState getStateResult = null;
	private String getAuthorResult = "";
	private String getTitleResult = "";
	private String getCallNumberResult = "";
	private int getIDResult = 0;

	public static IBookMock create() {
		return new IBookMock();
	}

	@Override
	public void borrow(ILoan loan) {
		// nothing
	}

	public void setGetLoanResult(ILoan getLoanResult) {
		this.getLoanResult = getLoanResult;
	}

	@Override
	public ILoan getLoan() {
		return getLoanResult;
	}

	@Override
	public void returnBook(boolean damaged) {
		// nothing
	}

	@Override
	public void lose() {
		// nothing
	}

	@Override
	public void repair() {
		// nothing
	}

	@Override
	public void dispose() {
		// nothing
	}

	public void setGetStateResult(EBookState getStateResult) {
		this.getStateResult = getStateResult;
	}

	@Override
	public EBookState getState() {
		return getStateResult;
	}

	public void setGetAuthorResult(String getAuthorResult) {
		this.getAuthorResult = getAuthorResult;
	}

	@Override
	public String getAuthor() {
		return getAuthorResult;
	}

	public void setGetTitleResult(String getTitleResult) {
		this.getTitleResult = getTitleResult;
	}

	@Override
	public String getTitle() {
		return getTitleResult;
	}

	public void setGetCallNumberResult(String getCallNumberResult) {
		this.getCallNumberResult = getCallNumberResult;
	}

	@Override
	public String getCallNumber() {
		return getCallNumberResult;
	}

	public void setGetIDResult(int getIDResult) {
		this.getIDResult = getIDResult;
	}

	@Override
	public int getID() {
		return getIDResult;
	}
}