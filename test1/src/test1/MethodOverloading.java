package test1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);

	}

	private void sum(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void sum() {
		// TODO Auto-generated method stub
		
	}

	private void sum(int i) {
		// TODO Auto-generated method stub
		
	}

}
