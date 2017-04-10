/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Consumer.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:54:52 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Consumer
 *
 */
public abstract class Consumer<T> extends Filter<T> {
	
	
	/**
	 * 
	 */
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param outPipe
	 * @param inPipe
	 */
	public Consumer(Pipe<T> outPipe, Pipe<T> inPipe) {
		super(outPipe, inPipe);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param message
	 *            {@link Message}<T>
	 *            the message to be consumed for performing some operation
	 */
	public abstract void consume(Message<T> message);
}
