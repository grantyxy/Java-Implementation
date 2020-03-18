import java.util.Calendar;

public class People {
	private String name;
	private int year;
	private String major;
	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

	public People(String name, int year, String major) {
		this.name = name;
		this.year = year;
		this.major = major;
	}

	public String getName() {
		return this.name;
	}

	public String getMajor() {
		return this.major;
	}

	public int getYear() {
		return this.year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public boolean checkValidYear() {
		return this.getYear() <= currentYear;
	}

	public String toString() {
		return "Name: " + this.name + "\n" + "Year: " + this.year + "\n" + "Major: " + this.major;
	}

	public static void main(String[] args) {
		People p1 = new People("Sun Xiaochuan", 1997, "Computer Science");
		System.out.println(p1);
	}
}
