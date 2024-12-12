package animals;

public class Dog extends Animal {

	public Dog(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String produceSound() {
		// TODO Auto-generated method stub
		return "Woof!";
	}

}
