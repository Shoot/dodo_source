package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class ob extends ua {
    private String d;
    private Set<Integer> e;
    private Map<Integer, pb> f;
    private Long g;
    private Long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ob(va vaVar) {
        super(vaVar);
    }

    private final pb x(Integer num) {
        if (this.f.containsKey(num)) {
            return this.f.get(num);
        }
        pb pbVar = new pb(this, this.d);
        this.f.put(num, pbVar);
        return pbVar;
    }

    private final boolean z(int i, int i2) {
        pb pbVar = this.f.get(Integer.valueOf(i));
        if (pbVar == null) {
            return false;
        }
        return pb.b(pbVar).get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0617, code lost:
        r7 = n().K();
        r9 = com.google.android.gms.measurement.internal.k4.u(r52.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0629, code lost:
        if (r8.Q() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x062b, code lost:
        r8 = java.lang.Integer.valueOf(r8.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0634, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0635, code lost:
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.b0> y(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.d0> r54, java.util.List<com.google.android.gms.internal.measurement.m0> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ob.y(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
