interface creditCard{
	void interest();
	void limit();
}
class Axis implements creditCard{
	public void interest(){				
		System.out.println("5%");
	}
	public void limit(){				
		System.out.println("1 lakh");
	}

}
class SBI implements creditCard{
	public void interest(){				
		System.out.println("10%");
	}
	public void limit(){				
		System.out.println("2 lakh");
	}

}

class Demo{
	public static void main(String[]args){
		System.out.println("Axis info :");
		Axis obj= new Axis();
		obj.interest();
		obj.limit();

		System.out.println("SBI info :");
		SBI obj1= new SBI();
		obj1.interest();
		obj1.limit();

	}
}

/*Axis info :
5%
1 lakh
SBI info :
10%
2 lakh*/
