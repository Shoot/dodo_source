package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.b1;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x0;
import org.bouncycastle.util.encoders.b;
/* renamed from: z9c  reason: default package */
/* loaded from: classes3.dex */
public class z9c extends i0 {
    public static final k A;
    public static final k B;
    public static final k I;
    public static final k S4;
    public static final k T4;
    public static final k U4;
    public static final k V4;
    public static final k W4;
    public static final k X;
    public static final k X4;
    public static final k Y;
    public static final k Y4;
    public static final k Z;
    public static final k Z4;
    public static final k a5;
    public static boolean b5;
    public static final Hashtable c5;
    public static final Hashtable d5;
    public static final Hashtable e5;
    public static final Hashtable f5;
    public static final k g;
    public static final Hashtable g5;
    public static final k h;
    public static final Hashtable h5;
    public static final k i;
    private static final Boolean i5;
    public static final k j;
    private static final Boolean j5;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final k s;
    public static final k t;
    public static final k u;
    public static final k v;
    public static final k w;
    public static final k x;
    public static final k y;
    public static final k z;
    private Vector a = new Vector();
    private Vector b = new Vector();
    private Vector c = new Vector();
    private p d;
    private boolean e;
    private int f;

    static {
        k kVar = new k("2.5.4.6");
        g = kVar;
        k kVar2 = new k("2.5.4.10");
        h = kVar2;
        k kVar3 = new k("2.5.4.11");
        i = kVar3;
        k kVar4 = new k("2.5.4.12");
        j = kVar4;
        k kVar5 = new k("2.5.4.3");
        k = kVar5;
        k kVar6 = new k("2.5.4.5");
        l = kVar6;
        k kVar7 = new k("2.5.4.9");
        m = kVar7;
        n = kVar6;
        k kVar8 = new k("2.5.4.7");
        o = kVar8;
        k kVar9 = new k("2.5.4.8");
        p = kVar9;
        k kVar10 = new k("2.5.4.4");
        q = kVar10;
        k kVar11 = new k("2.5.4.42");
        r = kVar11;
        k kVar12 = new k("2.5.4.43");
        s = kVar12;
        k kVar13 = new k("2.5.4.44");
        t = kVar13;
        k kVar14 = new k("2.5.4.45");
        u = kVar14;
        k kVar15 = new k("2.5.4.15");
        v = kVar15;
        k kVar16 = new k("2.5.4.17");
        w = kVar16;
        k kVar17 = new k("2.5.4.46");
        x = kVar17;
        k kVar18 = new k("2.5.4.65");
        y = kVar18;
        k kVar19 = new k("1.3.6.1.5.5.7.9.1");
        z = kVar19;
        k kVar20 = new k("1.3.6.1.5.5.7.9.2");
        A = kVar20;
        k kVar21 = new k("1.3.6.1.5.5.7.9.3");
        B = kVar21;
        k kVar22 = new k("1.3.6.1.5.5.7.9.4");
        I = kVar22;
        k kVar23 = new k("1.3.6.1.5.5.7.9.5");
        X = kVar23;
        k kVar24 = new k("1.3.36.8.3.14");
        Y = kVar24;
        k kVar25 = new k("2.5.4.16");
        Z = kVar25;
        S4 = new k("2.5.4.54");
        k kVar26 = aac.Z2;
        T4 = kVar26;
        k kVar27 = aac.a3;
        U4 = kVar27;
        k kVar28 = co7.S0;
        V4 = kVar28;
        k kVar29 = co7.T0;
        W4 = kVar29;
        k kVar30 = co7.Z0;
        X4 = kVar30;
        Y4 = kVar28;
        k kVar31 = new k("0.9.2342.19200300.100.1.25");
        Z4 = kVar31;
        k kVar32 = new k("0.9.2342.19200300.100.1.1");
        a5 = kVar32;
        b5 = false;
        Hashtable hashtable = new Hashtable();
        c5 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        d5 = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        e5 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        f5 = hashtable4;
        g5 = hashtable;
        h5 = hashtable4;
        i5 = new Boolean(true);
        j5 = new Boolean(false);
        hashtable.put(kVar, "C");
        hashtable.put(kVar2, "O");
        hashtable.put(kVar4, "T");
        hashtable.put(kVar3, "OU");
        hashtable.put(kVar5, "CN");
        hashtable.put(kVar8, "L");
        hashtable.put(kVar9, "ST");
        hashtable.put(kVar6, "SERIALNUMBER");
        hashtable.put(kVar28, "E");
        hashtable.put(kVar31, "DC");
        hashtable.put(kVar32, "UID");
        hashtable.put(kVar7, "STREET");
        hashtable.put(kVar10, "SURNAME");
        hashtable.put(kVar11, "GIVENNAME");
        hashtable.put(kVar12, "INITIALS");
        hashtable.put(kVar13, "GENERATION");
        hashtable.put(kVar30, "unstructuredAddress");
        hashtable.put(kVar29, "unstructuredName");
        hashtable.put(kVar14, "UniqueIdentifier");
        hashtable.put(kVar17, "DN");
        hashtable.put(kVar18, "Pseudonym");
        hashtable.put(kVar25, "PostalAddress");
        hashtable.put(kVar24, "NameAtBirth");
        hashtable.put(kVar22, "CountryOfCitizenship");
        hashtable.put(kVar23, "CountryOfResidence");
        hashtable.put(kVar21, "Gender");
        hashtable.put(kVar20, "PlaceOfBirth");
        hashtable.put(kVar19, "DateOfBirth");
        hashtable.put(kVar16, "PostalCode");
        hashtable.put(kVar15, "BusinessCategory");
        hashtable.put(kVar26, "TelephoneNumber");
        hashtable.put(kVar27, "Name");
        hashtable2.put(kVar, "C");
        hashtable2.put(kVar2, "O");
        hashtable2.put(kVar3, "OU");
        hashtable2.put(kVar5, "CN");
        hashtable2.put(kVar8, "L");
        hashtable2.put(kVar9, "ST");
        hashtable2.put(kVar7, "STREET");
        hashtable2.put(kVar31, "DC");
        hashtable2.put(kVar32, "UID");
        hashtable3.put(kVar, "C");
        hashtable3.put(kVar2, "O");
        hashtable3.put(kVar3, "OU");
        hashtable3.put(kVar5, "CN");
        hashtable3.put(kVar8, "L");
        hashtable3.put(kVar9, "ST");
        hashtable3.put(kVar7, "STREET");
        hashtable4.put(c.a, kVar);
        hashtable4.put("o", kVar2);
        hashtable4.put("t", kVar4);
        hashtable4.put("ou", kVar3);
        hashtable4.put("cn", kVar5);
        hashtable4.put("l", kVar8);
        hashtable4.put("st", kVar9);
        hashtable4.put("sn", kVar6);
        hashtable4.put("serialnumber", kVar6);
        hashtable4.put("street", kVar7);
        hashtable4.put("emailaddress", kVar28);
        hashtable4.put("dc", kVar31);
        hashtable4.put(e.a, kVar28);
        hashtable4.put("uid", kVar32);
        hashtable4.put("surname", kVar10);
        hashtable4.put("givenname", kVar11);
        hashtable4.put("initials", kVar12);
        hashtable4.put("generation", kVar13);
        hashtable4.put("unstructuredaddress", kVar30);
        hashtable4.put("unstructuredname", kVar29);
        hashtable4.put("uniqueidentifier", kVar14);
        hashtable4.put("dn", kVar17);
        hashtable4.put("pseudonym", kVar18);
        hashtable4.put("postaladdress", kVar25);
        hashtable4.put("nameofbirth", kVar24);
        hashtable4.put("countryofcitizenship", kVar22);
        hashtable4.put("countryofresidence", kVar23);
        hashtable4.put("gender", kVar21);
        hashtable4.put("placeofbirth", kVar20);
        hashtable4.put("dateofbirth", kVar19);
        hashtable4.put("postalcode", kVar16);
        hashtable4.put("businesscategory", kVar15);
        hashtable4.put("telephonenumber", kVar26);
        hashtable4.put(Action.NAME_ATTRIBUTE, kVar27);
    }

