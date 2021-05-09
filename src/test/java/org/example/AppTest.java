package org.example;

import static org.junit.Assert.assertTrue;

import org.example.utils.ImageSplitUtil;
import org.example.vo.TileInfo;
import org.example.vo.TileMeta;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testPng(){
        String url ="5/34.814/112.280";
        String[] split = url.split("/");
        int zoom =Integer.valueOf(split[0]);
        Double latitude = Double.valueOf(split[1]);
        Double longitude = Double.valueOf(split[2]);

        TileMeta tileMeta = new TileMeta();
        tileMeta.setZoom(zoom)
                .setTileSize(256);
        TileInfo tileInfo = ImageSplitUtil.calculateTileInfo( longitude,latitude, tileMeta);
        System.out.println(tileInfo);
    }
}
