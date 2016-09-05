case class Candidate(id: Int, name: String)

val candidates = List(Candidate(1, "Aniket"), Candidate(2, "Erik"))

def funForName(n: String) = {


}

//Boolean functions
val startsWithJ = (s:String) => s.startsWith("J")
def isOdd(y : Int): Boolean = y % 2 == 1

def go[T](filtered: List[T], persons: List[T], toBool: T => Boolean):List[T] = persons match {
  case Nil => filtered.reverse
  case p::pp => {
    if(toBool(p)) go(p::filtered,pp, toBool)
    else go(filtered,pp,toBool)
  }
}

val people = List("Ja","Jo","Ba","Boo","J")
val ints = List(1,2,3,4,5,6,7,8,9)

val filtered = go(List(),people,startsWithJ)
val oddInts = go(List(),ints,isOdd)

//          1    2    3   4  5   6   7   8
val x =List("a","b","c","d","e","f","g","h")
val xwithIndex: List[(String, Int)] = x.zipWithIndex

//def isItOdd(y : (String,Int)): Boolean = ???


//xwithIndex.map(e => isOdd(e)).flatten
//xwithIndex.flatMap(e => isOdd(e))

//val listss = List(List(1),List(1,2,3,4),List(6,5)).flatten



