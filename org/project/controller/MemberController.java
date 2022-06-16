package org.project.controller;

import java.util.Scanner;

import org.project.command.ActionDeleteDo;
import org.project.command.ActionInsertDo;
import org.project.command.ActionSelectDo;
import org.project.command.ActionUpdateDo;
import org.project.command.Excutecommand;

public class MemberController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Excutecommand command = null;

		while (true) {

			System.out.println(">> ������ �Է�\n(insert/select/update/delete)");
			String query = scn.next();

			if (query.equals("insert")) {
				command = new ActionInsertDo();
				command.excuteQuery();
			} else if (query.equals("select")) {
				command = new ActionSelectDo();
				command.excuteQuery();
			} else if (query.equals("update")) {
				command = new ActionUpdateDo();
				command.excuteQuery();
			} else if (query.equals("delete")) {
				command = new ActionDeleteDo();
				command.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.\n");
			}

		}

		scn.close();

	}

}
