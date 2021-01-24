package second.example.microservice2.info;

import java.util.List;

public class ProjectData {
	private String projectId;
	private String projectName;
	
	public ProjectData(String projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public ProjectData() {
		// TODO Auto-generated constructor stub
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setEmployee(List<Object> employee) {
		// TODO Auto-generated method stub
		
	}
	
	

}
