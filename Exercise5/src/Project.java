import java.util.ArrayList;

public class Project {

	private String name;
	
	private Course course; //one-to-many & 0...1
	
	private ArrayList<Student> members = new ArrayList<>();
	
	public Project(String name, Course course) {
		setName(name);
		this.course=course; //one-to-many association, each Project is fromexactly one course
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name=name;
	}
	
	public void addMember(Student student) {
		members.add(student);
		student.addProject(this);
	}
	
	public Student getMembers() {
		return null;
	}
	
}
