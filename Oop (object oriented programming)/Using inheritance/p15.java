class Teacher{
	String name;
	String address;

	void setName(String name){
	this.name=name;
}
	void setAddress(String address){
	this.address=address;
}
	String getName(){
	return name;
}
	String getAddress(){
	return address;
}
	}
class Student extends Teacher{
	int marks;
	int rollNumber;

	void setMarks(int marks){
	this.marks=marks;
}
	void setRollNumber(int rollnumber){
	this.rollNumber=rollNumber;
}
	int getMarks(){
	return marks;
	}
	int getRollNumber(){
	return rollNumber;
	}
}

class Demo{
	public static void main(String[]args){
	Student s = new Student();
	s.setName("Nikita");
	s.setAddress("Ambawade");
	s.setMarks(50);
	s.setRollNumber(1);

	Teacher t =new Teacher();
	t.setName("RJ");
	t.setAddress("Don't know");
	 
	System.out.println("Student data : ");
	System.out.println("Student Name is :" + s.getName());
	System.out.println("RollNumber is : "+ s.getRollNumber());
	
	
	System.out.println("Teacher data : ");
	System.out.println("Teacher Name is :" + t.getName());
	System.out.println("Address is :"+ t.getAddress());

	}
}

/*Student data :
Student Name is :Nikita
RollNumber is : 0
Teacher data :
Teacher Name is :RJ
Address is :Don't know*/