

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao_Singleton {

	/* 싱글톤 패턴 (객체를 한 번만 생성. 보안) */

	// final 상수는 한번만 초기화 (MemberDao 객체가 한번만 생성)
	private static final MemberDao_Singleton INSTANCE = new MemberDao_Singleton();

	private MemberDao_Singleton() {
	}

	// static
	public static MemberDao_Singleton getInstance() {
		return INSTANCE;
	}

	/* DB에 접근해서 처리 */
	public int insertDo() {
		System.out.println("DB 회원 가입 실행");
		int rs = 0;
		// 처리문
		return rs;
	}

	public int updateDo() {
		System.out.println("DB 회원 수정 실행");
		int rs = 0;
		// 처리문
		return rs;
	}

	public int deleteDo() {
		System.out.println("DB 회원 삭제 실행");
		int rs = 0;
		// 처리문
		return rs;
	}

	public ArrayList<MemberDto> list() {
		System.out.println("회원 조회 실행");
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// 처리문
		return lists;
	}

}
