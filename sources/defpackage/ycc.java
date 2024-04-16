package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: ZoneOffsetTransitionRule.java */
/* renamed from: ycc  reason: default package */
/* loaded from: classes3.dex */
public final class ycc implements Serializable {
    private final po6 a;
    private final byte b;
    private final hn2 c;
    private final gs5 d;
    private final int e;
    private final b f;
    private final wcc g;
    private final wcc h;
    private final wcc i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoneOffsetTransitionRule.java */
    /* renamed from: ycc$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ZoneOffsetTransitionRule.java */
    /* renamed from: ycc$b */
    /* loaded from: classes3.dex */
    public enum b {
        UTC,
        WALL,
        STANDARD;

        public es5 a(es5 es5Var, wcc wccVar, wcc wccVar2) {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return es5Var;
                }
                return es5Var.X0(wccVar2.b0() - wccVar.b0());
            }
            return es5Var.X0(wccVar2.b0() - wcc.h.b0());
        }
    }

    ycc(po6 po6Var, int i, hn2 hn2Var, gs5 gs5Var, int i2, b bVar, wcc wccVar, wcc wccVar2, wcc wccVar3) {
        this.a = po6Var;
        this.b = (byte) i;
        this.c = hn2Var;
        this.d = gs5Var;
        this.e = i2;
        this.f = bVar;
        this.g = wccVar;
        this.h = wccVar2;
        this.i = wccVar3;
    }

    private void a(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ycc c(DataInput dataInput) throws IOException {
        hn2 k;
        int i;
        int i2;
        int b0;
        int b02;
        int readInt = dataInput.readInt();
        po6 N = po6.N(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        if (i4 == 0) {
            k = null;
        } else {
            k = hn2.k(i4);
        }
        hn2 hn2Var = k;
        int i5 = (507904 & readInt) >>> 14;
        b bVar = b.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        if (i5 == 31) {
            i = dataInput.readInt();
        } else {
            i = i5 * 3600;
        }
        if (i6 == 255) {
            i2 = dataInput.readInt();
        } else {
            i2 = (i6 - 128) * 900;
        }
        wcc h0 = wcc.h0(i2);
        if (i7 == 3) {
            b0 = dataInput.readInt();
        } else {
            b0 = h0.b0() + (i7 * 1800);
        }
        wcc h02 = wcc.h0(b0);
        if (i8 == 3) {
            b02 = dataInput.readInt();
        } else {
            b02 = h0.b0() + (i8 * 1800);
        }
        wcc h03 = wcc.h0(b02);
        if (i3 >= -28 && i3 <= 31 && i3 != 0) {
            return new ycc(N, i3, hn2Var, gs5.x0(g95.f(i, RemoteMessageConst.DEFAULT_TTL)), g95.d(i, RemoteMessageConst.DEFAULT_TTL), bVar, h0, h02, h03);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new ica((byte) 3, this);
    }

    public xcc b(int i) {
        ds5 Y0;
        byte b2 = this.b;
        if (b2 < 0) {
            po6 po6Var = this.a;
            Y0 = ds5.Y0(i, po6Var, po6Var.u(t75.e.b0(i)) + 1 + this.b);
            hn2 hn2Var = this.c;
            if (hn2Var != null) {
                Y0 = Y0.s(s8b.b(hn2Var));
            }
        } else {
            Y0 = ds5.Y0(i, this.a, b2);
            hn2 hn2Var2 = this.c;
            if (hn2Var2 != null) {
                Y0 = Y0.s(s8b.a(hn2Var2));
            }
        }
        return new xcc(this.f.a(es5.P0(Y0.d1(this.e), this.d), this.g, this.h), this.h, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int value;
        int O0 = this.d.O0() + (this.e * RemoteMessageConst.DEFAULT_TTL);
        int b0 = this.g.b0();
        int b02 = this.h.b0() - b0;
        int b03 = this.i.b0() - b0;
        if (O0 % 3600 == 0 && O0 <= 86400) {
            if (O0 == 86400) {
                i = 24;
            } else {
                i = this.d.e0();
            }
        } else {
            i = 31;
        }
        if (b0 % 900 == 0) {
            i2 = (b0 / 900) + 128;
        } else {
            i2 = 255;
        }
        if (b02 != 0 && b02 != 1800 && b02 != 3600) {
            i3 = 3;
        } else {
            i3 = b02 / 1800;
        }
        if (b03 != 0 && b03 != 1800 && b03 != 3600) {
            i4 = 3;
        } else {
            i4 = b03 / 1800;
        }
        hn2 hn2Var = this.c;
        if (hn2Var == null) {
            value = 0;
        } else {
            value = hn2Var.getValue();
        }
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + (value << 19) + (i << 14) + (this.f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            dataOutput.writeInt(O0);
        }
        if (i2 == 255) {
            dataOutput.writeInt(b0);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.h.b0());
        }
        if (i4 == 3) {
            dataOutput.writeInt(this.i.b0());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ycc)) {
            return false;
        }
        ycc yccVar = (ycc) obj;
        if (this.a == yccVar.a && this.b == yccVar.b && this.c == yccVar.c && this.f == yccVar.f && this.e == yccVar.e && this.d.equals(yccVar.d) && this.g.equals(yccVar.g) && this.h.equals(yccVar.h) && this.i.equals(yccVar.i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int ordinal;
        int O0 = ((this.d.O0() + this.e) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        hn2 hn2Var = this.c;
        if (hn2Var == null) {
            ordinal = 7;
        } else {
            ordinal = hn2Var.ordinal();
        }
        return ((((O0 + (ordinal << 2)) + this.f.ordinal()) ^ this.g.hashCode()) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public String toString() {
        String str;
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        if (this.h.compareTo(this.i) > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        sb.append(str);
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        hn2 hn2Var = this.c;
        if (hn2Var != null) {
            byte b2 = this.b;
            if (b2 == -1) {
                sb.append(hn2Var.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b2 < 0) {
                sb.append(hn2Var.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(hn2Var.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        if (this.e == 0) {
            sb.append(this.d);
        } else {
            a(sb, g95.e((this.d.O0() / 60) + (this.e * 1440), 60L));
            sb.append(CoreConstants.COLON_CHAR);
            a(sb, g95.g(j, 60));
        }
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
