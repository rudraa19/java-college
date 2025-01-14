# Practical 2:
Array

1. Define a class Array with following member

    Field:
    
        int data[];

    Function:

        Array()                     // create array data of size 
        Array(int size)             // create array of size size
        Array(int data[])           // initialize array with parameter array
        void Reverse_an_array ()    // reverse element of an array
        int Maximum_of_array ()     // find maximum element of array
        int Average_of_array()      // find average of element of array
        void Sorting ()             // sort element of array
        void display()              // display element of array
        int search(int no)          // search element and return index else return -1
        int size();                 // return size of an array
        
    Use all the function in main method. Create different objects with different constructors.

2. Define a class Matrix with following

    Field:

        int row, column;
        float mat[][]

    Function:

        Matrix(int a[][])
        Matrix()
        Matrix(int rwo, int col)
        void readMatrix()                               //read element of array
        float [][] transpose()                          //find transpose of first matrix
        float [][] matrixMultiplication(Matrix second)  //multiply two matrices and return result
        void displayMatrix(float [][]a)                 //display content of argument array
        void displayMatrix()                            //display content
        float maximum_of_array()                        // return maximum element of first array
        float average_of_array()                        // return average of first array