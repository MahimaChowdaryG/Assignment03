/**
 * 
 */
package question1;

/**
 * @author S555087
 *
 */
public class Generics<T> {
    private T any;

    public void set(T object) {
        this.any = object;
    }

    public T get() {
        return this.any;
    }
    
    public static void main(String[] args)
    {
    	Generics<String>s=new Generics<String>();
    	s.set("Mahima");
    	System.out.println(s.get());
    }
}

