package Liaoxuefeng;

import java.util.*;
import java.time.DayOfWeek;

public class EnumMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
		map.put(DayOfWeek.MONDAY, "����һ");
        map.put(DayOfWeek.TUESDAY, "���ڶ�");
        map.put(DayOfWeek.WEDNESDAY, "������");
        map.put(DayOfWeek.THURSDAY, "������");
        map.put(DayOfWeek.FRIDAY, "������");
        map.put(DayOfWeek.SATURDAY, "������");
        map.put(DayOfWeek.SUNDAY, "������");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
	}

}
