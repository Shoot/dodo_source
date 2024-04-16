package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class y {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y a(long j) {
        return new y(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y b(long j, long j2) {
        return new y(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y c(Long l, Long l2, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new y(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        gh8.f(str);
        gh8.f(str2);
        gh8.a(j >= 0);
        gh8.a(j2 >= 0);
        gh8.a(j3 >= 0);
        gh8.a(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }
}
