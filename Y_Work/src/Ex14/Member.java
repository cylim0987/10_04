package Ex14;




public class Member {
	public static void main(String[] args) {
		Member user1 = new Member("��" , " jj");
	}
	
	public class Member {
	String name;
	String id;
	String pwd;
	int age;
	
	Member(String name, String id){//source - Constructor using field . ������ source�� �̿�.
		this.name = name;
		this.id = id;
	}
	//default������
	
	//�޼ҵ�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}