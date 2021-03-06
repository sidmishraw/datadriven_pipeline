/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Producer.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:53:29 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Producer
 *
 */
public abstract class Producer<T> extends Filter<T> {
	
	
	/**
	 * 
	 */
	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param outPipe
	 * @param inPipe
	 */
	public Producer(Pipe<T> outPipe, Pipe<T> inPipe) {
		super(outPipe, inPipe);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return message {@link Message}<T>
	 *         the message produced by the producer
	 */
	public abstract Message<T> produce();
}
