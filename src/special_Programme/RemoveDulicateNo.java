package special_Programme;

import java.util.HashSet;

public class RemoveDulicateNo {

	public static void main(String[] args) {

// We remove only int		
  int[] a= {1,2,2,3,4,5,5};
  
   HashSet<Integer> hs= new HashSet<>();
   
   for(int i=0;i<a.length-1;i++)
   {
	   hs.add(a[i]);
   }
		
   for(int w:hs)
   {
	   System.out.print(w+" ");
   }
	}
//   String[] a= {"Nikhil","Nikhil","pune"}; // We cannot remove the in one string 
//   
//   HashSet<String> hs=new HashSet<>();
//   
//   for(int i=0;i<a.length;i++)
//   {
//	   hs.add(a[i]);
//   }
//		
//   for(String w:hs)
//   {
//	   System.out.print(w+" ");
//   }
//	}

}
