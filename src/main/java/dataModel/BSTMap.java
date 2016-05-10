package dataModel;

public class BSTMap<key,value> {
	private BSTMap<key, value> left=null;
	private BSTMap<value, value> right = null;
	private key key;
	private value value;
	public BSTMap<key, value> getLeft() {
		return left;
	}
	public void setLeft(BSTMap<key, value> left) {
		this.left = left;
	}
	public BSTMap<value, value> getRight() {
		return right;
	}
	public void setRight(BSTMap<value, value> right) {
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