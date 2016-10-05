/**
 * 
 */
package src.library.interfaces.daos;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.Date;


public class ILoanDAOTest extends TestCase {

	private IMember borrower;
	private IBook book;
    ILoanDAO loantest = new ILoanDAO();
	private ILoan loan;
	private Date currentDate;
	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#createLoan(IMember, IBook)}.
	 */
	public void testCreateLoan() {		
		
	  assertNotNull("Loan Created",loantest.createLoan(borrower, book));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#commitLoan(ILoan)}.
	 */
	public void testCommitLoan() {
		
		assertNotNull("Commit Loan",loantest.commitLoan(loan))
		
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#getLoanByID(int)}.
	 */
	public void testGetLoanByID() {
		int id = 01;
		assertNotNull("Success",loantest.getLoanByID(id));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#getLoanByBook(IBook)}.
	 */
	public void testGetLoanByBook() {
		String book = "Enid";
		assertNotNull("Success",loantest.getLoanByBook(book));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#listLoans()}.
	 */
	public void testListLoans() {
		assertNotNull("Loan List Available",loantest.listLoans());
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#findLoansByBorrower(IMember)}.
	 */
	public void testFindLoansByBorrower() {
		assertNotNull("Loans Found",loantest.findLoansByBorrower(borrower));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#findLoansByBookTitle(String)}.
	 */
	public void testFindLoansByBookTitle() {
		String title = "Endi1";
		assertNotNull("Find Loans",loantest.findLoansByBookTitle(title));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#updateOverDueStatus(java.util.Date)}.
	 */
	public void testUpdateOverDueStatus() {
		assertNotNull("Overdue Books available",loantest.updateOverDueStatus(currentDate));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.ILoanDAO#findOverDueLoans()}.
	 */
	public void testFindOverDueLoans() {
		assertNotNull("Overdue Loans",loantest.findOverDueLoans());
	}

}
