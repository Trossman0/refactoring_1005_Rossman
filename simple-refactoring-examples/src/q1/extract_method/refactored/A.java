package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
      // other implementation
      return null;
   }
   
   <T extends Item> void extractedMethod(List<T> list, String p) {
	   for (T item : list) {
		   if(item.contains(p)) {
			   System.out.println(list);
		   }
	   }
   }
}

class Item {
	String name;
	
	public boolean contains(String p) {
	      return name.contains(p);
	}
}

class Node extends Item{
   
   }

class Edge extends Item {
   
   }