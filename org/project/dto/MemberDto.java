package org.project.dto;

public class MemberDto {

	// String userId,String userPw, int userAge, String userPhone 맴머를 생성(모드 private)
	// getter,setter매서드를 자동 완성으로 생성 ,
	// 기본 생성자와 모든 필드를 생성자의 매개변수로 초기화 할수 있는 생성자 두개를 생성 하시오

	private String userId;
	private String userPw;
	private int userAge;
	private String userPhone;

	public MemberDto() {
		System.out.println("기본 생성자");
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
