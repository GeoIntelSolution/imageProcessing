package org.example.vo;

public class TileMeta {
    private int zoom;
    private int tileSize=256;

    public int getZoom() {
        return zoom;
    }

    public TileMeta setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }

    public int getTileSize() {
        return tileSize;
    }

    public TileMeta setTileSize(int tileSize) {
        this.tileSize = tileSize;
        return this;
    }
}
