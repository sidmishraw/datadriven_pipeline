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
public class Transformer<T> extends Filter<T> {
	
	
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
	
	public Message<T> transform(Message<T> message) {
		
		
		return null;
	}
}
