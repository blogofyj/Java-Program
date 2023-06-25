package Liaoxuefeng;

public class iteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList<String> rlist = new ReverseList();
		rlist.add("apple");
		rlist.add("pear");
		rlist.add("orange");
		
		for(String s : rlist){
			System.out.println(s);
		}
	}

}
class ReverseList<T> implements Iterable<t>{
	private List<t> list = new ArrayList();
	
	public void add(T t){
		list.add(t);
	}
	
	//@override
	public Iterator<T> iterator(){
		return new ReverseIterator(list.size());
	}
	
	class ReverseIterator implements Iterator<T>{
		int index;
		
		ReverseIterator(int index){
			this.index = index;
		}
		
		//@override
		public boolean hasNext(){
			return index > 0;
		}
		
		//@override
		public T next(){
			index--;
			return ReverseList.this.list.get(index);
		}
	}
	
	
	
	
}

