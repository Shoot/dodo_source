package defpackage;

import defpackage.fl3;
/* compiled from: AutoValue_EventStoreConfig.java */
/* renamed from: p20  reason: default package */
/* loaded from: classes2.dex */
final class p20 extends fl3 {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventStoreConfig.java */
    /* renamed from: p20$b */
    /* loaded from: classes2.dex */
    public static final class b extends fl3.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override // defpackage.fl3.a
        fl3 a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new p20(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.fl3.a
        fl3.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.fl3.a
        fl3.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.fl3.a
        fl3.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.fl3.a
        fl3.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.fl3.a
        fl3.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.fl3
    public int b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.fl3
    public long c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.fl3
    public int d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.fl3
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        if (this.b == fl3Var.f() && this.c == fl3Var.d() && this.d == fl3Var.b() && this.e == fl3Var.c() && this.f == fl3Var.e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.fl3
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return this.f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    private p20(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
