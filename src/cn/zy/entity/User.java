package cn.zy.entity;

public class User {
	private int id;
	private String name;
	private String gender;
	private int age;
	private int typeid;
	private String info;
	private String email;
	private String phone;
	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private float discount;

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public User(int id, String name, String gender, int age, int typeid, String info, String email, String phone, String pwd, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.typeid = typeid;
		this.info = info;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.discount = discount;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
