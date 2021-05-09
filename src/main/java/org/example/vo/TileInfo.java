package org.example.vo;

public class TileInfo {
    //行号
    private int row;
    //列号
    private int col;
    //缩放级别
    private int zoom;
    //瓦片左上角的经度
    private double longitude;
    //瓦片左上角的纬度
    private double latitude;

    public int getZoom() {
        return zoom;
    }

    public TileInfo setZoom(int zoom) {
        this.zoom = zoom;
        return  this;
    }

    public int getRow() {
        return row;
    }

    public TileInfo setRow(int row) {
        this.row = row;
        return  this;

    }

    public int getCol() {
        return col;
    }

    public TileInfo setCol(int col) {
        this.col = col;
        return  this;

    }

    public double getLongitude() {
        return longitude;
    }

    public TileInfo setLongitude(double longitude) {
        this.longitude = longitude;
        return  this;

    }

    public double getLatitude() {
        return latitude;
    }

    public TileInfo setLatitude(double latitude) {
        this.latitude = latitude;
        return  this;

    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d.png",zoom,col,row);
    }
}
