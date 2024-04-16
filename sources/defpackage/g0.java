package defpackage;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.d0;
import org.bouncycastle.asn1.d1;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.e1;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.i0;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.x0;
import org.bouncycastle.asn1.y0;
import org.bouncycastle.util.encoders.b;
/* renamed from: g0  reason: default package */
/* loaded from: classes3.dex */
public class g0 {
    static void a(String str, boolean z, n nVar, StringBuffer stringBuffer) {
        StringBuilder sb;
        BigInteger F;
        String str2;
        String f;
        String I;
        StringBuilder sb2;
        int length;
        String str3;
        n f2;
        String str4;
        String str5;
        n f3;
        String d = a0b.d();
        if (nVar instanceof p) {
            Enumeration G = ((p) nVar).G();
            String str6 = str + "    ";
            stringBuffer.append(str);
            if (nVar instanceof b0) {
                str5 = "BER Sequence";
            } else if (nVar instanceof w0) {
                str5 = "DER Sequence";
            } else {
                str5 = "Sequence";
            }
            stringBuffer.append(str5);
            while (true) {
                stringBuffer.append(d);
                while (G.hasMoreElements()) {
                    Object nextElement = G.nextElement();
                    if (nextElement != null && !nextElement.equals(q0.a)) {
                        if (nextElement instanceof n) {
                            f3 = (n) nextElement;
                        } else {
                            f3 = ((h0) nextElement).f();
                        }
                        a(str6, z, f3, stringBuffer);
                    } else {
                        stringBuffer.append(str6);
                        stringBuffer.append(ActionConst.NULL);
                    }
                }
                return;
            }
        } else if (nVar instanceof s) {
            String str7 = str + "    ";
            stringBuffer.append(str);
            if (nVar instanceof f0) {
                str4 = "BER Tagged [";
            } else {
                str4 = "Tagged [";
            }
            stringBuffer.append(str4);
            s sVar = (s) nVar;
            stringBuffer.append(Integer.toString(sVar.G()));
            stringBuffer.append(']');
            if (!sVar.H()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(d);
            a(str7, z, sVar.F(), stringBuffer);
        } else if (nVar instanceof q) {
            Enumeration H = ((q) nVar).H();
            String str8 = str + "    ";
            stringBuffer.append(str);
            if (nVar instanceof d0) {
                str3 = "BER Set";
            } else if (nVar instanceof x0) {
                str3 = "DER Set";
            } else {
                str3 = "Set";
            }
            stringBuffer.append(str3);
            while (true) {
                stringBuffer.append(d);
                while (H.hasMoreElements()) {
                    Object nextElement2 = H.nextElement();
                    if (nextElement2 == null) {
                        break;
                    }
                    if (nextElement2 instanceof n) {
                        f2 = (n) nextElement2;
                    } else {
                        f2 = ((h0) nextElement2).f();
                    }
                    a(str8, z, f2, stringBuffer);
                }
                return;
                stringBuffer.append(str8);
                stringBuffer.append(ActionConst.NULL);
            }
        } else if (nVar instanceof l) {
            l lVar = (l) nVar;
            if (nVar instanceof x) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("BER Constructed Octet String[");
                length = lVar.F().length;
            } else {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("DER Octet String[");
                length = lVar.F().length;
            }
            sb2.append(length);
            sb2.append("] ");
            stringBuffer.append(sb2.toString());
            if (z) {
                f = e(str, lVar.F());
                stringBuffer.append(f);
            }
            stringBuffer.append(d);
        } else {
            if (nVar instanceof k) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("ObjectIdentifier(");
                sb.append(((k) nVar).H());
            } else if (nVar instanceof c) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("Boolean(");
                sb.append(((c) nVar).H());
            } else {
                if (nVar instanceof i) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("Integer(");
                    F = ((i) nVar).G();
                } else {
                    if (nVar instanceof j0) {
                        j0 j0Var = (j0) nVar;
                        stringBuffer.append(str + "DER Bit String[" + j0Var.E().length + ", " + j0Var.G() + "] ");
                        if (z) {
                            f = e(str, j0Var.E());
                        }
                        stringBuffer.append(d);
                    }
                    if (nVar instanceof p0) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("IA5String(");
                        I = ((p0) nVar).g();
                    } else if (nVar instanceof a1) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("UTF8String(");
                        I = ((a1) nVar).g();
                    } else if (nVar instanceof v0) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("PrintableString(");
                        I = ((v0) nVar).g();
                    } else if (nVar instanceof d1) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("VisibleString(");
                        I = ((d1) nVar).g();
                    } else if (nVar instanceof i0) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("BMPString(");
                        I = ((i0) nVar).g();
                    } else if (nVar instanceof y0) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("T61String(");
                        I = ((y0) nVar).g();
                    } else if (nVar instanceof o0) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("GraphicString(");
                        I = ((o0) nVar).g();
                    } else if (nVar instanceof c1) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("VideotexString(");
                        I = ((c1) nVar).g();
                    } else if (nVar instanceof t) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("UTCTime(");
                        I = ((t) nVar).F();
                    } else if (nVar instanceof g) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("GeneralizedTime(");
                        I = ((g) nVar).I();
                    } else {
                        if (nVar instanceof u) {
                            str2 = "BER";
                        } else if (nVar instanceof e1) {
                            str2 = "";
                        } else if (nVar instanceof e) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("DER Enumerated(");
                            F = ((e) nVar).F();
                        } else if (nVar instanceof f) {
                            f fVar = (f) nVar;
                            stringBuffer.append(str + "External " + d);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append("    ");
                            String sb4 = sb3.toString();
                            if (fVar.E() != null) {
                                stringBuffer.append(sb4 + "Direct Reference: " + fVar.E().H() + d);
                            }
                            if (fVar.H() != null) {
                                stringBuffer.append(sb4 + "Indirect Reference: " + fVar.H().toString() + d);
                            }
                            if (fVar.D() != null) {
                                a(sb4, z, fVar.D(), stringBuffer);
                            }
                            stringBuffer.append(sb4 + "Encoding: " + fVar.F() + d);
                            a(sb4, z, fVar.G(), stringBuffer);
                            return;
                        } else {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append(nVar.toString());
                            sb.append(d);
                            f = sb.toString();
                        }
                        f = f(str2, str, z, nVar, d);
                    }
                    sb.append(I);
                    sb.append(") ");
                    sb.append(d);
                    f = sb.toString();
                    stringBuffer.append(f);
                }
                sb.append(F);
            }
            sb.append(")");
            sb.append(d);
            f = sb.toString();
            stringBuffer.append(f);
        }
    }

    private static String b(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    public static String c(Object obj) {
        return d(obj, false);
    }

    public static String d(Object obj, boolean z) {
        n f;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof n) {
            f = (n) obj;
        } else if (obj instanceof h0) {
            f = ((h0) obj).f();
        } else {
            return "unknown object type " + obj.toString();
        }
        a("", z, f, stringBuffer);
        return stringBuffer.toString();
    }

    private static String e(String str, byte[] bArr) {
        String b;
        String d = a0b.d();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(d);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(a0b.b(b.e(bArr, i, 32)));
                stringBuffer.append("    ");
                b = b(bArr, i, 32);
            } else {
                stringBuffer.append(a0b.b(b.e(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                b = b(bArr, i, bArr.length - i);
            }
            stringBuffer.append(b);
            stringBuffer.append(d);
        }
        return stringBuffer.toString();
    }

    private static String f(String str, String str2, boolean z, n nVar, String str3) {
        a F = a.F(nVar);
        StringBuffer stringBuffer = new StringBuffer();
        if (F.A()) {
            try {
                p D = p.D(F.G(16));
                stringBuffer.append(str2 + str + " ApplicationSpecific[" + F.D() + "]" + str3);
                Enumeration G = D.G();
                while (G.hasMoreElements()) {
                    a(str2 + "    ", z, (n) G.nextElement(), stringBuffer);
                }
            } catch (IOException e) {
                stringBuffer.append(e);
            }
            return stringBuffer.toString();
        }
        return str2 + str + " ApplicationSpecific[" + F.D() + "] (" + a0b.b(b.d(F.E())) + ")" + str3;
    }
}
