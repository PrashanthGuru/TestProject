package classesandobjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
			
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.checkEligabilityForCreditCard();
		System.out.println("Is Tom Eligable for Ceridt Card : "+tom.eligableForCreditCard);
		
		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=31;
		henry.accountBalance=20000;
		henry.checkEligabilityForCreditCard();
		System.out.println("Is Henry Eligable for Ceridt Card : "+henry.eligableForCreditCard);
		
		sarah.firstName="Sarah";
		sarah.lastName="Miller";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.checkEligabilityForCreditCard();
		System.out.println("Is Sarah Eligable for Ceridt Card : "+henry.eligableForCreditCard);
	} 

}
