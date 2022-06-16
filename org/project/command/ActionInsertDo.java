package org.project.command;

import org.project.dao.MemberDao;

public class ActionInsertDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ 회원 가입 ~");

//		// 싱글톤 패턴 객체 생성
//		MemberDao dao = MemberDao.getInstance();

		MemberDao dao = new MemberDao();
		int rs = dao.insertDo(); // 회원 가입
		System.out.println("반환값 : " + rs);
		System.out.println();

	}

}
