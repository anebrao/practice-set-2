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

}
