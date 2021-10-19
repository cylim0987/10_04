package ch02_List;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx2 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
		
		//index를 가지고 접근할 떄는 굳이 iteratal를 쓸 필요 없다. set이면 써야함
		
		int sum=0;
		
		
		
		
		
	}

}
