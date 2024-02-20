package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TextureObject extends Entity{
	private Texture tex;
	private SpriteBatch batch;
	

	
	public TextureObject (String t, float x, float y, float speed, boolean AI) {
		super(x, y, Color.RED, speed, AI);
		tex = new Texture (Gdx.files.internal(t));
		
	}
	
	public Texture getTex() {
		return tex;
	}
	
	
	public void setTex(Texture tex) {
		this.tex = tex;
	}
	
	@Override
	public void create() {
		batch = new SpriteBatch();
	}
	
	@Override
	public void update() {
		System.out.format("In %s at %f,%f position\n", tex, getX(), getY());
	}
	
	@Override
	public void draw () {
		batch.begin();
		batch.draw(tex, getX(), getY(), tex.getWidth(), tex.getHeight());
		batch.end();
	}
	
	@Override
	public void movement() {
		if(getAIControlled() == true) {
			moveAIControlled();
		}
		else if(getAIControlled() == false) {
			moveUserControlled();
		}
	}

	@Override
	public void moveAIControlled() {
		setY(getY() - getSpeed());

		//Reset Y pos
		if (getY() <= 0) 
		{
			setY(400);
			setSpeed(getSpeed()+2);
		}
		//update();
	}

	@Override
	public void moveUserControlled() {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) 
		{
			float new_pos =  getX() - 200 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) 
		{
			float new_pos =  getX() + 200 * Gdx.graphics.getDeltaTime();
			setX(new_pos);
		}		
	}

	@Override
	public void dispose() {
		batch.dispose();
	}


	
	
}
