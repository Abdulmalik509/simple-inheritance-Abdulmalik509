package tr.edu.maltepe.oop;
public  class Simple_main {

 public static void main(String []args){
     Professor professor = new Professor("Dr. Ansar", 45, "Computer Science");
     Student student1 = new Student("Ali", 20);
     Student student2 = new Student("Ahmed", 21);

     professor.teach("Object-Oriented Programming");
     student1.listen(professor, "Object-Oriented Programming");
     student2.listen(professor, "Object-Oriented Programming");
     student1.takeNotes("Object-Oriented Programming");
     student2.takeNotes("Object-Oriented Programming");
 }
}



