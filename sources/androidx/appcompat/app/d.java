package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import defpackage.x4;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class d {
    private static int a = -100;
    private static final qr<WeakReference<d>> b = new qr<>();
    private static final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(@NonNull d dVar) {
        synchronized (c) {
            B(dVar);
        }
    }

    private static void B(@NonNull d dVar) {
        synchronized (c) {
            try {
                Iterator<WeakReference<d>> it = b.iterator();
                while (it.hasNext()) {
                    d dVar2 = it.next().get();
                    if (dVar2 == dVar || dVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void D(boolean z) {
        g0.c(z);
    }

    public static void H(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (a != i) {
            a = i;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull d dVar) {
        synchronized (c) {
            B(dVar);
            b.add(new WeakReference<>(dVar));
        }
    }

    private static void f() {
        synchronized (c) {
            try {
                Iterator<WeakReference<d>> it = b.iterator();
                while (it.hasNext()) {
                    d dVar = it.next().get();
                    if (dVar != null) {
                        dVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static d i(@NonNull Activity activity, cn cnVar) {
        return new e(activity, cnVar);
    }

    @NonNull
    public static d j(@NonNull Dialog dialog, cn cnVar) {
        return new e(dialog, cnVar);
    }

    public static int l() {
        return a;
    }

    public abstract boolean C(int i);

    public abstract void E(int i);

    public abstract void F(View view);

    public abstract void G(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void I(Toolbar toolbar);

    public abstract void K(CharSequence charSequence);

    public abstract x4 L(@NonNull x4.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @NonNull
    public Context h(@NonNull Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i);

    public abstract u4 m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract a p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();

    public void J(int i) {
    }

    @Deprecated
    public void g(Context context) {
    }
}
