package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
/* compiled from: JapaneseEra.java */
/* renamed from: r85  reason: default package */
/* loaded from: classes3.dex */
public final class r85 extends jq2 implements Serializable {
    public static final r85 d;
    public static final r85 e;
    public static final r85 f;
    public static final r85 g;
    public static final r85 h;
    private static final AtomicReference<r85[]> i;
    private final int a;
    private final transient ds5 b;
    private final transient String c;

    static {
        r85 r85Var = new r85(-1, ds5.X0(1868, 9, 8), "Meiji");
        d = r85Var;
        r85 r85Var2 = new r85(0, ds5.X0(1912, 7, 30), "Taisho");
        e = r85Var2;
        r85 r85Var3 = new r85(1, ds5.X0(1926, 12, 25), "Showa");
        f = r85Var3;
        r85 r85Var4 = new r85(2, ds5.X0(1989, 1, 8), "Heisei");
        g = r85Var4;
        r85 r85Var5 = new r85(3, ds5.X0(2019, 5, 1), "Reiwa");
        h = r85Var5;
        i = new AtomicReference<>(new r85[]{r85Var, r85Var2, r85Var3, r85Var4, r85Var5});
    }

    private r85(int i2, ds5 ds5Var, String str) {
        this.a = i2;
        this.b = ds5Var;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r85 P(ds5 ds5Var) {
        if (!ds5Var.e0(d.b)) {
            r85[] r85VarArr = i.get();
            for (int length = r85VarArr.length - 1; length >= 0; length--) {
                r85 r85Var = r85VarArr[length];
                if (ds5Var.compareTo(r85Var.b) >= 0) {
                    return r85Var;
                }
            }
            return null;
        }
        throw new DateTimeException("Date too early: " + ds5Var);
    }

    public static r85 Q(int i2) {
        r85[] r85VarArr = i.get();
        if (i2 >= d.a && i2 <= r85VarArr[r85VarArr.length - 1].a) {
            return r85VarArr[T(i2)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    private static int T(int i2) {
        return i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r85 b0(DataInput dataInput) throws IOException {
        return Q(dataInput.readByte());
    }

    public static r85[] f0() {
        r85[] r85VarArr = i.get();
        return (r85[]) Arrays.copyOf(r85VarArr, r85VarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return Q(this.a);
        } catch (DateTimeException e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new hca((byte) 2, this);
    }

    @Override // defpackage.lq2, defpackage.q8b
    public kwb K(u8b u8bVar) {
        h71 h71Var = h71.Z;
        if (u8bVar == h71Var) {
            return p85.f.e0(h71Var);
        }
        return super.K(u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ds5 N() {
        int T = T(this.a);
        r85[] f0 = f0();
        if (T >= f0.length - 1) {
            return ds5.f;
        }
        return f0[T + 1].e0().V0(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ds5 e0() {
        return this.b;
    }

    @Override // defpackage.ek3
    public int getValue() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    public String toString() {
        return this.c;
    }
}
