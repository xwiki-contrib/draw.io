/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.mxgraph.io.gliffy.model;

import com.google.gson.annotations.SerializedName;

public class Constraint
{

	public static enum ConstraintType
	{
		@SerializedName("StartPositionConstraint") START_POSITION_CONSTRAINT,
		@SerializedName("EndPositionConstraint") END_POSITION_CONSTRAINT,
		@SerializedName("HeightConstraint") HEIGHT_CONSTRAINT;

		public String toString()
		{
			return this.name();
		}
	}

	static public class ConstraintData
	{
		private String nodeId;

		private float px;

		private float py;

		public String getNodeId()
		{
			return nodeId;
		}

		public void setNodeId(String nodeId)
		{
			this.nodeId = nodeId;
		}

		public float getPx()
		{
			return px;
		}

		public void setPx(float px)
		{
			this.px = px;
		}

		public float getPy()
		{
			return py;
		}

		public void setPy(float py)
		{
			this.py = py;
		}

	}

	private ConstraintType type;

	private ConstraintData StartPositionConstraint;

	private ConstraintData EndPositionConstraint;

	public ConstraintType getType()
	{
		return type;
	}

	public void setType(ConstraintType type)
	{
		this.type = type;
	}

	public ConstraintData getStartPositionConstraint()
	{
		return StartPositionConstraint;
	}

	public void setStartPositionConstraint(
			ConstraintData startPositionConstraint)
	{
		StartPositionConstraint = startPositionConstraint;
	}

	public ConstraintData getEndPositionConstraint()
	{
		return EndPositionConstraint;
	}

	public void setEndPositionConstraint(ConstraintData endPositionConstraint)
	{
		EndPositionConstraint = endPositionConstraint;
	}

}
