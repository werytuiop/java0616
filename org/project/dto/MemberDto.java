package org.project.dto;

public class MemberDto {

	// String userId,String userPw, int userAge, String userPhone �ɸӸ� ����(��� private)
	// getter,setter�ż��带 �ڵ� �ϼ����� ���� ,
	// �⺻ �����ڿ� ��� �ʵ带 �������� �Ű������� �ʱ�ȭ �Ҽ� �ִ� ������ �ΰ��� ���� �Ͻÿ�

	private String userId;
	private String userPw;
	private int userAge;
	private String userPhone;

	public MemberDto() {
		System.out.println("�⺻ ������");
	}

	public MemberDto(String userId, String userPw, int userAge, String userPhone) {
//		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
