package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//另一个文件夹里的hello.java没有起到作用。这么说应用启动的只是hello包下的内容。或者说application的入口代码必须放在应用的根目录？
public class hello {

	@RequestMapping("/")
	public String index() {
		
		return "Greetings from Spring Boot!";
	
	}
	
}                           
