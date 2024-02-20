package com.mygdx.game;


import com.badlogic.gdx.graphics.Color;


public abstract class Entity implements iMovable{
	
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
	

	public float getX() 
	{
		return x;
	}


	public void setX(float x) 
	{
		this.x = x;
	}


	public float getY() 
	{
		return y; 	
	}


	public void setY(float y) 
	{
		this.y = y;
	}


	public float getSpeed() 
	{
		return speed;
	}


	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}
	
	public Color getColour() 
	{
		return Colour;
	}

	public void setColour(Color colour) 
	{
		Colour = colour;
	}
	
	public boolean getAIControlled()
	{
		return aiControlled;
	}
	
	public void setAIControlled(boolean bool)
	{
		aiControlled = bool;
	}
	
	public abstract void create();
	
	public abstract void draw();
	
	public abstract void update();
	
	public abstract void movement();
	
	public abstract void dispose();
}

