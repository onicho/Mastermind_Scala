import com.google.inject.Inject
import com.google.inject.name.Named


/**
  * The "top level class" of the program
  * It has a constructor that takes a boolean. The boolean is used for testing purpose.
  * TheGame class also has a method named runGames(see Game trait) that carries out the actual games.
  *
  * @param colourMaker - object that creates colour objects with given name
  */

class TheGame (colourMaker: ColourMaker) extends Game {
  private var showCode: Boolean = false


  // class constructor with injected boolean.
  //NB: to reveal / hide the secret code during the game, change the boolean in the DependencyModule!
  @Inject
  def this(@Named("ShowCode") easy: Boolean, colourMaker: ColourMaker) {
    this(colourMaker)
    showCode = easy
    ShowCode()
  }

  def ShowCode() ={
    if (showCode == true) gr.codestring = gr.code
  }

  override def gameflow() {
    var Win = false

    while (!Win && gr.guessCounter < 12) { //the user has only 12 guesses to crack the code
      val userGuess = new UserGuess(colourMaker)
      val guess = userGuess.sendInput()//taking a guess from a user
      gr.insertGuess(gr.guessCounter, guess) // updating the grid, so user guesses gets printed every time
      gr.printgrid()
      println("")

      //checking if the game code has been solved
      if (gr.lastPegs == "Black Black Black Black") {
        Win = true
        println(s"Well done! You've won with ${gr.guessCounter} guesses")
      }

      //checking if the user has run ou of guesses - then game over

      if (gr.guessCounter == 12 && gr.lastPegs != "Black Black Black Black") {
        println("")
        println("Game is over. You did not crack the Secret Code. ")
        println(s"The Secret code was ${gr.code.result().mkString}")
      }
    }




  }
}

