package edu.knoldus

class Operations {

  def rotateList(number: Int,list: List[Int]) : List[Int] = {

    def rotateHelper(number :Int, list: List[Int]) : List[Int] = {
      list match {
        case Nil  => list
        case head :: tail => if(number > 0)rotateHelper(number-1,tail:::List(head)) else list
      }
    }
    rotateHelper(number,list)
  }

  def eliminateDublicates(list: List[Int]): List[Int] = {
      list match {
        case Nil => Nil
        case head::Nil => List(head)
        case head::tail if (head == tail.head) => eliminateDublicates(tail)
        case head::tail => head::eliminateDublicates(tail)
      }
  }

  def determineHappyOrSad(number : Int): String = {

    def determineHelper(number: Int, sequenceList: List[Int]): String = {
      val squareResult = getSumOfSquare(number, 0)
      if (squareResult == 1) {
        "happy number"
      }
      else if (sequenceList.contains(squareResult)) {
        "is a sad number"
      }
      else {
        determineHelper(squareResult, squareResult :: sequenceList)
      }
    }
    determineHelper(number, List())
  }

  def getSumOfSquare(number: Int,sum: Int) : Int ={
    if(number != 0) {
      getSumOfSquare(number/10,sum + (number%10)*(number%10))
    }
    else {
      sum
    }
  }
}

