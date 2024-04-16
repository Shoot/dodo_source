package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DevelopmentPlatformProvider.java */
/* renamed from: p13  reason: default package */
/* loaded from: classes2.dex */
public class p13 {
    private final Context a;
    private b b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DevelopmentPlatformProvider.java */
    /* renamed from: p13$b */
    /* loaded from: classes2.dex */
    public class b {
        private final String a;
        private final String b;

        private b() {
            int p = ek1.p(p13.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p != 0) {
                this.a = "Unity";
                String string = p13.this.a.getResources().getString(p);
                this.b = string;
                rx5 f = rx5.f();
                f.i("Unity Editor version is: " + string);
            } else if (!p13.this.c("flutter_assets/NOTICES.Z")) {
                this.a = null;
                this.b = null;
            } else {
                this.a = "Flutter";
                this.b = null;
                rx5.f().i("Development platform is: Flutter");
            }
        }
    }

    public p13(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }
}
