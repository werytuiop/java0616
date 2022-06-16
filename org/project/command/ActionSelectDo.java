package org.project.command;

import java.util.ArrayList;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class ActionSelectDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ 회원 조회 ~");

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.list(); // 회원 조회
		System.out.println(lists);
		System.out.println();
	}

}
