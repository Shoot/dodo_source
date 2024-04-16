package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.slf4j.Marker;
/* loaded from: classes3.dex */
public class g extends n {
    protected byte[] a;

    public g(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", p1.c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.a = a0b.e(simpleDateFormat.format(date));
    }

    private SimpleDateFormat D() {
        SimpleDateFormat simpleDateFormat;
        if (J()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
        } else if (P()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        } else if (O()) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmz");
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHz");
        }
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String E(String str) {
        String str2;
        int i;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = Marker.ANY_NON_NULL_MARKER;
        }
        int i2 = rawOffset / 3600000;
        int i3 = (rawOffset - (3600000 * i2)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (J()) {
                    str = R(str);
                }
                SimpleDateFormat D = D();
                if (timeZone.inDaylightTime(D.parse(str + "GMT" + str2 + F(i2) + ":" + F(i3)))) {
                    if (str2.equals(Marker.ANY_NON_NULL_MARKER)) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    i2 += i;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + F(i2) + ":" + F(i3);
    }

    private String F(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return Integer.toString(i);
    }

    public static g H(Object obj) {
        if (obj != null && !(obj instanceof g)) {
            if (obj instanceof byte[]) {
                try {
                    return (g) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (g) obj;
    }

    private boolean Q(int i) {
        byte b;
        byte[] bArr = this.a;
        if (bArr.length > i && (b = bArr[i]) >= 48 && b <= 57) {
            return true;
        }
        return false;
    }

    private String R(String str) {
        String str2;
        StringBuilder sb;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 2) {
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        } else {
            return str;
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n B() {
        return new n0(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n C() {
        return new n0(this.a);
    }

    public Date G() throws ParseException {
        SimpleDateFormat D;
        SimpleDateFormat simpleDateFormat;
        String b = a0b.b(this.a);
        if (b.endsWith("Z")) {
            if (J()) {
                D = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else if (P()) {
                D = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            } else if (O()) {
                D = new SimpleDateFormat("yyyyMMddHHmm'Z'");
            } else {
                D = new SimpleDateFormat("yyyyMMddHH'Z'");
            }
            D.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (b.indexOf(45) <= 0 && b.indexOf(43) <= 0) {
            if (J()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else if (P()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            } else if (O()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
            } else {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHH");
            }
            D = simpleDateFormat;
            D.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        } else {
            b = I();
            D = D();
        }
        if (J()) {
            b = R(b);
        }
        return p1.a(D.parse(b));
    }

    public String I() {
        int length;
        String b = a0b.b(this.a);
        if (b.charAt(b.length() - 1) == 'Z') {
            return b.substring(0, b.length() - 1) + "GMT+00:00";
        }
        int length2 = b.length();
        char charAt = b.charAt(length2 - 6);
        if ((charAt == '-' || charAt == '+') && b.indexOf("GMT") == length2 - 9) {
            return b;
        }
        int length3 = b.length();
        int i = length3 - 5;
        char charAt2 = b.charAt(i);
        if (charAt2 != '-' && charAt2 != '+') {
            char charAt3 = b.charAt(b.length() - 3);
            if (charAt3 != '-' && charAt3 != '+') {
                return b + E(b);
            }
            return b.substring(0, length) + "GMT" + b.substring(length) + ":00";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b.substring(0, i));
        sb.append("GMT");
        int i2 = length3 - 2;
        sb.append(b.substring(i, i2));
        sb.append(":");
        sb.append(b.substring(i2));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean J() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean O() {
        if (Q(10) && Q(11)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean P() {
        if (Q(12) && Q(13)) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof g)) {
            return false;
        }
        return tr.c(this.a, ((g) nVar).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 24, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        int length = this.a.length;
        return v1.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.a = bArr;
        if (!Q(0) || !Q(1) || !Q(2) || !Q(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }
}
