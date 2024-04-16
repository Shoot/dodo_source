package defpackage;

import org.osmdroid.views.MapView;
/* compiled from: ZoomEvent.java */
/* renamed from: edc  reason: default package */
/* loaded from: classes3.dex */
public class edc {
    protected MapView a;
    protected double b;

    public edc(MapView mapView, double d) {
        this.a = mapView;
        this.b = d;
    }

    public String toString() {
        return "ZoomEvent [source=" + this.a + ", zoomLevel=" + this.b + "]";
    }
}
