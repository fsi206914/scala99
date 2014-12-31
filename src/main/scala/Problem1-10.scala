object Chapter1{

  def error(message: String): Nothing =
    throw new RuntimeException(message)

  def findLastElem(list: List[Int]): Int={

    list match {
      case a :: Nil => a
      case a :: b => findLastElem(b)
      case _ => error("wrong")
    }
  }

  def findLastButOne(list: List[Int]): Int={

    list match {
      case a :: b :: Nil => a
      case a :: b => findLastButOne(b)
      case _ => error("wrong")
    }
  }

  def findKthElem(list: List[Int], k: Int): Int={

    (list, k) match {
      case (Nil, _) => error("wrong")
      case (_, 0) => list.head
      case (a :: b, n) => findKthElem(b, n-1)
      case _ => error("wrong")
    }
  }

  def findLength(list: List[Int]): Int={
    list match {
      case Nil => 0
      case a::tail => 1+ findLength(tail)
    }
  }

  def reverse(list: List[Int]): List[Int]={
    list match {
      case a :: Nil => List(a)
      case a :: tail => reverse(tail) ::: List(a)
    }
  }

  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse


  def flatten(xs: List[Any]): List[Any] = xs match {
    case Nil => Nil
    case (head: List[_]) :: tail => flatten(head) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
  }

  def eliminateDuplicates(ls: List[Int]) = 
    ls.foldRight(List[Int]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }

  def pack[A](ls: List[A]): List[List[A]]=
    if(ls.isEmpty) List[List[A]]();
    else{
      val (packed, next) = ls.span(_ == ls.head)
      if(next == Nil) List(packed)
      packed :: pack(next)
    }

  def lenEncode[A](ls: List[A]): List[(Int, A)]=
    pack(ls) map { e => (e.length, e.head) }
}
