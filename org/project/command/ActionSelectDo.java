package org.project.command;

import java.util.ArrayList;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class ActionSelectDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ ȸ�� ��ȸ ~");

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.list(); // ȸ�� ��ȸ
		System.out.println(lists);
		System.out.println();
	}

}
