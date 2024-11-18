

package com.mycompany.student01;

public class Student01 {
    float Mark1,Mark2,Tutorial;
    float Total,RTotal;
    float Getmark(float M1,float M2){
        Mark1 = M1;
        Mark2 = M2;
        Total = Mark1 + Mark2;
        return(Total);
        
    }
    void Display(){
        Tutorial = 10;
        RTotal = Total + Getmark (56.67);
        System.out.println("The Tutorial Mark is ="+Tutorial);
        
        System.out.println("The Mark1 is = \t"+Mark1);
        
        System.out.println("The Mark2 is = \t"+Mark2);
        
        System.out.println("The Grand Total is ="+ RTotal);
        
    }

    public static void main(String[] args) {
        
        Student01 s = new Student01();
        s.Display();
       
        
    }
}
