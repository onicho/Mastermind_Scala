import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine


/**
  * Reading and taking in user's guess
  * Sanitising user's input
  * Converting user's guess into a list of colour objects
  *
  * @param colourMaker -object that creates colour objects with given name
  */

class UserGuess (val colourMaker: TColourMaker) {




  def sendInput(): ListBuffer[Colour] = {

    println()
    println("Please enter your guess to crack the secret code")
    println()

    var input = " "

    var input_correct = false

    while (!input_correct) {

      //collecting user's input, i.e. user's guess of a secret code
      val takeinput = readLine("Your guess is: ").toUpperCase()

      //Sanitising user's input.
      //check that user's guess equals to length 4
      if (takeinput.length > 4 || takeinput.length < 4) {
        println(s"Your guess code should be 4 characters, BUT YOURS IS ${takeinput.length}. Try again")
        println()
      } else {

        // ensuring that user guesses on the game palette colours
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

    //when the user guess is taken and is correct, we need to turn the guess into a list of colour objects with names
    //by means of using the colourmaker

    val output = new ListBuffer[Colour]

    for (i <- Range(0,4)) {
      output.append(colourMaker.CreateColour(input(i)))

    }
    output
  }
}

//