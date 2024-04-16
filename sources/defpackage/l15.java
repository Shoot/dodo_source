package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import org.osmdroid.views.MapView;
/* compiled from: InfoWindow.java */
/* renamed from: l15  reason: default package */
/* loaded from: classes3.dex */
public abstract class l15 {
    protected View a;
    protected boolean b;
    protected MapView c;

    public void a() {
        if (this.b) {
            this.b = false;
            ((ViewGroup) this.a.getParent()).removeView(this.a);
            b();
        }
    }

    public abstract void b();

    public void c() {
        a();
        View view = this.a;
        if (view != null) {
            view.setTag(null);
        }
        this.a = null;
        this.c = null;
        if (dq1.a().v()) {
            Log.d("OsmDroid", "Marked detached");
        }
    }
}
