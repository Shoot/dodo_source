package defpackage;

import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsFileMarker.java */
/* renamed from: b12  reason: default package */
/* loaded from: classes2.dex */
public class b12 {
    private final String a;
    private final hu3 b;

    public b12(String str, hu3 hu3Var) {
        this.a = str;
        this.b = hu3Var;
    }

    private File b() {
        return this.b.e(this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            rx5 f = rx5.f();
            f.e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
