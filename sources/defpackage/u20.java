package defpackage;

import defpackage.qw5;
import java.util.Arrays;
/* compiled from: AutoValue_LogEvent.java */
/* renamed from: u20  reason: default package */
/* loaded from: classes2.dex */
final class u20 extends qw5 {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final zv6 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_LogEvent.java */
    /* renamed from: u20$b */
    /* loaded from: classes2.dex */
    public static final class b extends qw5.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private zv6 g;

        @Override // defpackage.qw5.a
        public qw5 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new u20(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.qw5.a
        public qw5.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // defpackage.qw5.a
        public qw5.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.qw5.a
        public qw5.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.qw5.a
        public qw5.a e(zv6 zv6Var) {
            this.g = zv6Var;
            return this;
        }

        @Override // defpackage.qw5.a
        qw5.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // defpackage.qw5.a
        qw5.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.qw5.a
        public qw5.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.qw5
    public Integer b() {
        return this.b;
    }

    @Override // defpackage.qw5
    public long c() {
        return this.a;
    }

    @Override // defpackage.qw5
    public long d() {
        return this.c;
    }

    @Override // defpackage.qw5
    public zv6 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qw5)) {
            return false;
        }
        qw5 qw5Var = (qw5) obj;
        if (this.a == qw5Var.c() && ((num = this.b) != null ? num.equals(qw5Var.b()) : qw5Var.b() == null) && this.c == qw5Var.d()) {
            byte[] bArr = this.d;
            if (qw5Var instanceof u20) {
                f = ((u20) qw5Var).d;
            } else {
                f = qw5Var.f();
            }
            if (Arrays.equals(bArr, f) && ((str = this.e) != null ? str.equals(qw5Var.g()) : qw5Var.g() == null) && this.f == qw5Var.h()) {
                zv6 zv6Var = this.g;
                if (zv6Var == null) {
                    if (qw5Var.e() == null) {
                        return true;
                    }
                } else if (zv6Var.equals(qw5Var.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qw5
    public byte[] f() {
        return this.d;
    }

    @Override // defpackage.qw5
    public String g() {
        return this.e;
    }

    @Override // defpackage.qw5
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.c;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.f;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        zv6 zv6Var = this.g;
        if (zv6Var != null) {
            i2 = zv6Var.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    private u20(long j, Integer num, long j2, byte[] bArr, String str, long j3, zv6 zv6Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = zv6Var;
    }
}
