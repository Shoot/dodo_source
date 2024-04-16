package defpackage;

import defpackage.w45;
/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: s20  reason: default package */
/* loaded from: classes2.dex */
final class s20 extends w45 {
    private final String a;
    private final String b;
    private final String c;
    private final rib d;
    private final w45.b e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: s20$b */
    /* loaded from: classes2.dex */
    static final class b extends w45.a {
        private String a;
        private String b;
        private String c;
        private rib d;
        private w45.b e;

        @Override // defpackage.w45.a
        public w45 a() {
            return new s20(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.w45.a
        public w45.a b(rib ribVar) {
            this.d = ribVar;
            return this;
        }

        @Override // defpackage.w45.a
        public w45.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.w45.a
        public w45.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.w45.a
        public w45.a e(w45.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // defpackage.w45.a
        public w45.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // defpackage.w45
    public rib b() {
        return this.d;
    }

    @Override // defpackage.w45
    public String c() {
        return this.b;
    }

    @Override // defpackage.w45
    public String d() {
        return this.c;
    }

    @Override // defpackage.w45
    public w45.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w45)) {
            return false;
        }
        w45 w45Var = (w45) obj;
        String str = this.a;
        if (str != null ? str.equals(w45Var.f()) : w45Var.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(w45Var.c()) : w45Var.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(w45Var.d()) : w45Var.d() == null) {
                    rib ribVar = this.d;
                    if (ribVar != null ? ribVar.equals(w45Var.b()) : w45Var.b() == null) {
                        w45.b bVar = this.e;
                        if (bVar == null) {
                            if (w45Var.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(w45Var.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.w45
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        rib ribVar = this.d;
        if (ribVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ribVar.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        w45.b bVar = this.e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i5 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    private s20(String str, String str2, String str3, rib ribVar, w45.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ribVar;
        this.e = bVar;
    }
}
