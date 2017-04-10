/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Transformer.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:55:48 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Transformer
 *
 */
public abstract class Transformer<T> extends Filter<T> {
	
	
	/**
	 * 
	 */
	public Transformer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param outPipe
	 * @param inPipe
	 */
	public Transformer(Pipe<T> outPipe, Pipe<T> inPipe) {
		super(outPipe, inPipe);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param message
	 * @return transformed message {@link Message}<T>
	 *         transformed message which is obtained from the incoming message
	 */
	public abstract Message<T> transform(Message<T> message);
}
