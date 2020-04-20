package content1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Tom",18,54.2));
		students.add(new Student(2,"Jerry", 12, 93.3));
		dataIo(students);
		System.out.println("=============");
		spIo(students);
		System.out.println("=============");
		objIo(students);
	}
	
	public static void dataIo(ArrayList<Student> students) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data_1.txt"));
		dosStudent(dos, students);
		dos.flush();
		dos.close();
		InputStream input = new FileInputStream("data_1.txt");
		DataInputStream dis = new DataInputStream(input);
		writeStudent(dis);
	}
	
	public static void dosStudent(DataOutputStream dos, ArrayList<Student> students) throws IOException {
		for(int i = 0;i<students.size();i++) {
			dos.writeInt(students.get(i).getId());
			dos.writeUTF(students.get(i).getName());
			dos.writeInt(students.get(i).getAge());
			dos.writeDouble(students.get(i).getGrade());
		}
	}
	
	public static void writeStudent(DataInputStream dis) throws IOException{
		while(dis.available()>0) {
			System.out.println(dis.readInt()+" "+dis.readUTF()+" "+dis.readInt()+" "+dis.readDouble());
		}
	}
	
	public static void spIo(ArrayList<Student> students)throws IOException{
		PrintWriter pw = new PrintWriter("data_2.txt");
		pwStudent(pw, students);
		pw.flush();
		pw.close();
		Scanner sc = new Scanner(new File("data_2.txt"));
		writeStudent(sc);
		sc.close();
	}
	
	public static void pwStudent(PrintWriter pw, ArrayList<Student> students) throws IOException {
		for(int i = 0;i<students.size();i++) {
			pw.println(students.get(i).getId()+" "+students.get(i).getName()
					+" "+students.get(i).getAge()+" "+students.get(i).getGrade());
		}
	}
	
	public static void writeStudent(Scanner sc)throws IOException{
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
	}
	
	public static void objIo(ArrayList<Student> students) throws IOException, ClassNotFoundException{
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data_4.txt"));
		for(Student x:students) {
			os.writeObject(x);
		}
		os.writeObject(null);
		os.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data_4.txt"));
		writeStudent(in);
		in.close();
	}
	
	public static void writeStudent(ObjectInputStream in) throws IOException, ClassNotFoundException {
		for(Student temp = (Student)in.readObject();temp!=null;temp = (Student)in.readObject()) {
			System.out.println(temp);
		}
	}
}
