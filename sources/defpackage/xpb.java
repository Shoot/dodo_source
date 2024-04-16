package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.UUID;
/* compiled from: UUIDSerializer.java */
/* renamed from: xpb  reason: default package */
/* loaded from: classes2.dex */
public class xpb extends bxa<UUID> implements bv1 {
    static final char[] d = "0123456789abcdef".toCharArray();
    protected final Boolean c;

    public xpb() {
        this(null);
    }

    private static final void G(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private static void H(int i, char[] cArr, int i2) {
        K(i >> 16, cArr, i2);
        K(i, cArr, i2 + 4);
    }

    private static void K(int i, char[] cArr, int i2) {
        char[] cArr2 = d;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    private static final byte[] L(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        G((int) (mostSignificantBits >> 32), bArr, 0);
        G((int) mostSignificantBits, bArr, 4);
        G((int) (leastSignificantBits >> 32), bArr, 8);
        G((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    protected boolean M(ua5 ua5Var) {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!(ua5Var instanceof mib) && ua5Var.i()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gc5
    /* renamed from: N */
    public boolean d(bda bdaVar, UUID uuid) {
        if (uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: P */
    public void f(UUID uuid, ua5 ua5Var, bda bdaVar) throws IOException {
        if (M(ua5Var)) {
            ua5Var.Q(L(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        H((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = CoreConstants.DASH_CHAR;
        int i = (int) mostSignificantBits;
        K(i >>> 16, cArr, 9);
        cArr[13] = CoreConstants.DASH_CHAR;
        K(i, cArr, 14);
        cArr[18] = CoreConstants.DASH_CHAR;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        K((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = CoreConstants.DASH_CHAR;
        K((int) (leastSignificantBits >>> 32), cArr, 24);
        H((int) leastSignificantBits, cArr, 28);
        ua5Var.s1(cArr, 0, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    @Override // defpackage.bv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gc5<?> a(defpackage.bda r2, defpackage.ia0 r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class r0 = r1.c()
            ta5$d r2 = r1.s(r2, r3, r0)
            if (r2 == 0) goto L1c
            ta5$c r2 = r2.j()
            ta5$c r3 = defpackage.ta5.c.BINARY
            if (r2 != r3) goto L15
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L1d
        L15:
            ta5$c r3 = defpackage.ta5.c.STRING
            if (r2 != r3) goto L1c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L1d
        L1c:
            r2 = 0
        L1d:
            java.lang.Boolean r3 = r1.c
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L2b
            xpb r3 = new xpb
            r3.<init>(r2)
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpb.a(bda, ia0):gc5");
    }

    protected xpb(Boolean bool) {
        super(UUID.class);
        this.c = bool;
    }
}
