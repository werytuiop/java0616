package org.project.command;

import org.project.dao.MemberDao;

public class ActionUpdateDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ 회원 수정 ~");

		MemberDao dao = new MemberDao();
		int rs = dao.updateDo(); // 회원 수정
		System.out.println("반환값 : " + rs);
		System.out.println();
	}

}
