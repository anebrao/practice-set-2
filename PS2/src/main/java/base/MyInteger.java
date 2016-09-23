package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue(){
		return iValue;
	}
	public boolean isEven(){
		if (getiValue() % 2 == 0)
			return true;
		else
			return false; 
	}
	public boolean isOdd(){
		if (getiValue() % 2 == 1)
			return true;
		else
			return false; 
	}
	public boolean isPrime(){
		for (int i = 2;i<iValue;i++){
			if (iValue%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int Num){
		if (Num%2==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int Num){
		if (Num%2==1)
			return true;
		else 
			return false;
	}
	public static boolean isPrime(int Num){
		for (int i = 2;i<Num;i++){
			if (Num%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger value){
		if (value.getiValue()%2==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger value){
		if (value.getiValue()%2==1)
			return true;
		else 
			return false;
	}
	public static boolean isPrime(MyInteger value){
		for (int i = 2;i<value.getiValue();i++){
			if (value.getiValue()%i==0)
				return false;
		}
		return true;
	}
	public boolean equals(int num){
		if (iValue==num)
			return true;
		return false;
	}
	public boolean equals(MyInteger num){
		if (iValue==num.getiValue())
			return true;
		return false;
	}
	
}
