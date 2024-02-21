package com.mygdx.game.Screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.AIControl.AIControlManager;
import com.mygdx.game.Collision.CollisionManager;
import com.mygdx.game.Entity.EntityManager;
import com.mygdx.game.InputOutput.IOManager;
import com.mygdx.game.PlayerControl.PlayerControlManager;

public class GameScene extends Scene{
	Game game;
	EntityManager em;
	IOManager io;
	PlayerControlManager pcm;
	AIControlManager acm;
	CollisionManager cm;
	
	public GameScene(Game game) {
		super(game);
		this.game = getGame();
	} 

	@Override
	public void show() {
		em = EntityManager.getInstance();
		io = IOManager.getInstance();
		pcm = PlayerControlManager.getInstance();
		acm = AIControlManager.getInstance();
		cm = CollisionManager.getInstance();
	}

	@Override
	public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ScreenUtils.clear(0, 0, 0.2f, 1);
		io.outputTexture();
		pcm.movement();
		acm.movement();
		cm.checkCollisions();
		em.update();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		em.dispose();
		
	}

}
