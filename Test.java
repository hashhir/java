class Grandparent{
int x=10;
}
class parent extends Grandparent{
 int y=12;
 }
 class child extends parent{
 int z=14;
 void display(){
 System.out.println(x+y+z);
 }
 }
 class Test{
   public static void main(String args[]){
   child c= new child();
   c.display();
   }
 }
 