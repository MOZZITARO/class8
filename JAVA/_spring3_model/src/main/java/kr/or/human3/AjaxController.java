package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	
	
	
	
	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	
	
	@RequestMapping(value="/ajax1")
//	public String ajax1(String id) {
	public String ajax1 (
			
//			@RequestParam ("id") // json으로 보낸건 @requestParam이나 request
			
			@RequestBody
			// 제이슨 읽어 DTO에 담음 (잭슨, JSON 필요)
			MemberDTO dto
			
			) {
	
//	    String id = request.getParameter("id");
		System.out.println("id : " + dto.getId());
		return "ajax";
	}
	
	
	
	@RequestMapping(value="/ajax2")
	@ResponseBody //없으면 resolver가 jsp를 찾음
//	public String ajax1(String id) {
	public String ajax2 (
			
//			@RequestParam ("id") // json으로 보낸건 @requestParam이나 request
			
			@RequestBody
			// 제이슨 읽어줌 (잭슨, JSON 필요)
			MemberDTO dto
			
			) {
	
//	    String id = request.getParameter("id");
		System.out.println("id : " + dto.getId());
		return "ajax"; // ajax 그대로 나감
	}
	
	
	
	
	@RequestMapping(value="/ajax3")
	@ResponseBody //없으면 resolver가 jsp를 찾음
//	public String ajax1(String id) {
	public MemberDTO ajax3 (
			
//			@RequestParam ("id") // json으로 보낸건 @requestParam이나 request
			
			@RequestBody
			// 제이슨 읽어줌 (잭슨, JSON 필요)
			MemberDTO dto
			
			) {
	
//	    String id = request.getParameter("id");
		System.out.println("id : " + dto.getId());
		return dto;
	}
	
	
	
	
	@RequestMapping(value="/ajax4")
	@ResponseBody //없으면 resolver가 jsp를 찾음
//	public String ajax1(String id) {
	public List ajax4 (
			
//			@RequestParam ("id") // json으로 보낸건 @requestParam이나 request
			
			@RequestBody
			// 제이슨 읽어줌 (잭슨, JSON 필요)
//			List<Integer> list = 
			MemberDTO dto
			
			) {
	
//	    String id = request.getParameter("id");
		System.out.println("id : " + dto.getId());
		
		
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		
		
		
		return list;
	}
	
	
}
