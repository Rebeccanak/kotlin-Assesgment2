fun main() {
getMultiples(20,)
    getMultiples(19)
    getMultiples(16)

}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun getMultiples(num:Int){

    var item = 0;
    for (item in num ){
        if (item %6==0 || %8==0){
            println("Bingo")
        }
        else if (item %6==0){
            println("item multiple of  6")
        }
        else if (item %8==0){
            println("multiple of 8")
        }
        println("none")
    }
}




//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

//input string
//output  firstchar, lastChar,  length, vowel or not

fun getValues(word:String):String{
    var string = 0;
    for(item in word){
        if(item[0] < word.length){
            return string
    }
}
    //Create a class CurrentAccount with the following attributes: account number,
    //account name, balance. It has the following functions:
    //a. deposit(amount: Double) - Increments the balance by the amount
    //deposited
    //b. withdraw(amount: Double) - Decrements the balance by the amount
    //withdrawn
    //c. details() - Prints out the account number and balance and name in
    //this format: “Account number x with balance y is operated by z”


    open class CurrnentAccount(var accountnumber:Int,var accountname:String, var balance:Double){
    open fun deposit(amount:Double){
        var balances = amount
                var amount = amount+balances
        amount++
        println(balances)
    }
    open fun withdraw(amount:Double){
        var balances = amount
        var amount = amount - balances
        amount--
        println(balances)
    }
        open fun details(accountnumber:Int,balance:Double):String{
            var detail = "Account number x with balance y is operated"
            return (detail)
        }
            }
    //Create another class SavingsAccount. It has the same functions and
    //attributes as the current account except for one attribute, withdrawals: Int.
    //Withdrawals is a counter variable that is used to keep track of how many
    //withdrawals have been made from the account in a year. The only other
    //difference is that the savings account withdraw() method first checks if the
    //number of withdrawals is less than 4 for it to allow one to withdraw money
    //from the account. It also increments the withdrawals attribute after a
    //successful withdrawal
    class SavingAccounts( accountnumber:Int,accountname:String, balance:Double,var withdrawal:Int):CurrnentAccount(accountnumber,accountname,balance){
        override fun deposit(amount: Double) {
            super.deposit(amount)
        }

        override fun details(accountnumber: Int, balance: Double): String {
            return super.details(accountnumber, balance)
        }
    }

    //Create a function that takes in a password as a parameter. For a password to
    //be valid it must meet the following conditions:
    //1. Must be at least 8 characters long
    //2. Must be at most 16 characters long
    //3. Must not be “password”
    //4. Must contain a digit
    //Your function should determine whether the password provided is valid or not.
    //The function returns true/false

//fun takesPassword(password:String){
//    when(password){
//        "Character"=0..8 ->println()
//
//    }    }
}
fun getPassword(password:String){
    var item = 0
      var password = "Todayis256"
    if(password.length <8 || password.length >19){
        return false
    }

    else if (password.tolowercase === "password"){

      return false
}
    else{

    }
}









