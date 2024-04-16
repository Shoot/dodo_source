package defpackage;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: gpc  reason: default package */
/* loaded from: classes2.dex */
public final class gpc implements bpc, Iterable<bpc> {
    private final String a;

    public gpc(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // defpackage.bpc
    public final bpc c() {
        return new gpc(this.a);
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpc)) {
            return false;
        }
        return this.a.equals(((gpc) obj).a);
    }

    @Override // defpackage.bpc
    public final Double f() {
        if (this.a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.bpc
    public final String g() {
        return this.a;
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return new opc(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<bpc> iterator() {
        return new lpc(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    @Override // defpackage.bpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bpc t(java.lang.String r23, defpackage.xzc r24, java.util.List<defpackage.bpc> r25) {
        /*
            Method dump skipped, instructions count: 1932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpc.t(java.lang.String, xzc, java.util.List):bpc");
    }

    public final String toString() {
        String str = this.a;
        return "\"" + str + "\"";
    }
}
