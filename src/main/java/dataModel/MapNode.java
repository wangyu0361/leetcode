package dataModel;

public class MapNode<key,value> {
	private MapNode<key, value> left=null;
	private MapNode<value, value> right = null;
	private key key;
	private value value;
	public MapNode<key, value> getLeft() {
		return left;
	}
	public void setLeft(MapNode<key, value> left) {
		this.left = left;
	}
	public MapNode<value, value> getRight() {
		return right;
	}
	public void setRight(MapNode<value, value> right) {
		this.right = right;
	}
	public key getKey() {
		return key;
	}
	public void setKey(key key) {
		this.key = key;
	}
	public value getValue() {
		return value;
	}
	public void setValue(value value) {
		this.value = value;
	}
	
	
	
	
	
	
}