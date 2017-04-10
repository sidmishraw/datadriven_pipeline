/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Filter.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:50:22 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Filter
 *
 */
public abstract class Filter<T> implements Subscriber {
	
	
	protected Pipe<T>	outPipe	= null;
	protected Pipe<T>	inPipe	= null;
	
	/**
	 * 
	 */
	public Filter() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param outPipe
	 * @param inPipe
	 */
	public Filter(Pipe<T> outPipe, Pipe<T> inPipe) {
		this.outPipe = outPipe;
		this.inPipe = inPipe;
	}
	
	/**
	 * @return the outPipe
	 */
	public Pipe<T> getOutPipe() {
		
		
		return this.outPipe;
	}
	
	/**
	 * @param outPipe
	 *            the outPipe to set
	 */
	public void setOutPipe(Pipe<T> outPipe) {
		
		
		this.outPipe = outPipe;
	}
	
	/**
	 * @return the inPipe
	 */
	public Pipe<T> getInPipe() {
		
		
		return this.inPipe;
	}
	
	/**
	 * @param inPipe
	 *            the inPipe to set
	 */
	public void setInPipe(Pipe<T> inPipe) {
		
		
		this.inPipe = inPipe;
	}
	
}
