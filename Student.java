

package com.mycompany.student;


public class Student {
    
      private int Roll;
    private String Name;
    private float Mark;
    private void GetData()
    {
        Roll = 782319;
        Name = "Rakib";
        Mark = 60.54f;
        
    }
    void Display(){
        GetData();
        System.out.println("The Roll is ="+Roll);
        System.out.println("The Name is ="+Name);
        System.out.println("The Mark is ="+Mark);
    }
   
    public static void main(String[] args) {
           Student s = new Student();
    
    s.Display();
    }
}
