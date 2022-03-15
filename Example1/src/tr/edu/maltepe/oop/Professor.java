package tr.edu.maltepe.oop;

public class Professor extends Person {

    public Professor(String name){
        super(name);
    }


    public void teaches(){

        System.out.println("Proffessor "+super.getName()+" is teaching");
    }

}