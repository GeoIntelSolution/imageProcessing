package org.example.utils;

import org.example.vo.LngLatLike;
import org.example.vo.TileInfo;
import org.example.vo.TileMeta;

public class ImageSplitUtil {
    private static double half_extent = 20037508.34;
    /**
     * 根据经纬度计算出该点所在tiled的编号
     * @param longitude 经度
     * @param latitude  纬度
     * @param meta 元素据
     * @return tile信息
     */
    public static TileInfo calculateTileInfo(double longitude, double latitude, TileMeta meta){

        LngLatLike lngLatLike = CRSUtil.transform2WebMercator(new LngLatLike(longitude, latitude));

        int zoom = meta.getZoom();
        int tileCount = 1<<zoom;

        double delta_xy =  half_extent*2/tileCount;

        int col = (int) Math.floor(((half_extent + lngLatLike.getX()) / delta_xy));
        int row = (int) Math.floor((half_extent - lngLatLike.getY()) / delta_xy);


        //瓦片左上角的信息
        double webMercatorX=col*delta_xy-half_extent;
        double webMercatorY=half_extent-row*delta_xy;

        LngLatLike cc = CRSUtil.transform2wgs84(new LngLatLike(webMercatorX, webMercatorY));
        System.out.println(cc);

        TileInfo tileInfo = new TileInfo();
        tileInfo.setCol(col)
                .setRow(row)
                .setZoom(meta.getZoom())
                .setLatitude(cc.getY())
                .setLongitude(cc.getX());


        return tileInfo;


    }
}
