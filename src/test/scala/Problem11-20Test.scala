import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
 * Chapter 1:
 */
@RunWith(classOf[JUnitRunner])
class Chapter2Test extends Specification {

  import Chapter2._
  /* 
  *Problem11 
  */
  "P11" should {
    "Find the last element of a list." in {

      lenModifiedEncode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    }
  }
  /*==============================================================*/

  /* 
  *Problem12
  */
  "P12" should {
    "Decode a run-length encoded list." in {

      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }
  }
  /*==============================================================*/

  /* 
  *Problem13
  */
  "P13" should {
    "Run-length encoding of a list (direct solution)." in {

      lenModifiedEncode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    }
  }
  /*==============================================================*/

  /* 
  *Problem14
  */
  "P14" should {
    "Duplicate the elements of a list." in {

      duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }
  /*==============================================================*/

  /* 
  *Problem15
  */
  "P15" should {
    "Duplicate the elements of a list a given number of times." in {

      duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }
  /*==============================================================*/

  /* 
  *Problem16
  */
  "P16" should {
    "Drop every Nth element from a list." in {

      drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
  }
  /*==============================================================*/

  /* 
  *Problem17
  */
  "P17" should {
    "Split a list into two parts." in {

      split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
  }
  /*==============================================================*/


}
