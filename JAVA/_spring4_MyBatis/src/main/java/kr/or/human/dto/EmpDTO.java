package kr.or.human.dto;
import java.sql.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO : Data Transfer Object
// VO : Value Object
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자
//@EqualsAndHashCode
@Data // 통합
public class EmpDTO {

	private int empno;		// 사원번호
	private String ename;	// 사원명
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private Integer comm;
	private int deptno;
	
	private String type;
	private String keyword;
	
	private int page; // 현재 페이지
	private int viewCount; // 페이지당 보여줄 수 countPerPage rowPerPage
	private int indexStart;
	private int indexEnd;

	
}
