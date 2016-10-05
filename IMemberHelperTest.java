/**
 * 
 */
package src.library.interfaces.daos;

import junit.framework.TestCase;

public class IMemberHelperTest extends TestCase {
	
	IMemberHelper test = new IMemberHelper();

	/**
	 * Test method for {@link src.library.interfaces.daos.IMemberHelper#makeMember(String, String, String, String, int)}.
	 */
	public void testMakeMember() {
		String firstName;
		String lastName;
		String contactPhone;
		String emailAddress;
		int id;
		assertNotNull("Member Added",test.makeMember(firstName, lastName, contactPhone, emailAddress, id));
	}

}
