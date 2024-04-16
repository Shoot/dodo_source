package defpackage;

import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.views.MapView;
/* compiled from: MapViewRepository.java */
/* renamed from: u76  reason: default package */
/* loaded from: classes3.dex */
public class u76 {
    private MapView a;
    private Drawable b;
    private final Set<l15> c = new HashSet();

    public u76(MapView mapView) {
        this.a = mapView;
    }

    public void a() {
        synchronized (this.c) {
            try {
                for (l15 l15Var : this.c) {
                    l15Var.c();
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }
}
