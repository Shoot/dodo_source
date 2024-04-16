package defpackage;

import defpackage.mwa;
/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* renamed from: k30  reason: default package */
/* loaded from: classes2.dex */
final class k30 extends mwa.b {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k30(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = z;
            this.g = i3;
            if (str2 != null) {
                this.h = str2;
                if (str3 != null) {
                    this.i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // defpackage.mwa.b
    public int a() {
        return this.a;
    }

    @Override // defpackage.mwa.b
    public int b() {
        return this.c;
    }

    @Override // defpackage.mwa.b
    public long d() {
        return this.e;
    }

    @Override // defpackage.mwa.b
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwa.b)) {
            return false;
        }
        mwa.b bVar = (mwa.b) obj;
        if (this.a == bVar.a() && this.b.equals(bVar.g()) && this.c == bVar.b() && this.d == bVar.j() && this.e == bVar.d() && this.f == bVar.e() && this.g == bVar.i() && this.h.equals(bVar.f()) && this.i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mwa.b
    public String f() {
        return this.h;
    }

    @Override // defpackage.mwa.b
    public String g() {
        return this.b;
    }

    @Override // defpackage.mwa.b
    public String h() {
        return this.i;
    }

    public int hashCode() {
        int i;
        long j = this.d;
        long j2 = this.e;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.mwa.b
    public int i() {
        return this.g;
    }

    @Override // defpackage.mwa.b
    public long j() {
        return this.d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.a + ", model=" + this.b + ", availableProcessors=" + this.c + ", totalRam=" + this.d + ", diskSpace=" + this.e + ", isEmulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}
