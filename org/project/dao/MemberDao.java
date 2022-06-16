package org.project.dao;

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("기본 생성자");
	}

	public int insertDo() {
		System.out.println("회원 가입 실행");
		int rs = 0;
		// 처리문
		return rs;
	}

	public int updateDo() {
		System.out.println("회원 수정 실행");
		int rs = 0;
		// 처리문
		return rs;
	}

	public int deleteDo() {
		System.out.println("회원 삭제 실행");
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
