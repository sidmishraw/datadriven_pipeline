/**
 * Project: DatadrivenPipelineFramework
 * Package: org.bulbasaur.pipeline.core
 * File: Message.java
 * 
 * @author sidmishraw
 *         Last modified: Apr 9, 2017 2:33:03 PM
 */
package org.bulbasaur.pipeline.core;

/**
 * @author sidmishraw
 *
 *         Qualified Name: org.bulbasaur.pipeline.core.Message
 *
 */
public class Message<T> {
	
	
	private T		content	= null;
	private boolean	fail	= false;
	private boolean	quit	= false;
	
	/**
	 * 
	 */
	public Message() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the content
	 */
	public T getContent() {
		
		return this.content;
	}

	
	/**
	 * @param content the content to set
	 */
	public void setContent(T content) {
		
		this.content = content;
	}

	
	/**
	 * @return the fail
	 */
	public boolean isFail() {
		
		return this.fail;
	}

	
	/**
	 * @param fail the fail to set
	 */
	public void setFail(boolean fail) {
		
		this.fail = fail;
	}

	
	/**
	 * @return the quit
	 */
	public boolean isQuit() {
		
		return this.quit;
	}

	
	/**
	 * @param quit the quit to set
	 */
	public void setQuit(boolean quit) {
		
		this.quit = quit;
	}
	
}
