import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

class UserGuess (val colourMaker: TColourMaker) {

  def sendInput(): ListBuffer[Colour] = {

    println()
    println("Please enter your guess to crack the secret code")
    println()

    var input = " "

    var input_correct = false

    while (!input_correct) {

      val takeinput = readLine("Your guess is: ").toUpperCase()

      if (takeinput.length > 4 || takeinput.length < 4) {
        println(s"Your guess code should be 4 characters, BUT YOURS IS ${takeinput.length}. Try again")
        println()
      } else {

        val pass = new ListBuffer[String]
        takeinput.foreach(ch => if ((List('R','B','Y','O','P','G')).contains(ch)) {
          pass += "yes"
        })
        if (pass.result().length == 4) {
          input = takeinput
          input_correct = true
        } else {
          println("Every single character of your guess code must be a valid colour.")
          println("Valid characters/colours are R,B,Y,O,P or G. You can enter e.g rbgo . Try again")
          println()
        }
      }
    }

    var output = new ListBuffer[Colour]

    for (i <- Range(0,4)) {
      output.append(colourMaker.CreateColour(input(i)))

    }
    output
  }
}
