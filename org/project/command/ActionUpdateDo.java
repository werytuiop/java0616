package org.project.command;

import org.project.dao.MemberDao;

public class ActionUpdateDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ ȸ�� ���� ~");

		MemberDao dao = new MemberDao();
		int rs = dao.updateDo(); // ȸ�� ����
		System.out.println("��ȯ�� : " + rs);
		System.out.println();
	}

}
