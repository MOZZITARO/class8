package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webtoonController {

	
	
	
	
	
	@RequestMapping("/webtoon")
//	public String ajax1(String id) {
	public ModelAndView webtoon(WebtoonDTO WebtoonDTO) {
			
			
       String title1 = "계시록";
       String author1 = "연상호, 최규석";
	   String descript1 
	        = "대규모 아파트 단지가 공사 중인 지방의 한 도시. <br>"
	   		+ "그곳에 교회를 개척하라는 사명을 가지고 있는 성민찬 목사. <br>"
	   		+ "하지만 사명처럼 신도 수는 늘지 않는다.<br>"
	   		+ "그러던 어느 날 교회를 찾아온 권양래. 새 신자인 줄 알고 기뻐하는 성민찬 목사. 하지만 그는 발목에 전자 발찌를 찬 전과자였다.<br>"
	   		+ "성민찬 목사는 아내로부터 아들이 어린이집에서 실종되었다는 소식을 접한다.<br>"
	   		+ "그리고 민찬의 앞에는 양래가 범인이라는 계시가 내려진다.<br>";
       String link1 = "https://page-images.kakaoentcdn.com/download/resource?kid=cNduW3/hzwBmbpZKN/xr4RsAtlwzk7PIymGcBDtk&filename=o1/dims/resize/384";
	   
	   
	   
	   
	   
	   
	   
	   String title2 = "샤먼트리트먼트";
       String author2 = "종수";
	   String descript2 
	                = "백여 년 전 사라진 신을 찾아 헤매는"
	        		+ "무당과 영들의 이야기"
	        		+ ""
	        		+ "가랑비에 젖은 황혼의 남녀가 모텔로 들어선다."
	        		+ "우비를 벗고 마주앉은 두 사람."
	        		+ ""
	        		+ "영험하기로 소문이 자자한 무당과,"
	        		+ "재주는 없지만 무당이 되고픈 사내다."
	        		+ ""
	        		+ "의기투합하여 백여 년 전 사라진 신을 찾으려는 두 사람."
	        		+ "그러나 신은 이미 지척에서 일거수일투족을 지켜보고 있는데."
	        		+ ""
	        		+ "신을 만나는 일이 쉬운 줄 알았더냐."
	        		+ ""
	        		+ "신을 찾는 그 길은, 하룻밤에 천리를 달려야 하는 길이었다.";
	   String link2 = "https://kr-a.kakaopagecdn.com/P/O/crm/campaign-pages/2022_09_06/2x/14c76cc5-f396-425d-be77-214f56159a6a.png\" width=\"100%";		
	   
	   
	   
	   
	   
	   String title3 = "이끼";
       String author3 = "윤태호";
	   String descript3 
	          = "나를 거부하는 고향 사람들의 시선, 그 이유는? 한국식 잔혹스릴러의 막이 올랐다!";
	   String link3 = "https://page-images.kakaoentcdn.com/download/resource?kid=QOyf9/hy41O0Rzfp/updAbYRw2XyOXjWNwRNgB1&filename=o1/dims/resize/384";		
	   
	   
	   
	   
	   
	   // 객체 생성
       ModelAndView mav = new ModelAndView();
       
       WebtoonDTO webdto = new WebtoonDTO();
       WebtoonDTO webdto2 = new WebtoonDTO();
       WebtoonDTO webdto3 = new WebtoonDTO();
       
       webdto.setTitle(title1);
       webdto.setAuthor(author1);
       webdto.setDescript(descript1);
       webdto.setLink(link1);
       
       webdto2.setTitle(title2);
       webdto2.setAuthor(author2);
       webdto2.setDescript(descript2);
       webdto2.setLink(link2);
       
       webdto3.setTitle(title3);
       webdto3.setAuthor(author3);
       webdto3.setDescript(descript3);
       webdto3.setLink(link3);
       
       System.out.println("웹툰제목 : " + webdto.getTitle());
       System.out.println("웹툰작가 : " + webdto.getAuthor());
       System.out.println("웹툰설명 : " + webdto.getDescript());
       System.out.println("웹툰링크 : " + webdto.getLink());
       
       System.out.println("웹툰제목 : " + webdto2.getTitle());
       System.out.println("웹툰작가 : " + webdto2.getAuthor());
       System.out.println("웹툰설명 : " + webdto2.getDescript());
       System.out.println("웹툰링크 : " + webdto2.getLink());
       
       System.out.println("웹툰제목 : " + webdto3.getTitle());
       System.out.println("웹툰작가 : " + webdto3.getAuthor());
       System.out.println("웹툰설명 : " + webdto3.getDescript());
       System.out.println("웹툰링크 : " + webdto3.getLink());
       
       List list = new ArrayList();
       list.add(webdto);
       list.add(webdto2);
       list.add(webdto3);
       
       
//       
       mav.setViewName("webtoon"); // 여기에 넣던가 위에 모델에 넣기
       mav.addObject("list" , list);
       System.out.println(list);
       
       
       
       
       
       
       
       
       
       
       
//       // 파라미터 (다른 방법: @RequestParam )
//       String sub = request.getParameter("sub");
	 
		
	   
		
       
       
       
       
       
		return mav;
	}
	
	
	
	
	
	
}
