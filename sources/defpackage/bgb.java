package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.LinkedHashSet;
/* compiled from: TileStates.java */
/* renamed from: bgb  reason: default package */
/* loaded from: classes3.dex */
public class bgb {
    private Collection<Runnable> a = new LinkedHashSet();
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public void a() {
        this.b = true;
        for (Runnable runnable : this.a) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b(Drawable drawable) {
        this.c++;
        if (drawable == null) {
            this.g++;
            return;
        }
        int a = jn3.a(drawable);
        if (a != -4) {
            if (a != -3) {
                if (a != -2) {
                    if (a == -1) {
                        this.d++;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown state: " + a);
                }
                this.e++;
                return;
            }
            this.f++;
            return;
        }
        this.g++;
    }

    public void c() {
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public String toString() {
        if (this.b) {
            return "TileStates: " + this.c + " = " + this.d + "(U) + " + this.e + "(E) + " + this.f + "(S) + " + this.g + "(N)";
        }
        return "TileStates";
    }
}
