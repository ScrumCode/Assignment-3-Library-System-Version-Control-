/**
 * 
 */
package src.library.interfaces.daos;

import junit.framework.TestCase;


public class IMemberDAOTest extends TestCase {
	
	IMemberDAO membertest = new IMemberDAO();

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#addMember(String, String, String, String)}.
	 */
	public void testAddMember() {
		
		String firstName;
		String lastName;
		String ContactPhone;
		String emailAddress;
		
		assertNotNull("Member Added! ",membertest.addMember(firstName, lastName, ContactPhone, emailAddress));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#getMemberByID(int)}.
	 */
	public void testGetMemberByID() {
		int id;
		assertNotNull("Get Member by ID ",membertest.getMemberByID(id));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#listMembers()}.
	 */
	public void testListMembers() {
		assertNotNull("Member List",membertest.listMembers());
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#findMembersByLastName(String)}.
	 */
	public void testFindMembersByLastName() {
		String lastName;
		assertNotNull("Member by Last Name Success",membertest.findMembersByLastName(lastName));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#findMembersByEmailAddress(String)}.
	 */
	public void testFindMembersByEmailAddress() {
		String emailAddress;
		assertNotNull("Member by Last Name Success",membertest.findMembersByEmailAddress(emailAddress));
	}

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberDAO#findMembersByNames(String, String)}.
	 */
	public void testFindMembersByNames() {
		String firstName;
		String lastName;
		assertNotNull("Member by Last Name Success",membertest.findMembersByNames(firstName, lastName));
	}
	
	

}
