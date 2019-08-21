package aa;

public class Student implements Comparable<Student> {
	private String name;
	
	private int age;
 
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
 
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
 
	@Override
	public int compareTo(Student o) {
		//计算名字长度
		int num = this.name.length() - o.name.length();
		//名字长度不为0，则返回上面计算的名字差值，最终返回的就是这个差值，负数放二叉树左，正数放右
		//名字长度相等，计算内容是否相同
		int num1 = num == 0 ? this.name.compareTo(o.name) : num;
		//名字长度内容都一样，计算年龄，年龄相等，返回0不存储，否则返回差值，年龄小的放左边
		int num2 = num1 == 0 ? this.age - o.age : num1;
		return num2;
	}
}
