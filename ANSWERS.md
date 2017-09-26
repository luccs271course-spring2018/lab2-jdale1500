# COMP 271 F17 002 Lab 2

# Team project

Work in teams of two

# Objectives

An understanding of the following concepts and techniques:

- entity objects
- linear search
- binary search
- algorithmic complexity
- arrays versus lists
- [optional values](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- DRY and factoring out methods
- final-correctness
- automated unit testing using JUnit
- testing for exceptions
- test fixtures and assertions

# Instructions

1. Review the code.
2. Run the code for various inputs to gain an understanding of what it does.
3. Complete the items marked TODO in the code and get the tests to pass.
4. Create a markdown document called Answers.md and answer the questions in the next section.

# Questions

- What is the complexity of each of the four search methods in terms of array or list size n?
- Linear for the first three search methods and binary for the last search method.
- 
- What happens in the case of binary search if the array is not sorted?
- Unpredictable results, without order you can get incorrect results.
- 
- What is the purpose of constructor argument validity checking?
- The constructor argument validity checking is make sure you don't operate on a null.

- What is the purpose of using the keyword `final` with variables and arguments?
- The keyword is used to make the variables and arguments immutable so they can't be changed later.
- 
- What are alternatives to using `Optional` and how do they compare?
- Alternatives to Optional are writing your own conditions in your code to check if there is a null.