package org.asylum.core.regions;

import java.util.HashMap;
import org.asylum.utils.Utils;

public class Region {

	public static HashMap<Integer, Region> regionList = new HashMap<Integer, Region>();
	private int id;	
	private String name, description, rawName;
	private Bound bound;
	private boolean wilderness;
	
	public Region(String name, String description, String rawName, Bound bound, boolean wilderness) {
		int id = 1;
        while (regionList.containsKey(id)) {
            id++;
        }
        this.id = id;
        regionList.put(this.id, this);
        
        this.name = name;
        this.description = description;
        rawName = Utils.decolor(name);
        this.bound = bound;
        this.wilderness = wilderness;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rawName
	 */
	public String getRawName() {
		return rawName;
	}
	/**
	 * @param rawName the rawName to set
	 */
	public void setRawName(String rawName) {
		this.rawName = rawName;
	}

	/**
	 * @return the wilderness
	 */
	public boolean isWilderness() {
		return wilderness;
	}
	/**
	 * @param wilderness the wilderness to set
	 */
	public void setWilderness(boolean wilderness) {
		this.wilderness = wilderness;
	}

	/**
	 * @return the bound
	 */
	public Bound getBound() {
		return bound;
	}
	/**
	 * @param bound the bound to set
	 */
	public void setBound(Bound bound) {
		this.bound = bound;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
