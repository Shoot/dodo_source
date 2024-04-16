package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* renamed from: t10  reason: default package */
/* loaded from: classes2.dex */
final class t10 extends j12.e.a {
    private final String a;
    private final String b;
    private final String c;
    private final j12.e.a.b d;
    private final String e;
    private final String f;
    private final String g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* renamed from: t10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.a.AbstractC0375a {
        private String a;
        private String b;
        private String c;
        private j12.e.a.b d;
        private String e;
        private String f;
        private String g;

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new t10(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a b(String str) {
            this.f = str;
            return this;
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a c(String str) {
            this.g = str;
            return this;
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a d(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a f(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.j12.e.a.AbstractC0375a
        public j12.e.a.AbstractC0375a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // defpackage.j12.e.a
    public String b() {
        return this.f;
    }

    @Override // defpackage.j12.e.a
    public String c() {
        return this.g;
    }

    @Override // defpackage.j12.e.a
    public String d() {
        return this.c;
    }

    @Override // defpackage.j12.e.a
    @NonNull
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        j12.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.a)) {
            return false;
        }
        j12.e.a aVar = (j12.e.a) obj;
        if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j12.e.a
    public String f() {
        return this.e;
    }

    @Override // defpackage.j12.e.a
    public j12.e.a.b g() {
        return this.d;
    }

    @Override // defpackage.j12.e.a
    @NonNull
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        j12.e.a.b bVar = this.d;
        if (bVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.g + "}";
    }

    private t10(String str, String str2, String str3, j12.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
