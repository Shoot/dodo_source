package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
/* compiled from: FramedataImpl1.java */
/* renamed from: j74  reason: default package */
/* loaded from: classes3.dex */
public abstract class j74 implements i74 {
    private ga7 b;
    private ByteBuffer c = dk0.a();
    private boolean a = true;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    /* compiled from: FramedataImpl1.java */
    /* renamed from: j74$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ga7.values().length];
            a = iArr;
            try {
                iArr[ga7.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ga7.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ga7.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ga7.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ga7.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ga7.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public j74(ga7 ga7Var) {
        this.b = ga7Var;
    }

    public static j74 g(ga7 ga7Var) {
        if (ga7Var != null) {
            switch (a.a[ga7Var.ordinal()]) {
                case 1:
                    return new v68();
                case 2:
                    return new cf8();
                case 3:
                    return new fbb();
                case 4:
                    return new ib0();
                case 5:
                    return new y91();
                case 6:
                    return new hv1();
                default:
                    throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        }
        throw new IllegalArgumentException("Supplied opcode cannot be null");
    }

    @Override // defpackage.i74
    public boolean a() {
        return this.e;
    }

    @Override // defpackage.i74
    public boolean b() {
        return this.f;
    }

    @Override // defpackage.i74
    public ga7 c() {
        return this.b;
    }

    @Override // defpackage.i74
    public boolean d() {
        return this.g;
    }

    @Override // defpackage.i74
    public boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j74 j74Var = (j74) obj;
        if (this.a != j74Var.a || this.d != j74Var.d || this.e != j74Var.e || this.f != j74Var.f || this.g != j74Var.g || this.b != j74Var.b) {
            return false;
        }
        ByteBuffer byteBuffer = this.c;
        ByteBuffer byteBuffer2 = j74Var.c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        if (byteBuffer2 == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i74
    public ByteBuffer f() {
        return this.c;
    }

    public abstract void h() throws InvalidDataException;

    public int hashCode() {
        int i;
        int hashCode = (((this.a ? 1 : 0) * 31) + this.b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            i = byteBuffer.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public void i(boolean z) {
        this.a = z;
    }

    public void j(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    public void k(boolean z) {
        this.e = z;
    }

    public void l(boolean z) {
        this.f = z;
    }

    public void m(boolean z) {
        this.g = z;
    }

    public void n(boolean z) {
        this.d = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ opcode:");
        sb.append(c());
        sb.append(", fin:");
        sb.append(e());
        sb.append(", rsv1:");
        sb.append(a());
        sb.append(", rsv2:");
        sb.append(b());
        sb.append(", rsv3:");
        sb.append(d());
        sb.append(", payload length:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        if (this.c.remaining() > 1000) {
            str = "(too big to display)";
        } else {
            str = new String(this.c.array());
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
