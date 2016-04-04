


trait Game {

  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */

  println()
  println("*"*20 + " Welcome to Mastermind ".toUpperCase() + "*"*20)
  println()
  println("RULES")
  println(" " +"-"*100)


  val rules: String = """
                        |This is a text version of the classic board game Mastermind.
                        |The computer will think of a secret code. The code consists of 4 colored pegs.
                        |The pegs may be one of six colors: RED, BLUE, ORANGE, YELLOW, GREEN, PURPLE.
                        |A color may appear more than once in the code.
                        |You try to guess what colored pegs are in the code and what order they are in
                        |After making a guess the result will be displayed.
                        |A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.
                        |For each peg in the guess that is the correct color, but is out of position, you get a white peg.
                        |When entering guesses you only need to enter the first character of the color as a capital letter.
                        |You have 12 to guess the answer or you lose the game.""".stripMargin


  println(rules)
  println(" " +"-"*100)
  println()

  val gr  = new Grid
  val gc = new GameCode

  def runGames() = {
    gr.printgrid()
    gameflow()
  }

  def gameflow()
}
