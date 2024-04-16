package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: kz  reason: default package */
/* loaded from: classes2.dex */
public final class kz {
    public static final a.g<a9d> a;
    public static final a.g<zwc> b;
    private static final a.AbstractC0215a<a9d, a> c;
    private static final a.AbstractC0215a<zwc, GoogleSignInOptions> d;
    @Deprecated
    public static final com.google.android.gms.common.api.a<nz> e;
    public static final com.google.android.gms.common.api.a<a> f;
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> g;
    @Deprecated
    public static final ds8 h;
    public static final q22 i;
    public static final ph4 j;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    @Deprecated
    /* renamed from: kz$a */
    /* loaded from: classes2.dex */
    public static class a implements a.d {
        public static final a d = new C0420a().b();
        private final String a;
        private final boolean b;
        private final String c;

        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        @Deprecated
        /* renamed from: kz$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0420a {
            protected String a;
            protected Boolean b;
            protected String c;

            public C0420a() {
                this.b = Boolean.FALSE;
            }

            public C0420a a(String str) {
                this.c = str;
                return this;
            }

            public a b() {
                return new a(this);
            }

            public C0420a(a aVar) {
                this.b = Boolean.FALSE;
                this.a = aVar.a;
                this.b = Boolean.valueOf(aVar.b);
                this.c = aVar.c;
            }
        }

        public a(C0420a c0420a) {
            this.a = c0420a.a;
            this.b = c0420a.b.booleanValue();
            this.c = c0420a.c;
        }

        public final String a() {
            return this.c;
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.a);
            bundle.putBoolean("force_save_dialog", this.b);
            bundle.putString("log_session_id", this.c);
            return bundle;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (m57.a(this.a, aVar.a) && this.b == aVar.b && m57.a(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return m57.b(this.a, Boolean.valueOf(this.b), this.c);
        }
    }

    static {
        a.g<a9d> gVar = new a.g<>();
        a = gVar;
        a.g<zwc> gVar2 = new a.g<>();
        b = gVar2;
        zsc zscVar = new zsc();
        c = zscVar;
        vuc vucVar = new vuc();
        d = vucVar;
        e = mz.c;
        f = new com.google.android.gms.common.api.a<>("Auth.CREDENTIALS_API", zscVar, gVar);
        g = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", vucVar, gVar2);
        h = mz.d;
        i = new z1d();
        j = new ayc();
    }
}
