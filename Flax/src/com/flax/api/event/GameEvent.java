/**
 * 
 */
package com.flax.api.event;

/**
 * @author Ian
 *
 */
public class GameEvent {
	public static final int EVENT_NULL 				= 0;
	public static final int EVENT_LEVEL_UP 			= 1;
	public static final int EVENT_SMITHING_SMELT 	= 2;
	public static final int EVENT_MINING 			= 3;
	public static final int EVENT_DEATH	 			= 4;
	public static final int EVENT_SMITHING_REFINING_FAILED 	= 5;
	public static final int EVENT_FISH_CAUGHT 		= 6;
	public static final int EVENT_WOODCUTTING 		= 7;
	public static final int EVENT_FIREMAKING 		= 8;
	public static final int EVENT_COOKED_FOOD 		= 9;
	public static final int EVENT_BURNT_FOOD 		= 10;
	public static final int EVENT_SMITHING 			= 11;
	
	
	private int event_type = EVENT_NULL;
	
	public GameEvent(int type) {
		event_type = type;
	}
	
	public int getEventType() {
		return this.event_type;
	}
	
}
