/*
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * Copyright 2011-2013 Peter Güttinger
 * 
 */

package ch.njol.skript.config;

/**
 * @author Peter Güttinger
 */
public class SimpleNode extends Node {
	
	public SimpleNode(final String value, final String comment, final int lineNum, final SectionNode parent) {
		super(value, comment, parent, lineNum);
	}
	
	public SimpleNode(final Config c) {
		super(c);
	}
	
	@SuppressWarnings("null")
	@Override
	String save_i() {
		return key;
	}
	
	public void set(final String s) {
		key = s;
	}
	
}