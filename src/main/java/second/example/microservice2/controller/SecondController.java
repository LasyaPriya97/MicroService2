package second.example.microservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import second.example.microservice2.info.ProjectData;

@RestController
@RequestMapping("/project")
public class SecondController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{projectId}")
	public  ProjectData getProject(@PathVariable String projectId) {
		ProjectData project=new ProjectData();
		project.setProjectId(projectId);
		List<Object> employee= restTemplate.getForObject("http://microservice1/employee/empid/", List.class);
			project.setEmployee(employee);
			return project;
	}
	@RequestMapping("/admin")
	public String homeAdmin() {
		 return "Hello Spring";
	}

}
