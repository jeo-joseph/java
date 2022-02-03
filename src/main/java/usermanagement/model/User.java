package usermanagement.model;

public class User {
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(String name, String salary, String address, String phone) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.phone = phone;
	}

  public User(int id, String name, String salary, String address, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
	this.phone = phone;

}
  
  private int id;
  private String name;
  private String salary;
  private String address;
  private String phone;

}
