import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		if (day > 0 && day <= 31) {
			this.day = day;
		} else {
			this.day = 0;
		}
		if (month > 0 && month <= 12) {
			this.month = month;
		} else {
			this.month = 0;
		}
		if (year >= 1) {
			this.year = year;
		} else {
			this.year = 0;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day <= 31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
