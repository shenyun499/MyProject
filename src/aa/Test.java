package aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class Test {
	public static void main(String[] args) {
		/*//查看当前系统类路径中包含的路径
		System.out.println(System.getProperty("java.class.path"));
		//通过反射加载TwoParentTest类
		Class<?> forName = Class.forName("aa.TwoParentTest");
		//查看实例是被哪个类加载的
		System.out.println(forName.getClassLoader());*/
		
		/*Student key1 = new Student("张三3",3);
		Student key2 = new Student("张三2",3);
		Student key3 = new Student("张三3",2);
		TreeSet<Student> keys = new TreeSet<>();
		boolean k1 = keys.add(key1);
		boolean k2 = keys.add(key2);
		boolean k3 = keys.add(key3);
		
		for(Student key : keys) {
			System.out.println(key);
		}
		
		System.out.println(k1 + " " + k2 + " " + k3);*/
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		for(Iterator<String> iterator = list.iterator() ; iterator.hasNext(); ) {
			String string = iterator.next();
			list.remove(string);   //用集合删除，并发修改异常
			System.out.println(string);
		}
		System.out.println(list);
	}

}
