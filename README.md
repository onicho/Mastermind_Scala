# Mastermind

This is a text version of the Mastermind Game completed in Scala 2.11. 
The game generates a random secret code of four colours. The current game palette is 6 colours


## Completed by students:

* Olya Nicholls
* Henrique Andrella

----------------------------------------------------------------------------------------------------------------------------------



## HOW THE SOLUTION FOR SML INTERPRETER WAS DEVELOPED

* Our moto for this assignment was "simplicity is the key" 

* At first stage, because we both are very new to Scala or Java, our primary goal was to make the game work, i.e. to develop *some* solution for Mastermind, even if it was long and "ugly" 

* For example, at first instead of the colour objects we had a list of strings representing different colours. Later we created a separate class Colour, which could take in different names at construction time.

* When the first version of the solution was more or less working, we split up the problem into multiple classes, e.g. Colour, GameCode, Grid, UserGuess etc. 

* To make it easy to add (or remove) NEW colours to the game palette, we created a new class ColourMaker and object GameColours

* Finally, we applied Dependency Injection and created a new class DependencyModule where all "bindings" were configured


---------------------------------------------------------------------------------------------------------------------------------


## DI IN MASTERMIND

It is our first experience of using  Dependency Injection. We used DI to bind together the ColourMaker trait and class, trait Game and class TheGame, as well as the boolean value of "ShowCode" to instance true, so the secret Game Code is displayed when the game runs (it can be changed to false for the non-cheating game mode).
"ShowCode" was injected into class TheGame. 


---------------------------------------------------------------------------------------------------------------------------------


## TESTING

A combination of scalamock and scalatest libraries were used in the testing suite.

---------------------------------------------------------------------------------------------------------------------------------

## REFERENCES

1. https://www.playframework.com/documentation/2.5.x/ScalaDependencyInjection