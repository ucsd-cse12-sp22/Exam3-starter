import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Scanner;

public class FileReader {
	
	String filename;
	Comparator comparator;
	DefaultMap<Character, Student> hashMap;
	
	public FileReader(String name) {
		this.filename = name;
		this.comparator =  (Comparator) new Comparator<Student>(){
            @Override public int compare(Student p1, Student p2) {
                //return n1.getKey().compareTo(n2.getKey());
                if (p1.marks > p2.marks) {
                	return 1;
                }
                else {
                	return -1;
                }
            }
        };
		this.hashMap = 
	}
	
	public void createHeap() {
        
	}
	
	public Student getMaxOfSection(char section) {
		
	}
	


}
