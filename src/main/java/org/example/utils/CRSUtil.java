package org.example.utils;


import org.example.vo.LngLatLike;
import org.locationtech.proj4j.*;

public class CRSUtil {
    private static CRSFactory crsFactory =new CRSFactory();
    private static CoordinateTransformFactory ctFactory =new CoordinateTransformFactory();
    public static LngLatLike transform2WebMercator(LngLatLike wgs84){
        CoordinateReferenceSystem src = crsFactory.createFromName("EPSG:4326");
        CoordinateReferenceSystem dist = crsFactory.createFromName("EPSG:3857");
        CoordinateTransform transform = ctFactory.createTransform(src, dist);
        ProjCoordinate ans = new ProjCoordinate();
        transform.transform(new ProjCoordinate(wgs84.getX(),wgs84.getY()),ans);
        return new LngLatLike(ans.x,ans.y);
    }

    public static LngLatLike transform2wgs84(LngLatLike epsg3857){
        CoordinateReferenceSystem dist = crsFactory.createFromName("EPSG:4326");
        CoordinateReferenceSystem src = crsFactory.createFromName("EPSG:3857");
        CoordinateTransform transform = ctFactory.createTransform(src, dist);
        ProjCoordinate ans = new ProjCoordinate();
        transform.transform(new ProjCoordinate(epsg3857.getX(),epsg3857.getY()),ans);
        return new LngLatLike(ans.x,ans.y);
    }
}
