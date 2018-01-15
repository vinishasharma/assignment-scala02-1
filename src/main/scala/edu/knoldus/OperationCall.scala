package edu.knoldus

object OperationCall {

  def main(args: Array[String]): Unit = {
    val num1 = 1
    val num2 = 2
    val num3 = 3
    val num4 = 4

    val list = List (num1,num2,num3,num4)
    val operation = new Operations
    val rotateValue = 3
    if(rotateValue > list.length) {
      print("rotate vale should be less than list length")
    }
    else if(rotateValue < 0) {
      print("rotate value can't be negative")
    }
    else {
      val resultList1 = operation.rotateList(2, list)
      print("Original List:\n")
      print(list)
      print("\nrotated List:\n")
      print(resultList1)
    }

    print("\nEliminate dublicate Operation:\nOriginal List:\n")
    val list2 = List(num1,num2,num2,num3,num3,num4)
    print(list2)
    val resultList2: List[Int] = operation.eliminateDublicates(list2)
    print("\nDistinct List:\n")
    print(resultList2)

    print("\nHappy Number or Sad Number from range 1 to 20 :\n")
    val range = 1 to 20
    range.foreach(res =>{
      val result = operation.determineHappyOrSad(res)
      print(s"\n$res is $result")
    })
  }
}
