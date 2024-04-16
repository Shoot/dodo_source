package defpackage;

import org.osmdroid.views.MapView;
/* compiled from: ScrollEvent.java */
/* renamed from: ox9  reason: default package */
/* loaded from: classes3.dex */
public class ox9 {
    protected MapView a;
    protected int b;
    protected int c;

    public ox9(MapView mapView, int i, int i2) {
        this.a = mapView;
        this.b = i;
        this.c = i2;
    }

    public String toString() {
        return "ScrollEvent [source=" + this.a + ", x=" + this.b + ", y=" + this.c + "]";
    }
}
