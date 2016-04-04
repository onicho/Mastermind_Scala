/**
  * Created by ONicholls on 05/03/2016.
  */
class Colour (name: String) {

    override def toString() : String = name.split("").headOption.mkString.toUpperCase
    var matched = false

  override def equals(obj: scala.Any): Boolean = {
    obj.asInstanceOf[Colour].getName().split("").headOption.mkString.toUpperCase ==
      name.split("").headOption.mkString.toUpperCase
  }

  def getName() :String = name
}

object Colour {

  def apply(name:String) = new Colour(name)

}
