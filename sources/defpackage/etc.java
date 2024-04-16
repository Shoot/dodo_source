package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: etc  reason: default package */
/* loaded from: classes2.dex */
final class etc implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ yuc c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public etc(yuc yucVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = yucVar;
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
        yuc yucVar = this.c;
        i = yucVar.c;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            bundle = yucVar.d;
            if (bundle != null) {
                bundle3 = yucVar.d;
                bundle2 = bundle3.getBundle(this.b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.c.c;
        if (i2 >= 2) {
            this.a.j();
        }
        i3 = this.c.c;
        if (i3 >= 3) {
            this.a.h();
        }
        i4 = this.c.c;
        if (i4 >= 4) {
            this.a.k();
        }
        i5 = this.c.c;
        if (i5 >= 5) {
            this.a.g();
        }
    }
}
