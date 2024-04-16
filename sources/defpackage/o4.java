package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: AcquirerFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lo4;", "Lm4;", "", "acquirerCode", "Lzo0;", "b", "Ll4;", "a", "", "Ljava/util/Map;", "acquirerEncryptors", "<init>", "(Ljava/util/Map;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o4  reason: default package */
/* loaded from: classes2.dex */
public final class o4 implements m4 {
    private final Map<String, zo0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public o4(Map<String, ? extends zo0> map) {
        z65.h(map, "acquirerEncryptors");
        this.a = map;
    }

    private final zo0 b(String str) {
        zo0 zo0Var = this.a.get(str);
        if (zo0Var != null) {
            return zo0Var;
        }
        throw new IllegalArgumentException("Encryptor for " + str + " acquirer not found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r4.equals("ECommPay") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r4.equals("Jetpay") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        return new defpackage.tb3(b(r4));
     */
    @Override // defpackage.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l4 a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "acquirerCode"
            defpackage.z65.h(r4, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -2079567985: goto L85;
                case -1685107209: goto L7c;
                case -1594740840: goto L6a;
                case 553024610: goto L58;
                case 757379879: goto L45;
                case 1558209624: goto L33;
                case 1601548646: goto L21;
                case 1985279439: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L97
        Le:
            java.lang.String r0 = "BePaid"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
            ca0 r0 = new ca0
            zo0 r4 = r3.b(r4)
            r0.<init>(r4)
            goto L96
        L21:
            java.lang.String r0 = "Checkout"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
            t31 r0 = new t31
            zo0 r4 = r3.b(r4)
            r0.<init>(r4)
            goto L96
        L33:
            java.lang.String r0 = "AllSecure"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
            wb r0 = new wb
            zo0 r4 = r3.b(r4)
            r0.<init>(r4)
            goto L96
        L45:
            java.lang.String r0 = "SberbankKz"
            boolean r1 = r4.equals(r0)
            if (r1 == 0) goto L97
            fu9 r1 = new fu9
            zo0 r4 = r3.b(r4)
            r1.<init>(r0, r4)
        L56:
            r0 = r1
            goto L96
        L58:
            java.lang.String r0 = "CloudPayments"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
            ea1 r0 = new ea1
            zo0 r4 = r3.b(r4)
            r0.<init>(r4)
            goto L96
        L6a:
            java.lang.String r0 = "Sberbank"
            boolean r1 = r4.equals(r0)
            if (r1 == 0) goto L97
            fu9 r1 = new fu9
            zo0 r4 = r3.b(r4)
            r1.<init>(r0, r4)
            goto L56
        L7c:
            java.lang.String r0 = "ECommPay"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
            goto L8d
        L85:
            java.lang.String r0 = "Jetpay"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L97
        L8d:
            tb3 r0 = new tb3
            zo0 r4 = r3.b(r4)
            r0.<init>(r4)
        L96:
            return r0
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Acquirer with code "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " not found"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4.a(java.lang.String):l4");
    }
}
