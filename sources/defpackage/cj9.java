package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: RequestTracker.java */
/* renamed from: cj9  reason: default package */
/* loaded from: classes.dex */
public class cj9 {
    private final Set<ii9> a = Collections.newSetFromMap(new WeakHashMap());
    private final Set<ii9> b = new HashSet();
    private boolean c;

    public boolean a(ii9 ii9Var) {
        boolean z = true;
        if (ii9Var == null) {
            return true;
        }
        boolean remove = this.a.remove(ii9Var);
        if (!this.b.remove(ii9Var) && !remove) {
            z = false;
        }
        if (z) {
            ii9Var.clear();
        }
        return z;
    }

    public void b() {
        for (ii9 ii9Var : vub.k(this.a)) {
            a(ii9Var);
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (ii9 ii9Var : vub.k(this.a)) {
            if (ii9Var.isRunning() || ii9Var.g()) {
                ii9Var.clear();
                this.b.add(ii9Var);
            }
        }
    }

    public void d() {
        this.c = true;
        for (ii9 ii9Var : vub.k(this.a)) {
            if (ii9Var.isRunning()) {
                ii9Var.pause();
                this.b.add(ii9Var);
            }
        }
    }

    public void e() {
        for (ii9 ii9Var : vub.k(this.a)) {
            if (!ii9Var.g() && !ii9Var.e()) {
                ii9Var.clear();
                if (!this.c) {
                    ii9Var.k();
                } else {
                    this.b.add(ii9Var);
                }
            }
        }
    }

    public void f() {
        this.c = false;
        for (ii9 ii9Var : vub.k(this.a)) {
            if (!ii9Var.g() && !ii9Var.isRunning()) {
                ii9Var.k();
            }
        }
        this.b.clear();
    }

    public void g(@NonNull ii9 ii9Var) {
        this.a.add(ii9Var);
        if (!this.c) {
            ii9Var.k();
            return;
        }
        ii9Var.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(ii9Var);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
