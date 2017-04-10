/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Tester.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:58:10 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Tester
 *
 */
public abstract class Tester<T> extends Filter<T> {
	
	
	/**
	 * 
	 */
	public Tester() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param outPipe
	 * @param inPipe
	 */
	public Tester(Pipe<T> outPipe, Pipe<T> inPipe) {
		super(outPipe, inPipe);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param message
	 * @return status {@link boolean}
	 *         Provides the status of a message after testing it which is `true`
	 *         for success and `false` for fail
	 */
	public abstract boolean test(Message<T> message);
}
