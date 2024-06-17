object volume {
  def v(r: Double) = math.Pi * r * r * r * 4 / 3

  def main(args: Array[String]): Unit = {
    var r = 5
    var volume = v(r)
    println(f"volume of a sphere is $volume%.2f")
  }
}
