package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Triangle extends Entity {
	ShapeRenderer shape;
	
	
	
	public Triangle(float x, float y, Color colour, float speed, boolean AI) 
	{
		super(x, y, colour, speed, AI);

	}
	
	@Override
	public void create() {
		shape = new ShapeRenderer();
	}
	
	@Override
	public void update() {
		System.out.format("In triangle at (%f,%f), (%f,%f), (%f,%f)\n", -25 + getX(), -25 + getY(), 25 + getX(), -25 + getY(), 0 + getX(), 25 + getY());
	}

	@Override
	public void draw() 
	{
		shape.begin(ShapeRenderer.ShapeType.Filled);
		shape.setColor(getColour());
		shape.triangle(-25 + getX(), -25 + getY(), 25 + getX(), -25 + getY(), 0 + getX(), 25 + getY());
		shape.end();
	}

	@Override
	public void movement() 
	{
		if (getAIControlled() == false) 
		{
			moveUserControlled();
		}
	}

	@Override
	public void moveAIControlled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUserControlled() {
		if (Gdx.input.isKeyPressed(Keys.A)) 
		{
			float new_pos = getX() - 200 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}
		if (Gdx.input.isKeyPressed(Keys.D)) 
		{
			float new_pos = getX() + 200 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}		
	}

	@Override
	public void dispose() {
		shape.dispose();		
	}

}
