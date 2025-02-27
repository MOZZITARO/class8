package quiz;

public class warmer {

	
	// 필드 쓰는 이유 - *저장하려고*
	//(this - *다른곳에서 쓸적에)*
	String onoff = "끄기";
	String temp = "고온";
//	 this.onoff = "끄기"; // 없는 코드
	//전원켜기        
	//전원끄기        
	
	
	// 전원이 켜져있다면 계속 실행됨 
	// 전원을 누르면 켜짐 다시 누르면 꺼지게 함
	                  
	                  //전원을 켠다
	//*전원을 켰는지 껐는지 기록하기*
//	                  String ON; // 전원 켜기 기능
                      void turnon () {
                    	  System.out.println("전원을 켭니다");
	                	  this.onoff = "켜기";
//	                	  return OFF;
	                	  
                      }
                      
                      
                      
                      
                  
                      
                                       
                      
                      
//	                  String OFF;     // 임의의 문자
	                  void turnoff () {
	                	  System.out.println("전원을 끕니다");
	                	  this.onoff = "끄기"; // 저장
//	                	  return OFF; 
	                	  
	                  } // 지역변수라서 메소드 또는 {}안에서만 사용가능
	                  // 필드에 만들어놓고
	
	                  
	                  
	                  
	                  
                      void display () {
                    	   
                            
                           // 꺼져있는지 켜져있는지 출력
                    	   System.out.println(this.onoff);
                    	   
                    	  
                    	  
                      }
                      
                      
                      //전원이 켜져있다면 저온으로 따뜻하게 
                      void low () {
                    	  if(this.onoff.equals("켜기")) {
                    		  System.out.println("저온으로 따뜻하게");
                    	  } else {
                    		  System.out.println("전원이 꺼져있습니다");
                    	  } 
                    	  
                    	  
                    	  this.temp = "저온";
                    	  System.out.println("상태가 저온입니다");
                    	  
                    	  
                          } 
                    	  
                    	  
                    	  
                    	  // 고온인지 저온인지 확인
                    	  void high () {
                    		  
                    		  
                    		  this.temp = "고온";
                    		  System.out.println("상태가 고온입니다");
                    		  
                    		  
                           }
	
                      
                          
                      
                    	  
                      
                     
                      
	                  
}
