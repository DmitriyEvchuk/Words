package ua.bigchuk.compare;



import ua.bigchuk.Tree.MyCompare;


public class WithOutCaseSensitive implements MyCompare  {

	public Integer compare(String nodeVal, String val) {

		
		nodeVal=nodeVal.toLowerCase();
		val=val.toLowerCase();
		
		
		if (nodeVal.hashCode() > val.hashCode())
			return 1;

		if (nodeVal.hashCode() < val.hashCode())
			return -1;

		
		return 0;
	}
	
	public boolean equals(String key,String current) {

		
		
		
		if (key.equalsIgnoreCase(current)) 
			return true;

			
		

		return false;

	}


}
