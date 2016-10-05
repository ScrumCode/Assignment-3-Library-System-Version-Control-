package src.library.interfaces.daos;

import java.util.List;

import javax.annotation.Generated;

import src.library.interfaces.entities.IMember;

/** Mock for { @link IMemberDAO } */
@Generated(value = "org.junit-tools-1.0.3")
public class IMemberDAOMock implements IMemberDAO {

	private IMember addMemberResult = null;
	private IMember getMemberByIDResult = null;
	private List<IMember> listMembersResult = null;
	private List<IMember> findMembersByLastNameResult = null;
	private List<IMember> findMembersByEmailAddressResult = null;
	private List<IMember> findMembersByNamesResult = null;

	public static IMemberDAOMock create() {
		return new IMemberDAOMock();
	}

	public void setAddMemberResult(IMember addMemberResult) {
		this.addMemberResult = addMemberResult;
	}

	@Override
	public IMember addMember(String firstName, String lastName, String ContactPhone, String emailAddress) {
		return addMemberResult;
	}

	public void setGetMemberByIDResult(IMember getMemberByIDResult) {
		this.getMemberByIDResult = getMemberByIDResult;
	}

	@Override
	public IMember getMemberByID(int id) {
		return getMemberByIDResult;
	}

	public void setListMembersResult(List<IMember> listMembersResult) {
		this.listMembersResult = listMembersResult;
	}

	@Override
	public List<IMember> listMembers() {
		return listMembersResult;
	}

	public void setFindMembersByLastNameResult(List<IMember> findMembersByLastNameResult) {
		this.findMembersByLastNameResult = findMembersByLastNameResult;
	}

	@Override
	public List<IMember> findMembersByLastName(String lastName) {
		return findMembersByLastNameResult;
	}

	public void setFindMembersByEmailAddressResult(List<IMember> findMembersByEmailAddressResult) {
		this.findMembersByEmailAddressResult = findMembersByEmailAddressResult;
	}

	@Override
	public List<IMember> findMembersByEmailAddress(String emailAddress) {
		return findMembersByEmailAddressResult;
	}

	public void setFindMembersByNamesResult(List<IMember> findMembersByNamesResult) {
		this.findMembersByNamesResult = findMembersByNamesResult;
	}

	@Override
	public List<IMember> findMembersByNames(String firstName, String lastName) {
		return findMembersByNamesResult;
	}
}