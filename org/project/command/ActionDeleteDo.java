package org.project.command;

import org.project.dao.MemberDao;

public class ActionDeleteDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ 회원 삭제 ~");

		MemberDao dao = new MemberDao();
		int rs = dao.deleteDo(); // 회원 삭제
		System.out.println("반환값 : " + rs);
		System.out.println();
	}

}
