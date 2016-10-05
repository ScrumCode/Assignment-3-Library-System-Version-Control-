/**
 * 
 */
package src.library.interfaces.entities;

import java.util.Date;

import junit.framework.TestCase;

public class ILoanMockTest extends TestCase {

	ILoan interloantest = new ILoan();
	/**
	 * Test method for {@link src.library.interfaces.entities.ILoanMock#isOverDue()}.
	 */
	public void testIsOverDue() {
		assertEquals(true,interloantest.isOverDue());
	}

	/**
	 * Test method for {@link src.library.interfaces.entities.ILoanMock#checkOverDue(java.util.Date)}.
	 */
	public void testCheckOverDue() {
		Date currentDate;
		assertEquals(true,interloantest.checkOverDue(currentDate));
	}

	/**
	 * Test method for {@link src.library.interfaces.entities.ILoanMock#getBorrower()}.
	 */
	public void testGetBorrower() {
		assertNotNull("Get Borrower",interloantest.getBorrower());
		
	}

	/**
	 * Test method for {@link src.library.interfaces.entities.ILoanMock#getBook()}.
	 */
	public void testGetBook() {
		assertNotNull("Book Recieved Sucess !"interloantest.getBook());
	}

	/**
	 * Test method for {@link src.library.interfaces.entities.ILoanMock#getID()}.
	 */
	public void testGetID() {
		assertNotNull("Recieved ID Success",interloantest.getID());

	}

}
