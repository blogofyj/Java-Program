package JavaAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetAward {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AwardGroup awardGroup = new AwardGroup();
		
		awardGroup.setAutoReduce(true);
		awardGroup.addAward(new Award("奖品1", 1, 10)); // Award 分别是 奖品名称 奖品权重（个数） 奖品价格
		awardGroup.addAward(new Award("奖品2", 2, 10));
		awardGroup.addAward(new Award("奖品3", 1, 10));
		awardGroup.addAward(new Award("奖品4", 3, 10));
		
		for (int i = 0; i < 7; i++) {
			System.out.println(awardGroup.startGetAward());
		}
	}

}

class Award{
	
	private String name;
	private int weight;
	private int money;
	
	public Award(String name, int weight, int money){
		this.money = money;
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public void reduceWeight(int reduce){
		if(weight - reduce < 0){
			weight = 0;
		}else{
			weight -= reduce;
		}
	}
	
	//@Override
	public String toString(){
		return "Congratulations " + name + " get vlaue of " + money + "dollar";
	}
}

class AwardGroup{
	
	private List<Award> awardgroup;
	private boolean isAutoReduce;
	private int total = 0;
	
	public AwardGroup(){
		awardgroup = new ArrayList<Award>();
	}
	
	public boolean addAward(Award award){
		total += award.getWeight();
		return awardgroup.add(award);
	}
	
	public List<Award> getAwardgroup(){
		return awardgroup;
	}
	
	public void setAutoReduce(boolean isAutoReduce){
		this.isAutoReduce = isAutoReduce;
	}
	
	public synchronized Award startGetAward() {
		if (awardgroup == null || total <= 0)
			return null;
		Random random = new Random();
		int awardNUmber = random.nextInt(total);
		for (Award award : awardgroup) {
			if (awardNUmber + 1 - award.getWeight() > 0) {
				awardNUmber -= award.getWeight();
				continue;
			}
			if (isAutoReduce) {
				award.reduceWeight(1);
				total -= 1;
			}
			return award;
		}

		return null;
	}
}