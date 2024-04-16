package defpackage;

import defpackage.tw5;
import java.util.List;
/* compiled from: AutoValue_LogRequest.java */
/* renamed from: v20  reason: default package */
/* loaded from: classes2.dex */
final class v20 extends tw5 {
    private final long a;
    private final long b;
    private final l91 c;
    private final Integer d;
    private final String e;
    private final List<qw5> f;
    private final ru8 g;

    /* compiled from: AutoValue_LogRequest.java */
    /* renamed from: v20$b */
    /* loaded from: classes2.dex */
    static final class b extends tw5.a {
        private Long a;
        private Long b;
        private l91 c;
        private Integer d;
        private String e;
        private List<qw5> f;
        private ru8 g;

        @Override // defpackage.tw5.a
        public tw5 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new v20(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.tw5.a
        public tw5.a b(l91 l91Var) {
            this.c = l91Var;
            return this;
        }

        @Override // defpackage.tw5.a
        public tw5.a c(List<qw5> list) {
            this.f = list;
            return this;
        }

        @Override // defpackage.tw5.a
        tw5.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // defpackage.tw5.a
        tw5.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.tw5.a
        public tw5.a f(ru8 ru8Var) {
            this.g = ru8Var;
            return this;
        }

        @Override // defpackage.tw5.a
        public tw5.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.tw5.a
        public tw5.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.tw5
    public l91 b() {
        return this.c;
    }

    @Override // defpackage.tw5
    public List<qw5> c() {
        return this.f;
    }

    @Override // defpackage.tw5
    public Integer d() {
        return this.d;
    }

    @Override // defpackage.tw5
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        l91 l91Var;
        Integer num;
        String str;
        List<qw5> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tw5)) {
            return false;
        }
        tw5 tw5Var = (tw5) obj;
        if (this.a == tw5Var.g() && this.b == tw5Var.h() && ((l91Var = this.c) != null ? l91Var.equals(tw5Var.b()) : tw5Var.b() == null) && ((num = this.d) != null ? num.equals(tw5Var.d()) : tw5Var.d() == null) && ((str = this.e) != null ? str.equals(tw5Var.e()) : tw5Var.e() == null) && ((list = this.f) != null ? list.equals(tw5Var.c()) : tw5Var.c() == null)) {
            ru8 ru8Var = this.g;
            if (ru8Var == null) {
                if (tw5Var.f() == null) {
                    return true;
                }
            } else if (ru8Var.equals(tw5Var.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tw5
    public ru8 f() {
        return this.g;
    }

    @Override // defpackage.tw5
    public long g() {
        return this.a;
    }

    @Override // defpackage.tw5
    public long h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        l91 l91Var = this.c;
        int i2 = 0;
        if (l91Var == null) {
            hashCode = 0;
        } else {
            hashCode = l91Var.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List<qw5> list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        ru8 ru8Var = this.g;
        if (ru8Var != null) {
            i2 = ru8Var.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    private v20(long j, long j2, l91 l91Var, Integer num, String str, List<qw5> list, ru8 ru8Var) {
        this.a = j;
        this.b = j2;
        this.c = l91Var;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = ru8Var;
    }
}
