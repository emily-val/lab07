
class WeightedVertexComparator implements java.util.Comparator<WeightedVertex> {
	public int compare(WeightedVertex a, WeightedVertex b) {
		if(a.getWeight() < b.getWeight()) {
			return -1;
		}
		else if(a.getWeight() > b.getWeight()) {
			return 1;
		}
		else if(a.getWeight().equals(b.getWeight()) && a.getVertex() < b.getVertex()) {
			return -1;
		}
		else if(a.getWeight().equals(b.getWeight()) && a.getVertex() > b.getVertex()) {
			return 1;
		}
		else return 0;
	}
}