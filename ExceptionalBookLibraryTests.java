//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Book Library)
// Files: (BookLibraryTests.java)
// Course: (CS 300, Spring, 2019)
//
// Author: (Shaurya Kethireddy)
// Email: (skethireddy@wisc.edu)
// Lecturer's Name: (Gary Dahl)
//
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: (identify each person and describe their help in detail)
// Online Sources: (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
import java.text.ParseException;

public class ExceptionalBookLibraryTests {
  /*
   * tests the parseCardBarCode method
   * 
   * @returns true if the method passes all the tests
   */
  public static boolean testLibraryParseCardBarCode() {
    boolean testPassed = false; //sets testPassed to false
    ExceptionalLibrary library = new ExceptionalLibrary("madison", "userName", "abc"); //new object
    try {
      library.parseCardBarCode("43", 1); //runs the method with assigned values
      System.out.println("ERROR: the method doesnt thrown an exception for an invalid barcode");
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      library.parseCardBarCode("happy", 1); //runs the method with assigned values
      System.out
          .println("ERROR: the method doesnt throw an exception for a invalid barcode argument");
      //error statement
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      int BarCode = library.parseCardBarCode("2019000002", 1);
      if (!(BarCode == 2019000002)) { //if the barcode doesn't equal
        System.out.println("ERROR: The wrong barCode was returned"); //error statement
        testPassed = false;
      } else {
        testPassed = true;
      }
    } catch (ParseException e) {
      testPassed = false;
      System.out.println("ERROR: Unecessary exception was thrown");

    }
    return testPassed;

  }

  /*
   * tests LibraryParseRunLibrarianCheckoutBookCommand method 
   */
  public static boolean testLibraryParseRunLibrarianCheckoutBookCommand() {
    boolean testPassed = true;
    ExceptionalLibrary library = new ExceptionalLibrary("madison", "userName", "abc");//new object
    try {
      String[] commands = {"43", "abc"};//assigns the commands
      library.parseRunLibrarianCheckoutBookCommand(commands); //method call for the commands
      System.out.println(
          "ERROR: the method doesnt thrown an exception for an invalid number of arguments");
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      String[] commands = {"3", "2342", "23"}; //assigns the commands
      library.parseRunLibrarianCheckoutBookCommand(commands); //method call for the commands
      System.out
          .println("ERROR: the method doesnt throw an exception for a invalid barcode argument");
      
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      String[] commands = {"3", "2019000002", "abc"}; //assigns the commands
      library.parseRunLibrarianCheckoutBookCommand(commands); //method call for the commands
      System.out.println(
          "ERROR: an exception wasnt thrown when the number format of the bookId wsa wrong.");
      //error statement
      testPassed = false;


    } catch (ParseException e) {
      testPassed = true;

    }
    return testPassed;
  }

  public static boolean testLibraryParseRunSubscriberReturnBookCommand() {
    boolean testPassed = true; 
    ExceptionalLibrary library = new ExceptionalLibrary("madison", "userName", "abc");
    try {
      String[] commands = {"43", "abc"}; //assigns the commands
      library.parseRunLibrarianReturnBookCommand(commands); //method call for the commands
      System.out.println(
          "ERROR: the method doesnt thrown an exception for an invalid number of arguments");
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      String[] commands = {"3", "2342", "23"}; //assigns the commands
      library.parseRunLibrarianReturnBookCommand(commands); //method call for the commands
      System.out
          .println("ERROR: the method doesnt throw an exception for a invalid barcode argument");
      //error statement
      testPassed = false; //assign
    } catch (ParseException t) {
      testPassed = true;
    }
    try {
      String[] commands = {"3", "2019000002", "abc"}; //assigns the commands
      library.parseRunLibrarianReturnBookCommand(commands); //method call for the commands
      System.out.println(
          "ERROR: an exception wasnt thrown when the number format of the bookId wsa wrong.");
      //error statement
      testPassed = false;


    } catch (ParseException e) {
      testPassed = true;
      // System.out.println("ERROR: unnecessary exception was thrown");

    }
    return testPassed;


  }

  public static boolean testparseRunLibrarianAddSubscriberCommand() {
    boolean testPassed = true;
    ExceptionalLibrary library = new ExceptionalLibrary("madison", "userName", "abc");
    //new object with assigned commands
    try {
      String[] commands = {"43", "abc"};
      library.parseRunLibrarianAddSubscriberCommand(commands);
      System.out.println(
          "ERROR: the method doesnt thrown an exception for an invalid number of arguments");
      //error statement
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    } catch (InstantiationException e) {

    }
    try {
      String[] commands = {"2", "abhi", "23", "madison", "994846"}; //this commands are applied
      library.parseRunLibrarianAddSubscriberCommand(commands); //method call
      System.out.println("ERROR: the method doesnt throw an exception for a invalid pin");
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    } catch (InstantiationException d) { 

    }
    try {
      String[] commands = {"2", "abhi", "23", "madison", "abc"};
      library.parseRunLibrarianReturnBookCommand(commands);
      System.out.println(
          "ERROR: an exception wasnt thrown when the number format of the phone number wsa wrong.");
      testPassed = false; //assigns


    } catch (ParseException e) { 
      testPassed = true; //assigns
      

    }
    return testPassed;


  }

  public static boolean testLibraryParseBookId() {
    boolean testPassed = false; //sets to false
    ExceptionalLibrary library = new ExceptionalLibrary("madison", "userName", "abc");
    try {
      library.parseCardBarCode("abc", 1);
      System.out.println("error: the method doesnt thrown an exception for an invalid bookId");
      testPassed = false;
    } catch (ParseException t) {
      testPassed = true;
    }



    return testPassed;

  }



  public static void main(String[] args) {
    int testFailed = 0;
    if (!testLibraryParseCardBarCode()) { //if this method returns fail
      System.out.println(" parseCardBarCode method failed");
      testFailed++; //increment testFailed
    }
    if (!testLibraryParseRunLibrarianCheckoutBookCommand()) { //if this method returns fail
      System.out.println("LibraryParseRunLibrarianCheckoutBookCommand() method failed");
      testFailed++; //increment testFailed
    }
    if (!testLibraryParseRunSubscriberReturnBookCommand()) { //if this method returns fail
      System.out.println("LibraryParseRunSubscriberReturnBookCommand() method failed");
      testFailed++; //increment testFailed
    }
    if (!testparseRunLibrarianAddSubscriberCommand()) { //if this method returns fail
      System.out.println("testparseRunLibrarianAddSubscriberCommand() method failed");
      testFailed++; //increment testFailed
    }

    if (!testLibraryParseBookId()) { //if this method returns fail
      System.out.println("testLibraryParseBookId() method failed");
      testFailed++; //increment testFailed
    }

    System.out.println("You failed " + testFailed + " tests."); //prints how many failed tests
  }
}
