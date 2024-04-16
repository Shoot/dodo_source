package defpackage;

import defpackage.wk3;
import java.util.Map;
/* compiled from: AutoValue_EventInternal.java */
/* renamed from: o20  reason: default package */
/* loaded from: classes2.dex */
final class o20 extends wk3 {
    private final String a;
    private final Integer b;
    private final zg3 c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: o20$b */
    /* loaded from: classes2.dex */
    public static final class b extends wk3.a {
        private String a;
        private Integer b;
        private zg3 c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        @Override // defpackage.wk3.a
        public wk3 d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new o20(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.wk3.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.wk3.a
        public wk3.a f(Map<String, String> map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // defpackage.wk3.a
        public wk3.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // defpackage.wk3.a
        public wk3.a h(zg3 zg3Var) {
            if (zg3Var != null) {
                this.c = zg3Var;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // defpackage.wk3.a
        public wk3.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.wk3.a
        public wk3.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // defpackage.wk3.a
        public wk3.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wk3
    public Map<String, String> c() {
        return this.f;
    }

    @Override // defpackage.wk3
    public Integer d() {
        return this.b;
    }

    @Override // defpackage.wk3
    public zg3 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wk3)) {
            return false;
        }
        wk3 wk3Var = (wk3) obj;
        if (this.a.equals(wk3Var.j()) && ((num = this.b) != null ? num.equals(wk3Var.d()) : wk3Var.d() == null) && this.c.equals(wk3Var.e()) && this.d == wk3Var.f() && this.e == wk3Var.k() && this.f.equals(wk3Var.c())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wk3
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.wk3
    public String j() {
        return this.a;
    }

    @Override // defpackage.wk3
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    private o20(String str, Integer num, zg3 zg3Var, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = zg3Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
