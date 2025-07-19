// class is a user defined blueprint consisting of attributes and methods 
//object is  instances of a class
class learn{
    public static void main(String[] args) { // function
        int money = 2000;
        //int -integer
// void - return type. main - function name or entry point in a java program
// public - access modifier. static - it allows to call this method without creating an object of the class
// String[] args - command line arguments 
// [] - list
System.out.println(money);
money = 5000;
System.out.println(money);
// ln - next line
// system - class  out - object of print stream println - method in print stream
//Java varibles - titles of reserved memory location.A variable in Java is like a container or box where you can store a value
//strings -collection of characters
//camelcase - first word - small letters second word - First letter in capital
//functions.variables - in camelCase
//Pascalcase - first letter should be capital in all word
//class - in Pascalcase
//packages - in lower case
//snake case - separate two or more words by underscore(_)
//constant - should not be change. in upper snake case
//Rules for naming variables in java
    //Rule 1 - variables names should not begin with a number (e.g.-num_1)
   //Rule 2 - whitespace is not permitted in variabale names (e.g. - int money_Borrowed)
   //Rule 3 - a java keyword (reserved word) cannot be used as a variable name
   //Rule 4 - it is preferred to use variable names with more than one word with all lowercase letters for the first word and capitalization of the first letter of each subsequent word
   //Rule 5 - when creating variables, it is preferred to give them meaningful names
   //Rule 6 - all lowercase letters should be used when creating one-word varibles names
//Java Identifiers - any name you create in java 
  //Rule 1- all identifiers should begin with a letter (A to Z or a to z),currency character($) or an underscore(_)
  //Rule 2- after the first character,identifiers can have any combination of characters
  //Rule 3- a keyword cannot be used as an identifier
  //Rule 4- the identifiers are case sensitive
  //Rule 5- whitespace is not permitted
// Data Types
  // Primitive data types - built in java, hold single values , cannot be divided into simpler data types 
    // 1.Boolean- true or false possible values 
    // 2. Byte- byte b = 60;  size: 1 byte or 8 bits    range : -128 to 127
    // 3. Short- Short S = 100; size : 2 bytes or 16 bits   range: -32,768 to 32,767
    // 4. int- int a= 1000;    size = 4 bytes or 32 bits  range = -2^31 to 2^32 -1
    // 5. Long- long l = 123456   size = 8 bytes or 64 bits  range = -2^64 to 2^64-1
    // 6. Float- float f = 123.456 f; size = 4 bytes or 32 bits
    // 7. Double- double d = 421.45;     size = 8 bytes
    // 8. Char- char ch = 'p';   size = 2 bytes or 16 bits
  //Non primitive data types - user defined, hold memory address of a variable, complex structure
    // 1. Strings
    // 2. Arrays
    // 3. Classes
    // 4. Interfaces

    }
}