    protected z9c() {
    }

    private String A(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i2 = 1;
            while (i2 < str.length()) {
                char charAt2 = str.charAt(i2);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i2++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private void t(StringBuffer stringBuffer, Hashtable hashtable, k kVar, String str) {
        String str2 = (String) hashtable.get(kVar);
        if (str2 == null) {
            str2 = kVar.H();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            }
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        continue;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private String u(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 != length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        return new String(cArr);
    }

    private String v(String str) {
        String f = a0b.f(str.trim());
        if (f.length() > 0 && f.charAt(0) == '#') {
            n w2 = w(f);
            if (w2 instanceof m0) {
                return a0b.f(((m0) w2).g().trim());
            }
            return f;
        }
        return f;
    }

    private n w(String str) {
        try {
            return n.z(b.c(str, 1, str.length() - 1));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    private boolean x(String str, String str2) {
        String v2 = v(str);
        String v3 = v(str2);
        if (!v2.equals(v3) && !A(v2).equals(A(v3))) {
            return false;
        }
        return true;
    }

    public static z9c z(Object obj) {
        if (obj instanceof z9c) {
            return (z9c) obj;
        }
        if (obj instanceof t9c) {
            return new z9c(p.D(((t9c) obj).f()));
        }
        if (obj != null) {
            return new z9c(p.D(obj));
        }
        return null;
    }

    public String B(boolean z2, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (((Boolean) this.c.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                t(stringBuffer2, hashtable, (k) this.a.elementAt(i2), (String) this.b.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                t(stringBuffer2, hashtable, (k) this.a.elementAt(i2), (String) this.b.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z3 = true;
        if (z2) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i3 = 0; i3 < vector.size(); i3++) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                stringBuffer.append(vector.elementAt(i3).toString());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        r3[r9] = true;
        r4 = r4 + r6;
     */
    @Override // defpackage.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L4
            return r0
        L4:
            boolean r1 = r12 instanceof defpackage.z9c
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r12 instanceof org.bouncycastle.asn1.p
            if (r1 != 0) goto Le
            return r2
        Le:
            r1 = r12
            h0 r1 = (defpackage.h0) r1
            org.bouncycastle.asn1.n r1 = r1.f()
            org.bouncycastle.asn1.n r3 = r11.f()
            boolean r1 = r3.x(r1)
            if (r1 == 0) goto L20
            return r0
        L20:
            z9c r12 = z(r12)     // Catch: java.lang.IllegalArgumentException -> L8e
            java.util.Vector r1 = r11.a
            int r1 = r1.size()
            java.util.Vector r3 = r12.a
            int r3 = r3.size()
            if (r1 == r3) goto L33
            return r2
        L33:
            boolean[] r3 = new boolean[r1]
            java.util.Vector r4 = r11.a
            java.lang.Object r4 = r4.elementAt(r2)
            java.util.Vector r5 = r12.a
            java.lang.Object r5 = r5.elementAt(r2)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b
            r5 = r1
            r4 = 0
            r6 = 1
            goto L4f
        L4b:
            int r4 = r1 + (-1)
            r5 = -1
            r6 = -1
        L4f:
            if (r4 == r5) goto L8d
            java.util.Vector r7 = r11.a
            java.lang.Object r7 = r7.elementAt(r4)
            org.bouncycastle.asn1.k r7 = (org.bouncycastle.asn1.k) r7
            java.util.Vector r8 = r11.b
            java.lang.Object r8 = r8.elementAt(r4)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
        L62:
            if (r9 >= r1) goto L8c
            boolean r10 = r3[r9]
            if (r10 == 0) goto L69
            goto L89
        L69:
            java.util.Vector r10 = r12.a
            java.lang.Object r10 = r10.elementAt(r9)
            org.bouncycastle.asn1.k r10 = (org.bouncycastle.asn1.k) r10
            boolean r10 = r7.x(r10)
            if (r10 == 0) goto L89
            java.util.Vector r10 = r12.b
            java.lang.Object r10 = r10.elementAt(r9)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r11.x(r8, r10)
            if (r10 == 0) goto L89
            r3[r9] = r0
            int r4 = r4 + r6
            goto L4f
        L89:
            int r9 = r9 + 1
            goto L62
        L8c:
            return r2
        L8d:
            return r0
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9c.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        if (this.d == null) {
            d dVar = new d();
            d dVar2 = new d();
            if (this.a.size() == 0) {
                dVar.a(new x0(dVar2));
                this.d = new w0(dVar);
            } else {
                new d(2).a((k) this.a.elementAt(0));
                String str = (String) this.b.elementAt(0);
                throw null;
            }
        }
        return this.d;
    }

    @Override // defpackage.i0
    public int hashCode() {
        if (this.e) {
            return this.f;
        }
        this.e = true;
        for (int i2 = 0; i2 != this.a.size(); i2++) {
            String A2 = A(v((String) this.b.elementAt(i2)));
            int hashCode = this.f ^ this.a.elementAt(i2).hashCode();
            this.f = hashCode;
            this.f = A2.hashCode() ^ hashCode;
        }
        return this.f;
    }

    public String toString() {
        return B(b5, c5);
    }

    public z9c(p pVar) {
        Vector vector;
        this.d = pVar;
        Enumeration G = pVar.G();
        while (G.hasMoreElements()) {
            q E = q.E(((h0) G.nextElement()).f());
            int i2 = 0;
            while (i2 < E.size()) {
                p D = p.D(E.G(i2).f());
                if (D.size() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.a.addElement(k.I(D.F(0)));
                h0 F = D.F(1);
                if (!(F instanceof m0) || (F instanceof b1)) {
                    try {
                        this.b.addElement("#" + u(b.d(F.f().p("DER"))));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String g2 = ((m0) F).g();
                    if (g2.length() <= 0 || g2.charAt(0) != '#') {
                        vector = this.b;
                    } else {
                        vector = this.b;
                        g2 = "\\" + g2;
                    }
                    vector.addElement(g2);
                }
                this.c.addElement(i2 != 0 ? i5 : j5);
                i2++;
            }
        }
    }
}
