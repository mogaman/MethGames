package com.mygdx.game.Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TextureObject extends Entity{
	private Texture tex;
	private SpriteBatch batch;
	

	
	public TextureObject (String t, float x, float y, float speed) {
		super(x, y, speed);
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
	public void dispose() {
		batch.dispose();
	}


	
	
}
