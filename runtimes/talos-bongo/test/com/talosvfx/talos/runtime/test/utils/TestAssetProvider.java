
package com.talosvfx.talos.runtime.test.utils;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.talosvfx.talos.runtime.assets.BaseAssetProvider;

public class TestAssetProvider extends BaseAssetProvider {

	private final TextureAtlas atlas;

	public TestAssetProvider (final TextureAtlas atlas) {
		this.atlas = atlas;

		setAssetHandler(TextureRegion.class, new AssetHandler<TextureRegion>() {
			@Override
			public TextureRegion findAsset (String assetName) {
				return atlas.findRegion(assetName);
			}
		});

		setAssetHandler(Sprite.class, new AssetHandler<Sprite>() {
			@Override
			public Sprite findAsset (String assetName) {
				return atlas.createSprite(assetName);
			}
		});
	}
}
