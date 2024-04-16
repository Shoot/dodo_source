package defpackage;

import defpackage.wf;
/* compiled from: AutoValue_AndroidClientInfo.java */
/* renamed from: f10  reason: default package */
/* loaded from: classes2.dex */
final class f10 extends wf {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    /* compiled from: AutoValue_AndroidClientInfo.java */
    /* renamed from: f10$b */
    /* loaded from: classes2.dex */
    static final class b extends wf.a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        @Override // defpackage.wf.a
        public wf a() {
            return new f10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // defpackage.wf.a
        public wf.a b(String str) {
            this.l = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a c(String str) {
            this.j = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a d(String str) {
            this.d = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a e(String str) {
            this.h = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a f(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a g(String str) {
            this.i = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a h(String str) {
            this.g = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a i(String str) {
            this.k = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a j(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a k(String str) {
            this.f = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a l(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.wf.a
        public wf.a m(Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // defpackage.wf
    public String b() {
        return this.l;
    }

    @Override // defpackage.wf
    public String c() {
        return this.j;
    }

    @Override // defpackage.wf
    public String d() {
        return this.d;
    }

    @Override // defpackage.wf
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        Integer num = this.a;
        if (num != null ? num.equals(wfVar.m()) : wfVar.m() == null) {
            String str = this.b;
            if (str != null ? str.equals(wfVar.j()) : wfVar.j() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(wfVar.f()) : wfVar.f() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(wfVar.d()) : wfVar.d() == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(wfVar.l()) : wfVar.l() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(wfVar.k()) : wfVar.k() == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(wfVar.h()) : wfVar.h() == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(wfVar.e()) : wfVar.e() == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(wfVar.g()) : wfVar.g() == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(wfVar.c()) : wfVar.c() == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(wfVar.i()) : wfVar.i() == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (wfVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(wfVar.b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.wf
    public String f() {
        return this.c;
    }

    @Override // defpackage.wf
    public String g() {
        return this.i;
    }

    @Override // defpackage.wf
    public String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str6 = this.g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str8 = this.i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        String str10 = this.k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i12 ^ i;
    }

    @Override // defpackage.wf
    public String i() {
        return this.k;
    }

    @Override // defpackage.wf
    public String j() {
        return this.b;
    }

    @Override // defpackage.wf
    public String k() {
        return this.f;
    }

    @Override // defpackage.wf
    public String l() {
        return this.e;
    }

    @Override // defpackage.wf
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }

    private f10(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}
