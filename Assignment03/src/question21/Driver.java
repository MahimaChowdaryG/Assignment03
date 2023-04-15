package question21;


	import java.io.*;

	public class Driver {
	    public static void main(String[] args) throws IOException, ClassNotFoundException {
	        // create an object to serialize
	        Student person = new Student("Mahima", "Chowdary");

	        // serialize the object
	        FileOutputStream fileOut = new FileOutputStream("person.ser");
	        //To serialize an object, you need to create an ObjectOutputStream object.
	        //This object will handle the serialization process and convert the object into a stream of bytes.
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        //Once you have the ObjectOutputStream, you can write the object to the stream using its writeObject() method.
	        //This method serializes the object and writes it to the stream.
	        out.writeObject(person);
	        //After writing the object to the stream, you should close the stream using the close() method.
	        //This will ensure that the data is flushed and the stream is closed properly.
	        out.close();
	        fileOut.close();

	        // deserialize the object
	        FileInputStream fileIn = new FileInputStream("person.ser");
	        //To deserialize an object, you need to create an ObjectInputStream object. 
	        //This object will handle the deserialization process and convert the stream of bytes back into an object.
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        //Once you have the ObjectInputStream, you can read the object from the stream using its readObject() method.
	        //This method deserializes the object and returns it.
	        Student serializedStudent = (Student) in.readObject();
	        //After reading the object from the stream, you should close the stream using the close() method.
	        //This will ensure that the stream is closed properly
	        in.close();
	        fileIn.close();

	        // print the deserialized object
	        System.out.println("Deserialized Person:");
	        System.out.println("First Name: " + serializedStudent.getFirstName());
	        System.out.println("Last Name: " +serializedStudent.getLastName());
	    }
	}

	//In order to serialize an object, the class to which the object belongs must implement the Serializable interface.
	//This interface doesn't have any methods and acts as a marker interface to indicate that the class can be serialized.
	class Student implements Serializable {
	    private String firstName;
	    private String lastName;

	    public Student(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }
	}



