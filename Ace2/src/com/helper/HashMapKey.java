package com.helper;

public class HashMapKey {
	String Family;
	String StartEvent;
	String EndEvent;
	
	@Override
	public boolean equals(Object obj) {
		HashMapKey keyObj = (HashMapKey) obj;
		return this.Family.equals(keyObj.getFamily()) && this.StartEvent.equals(keyObj.getStartEvent()) && this.EndEvent.equals(keyObj.getEndEvent());
	}
	
	@Override
	public int hashCode() {
		 final int PRIME = 31;
		 int result = 1;
		 result = PRIME * result + this.getEndEvent().hashCode()+this.getFamily().hashCode()+this.getStartEvent().hashCode();
		    
		 return result;
	}
	
	public String getFamily() {
		return Family;
	}
	public void setFamily(String family) {
		Family = family;
	}
	public String getStartEvent() {
		return StartEvent;
	}
	public void setStartEvent(String startEvent) {
		StartEvent = startEvent;
	}
	public String getEndEvent() {
		return EndEvent;
	}
	public void setEndEvent(String endEvent) {
		EndEvent = endEvent;
	}
}
