package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: amc  reason: default package */
/* loaded from: classes2.dex */
final class amc implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ qqc c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public amc(qqc qqcVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = qqcVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        qqc qqcVar = this.c;
        i = qqcVar.b;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            bundle = qqcVar.c;
            if (bundle != null) {
                bundle3 = qqcVar.c;
                bundle2 = bundle3.getBundle(this.b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.c.b;
        if (i2 >= 2) {
            this.a.j();
        }
        i3 = this.c.b;
        if (i3 >= 3) {
            this.a.h();
        }
        i4 = this.c.b;
        if (i4 >= 4) {
            this.a.k();
        }
        i5 = this.c.b;
        if (i5 >= 5) {
            this.a.g();
        }
    }
}
