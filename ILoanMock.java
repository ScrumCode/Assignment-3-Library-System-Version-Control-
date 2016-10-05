package src.library.interfaces.entities;

import java.util.Date;

import javax.annotation.Generated;

/** Mock for { @link ILoan } */
@Generated(value = "org.junit-tools-1.0.3")
public class ILoanMock implements ILoan {

	private boolean isOverDueResult = false;
	private boolean checkOverDueResult = false;
	private IMember getBorrowerResult = null;
	private IBook getBookResult = null;
	private int getIDResult = 0;

	public static ILoanMock create() {
		return new ILoanMock();
	}

	@Override
	public void commit(int id) {
		// nothing
	}

	@Override
	public void complete() {
		// nothing
	}

	public void setIsOverDueResult(boolean isOverDueResult) {
		this.isOverDueResult = isOverDueResult;
	}

	@Override
	public boolean isOverDue() {
		return isOverDueResult;
	}

	public void setCheckOverDueResult(boolean checkOverDueResult) {
		this.checkOverDueResult = checkOverDueResult;
	}

	@Override
	public boolean checkOverDue(Date currentDate) {
		return checkOverDueResult;
	}

	public void setGetBorrowerResult(IMember getBorrowerResult) {
		this.getBorrowerResult = getBorrowerResult;
	}

	@Override
	public IMember getBorrower() {
		return getBorrowerResult;
	}

	public void setGetBookResult(IBook getBookResult) {
		this.getBookResult = getBookResult;
	}

	@Override
	public IBook getBook() {
		return getBookResult;
	}

	public void setGetIDResult(int getIDResult) {
		this.getIDResult = getIDResult;
	}

	@Override
	public int getID() {
		return getIDResult;
	}
}