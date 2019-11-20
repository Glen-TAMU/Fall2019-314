
public class Pair<T> {
	private T m_left;
	private T m_right;
	
	Pair(T l, T r) 
	{
		m_left = l;
		m_right = r;
	}
	public T left() { return m_left; }
	public T right() {return m_right; }

}