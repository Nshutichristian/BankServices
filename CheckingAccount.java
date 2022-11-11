import java.util.Date;

public class CheckingAccount {
	
	private String uniqueID;
	private double acctBalance;
	private double annualInterestRate;
	private Date createdDateTime;
	
	public CheckingAccount(String uniqueID, double acctBalance,double annualInterestRate) 
	{
		this.uniqueID = uniqueID;
		this.acctBalance = acctBalance;
		this.annualInterestRate = annualInterestRate;
		this.createdDateTime =(new Date(System.currentTimeMillis()));
	}

	// Returns the new balance.
	public double deposit(double depositAmount) {
		this.acctBalance += depositAmount;
		
		return this.acctBalance;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public double getAcctBalance() {
		return this.acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public double getAnnualInterestRate() {
		double answer = this.acctBalance * annualInterestRate/36000;
		int i=2;
		answer=Math.round(answer *Math.pow(10,i))/Math.pow(10, i);
		return answer;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	@Override
	public String toString() {
		return "bankApplication [uniqueID=" + uniqueID + ", acctBalance=" + acctBalance + ", annualInterestRate="
				+ annualInterestRate + "]";
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}
}
