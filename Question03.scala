object Question03 extends App{
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach { name =>
    val formattedName = formatNames(name) {
      case str if str.length % 2 == 0 => toUpper(str)
      case str => toLower(str)
    }
    println(formattedName)
  }
}
