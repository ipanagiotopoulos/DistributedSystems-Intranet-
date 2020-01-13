package gr.hua.ds.users.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import gr.hua.ds.users.model.Enums.*;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@Column(name="department_name")
	@Enumerated(EnumType.STRING)
	private Dept departmentName;
	
	@Column(name= "percentage")
	private int percentage;
	
	@Column(name = "active")
	@Enumerated(EnumType.STRING)
	private Activable  active;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_name")
	private List<Application> apllications;

	public Department() {
		
	}
	
	public Department(Dept departmentName, Activable  active, int percentage) {
		super();
		this.departmentName = departmentName;
		this.active = active;
		this.percentage = percentage;
	}
	
	public Dept getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(Dept departmentName) {
		this.departmentName = departmentName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Activable getActive() {
		return active;
	}

	public void setActive(Activable active) {
		this.active = active;
	}
	
}