package org.project.command;

import org.project.dao.MemberDao;

public class ActionInsertDo extends Excutecommand {

	@Override
	public void excuteQuery() {
		System.out.println("~ ȸ�� ���� ~");

//		// �̱��� ���� ��ü ����
//		MemberDao dao = MemberDao.getInstance();

		MemberDao dao = new MemberDao();
		int rs = dao.insertDo(); // ȸ�� ����
		System.out.println("��ȯ�� : " + rs);
		System.out.println();

	}

}
