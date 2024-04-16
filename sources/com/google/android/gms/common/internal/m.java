package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class m {
    private Object a;
    private boolean b = false;
    final /* synthetic */ b c;

    public m(b bVar, Object obj) {
        this.c = bVar;
        this.a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.r;
        synchronized (arrayList) {
            arrayList2 = this.c.r;
            arrayList2.remove(this);
        }
    }
}
