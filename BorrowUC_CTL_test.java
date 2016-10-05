package library;

import junit.framework.Assert;
import org.junit.Test;


public class BorrowUC_CTL_test {
	
	@mock
	BorrowUC_CTL borrow = new BorrowUC_CTL();
    
	
	@mock
	public abstract class ExpectedRuntimeExceptionAsserter {
	
	
    private String expectedExceptionMessage;

    public ExpectedRuntimeExceptionAsserter(String expectedExceptionMessage) {
        this.expectedExceptionMessage = expectedExceptionMessage;
    }

	@Test
	public void cardSwiped_test()
	{		
		int testID = 7;
		borrow.cardSwiped(testID);
		ExpectedRuntimeExceptionAsserter("Not implemented yet");		
	}
	@Test
	public void bookScanned_test()
	{	
		int testBarcode = 3;
		borrow.bookScanned(testBarcode);	
		ExpectedRuntimeExceptionAsserter("Not implemented yet");
	}
	@Test
	public void scansCompleted_test()
	{
		ExpectedRuntimeExceptionAsserter("Not implemented yet");
	}
	@Test
	public void loansCompleted_test()
	{
		ExpectedRuntimeExceptionAsserter("Not implemented yet");
	}
	@Test
	public void loansRejected_test()
	{
		ExpectedRuntimeExceptionAsserter("Not implemented yet");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
