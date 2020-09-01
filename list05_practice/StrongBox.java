package list05_practice;

public class StrongBox<E> {
	private E item;
	private KeyType keyType;
	private long count;
	public StrongBox(KeyType keyT) {
		this.keyType = keyT;
	}
	public void put(E i) {
		this.item = i;
	}
	public E get() {
		this.count++;
		switch(this.keyType) {
			case PADLOCK: if(count < 1)  return null; break;
			case BUTTON: if(count < 3) return null; break;
			case DIAL: if(count < 5) return null; break;
			case FINGER: if(count < 1000000) return null; break;
		}
		this.count = 0;
		return this.item;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public KeyType getKeyType() {
		return keyType;
	}
	public void setKeyType(KeyType keyType) {
		this.keyType = keyType;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}

//public class StrongBox<E> {
//    private KeyType keyType;
//    private E item;
//    private long count;
////    public StrongBox(KeyType key) {
////    	this.keyType = key;
////    }
//	public E get() {
////        this.count++;
////        switch(this.keyType) {
////            case PADLOCK:
////            	if(count < 1024) return null;
////                break;
////            case BUTTON:
////                if(count < 10000) return null;
////                break;
////            case DIAL:
////                if(count < 30000) return null;
////                break;
////            case FINGER:
////                if(count < 1000000) return null;
////                break;
////        }
////        this.count = 0;
//        return this.item;
//    }
//	public void put(E i) {
//		this.item = i;
//	}
//	public KeyType getKeyType() {
//		return keyType;
//	}
//	public void setKeyType(KeyType keyType) {
//		this.keyType = keyType;
//	}
//	public E getItem() {
//		return item;
//	}
//	public void setItem(E item) {
//		this.item = item;
//	}
//	public long getCount() {
//		return count;
//	}
//	public void setCount(long count) {
//		this.count = count;
//	}
//}

