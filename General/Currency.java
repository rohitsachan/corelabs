public enum Currency { 
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private int value;
	private Currency(int value) {		//must be private constructor
		this.value = value;
	}

};

// class A{};	//	Valid