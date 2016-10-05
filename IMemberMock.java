package src.library.interfaces.entities;

import java.util.List;

import javax.annotation.Generated;

/** Mock for { @link IMember } */
@Generated(value = "org.junit-tools-1.0.3")
public class IMemberMock implements IMember {

	private boolean hasOverDueLoansResult = false;
	private boolean hasReachedLoanLimitResult = false;
	private boolean hasFinesPayableResult = false;
	private boolean hasReachedFineLimitResult = false;
	private float getFineAmountResult = 0;
	private List<ILoan> getLoansResult = null;
	private EMemberState getStateResult = null;
	private String getFirstNameResult = "";
	private String getLastNameResult = "";
	private String getContactPhoneResult = "";
	private String getEmailAddressResult = "";
	private int getIDResult = 0;

	public static IMemberMock create() {
		return new IMemberMock();
	}

	public void setHasOverDueLoansResult(boolean hasOverDueLoansResult) {
		this.hasOverDueLoansResult = hasOverDueLoansResult;
	}

	@Override
	public boolean hasOverDueLoans() {
		return hasOverDueLoansResult;
	}

	public void setHasReachedLoanLimitResult(boolean hasReachedLoanLimitResult) {
		this.hasReachedLoanLimitResult = hasReachedLoanLimitResult;
	}

	@Override
	public boolean hasReachedLoanLimit() {
		return hasReachedLoanLimitResult;
	}

	public void setHasFinesPayableResult(boolean hasFinesPayableResult) {
		this.hasFinesPayableResult = hasFinesPayableResult;
	}

	@Override
	public boolean hasFinesPayable() {
		return hasFinesPayableResult;
	}

	public void setHasReachedFineLimitResult(boolean hasReachedFineLimitResult) {
		this.hasReachedFineLimitResult = hasReachedFineLimitResult;
	}

	@Override
	public boolean hasReachedFineLimit() {
		return hasReachedFineLimitResult;
	}

	public void setGetFineAmountResult(float getFineAmountResult) {
		this.getFineAmountResult = getFineAmountResult;
	}

	@Override
	public float getFineAmount() {
		return getFineAmountResult;
	}

	@Override
	public void addFine(float fine) {
		// nothing
	}

	@Override
	public void payFine(float payment) {
		// nothing
	}

	@Override
	public void addLoan(ILoan loan) {
		// nothing
	}

	public void setGetLoansResult(List<ILoan> getLoansResult) {
		this.getLoansResult = getLoansResult;
	}

	@Override
	public List<ILoan> getLoans() {
		return getLoansResult;
	}

	@Override
	public void removeLoan(ILoan loan) {
		// nothing
	}

	public void setGetStateResult(EMemberState getStateResult) {
		this.getStateResult = getStateResult;
	}

	@Override
	public EMemberState getState() {
		return getStateResult;
	}

	public void setGetFirstNameResult(String getFirstNameResult) {
		this.getFirstNameResult = getFirstNameResult;
	}

	@Override
	public String getFirstName() {
		return getFirstNameResult;
	}

	public void setGetLastNameResult(String getLastNameResult) {
		this.getLastNameResult = getLastNameResult;
	}

	@Override
	public String getLastName() {
		return getLastNameResult;
	}

	public void setGetContactPhoneResult(String getContactPhoneResult) {
		this.getContactPhoneResult = getContactPhoneResult;
	}

	@Override
	public String getContactPhone() {
		return getContactPhoneResult;
	}

	public void setGetEmailAddressResult(String getEmailAddressResult) {
		this.getEmailAddressResult = getEmailAddressResult;
	}

	@Override
	public String getEmailAddress() {
		return getEmailAddressResult;
	}

	public void setGetIDResult(int getIDResult) {
		this.getIDResult = getIDResult;
	}

	@Override
	public int getID() {
		return getIDResult;
	}
}