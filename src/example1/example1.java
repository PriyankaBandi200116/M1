package example1;

/*interface Drawable{  
    public void draw();  
}  
public class example1 {  
    public static void main(String[] args) {  
        int width=10;  
       //create an object called Drawable
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  
*/

//intercace<interface_name>

//object creation in java 
//classname object = new classname();

//lambda
//classname object=()->
///dehildhelhdhe/
//egkjgjkgjkg


interface Drawable{  
    public void draw();  
}  
public class example1 {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d1=()->{
        	System.out.println("Drawing"+width);
        };
        d1.draw();
    }
}  

