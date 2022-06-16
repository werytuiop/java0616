

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao_Singleton {

	/* �̱��� ���� (��ü�� �� ���� ����. ����) */

	// final ����� �ѹ��� �ʱ�ȭ (MemberDao ��ü�� �ѹ��� ����)
	private static final MemberDao_Singleton INSTANCE = new MemberDao_Singleton();

	private MemberDao_Singleton() {
	}

	// static
	public static MemberDao_Singleton getInstance() {
		return INSTANCE;
	}

	/* DB�� �����ؼ� ó�� */
	public int insertDo() {
		System.out.println("DB ȸ�� ���� ����");
		int rs = 0;
		// ó����
		return rs;
	}

	public int updateDo() {
		System.out.println("DB ȸ�� ���� ����");
		int rs = 0;
		// ó����
		return rs;
	}

	public int deleteDo() {
		System.out.println("DB ȸ�� ���� ����");
		int rs = 0;
		// ó����
		return rs;
	}

	public ArrayList<MemberDto> list() {
		System.out.println("ȸ�� ��ȸ ����");
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// ó����
		return lists;
	}

}
