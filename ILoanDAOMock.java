package src.library.interfaces.daos;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import src.library.interfaces.entities.IBook;
import src.library.interfaces.entities.ILoan;
import src.library.interfaces.entities.IMember;

/** Mock for { @link ILoanDAO } */
@Generated(value = "org.junit-tools-1.0.3")
public class ILoanDAOMock implements ILoanDAO {

	private ILoan createLoanResult = null;
	private ILoan getLoanByIDResult = null;
	private ILoan getLoanByBookResult = null;
	private List<ILoan> listLoansResult = null;
	private List<ILoan> findLoansByBorrowerResult = null;
	private List<ILoan> findLoansByBookTitleResult = null;
	private List<ILoan> findOverDueLoansResult = null;

	public static ILoanDAOMock create() {
		return new ILoanDAOMock();
	}

	public void setCreateLoanResult(ILoan createLoanResult) {
		this.createLoanResult = createLoanResult;
	}

	@Override
	public ILoan createLoan(IMember borrower, IBook book) {
		return createLoanResult;
	}

	@Override
	public void commitLoan(ILoan loan) {
		// nothing
	}

	public void setGetLoanByIDResult(ILoan getLoanByIDResult) {
		this.getLoanByIDResult = getLoanByIDResult;
	}

	@Override
	public ILoan getLoanByID(int id) {
		return getLoanByIDResult;
	}

	public void setGetLoanByBookResult(ILoan getLoanByBookResult) {
		this.getLoanByBookResult = getLoanByBookResult;
	}

	@Override
	public ILoan getLoanByBook(IBook book) {
		return getLoanByBookResult;
	}

	public void setListLoansResult(List<ILoan> listLoansResult) {
		this.listLoansResult = listLoansResult;
	}

	@Override
	public List<ILoan> listLoans() {
		return listLoansResult;
	}

	public void setFindLoansByBorrowerResult(List<ILoan> findLoansByBorrowerResult) {
		this.findLoansByBorrowerResult = findLoansByBorrowerResult;
	}

	@Override
	public List<ILoan> findLoansByBorrower(IMember borrower) {
		return findLoansByBorrowerResult;
	}

	public void setFindLoansByBookTitleResult(List<ILoan> findLoansByBookTitleResult) {
		this.findLoansByBookTitleResult = findLoansByBookTitleResult;
	}

	@Override
	public List<ILoan> findLoansByBookTitle(String title) {
		return findLoansByBookTitleResult;
	}

	@Override
	public void updateOverDueStatus(Date currentDate) {
		// nothing
	}

	public void setFindOverDueLoansResult(List<ILoan> findOverDueLoansResult) {
		this.findOverDueLoansResult = findOverDueLoansResult;
	}

	@Override
	public List<ILoan> findOverDueLoans() {
		return findOverDueLoansResult;
	}
}