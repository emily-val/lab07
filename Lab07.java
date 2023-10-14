import java.util.PriorityQueue;

public class Lab07 {
	public static void main(String[] args) {
		PriorityQueue<WeightedVertex> p = new PriorityQueue<>(new WeightedVertexComparator());
		WeightedVertex[] weightedVertexArr = new WeightedVertex[10];
		weightedVertexArr[0] = new WeightedVertex(0, 0.0);
		weightedVertexArr[1] = new WeightedVertex(1, 1.0);
		weightedVertexArr[2] = new WeightedVertex(2, 2.0);
		weightedVertexArr[3] = new WeightedVertex(3, 3.0);
		weightedVertexArr[4] = new WeightedVertex(4, 4.0);
		weightedVertexArr[5] = new WeightedVertex(5, 0.0);
		weightedVertexArr[6] = new WeightedVertex(6, 1.0);
		weightedVertexArr[7] = new WeightedVertex(7, 2.0);
		weightedVertexArr[8] = new WeightedVertex(8, 3.0);
		weightedVertexArr[9] = new WeightedVertex(9, 4.0);
		
		//version 1
		for(WeightedVertex element : weightedVertexArr) {
			p.add(element);
		}
		WeightedVertex[] arr = p.toArray(new WeightedVertex[0]);
		for(WeightedVertex wv : arr) {
			System.out.println("\t" + wv);
		}
		System.out.println();
		
		//version 2
		p.toArray(new WeightedVertex[0]);
		while(p.size() > 0) {
			System.out.println("\t" + p.poll());
		}
		System.out.println();
		
		//version 3
		for(WeightedVertex element : weightedVertexArr) {
			p.add(element);
		}
		weightedVertexArr[0].setWeight(10.0);
		WeightedVertex[] arr2 = p.toArray(new WeightedVertex[0]);
		for(WeightedVertex wv : arr2) {
			System.out.println("\t" + wv);
		}
		System.out.println();
		
		//version 4
		while(p.size() > 0) {
			System.out.println("\t" + p.poll());
		}
		System.out.println();
		
		//version 5
		weightedVertexArr[0].setWeight(0.0);
		for(WeightedVertex element : weightedVertexArr) {
			p.add(element);
		}
		p.remove(weightedVertexArr[0]);
		weightedVertexArr[0].setWeight(10.0);
		p.add(weightedVertexArr[0]);
		while(p.size() > 0) {
			System.out.println("\t" + p.poll());
		}
		System.out.println();
	}
}
