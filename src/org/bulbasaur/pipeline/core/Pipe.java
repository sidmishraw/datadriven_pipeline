/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Pipe.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:19:41 PM
 */
package org.bulbasaur.pipeline.core;

import java.util.List;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Pipe
 * 
 *         Description:
 *         The Pipe class is a generic class that represents a message queue. It
 *         connects 2 Filters.
 *         A message can be anything, hence the Pipe needs to be generic. A Pipe
 *         has a flag to change from
 *         data-driven to demand-driven.
 */
public class Pipe<T> extends Publisher {
	
	
	/**
	 * This is the flag which changes the Pipe from a demand-driven to
	 * data-driven.
	 * false => Data-driven Pipe
	 * true => Demand-driven Pipe
	 */
	private boolean				typeFlag	= false;
	private List<Message<T>>	messages	= null;
	
	/**
	 * 
	 */
	public Pipe() {
		super();
	}
	
	/**
	 * @param typeFlag
	 * @param messages
	 */
	public Pipe(boolean typeFlag, List<Message<T>> messages, List<Subscriber> subscribers) {

		super(subscribers);
		this.typeFlag = typeFlag;
		this.messages = messages;
	}
	
	/**
	 * @return the typeFlag
	 */
	public boolean isTypeFlag() {
		
		
		return this.typeFlag;
	}
	
	/**
	 * @param typeFlag
	 *            the typeFlag to set
	 */
	public void setTypeFlag(boolean typeFlag) {
		
		
		this.typeFlag = typeFlag;
	}
	
	/**
	 * @return the messages
	 */
	public List<Message<T>> getMessages() {
		
		
		return this.messages;
	}
	
	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(List<Message<T>> messages) {
		
		
		this.messages = messages;
	}
	
	/**
	 * 
	 * @return message {@link Message}<T>
	 *         the message read from the message queue
	 */
	public Message<T> read() {
		
		
		return null;
	}
	
	/**
	 * 
	 * @param message
	 *            {@link Message}<T>
	 *            The message to be written to the message queue.
	 */
	public void writeMessage(Message<T> message) {
		
		
		return;
	}
}
