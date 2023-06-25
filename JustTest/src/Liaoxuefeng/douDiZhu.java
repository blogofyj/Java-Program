

package Liaoxuefeng;
import java.util.ArrayList;


public class douDiZhu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> poker = new ArrayList();
		
		String[] colors = {"黑桃","红桃", "梅花", "方块"};
		String[] numbers = {"2", "A","K","Q","J","10","9","8","7","6","5","4","3"};
		//先把大王小王存储在poker集合中
		poker.add("大王");
		poker.add("小王");
		//循坏嵌套遍历
		
		for(String number : numbers){
			for(String color : colors){
				poker.add(color + number); 
			}
		}
		
		java.util.Collections.shuffle(poker);
		
		ArrayList<String> player1 = new ArrayList();
		ArrayList<String> player2 = new ArrayList();
		ArrayList<String> player3 = new ArrayList();
		ArrayList<String> diPai = new ArrayList();
		
		for (int i = 0; i < poker.size(); i++) {
			String p = poker.get(i);
			if(i >= 51){
				diPai.add(p);
			}else if(i % 3 ==0){
				player1.add(p);
			}else if(i % 3 ==1){
				player2.add(p);
			}else if(i % 3 ==2){
				player3.add(p);
			}
		}
		
		System.out.println("小明:" + player1);
		System.out.println("小军:" + player2);
		System.out.println("小杨:" + player3);
		System.out.println("底牌:" + diPai);
		
	}

}







