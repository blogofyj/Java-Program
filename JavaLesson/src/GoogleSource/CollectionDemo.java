//package GoogleSource;
//
//public class CollectionDemo {
//	
//	public static void main(String[] args) {
//		
//	}
//
//}
//一	、Collection：
//1、List集合
//1.1、 Vector集合特有的特点
//1.2、LinkedList集合的特有功能
//2、	Set集合
//2.1、	HashSet类：
//2.1.1、	LinkedHashSet类
//2.2、	TreeSet类
//3、	针对Collection集合我们应该怎么使用
//二 、Collection集合和List集合迭代器遍历实例
//三、使用使用HashSet类随机产生10个不重复的1到20的不重复随机数实例
//四、TreeSet类中自然排序和比较器排序实例
//
//最重要的是迭代器
//一	、Collection：
//集合的顶层接口，不能被实例化
//a)	根接口Collection
// i.	常用子接口
//  1.	List
//   实现类：ArrayList、Vector、LinkedList
//  2.	Set
//   实现类：HashSet、TreeSet
//b)	添加功能
// i.	boolean add(object obj)添加一个元素
// ii.	boolean addAll(Collection c)将集合c的全部元素添加到原集合元素后返回true
// iii.	添加功能永远返回true
//c)	删除功能
// i.	void clear();移除所有元素
// ii.	boolean remove(Object o)移除一个元素
// iii.	boolean removeAll（Collection c）移除一个集合的元素，只要有一个被移除就返回true，改变原集合，删除原集合中和c中相同的元素
// iv.	删除功能只有删除成功后才返回true
//d)	判断功能
// i.	boolean contain(object o)判断集合中是否包含指定的元素。
// ii.	boolean containsAll(Collection c)判断原集合中是否包含指定集合c的所有元素，有则true，
// iii.	boolean isEmpty()判断集合是否为空
//e)	获取功能
// i.	Iterator iterator()迭代器，集合的专用方式，实现遍历的功能
// ii.	Object next()获取当前元素，并移动到下一个位置
// iii.	boolean hasNext()判断此位置是否有元素
// iv.	迭代器遍历实例在下面
//f)	长度功能
// i.	int size()元素的个数
// ii.	数组和字符串中都是length()方法获取元素个数，集合中是size()方法
//  因为object包括集合、字符串、数组，所以其不能直接用length方法。
//g)	交集功能boolean retainAll(Collection c)
// 两个集合交集的元素给原集合，并判断原集合是否改变，改变则true，不变则false
//h)	把集合转换为数组
// i.	Object [] toArray()
//
//1、List集合
//Collection集合的子类
//特点：
//a)	有序（存储和取出的元素顺序一致），可重复
//b)	特有功能
// i.	添加功能
//  void add(int index,Object element)在指定位置添加元素（原索引处的元素后延）
// ii.	获取功能
//  Object get(int index)获取指定位置的元素
// iii.	列表迭代器
//  1.	ListIterator listIterator() List集合特有的迭代器
//  2.	Iterator迭代器的子类，所以其可以用Iterator中的boolean hasNext()、Object next()方法
//  3.	特有的方法：
//   a)	Object previous ()返回此处位置的前一个的元素，并移动到前一个位置。
//   b)	boolean hasPrevious()判断此处的前一个位置是否有元素
//   c)	逆向遍历必须先正向遍历使指针指到后面位置才能使用（使用意义不大）
//  4.	迭代器遍历元素时不能直接通过集合修改元素，怎么办？
//   a)	迭代器修改元素
//    i.	List迭代器有修改方法，Collection中的迭代器没有
//    ii.	通过迭代器中add(object obj)方法添加，跟在刚才迭代元素后面
//   b)	通过集合遍历元素，并用集合修改元素（for循环遍历）
//    i.	通过集合中add(object obj)方法添加，跟在集合最后面
//  5.	迭代器遍历实例实例在下面给出
// iv.	删除功能
//  Object remove(int index)根据索引删除指定的元素，并返回删除的元素
// v.	修改功能、
//  	Object set(int index,Object element)根据索引修改元素，返回被修改的元素
// vi.	数组转成集合
//  1.	public static List asList(T… a)，返回类型为List类型
//  2.	a为集合，此处的… 代表可变参数，也就是a的数组元素个数可变
//  3.	此方法是Arrays类中的静态方法
//  4.	数组转变为集合，实质还是数组需要保证长度不变，所以不支持增删集合元素，可以修改元素
//c)	List子类的特点：
// i.	ArrayList:
//  1.	底层数据结构是数组，查询快、增删慢
//  2.	线程不安全，效率高
// ii.	Vector：
//  1.	底层数据结构是数组，查询快，增删慢
//  2.	线程安全，效率底
// iii.	LinkedList：
//  1.	底层数据结构是链表，查询慢，增删快
//  2.	线程不安全，效率高
//
//1.1、 Vector集合特有的特点
//a)	添加功能
// i.	public void addElement(Object obj)
//b)	获取功能
// i.	public Object elementAt(int index)
// ii.	public Enumeration elements ()
//  1.	也是用来遍历集合
//  2.	boolean hasMoreElements()
//  3.	Object nextElement()
//  4.	基本不用这个，都是直接用上面的迭代器实现遍历
//
//1.2、LinkedList集合的特有功能
//a)	添加功能
// i.	public void addFirst(Object e)
// ii.	public void addLast(Object e)
//b)	获取功能
// i.	public Object getFirst()
// ii.	public Object getLast()
//c)	删除功能
// i.	public Object removeFirst()
// ii.	public Object removeLast()
//
//2、	Set集合
// a)	无序（存储和取出顺序不一致，有可能会一致），但是元素唯一，不能重复
// b)	b)	实现类
//  i.	HashSet
//   1.	底层数据是哈希表
//   2.	通过两个方法hashCode()和equals()保证元素的唯一性，方法自动生成
//   3.	子类LinkedHashSet底层数据结构是链表和哈希表，由链表保证元素有序，
//    由哈希表保证元素唯一。
//  ii.	TreeSet
//   1.	底层数据是红黑二叉树
//   2.	排序方式：自然排序、比较器排序
//   3.	通过比较返回值是否为0来保证元素的唯一性。
//
//2.1、	HashSet类：
// a)	不保证set的迭代顺序，
// b)	当存储对象时需要重写equals（）和hashCode（）方法（可以用Eclipse自动生成此方法）
//
//2.1.1、	LinkedHashSet类
// a)	HashSet的子类
// b)	可预知的迭代顺序，底层数据结构由哈希表和链表组成
//  i.	哈希表：保证元素的唯一性
//  ii.	链表：保证元素有序（存储和取出顺序一致）
//
//2.2、	TreeSet类
// a)	能够保证元素唯一性（根据返回值是否是0来决定的），并且按照某种规则排序
//  i.	自然排序，无参构造方法（元素具备比较性）
//   按照compareTo()方法排序，让需要比较的元素所属的类实现自然排序接口Comparable，
//   并重写compareTo()方法
//  ii.	1.	让集合的构造方法接收一个比较器接口的子类对象（compareator）
//  （此处的Comparator为接口，需要写一个接口实现类，在实现类中重写compare()方法，
//   并在这里创建接口实现类的对象，可以用匿名内部类来创建实现类对象）
// b)	底层是自平衡二叉树结构
//  i.	二叉树有前序遍历、后序遍历、中序遍历
//  ii.	TreeSet类是按照从根节点开始，按照从左、中、右的原则依此取出元素
// c)	当使用无参构造方法，也就是自然排序，需要根据要求重写compareTo()方法，这个不能自动生成
//
//3、	针对Collection集合我们应该怎么使用
//a)	是否元素唯一
// i.	是：Set
//  1.	是否排序
//   a)	是：TreeSet
//   b)	否：HashSet
//  如果不知道用哪个Set就用HashSet
// ii.	否：List
//  1.	是否对安全性有要求
//   a)	是：Vector
//   b)	否：
//     查询多：ArrayList
//     增删多：LinkedList
//  如果不知道用哪个List用ArrayList
//如果知道是用集合但不知道用哪个用ArrayList
//
//二 、Collection集合和List集合迭代器遍历实例
//package test10_collecton;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
////Collection集合中的方法，子集合都可以用
////	Iterator<E> iterator()迭代器，集合的专用方式子集合都可以用
////	Object next()获取当前元素，并移动到下一个位置
////	boolean hasNext()判断此位置是否有元素
//
////List集合中的方法
////	void add(int index,Object element)在指定位置添加元素（原索引处的元素后延）
////	Object get(int index)获取指定位置的元素
////list迭代器中的特有方法
////	Object previous ()返回此处位置的前一个的元素，并移动到前一个位置。
////	boolean hasPrevious()判断此处的前一个位置是否有元素
//public class InteratoeDemo {
//	public static void main(String[] args) {
//		
//		//Collection集合的遍历
//		Collection c=new ArrayList();
//		c.add("zfliu");
//		c.add("18");
//		c.add("java");
//		
//		Iterator i=c.iterator();
//		
//		while(i.hasNext()) {
//			//向下转型
//			String s=(String) i.next();
//			System.out.println(s);
//		}
//		System.out.println("-----------------");
//		//List集合的遍历
//		List l=new ArrayList();
//		
//		l.add(0,"zfliu");
//		l.add(1,"18");
//		l.add(1,"java");
//		
//		ListIterator li=l.listIterator();
//		
//		//后向遍历
//		while(li.hasNext()) {
//			String s=(String)li.next();
//			System.out.println(s);
//		}
//		System.out.println("-----------------");
//		
//		//前向遍历
//		while(li.hasPrevious()) {
//			String s=(String)li.previous();
//			System.out.println(s);
//		}
//		System.out.println("-----------------");
//		
//		//get方法遍历
//		for(int x=0;x<l.size();x++) {
//			String s=(String)l.get(x);
//			System.out.println(s);
//			
//		}
//		
//		
//	}
//}
//
//
//
//三、使用使用HashSet类随机产生10个不重复的1到20的不重复随机数实例
//package test_11_hashset;
//
//import java.util.HashSet;
//import java.util.Random;
//
////使用HashSet类随机产生10个不重复的1到20的不重复随机数
//public class HashSetDemo {
//	public static void main(String[] args) {
//		Random r=new Random();
//		
//		HashSet <Integer> hs=new HashSet<Integer>();
//		
//		while(hs.size()<10) {
//			hs.add((r.nextInt(20)+1));
//		}
//		for(Integer i:hs) {
//			System.out.println(i);
//		}
//	}
//
//}
//
//四、TreeSet类中自然排序和比较器排序实例
//Student类
//
//package test11_Treeset;
////此处实现的为自然排序接口，如果仅仅使用比较器排序此接口可以不实现
//public class Student implements Comparable<Student>{
//	private int age;
//	
//	private String name;
//	
//	public Student() {
//		super();
//	}
//
//	public Student(String name,int age) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int compareTo(Student s) {
//		//此处的this和s前后位置改变会影响排序方式
//		int num1=this.age-s.age;
//		
//		int num2=num1==0?this.name.compareTo(s.name):num1;
//		
//		return num2;
//	}
//
//	
//}
//
//1、自然排序
//
//package test11_Treeset;
//
//import java.util.TreeSet;
//
////TreeSet类存储对象，自然排序
////规定:按照年龄进行排序
//public class TreeSetDemo1 {
//	public static void main(String[] args) {
//		
//		TreeSet<Student> ts=new TreeSet<Student>();
//		
//		Student s1=new Student("zfliu",18);
//		Student s2=new Student("zfliu",20);
//		Student s3=new Student("zfliu",18);
//		Student s4=new Student("ZFLIU",18);
//		Student s5=new Student("Java",18);
//
//		ts.add(s1);
//		ts.add(s2);
//		ts.add(s3);
//		ts.add(s4);
//		ts.add(s5);
//		
//		
//		for (Student s:ts) {
//			System.out.println(s.getName()+s.getAge());
//		}
//		
//	}
//}
//
//
//2、比较器排序
//
//package test11_Treeset;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
////TreeSet类存储对象，比较器排序
////规定:按照年龄进行排序
//public class TreeSetDemo2 {
//	public static void main(String[] args) {
//		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
//
//			//匿名内部类实现比较器排序接口
//			public int compare(Student s1, Student s2) {
//				int num1=s1.getAge()-s2.getAge();
//				int num2=num1==0? s1.getName().compareTo(s2.getName()):num1;
//				return num2;
//			}
//
//		});
//		
//		Student s1=new Student("zfliu",18);
//		Student s2=new Student("zfliu",20);
//		Student s3=new Student("zfliu",18);
//		Student s4=new Student("ZFLIU",18);
//		Student s5=new Student("Java",18);
//
//		ts.add(s1);
//		ts.add(s2);
//		ts.add(s3);
//		ts.add(s4);
//		ts.add(s5);
//		
//		
//		for (Student s:ts) {
//			System.out.println(s.getName()+s.getAge());
//		}
//	}
//}
//
