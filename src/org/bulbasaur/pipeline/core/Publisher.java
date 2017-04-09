/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Publisher.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:45:38 PM
 */
package org.bulbasaur.pipeline.core;

import java.util.List;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Publisher
 *
 */
public class Publisher {
	
	
	protected List<Subscriber> subscribers = null;
	
	/**
	 * 
	 */
	public Publisher() {}
	
	/**
	 * @param subscribers
	 */
	public Publisher(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}
	
	/**
	 * @return the subscribers
	 */
	public List<Subscriber> getSubscribers() {
		
		
		return this.subscribers;
	}
	
	/**
	 * @param subscribers
	 *            the subscribers to set
	 */
	public void setSubscribers(List<Subscriber> subscribers) {
		
		
		this.subscribers = subscribers;
	}
	
}
