package roadgraph;

import java.util.List;

import geography.GeographicPoint;

public class GraphNode implements Comparable<GraphNode> {

//	Node class for storing properties of each node (name, type and location)

	private List<GraphNode> neighbors;
	private String roadName;
	private String roadType;
	private GeographicPoint value;
	private double length;
	private double actualDist;

	// Node Constructor
	public GraphNode(GeographicPoint loc, String roadName, String roadType, double length) {
		this.roadName = roadName;
		this.roadType = roadType;
		this.value = loc;
		this.length = length;
	}

	// Getters and Setters for all the properties.
	public GraphNode(GeographicPoint loc) {
		this.value = loc;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public GeographicPoint getValue() {
		return value;
	}

	public void setValue(GeographicPoint value) {
		this.value = value;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setActualDist(double actualDist) {
		this.actualDist = actualDist;
	}

	public void addNeighbor(GraphNode n) {
		neighbors.add(n);
	}

	public List<GraphNode> getNeighbor() {
		return neighbors;
	}

	public double getActualDist() {
		return actualDist;
	}

	@Override
	public int compareTo(GraphNode o) {
		return Double.compare(length, o.getLength());
	}

	public String toString() {
		return this.getValue().toString();
	}

}