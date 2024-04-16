package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HttpHeaders.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, d2 = {"Lgn4;", "", "headerName", "", "Lxu0;", "a", "Lyg0;", "", "result", "", c.a, "", "g", "", "prefix", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, e.a, "Low1;", "Lsq4;", RemoteMessageConst.Notification.URL, "headers", "f", "Lik9;", "b", "Llk0;", "Llk0;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: lq4  reason: default package */
/* loaded from: classes3.dex */
public final class lq4 {
    private static final lk0 a;
    private static final lk0 b;

    static {
        lk0.a aVar = lk0.d;
        a = aVar.d("\"\\");
        b = aVar.d("\t ,=");
    }

    public static final List<xu0> a(gn4 gn4Var, String str) {
        boolean v;
        z65.h(gn4Var, "<this>");
        z65.h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = gn4Var.size();
        for (int i = 0; i < size; i++) {
            v = l0b.v(str, gn4Var.h(i), true);
            if (v) {
                try {
                    c(new yg0().a0(gn4Var.u(i)), arrayList);
                } catch (EOFException e) {
                    xb8.a.g().k("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(ik9 ik9Var) {
        boolean v;
        z65.h(ik9Var, "<this>");
        if (z65.c(ik9Var.K().h(), NetworkHandler.HEAD)) {
            return false;
        }
        int j = ik9Var.j();
        if (((j >= 100 && j < 200) || j == 204 || j == 304) && cec.k(ik9Var) == -1) {
            v = l0b.v("chunked", ik9.o(ik9Var, "Transfer-Encoding", null, 2, null), true);
            if (!v) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void c(defpackage.yg0 r7, java.util.List<defpackage.xu0> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.U0()
            if (r7 != 0) goto L1f
            return
        L1f:
            xu0 r7 = new xu0
            java.util.Map r0 = defpackage.d86.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = defpackage.zdc.F(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.U0()
            if (r2 == 0) goto L67
        L40:
            xu0 r2 = new xu0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = defpackage.c0b.B(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            defpackage.z65.g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = defpackage.zdc.F(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lba
            int r5 = defpackage.zdc.F(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = d(r7)
            goto L9f
        L9b:
            java.lang.String r6 = e(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.U0()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            xu0 r4 = new xu0
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq4.c(yg0, java.util.List):void");
    }

    private static final String d(yg0 yg0Var) throws EOFException {
        if (yg0Var.readByte() == 34) {
            yg0 yg0Var2 = new yg0();
            while (true) {
                long O1 = yg0Var.O1(a);
                if (O1 == -1) {
                    return null;
                }
                if (yg0Var.n(O1) == 34) {
                    yg0Var2.r1(yg0Var, O1);
                    yg0Var.readByte();
                    return yg0Var2.L();
                } else if (yg0Var.P() == O1 + 1) {
                    return null;
                } else {
                    yg0Var2.r1(yg0Var, O1);
                    yg0Var.readByte();
                    yg0Var2.r1(yg0Var, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String e(yg0 yg0Var) {
        long O1 = yg0Var.O1(b);
        if (O1 == -1) {
            O1 = yg0Var.P();
        }
        if (O1 != 0) {
            return yg0Var.G0(O1);
        }
        return null;
    }

    public static final void f(ow1 ow1Var, sq4 sq4Var, gn4 gn4Var) {
        z65.h(ow1Var, "<this>");
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        z65.h(gn4Var, "headers");
        if (ow1Var == ow1.b) {
            return;
        }
        List<nw1> e = nw1.k.e(sq4Var, gn4Var);
        if (e.isEmpty()) {
            return;
        }
        ow1Var.a(sq4Var, e);
    }

    private static final boolean g(yg0 yg0Var) {
        boolean z = false;
        while (!yg0Var.U0()) {
            byte n = yg0Var.n(0L);
            if (n == 44) {
                yg0Var.readByte();
                z = true;
            } else if (n != 32 && n != 9) {
                break;
            } else {
                yg0Var.readByte();
            }
        }
        return z;
    }

    private static final boolean h(yg0 yg0Var, byte b2) {
        if (!yg0Var.U0() && yg0Var.n(0L) == b2) {
            return true;
        }
        return false;
    }
}
