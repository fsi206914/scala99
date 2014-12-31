object Chapter2{

  def error(message: String): Nothing =
    throw new RuntimeException(message)


  def flatten(xs: List[Any]): List[Any] = xs match {
    case Nil => Nil
    case (head: List[_]) :: tail => flatten(head) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
  }



  def pack[A](ls: List[A]): List[List[A]]=
    if(ls.isEmpty) List[List[A]]();
    else{
      val (packed, next) = ls.span(_ == ls.head)
      if(next == Nil) List(packed)
      packed :: pack(next)
    }

  def lenModifiedEncode[A](ls: List[A]): List[Any]=
    pack(ls) map { e => if(e.length>1)(e.length, e.head) else e.head }


  def decode[A](ls: List[(Int, A)]) =
    ls.flatMap(e => List.fill(e._1)(e._2))

  def duplicate[A](ls: List[A]) =
    ls.flatMap(e => List.fill(2)(e))

  def drop[A](n: Int, ls: List[A]) ={
    var iter = 0
    ls.flatMap(e => {
      iter += 1
      if(iter >= 3) iter=0;
      if(iter%3 == 0) None
      else Some(e)
    })
  }

  def split[A](n: Int, ls: List[A]) ={
    val(l1, l2) = ls.zipWithIndex.span(_._2 < n)
    (l1.map(e => e._1), l2.map(e => e._1))
  }

}
