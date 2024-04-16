package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* compiled from: Trackers.java */
/* renamed from: ckb  reason: default package */
/* loaded from: classes.dex */
public class ckb {
    private static ckb e;
    private y90 a;
    private aa0 b;
    private nw6 c;
    private sxa d;

    private ckb(@NonNull Context context, @NonNull d7b d7bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new y90(applicationContext, d7bVar);
        this.b = new aa0(applicationContext, d7bVar);
        this.c = new nw6(applicationContext, d7bVar);
        this.d = new sxa(applicationContext, d7bVar);
    }

    @NonNull
    public static synchronized ckb c(Context context, d7b d7bVar) {
        ckb ckbVar;
        synchronized (ckb.class) {
            try {
                if (e == null) {
                    e = new ckb(context, d7bVar);
                }
                ckbVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ckbVar;
    }

    @NonNull
    public y90 a() {
        return this.a;
    }

    @NonNull
    public aa0 b() {
        return this.b;
    }

    @NonNull
    public nw6 d() {
        return this.c;
    }

    @NonNull
    public sxa e() {
        return this.d;
    }
}
