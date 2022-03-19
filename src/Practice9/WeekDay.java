package Practice9;

public enum WeekDay {
	MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7),SUNDAY(8);
	
	private int value;
	
	WeekDay(int value ){
		this.value = value;
	};
	
	public static WeekDay getWeekDayByValue(int value) {
		for (WeekDay d : WeekDay.values()) {
			if(d.value == value) {
				return d;
			}
		}
		return null;
	}
	
}
