package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class h3 implements w2 {
    private final h3d a;
    private final String b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3(h3d h3dVar, String str, Object[] objArr) {
        this.a = h3dVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final w3d b() {
        int i = this.d;
        if ((i & 1) != 0) {
            return w3d.PROTO2;
        }
        if ((i & 4) == 4) {
            return w3d.EDITIONS;
        }
        return w3d.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final boolean c() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] d() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final h3d zza() {
        return this.a;
    }
}
