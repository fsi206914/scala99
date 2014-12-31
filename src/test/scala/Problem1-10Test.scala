import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

/**
 * Chapter 1:
 */
@RunWith(classOf[JUnitRunner])
class Chapter1Test extends Specification {

  import Chapter1._
  /* 
  *Problem1 
  */
  "P1" should {
    "Find the last element of a list." in {

      findLastElem(List(1,2,3)) === 3
      findLastElem(List(3)) === 3
      findLastElem(List()) must throwA[Exception]    
    }
  }
  /*==============================================================*/

  /* 
  *Problem2
  */
  "P2" should {
    "Find the last but one element of a list." in {

      findLastButOne(List(1, 2, 3)) === 2
      findLastButOne(List(2, 3)) === 2
      findLastButOne(List(1)) must throwA[Exception]   
      findLastButOne(List()) must throwA[Exception]    

    }
  }
  /*==============================================================*/

  /* 
  *Problem3
  */
  "P3" should {
    "Find the Kth element of a list." in {

      findKthElem(List(1, 2, 3), 2) === 3
      findKthElem(List(1), 8) must throwA[Exception]   
      findKthElem(List(),2) must throwA[Exception]    

    }
  }
  /*==============================================================*/

  /* 
  *Problem4
  */
  "P4" should {
    "Find the number of elems in a list." in {

      findLength(List(1, 2, 3)) === 3
      findLength(List()) === 0
    }
  }
  /*==============================================================*/

  /* 
  *Problem5
  */
  "P5" should {
    "Find the number of elems in a list." in {

      reverse(List(1, 2, 3)) === List(3,2,1)
    }
  }
  /*==============================================================*/

  /* 
  *Problem6
  */
  "P6" should {
    "is Palindrome" in {

      isPalindrome(List(1, 2, 1)) === true
    }
  }
  /*==============================================================*/

  /* 
  *Problem7
  */
  "P7" should {
    "Flatten a nested list structure" in {

      flatten( List(List(1, 2, 1), 1 , List(2)) ) === List(1,2,1,1,2)
    }
  }
  /*==============================================================*/

  /* 
  *Problem8
  */
  "P8" should {
    "Eliminate consecutive duplicates of list elements." in {

      eliminateDuplicates(List(1, 1, 2, 1, 1)) === List(1,2,1)
    }
  }
  /*==============================================================*/

  /* 
  *Problem9
  */
  "P9" should {
    "Pack consecutive duplicates of list elements into sublists." in {
      pack(List(1, 1, 2, 1, 1)) === List(List(1, 1), List(2), List(1, 1))
    }
  }
  /*==============================================================*/

  /* 
  *Problem10
  */
  "P10" should {
    "Run-length encoding of a list." in {

      lenEncode(List(1, 1, 2, 1, 1)) === List((2,1),(1,2),(2,1))
    }
  }
  /*==============================================================*/

}
