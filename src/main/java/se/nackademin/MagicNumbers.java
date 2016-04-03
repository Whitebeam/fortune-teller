package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
	int a = age + 1;
	for (int i = name.length() - 1; i >= 0; i--) {
		if (name.charAt(i) == ' ') a++;
	}
	while (a >= 10) {
		a -= 7;
	}
	return a;
    }

    public int calculateB() {
	int b = location.length() + income;
	while (b >= 10) {
		b -= 7;
	}
	return b;
    }

    public int calculateC() {
	int c = calculateA() + calculateB() - height;
	while (c < 0) {
		c += 10;
	}
	return c;
    }

    public int calculateD() {
	int d = calculateA();
	if (d > 5) {
		d += calculateB();
	} else {
		d += calculateC();
	}
	d -= income;
	while (d < 0) {
		d += 10;
	}
        return d;
    }

    public int calculateE() {
	double e = income * Math.sqrt(age * height);
	while (Math.round(e) >= 10) {
		e = e/2;
	}
        return (int) Math.round(e);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
