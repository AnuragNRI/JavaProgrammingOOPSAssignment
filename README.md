Assignment 3

A.)Create an simple java applications with two classes

1.Customer(this class contain information about customers)

a.)The attribute are as follows.

Name-String
Username-String
Password-String
Age-int
SSN-String
Address-String(just city name)
Email-String
Phone-long
Balance-float
b.)Methods

login
deposit
withdrawal
checkBalance
editProfile
changePassword
2.)Bank(This will be the main class,which when executed shows following results)

3.)On the start of application login() method of Customer class should be called.

4.)After logging in,customer should select one of the following option to perform operation.

5.)On selection of each opeeration,respecting methods in customer class should be called.

6.)At the end of each operation the customer should be prompted,do you want to continue?

7.)If the reply is "YES" then it should display the menu again.

8.)If the answer is "NO" then it should exit out and display the login page.

B. Add another class Account in the application with the following attributes
and methods
a. Attributes
• accountId
• description
• minimumBalance
b. methods
• display()

C. Create two subclasses of Account class
a. Current
• Set minimumBalance=$0
• Override display method to show details of all the attributes
in the account

b. Saving
• Set minimumBalance=$500
• Override display method to show details of all the attributes
in the account
