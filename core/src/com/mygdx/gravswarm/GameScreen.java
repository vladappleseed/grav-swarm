package com.mygdx.gravswarm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Vlad M on 4/16/16.
 */
public class GameScreen implements Screen
{
	final GravSwarm game;

	OrthographicCamera camera;
	Vector3 touchPos;
	Texture testLogoImg;

	Rectangle testLogo;

	public GameScreen (final GravSwarm thisGame)
	{
		this.game = thisGame;

		camera = new OrthographicCamera();
		//     camera.setToOrtho(false);
		camera.setToOrtho(false, 1280, 720);

		touchPos = new Vector3();

		testLogoImg = new Texture("logo2.png");

		testLogo = new Rectangle();
		testLogo.x = 400;
		testLogo.y = 140;
		testLogo.width = 452;
		testLogo.height = 452;
	}

	@Override
	public void show()
	{

	}

	@Override
	public void render (float delta)
	{
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();

		game.batch.setProjectionMatrix(camera.combined);
		game.batch.begin();
		game.batch.draw(testLogoImg, testLogo.x, testLogo.y);
		game.batch.end();
	}

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void pause()
	{

	}

	@Override
	public void resume()
	{

	}

	@Override
	public void hide()
	{

	}

	@Override
	public void dispose()
	{
		testLogoImg.dispose();
	}
}