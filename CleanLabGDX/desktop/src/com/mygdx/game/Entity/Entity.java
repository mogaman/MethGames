package com.mygdx.game.Entity;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;


public abstract class Entity{

	private float x, y;
	private float speed;
	private Color Colour;
	private boolean aiControlled;
	
	public Entity (float x, float y, Color colour, float speed, boolean AI) {
		this.x =x;
		this.y =y;
		this.Colour = colour;
		this.speed = speed;
		this.aiControlled = AI;
	}
	
	//X Axis Get Set
	public float getX() 
	{
		return x;
	}

	public void setX(float x) 
	{
		this.x = x;
	}

	//Y Axis Get Set
	public float getY() 
	{
		return y; 	
	}

	public void setY(float y) 
	{
		this.y = y;
	}

	//Speed Get Set
	public float getSpeed() 
	{
		return speed;
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}
	
	//Colour Get Set
	public Color getColour() 
	{
		return Colour;
	}

	public void setColour(Color colour) 
	{
		Colour = colour;
	}
	
	//Boolean Get Set
	public boolean getAIControlled()
	{
		return aiControlled;
	}
	
	public void setAIControlled(boolean bool)
	{
		aiControlled = bool;
	}

	
	public abstract void create();
	
	public abstract void update();
	
	public abstract void dispose();
}

