object tutorial_4{

// Q-1 Functions

def cal_Interest(depositAmount: Double): Double = depositAmount match{
	case x if x<=20000 => 0.02*depositAmount
	case x if x<=200000 => 0.04*depositAmount
	case x if x<=2000000 => 0.035*depositAmount
	case _  => 0.02*depositAmount
}


// Q-2 Functions

def patternMatching(number:Int): String = number match{
	case x if number <= 0 => "Negative/Zero"
	case x if number%2== 0 => "Even"
	case x if number%2!= 0 => "Odd"
}

// Q-3 Functions

def toUpper (str:String): String = str.toUpperCase()
def toLower (str:String): String = str.toLowerCase()
def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)



def main(args: Array[String]): Unit={

//Q-1

	println("\n \nQuestion 1\n")
	println("Enter the amount: ")
	val depositAmount = scala.io.StdIn.readInt()
	println("The interest you're getting is " +cal_Interest(depositAmount))


//Q-2

	println("\n \nQuestion 2\n")
	println("Enter a Number: ")
	val number = scala.io.StdIn.readInt()
	println("The number you entered is an " +patternMatching(number)) 

//Q-3

	println("\n \nQuestion 3\n")
	var name = "Benny"
	println(formatNames(name) { str => toUpper(str) })

	name = "Niroshan"
	println(formatNames(name) { str =>
		val firsthalf = str.substring(0,2)
		val sechalf = str.substring(2)
		toUpper(firsthalf) + toLower(sechalf)
		}
	)

	name = "Saman"
	println(formatNames(name){str=>toLower(str)})

	name = "Kumara"
	println(formatNames(name) {str =>
        val firsthalf = str.substring(0, 1)
        val sechalf = str.substring(1,5)
        val thirdhalf= str.substring(5)
        toUpper(firsthalf) + toLower(sechalf)+toUpper(thirdhalf)
    }
	)

}

}