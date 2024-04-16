package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
/* loaded from: classes3.dex */
public class t extends n {
    private byte[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(byte[] bArr) {
        if (bArr.length >= 2) {
            this.a = bArr;
            if (G(0) && G(1)) {
                return;
            }
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    private boolean G(int i) {
        byte b;
        byte[] bArr = this.a;
        if (bArr.length > i && (b = bArr[i]) >= 48 && b <= 57) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    public Date D() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return p1.a(simpleDateFormat.parse(E()));
    }

    public String E() {
        StringBuilder sb;
        String str;
        String F = F();
        if (F.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        sb.append(str);
        sb.append(F);
        return sb.toString();
    }

    public String F() {
        StringBuilder sb;
        String substring;
        String b = a0b.b(this.a);
        if (b.indexOf(45) < 0 && b.indexOf(43) < 0) {
            if (b.length() == 11) {
                sb = new StringBuilder();
                sb.append(b.substring(0, 10));
                substring = "00GMT+00:00";
            } else {
                sb = new StringBuilder();
                sb.append(b.substring(0, 12));
                substring = "GMT+00:00";
            }
        } else {
            int indexOf = b.indexOf(45);
            if (indexOf < 0) {
                indexOf = b.indexOf(43);
            }
            if (indexOf == b.length() - 3) {
                b = b + "00";
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(b.substring(0, 10));
                sb.append("00GMT");
                sb.append(b.substring(10, 13));
                sb.append(":");
                substring = b.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(b.substring(0, 12));
                sb.append("GMT");
                sb.append(b.substring(12, 15));
                sb.append(":");
                substring = b.substring(15, 17);
            }
        }
        sb.append(substring);
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof t)) {
            return false;
        }
        return tr.c(this.a, ((t) nVar).a);
    }

    public String toString() {
        return a0b.b(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 23, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        int length = this.a.length;
        return v1.a(length) + 1 + length;
    }
}
