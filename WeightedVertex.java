
public class WeightedVertex {
	private final Integer vertex;
	private Double weight;
	
	public WeightedVertex(int v, double w) {
		vertex = v;
		weight = w;
	}
	
	public Integer getVertex() {
		return vertex;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(double w) {
		this.weight = w;
	}
	
	public String toString() {
		return "(" + vertex + "," + weight + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		boolean ret;
		if(other == null) ret = false;
		else if(this == other) ret = true;
		else if(getClass() == other.getClass()) {
			ret = (vertex.intValue() == ((WeightedVertex) other).getVertex().intValue());
		}
		else ret = false;
		return ret;
	}
}
