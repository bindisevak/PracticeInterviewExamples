package linkedlist;

 class Link {
	public int dData;
	public Link next;
	
	public Link(int d){
		dData = d;
	}
}

 class LinkList{
	private Link first;
	private Link last;
	
	public LinkList(){
		first = null;
		//last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int dd){
		Link newLink = new Link(dd);
		
		if(isEmpty())
			last = newLink;
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(int dd){
		Link newlink = new Link(dd);
		
		if(isEmpty())
			first = newlink;
		else
			last.next = newlink;
		last = newlink;	
	}
	
	public double deleteFirst(){
		double tmp = first.dData;
		if(first.next == null)
			last = null;
		first = first.next;
		return tmp;
	}
	
	
}	
