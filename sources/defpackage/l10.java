package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport.java */
/* renamed from: l10  reason: default package */
/* loaded from: classes2.dex */
final class l10 extends j12 {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final j12.e j;
    private final j12.d k;
    private final j12.a l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: l10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.b {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private j12.e i;
        private j12.d j;
        private j12.a k;

        @Override // defpackage.j12.b
        public j12 a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.g == null) {
                str = str + " buildVersion";
            }
            if (this.h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new l10(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.b
        public j12.b b(j12.a aVar) {
            this.k = aVar;
            return this;
        }

        @Override // defpackage.j12.b
        public j12.b c(String str) {
            this.f = str;
            return this;
        }

        @Override // defpackage.j12.b
        public j12.b d(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // defpackage.j12.b
        public j12.b e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // defpackage.j12.b
        public j12.b f(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.j12.b
        public j12.b g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // defpackage.j12.b
        public j12.b h(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // defpackage.j12.b
        public j12.b i(j12.d dVar) {
            this.j = dVar;
            return this;
        }

        @Override // defpackage.j12.b
        public j12.b j(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.b
        public j12.b k(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // defpackage.j12.b
        public j12.b l(j12.e eVar) {
            this.i = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(j12 j12Var) {
            this.a = j12Var.l();
            this.b = j12Var.h();
            this.c = Integer.valueOf(j12Var.k());
            this.d = j12Var.i();
            this.e = j12Var.g();
            this.f = j12Var.d();
            this.g = j12Var.e();
            this.h = j12Var.f();
            this.i = j12Var.m();
            this.j = j12Var.j();
            this.k = j12Var.c();
        }
    }

    @Override // defpackage.j12
    public j12.a c() {
        return this.l;
    }

    @Override // defpackage.j12
    public String d() {
        return this.g;
    }

    @Override // defpackage.j12
    @NonNull
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        j12.e eVar;
        j12.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12)) {
            return false;
        }
        j12 j12Var = (j12) obj;
        if (this.b.equals(j12Var.l()) && this.c.equals(j12Var.h()) && this.d == j12Var.k() && this.e.equals(j12Var.i()) && ((str = this.f) != null ? str.equals(j12Var.g()) : j12Var.g() == null) && ((str2 = this.g) != null ? str2.equals(j12Var.d()) : j12Var.d() == null) && this.h.equals(j12Var.e()) && this.i.equals(j12Var.f()) && ((eVar = this.j) != null ? eVar.equals(j12Var.m()) : j12Var.m() == null) && ((dVar = this.k) != null ? dVar.equals(j12Var.j()) : j12Var.j() == null)) {
            j12.a aVar = this.l;
            if (aVar == null) {
                if (j12Var.c() == null) {
                    return true;
                }
            } else if (aVar.equals(j12Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j12
    @NonNull
    public String f() {
        return this.i;
    }

    @Override // defpackage.j12
    public String g() {
        return this.f;
    }

    @Override // defpackage.j12
    @NonNull
    public String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i2 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        j12.e eVar = this.j;
        if (eVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = eVar.hashCode();
        }
        int i3 = (hashCode6 ^ hashCode3) * 1000003;
        j12.d dVar = this.k;
        if (dVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = dVar.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        j12.a aVar = this.l;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i4 ^ i;
    }

    @Override // defpackage.j12
    @NonNull
    public String i() {
        return this.e;
    }

    @Override // defpackage.j12
    public j12.d j() {
        return this.k;
    }

    @Override // defpackage.j12
    public int k() {
        return this.d;
    }

    @Override // defpackage.j12
    @NonNull
    public String l() {
        return this.b;
    }

    @Override // defpackage.j12
    public j12.e m() {
        return this.j;
    }

    @Override // defpackage.j12
    protected j12.b n() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }

    private l10(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, j12.e eVar, j12.d dVar, j12.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = eVar;
        this.k = dVar;
        this.l = aVar;
    }
}
