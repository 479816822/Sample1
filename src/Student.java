

/**
 * Student这一个类其实就是对一个现实中的一个学生的完整的抽象
 * 其中的方法就是一个学生的动作，做什么
 * 属性就是他特有的基本特点
 * 公有的属性就是所有的学生党相同
 * 私有属性就是每一个学生自己独一无二的
 * 保护属性就是每一个的区别
 * @author NIIT
 *
 */
public class Student {
	//学生私有的属性
	private String stuName;
	private int stuAge;
	private String stuSex;
	private int stuGrand;    //学生的年级
	
	//
	public Student(String name,int age,String Sex,int Grand)
	{
		stuName=name;
		stuAge=age;
		stuSex=Sex;
		stuGrand=Grand;
		
		
	}
	

}
