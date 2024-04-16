package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: ParserMinimalBase.java */
/* renamed from: hr7  reason: default package */
/* loaded from: classes2.dex */
public abstract class hr7 extends ob5 {
    protected static final byte[] d = new byte[0];
    protected static final int[] e = new int[0];
    protected static final BigInteger f;
    protected static final BigInteger g;
    protected static final BigInteger h;
    protected static final BigInteger i;
    protected static final BigDecimal j;
    protected static final BigDecimal k;
    protected static final BigDecimal l;
    protected static final BigDecimal m;
    protected nc5 c;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        g = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        h = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        i = valueOf4;
        j = new BigDecimal(valueOf3);
        k = new BigDecimal(valueOf4);
        l = new BigDecimal(valueOf);
        m = new BigDecimal(valueOf2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public hr7(int i2) {
        super(i2);
    }
}
