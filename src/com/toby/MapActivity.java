/*
 * Copyright 2011 MITIAN Technology, Co., Ltd. All rights reserved.
 */
package com.toby;

import java.util.List;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

/**
 * MapActivity.java
 * 
 * @author baojun
 */
public class MapActivity extends com.google.android.maps.MapActivity {
    private Button showDialogButton = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        MapView mapView = (MapView) findViewById(R.id.map);

        mapView.setBuiltInZoomControls(true);

        List<Overlay> mapOverlays = mapView.getOverlays();
        Drawable drawable = getResources().getDrawable(R.drawable.androidmarker);
        HelloItemizedOverlay itemizedoverlay = new HelloItemizedOverlay(drawable, this);

        Double x = 118.8159692287445 * 1E6;
        Double y = 32.023413511852446 * 1E6;
        GeoPoint point = new GeoPoint(y.intValue(), x.intValue());
        OverlayItem overlayitem = new OverlayItem(point, "Hola, Mundo!", "I'm in Mexico City!");

        itemizedoverlay.addOverlay(overlayitem);
        mapOverlays.add(itemizedoverlay);
        MapController controller = mapView.getController();
        controller.animateTo(point);
        controller.setZoom(14);
        final Dialog showDialog = new Dialog(this);
        showDialogButton = (Button) findViewById(R.id.showDialog);
        showDialogButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                showDialog.setContentView(R.layout.custom_dialog);
                showDialog.setTitle("Custom Dialog");
                showDialog.show();
            }
        });

    }

    /*
     * (non-Javadoc)
     * @see com.google.android.maps.MapActivity#isRouteDisplayed()
     */
    @Override
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }

}
