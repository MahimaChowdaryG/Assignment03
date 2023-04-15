/**
 * 
 */
package question1;

/**
 * @author S555087
 *
 */
public class Generics<T> {
    private T object;

    public void set(T obj) {
        this.object = obj;
    }

    public T get() {
        return this.object;
    }
    
    public static void main(String[] args)
    {
    	Generics<String>s=new Generics<String>();
    	s.set("Mahima");
    	System.out.println(s.get());
    }
}

