package defpackage;

import defpackage.i71;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChronoZonedDateTimeImpl.java */
/* renamed from: o71  reason: default package */
/* loaded from: classes3.dex */
public final class o71<D extends i71> extends n71<D> implements Serializable {
    private final k71<D> b;
    private final wcc c;
    private final vcc d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChronoZonedDateTimeImpl.java */
    /* renamed from: o71$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h71.values().length];
            a = iArr;
            try {
                iArr[h71.S4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h71.T4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private o71(k71<D> k71Var, wcc wccVar, vcc vccVar) {
        this.b = (k71) g95.i(k71Var, "dateTime");
        this.c = (wcc) g95.i(wccVar, "offset");
        this.d = (vcc) g95.i(vccVar, "zone");
    }

    private o71<D> F0(b55 b55Var, vcc vccVar) {
        return K0(o0().T(), b55Var, vccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends i71> n71<R> J0(k71<R> k71Var, vcc vccVar, wcc wccVar) {
        g95.i(k71Var, "localDateTime");
        g95.i(vccVar, "zone");
        if (vccVar instanceof wcc) {
            return new o71(k71Var, (wcc) vccVar, vccVar);
        }
        adc u = vccVar.u();
        es5 J0 = es5.J0(k71Var);
        List<wcc> c = u.c(J0);
        if (c.size() == 1) {
            wccVar = c.get(0);
        } else if (c.size() == 0) {
            xcc b = u.b(J0);
            k71Var = k71Var.M0(b.o().o());
            wccVar = b.u();
        } else if (wccVar == null || !c.contains(wccVar)) {
            wccVar = c.get(0);
        }
        g95.i(wccVar, "offset");
        return new o71(k71Var, wccVar, vccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends i71> o71<R> K0(p71 p71Var, b55 b55Var, vcc vccVar) {
        wcc a2 = vccVar.u().a(b55Var);
        g95.i(a2, "offset");
        return new o71<>((k71) p71Var.G(es5.Q0(b55Var.T(), b55Var.b0(), a2)), a2, vccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n71<?> L0(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return (n71<D>) ((j71) objectInput.readObject()).P((wcc) objectInput.readObject()).E0((vcc) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new hca((byte) 13, this);
    }

    @Override // defpackage.n71
    public n71<D> E0(vcc vccVar) {
        return J0(this.b, vccVar, this.c);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (!(u8bVar instanceof h71) && (u8bVar == null || !u8bVar.i(this))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n71
    public wcc T() {
        return this.c;
    }

    @Override // defpackage.n71
    public vcc b0() {
        return this.d;
    }

    @Override // defpackage.n71
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n71) && compareTo((n71) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.n71
    public int hashCode() {
        return (p0().hashCode() ^ T().hashCode()) ^ Integer.rotateLeft(b0().hashCode(), 3);
    }

    @Override // defpackage.n71, defpackage.p8b
    /* renamed from: l0 */
    public n71<D> L(long j, x8b x8bVar) {
        if (x8bVar instanceof m71) {
            return s(this.b.h0(j, x8bVar));
        }
        return o0().T().s(x8bVar.i(this, j));
    }

    @Override // defpackage.n71
    public j71<D> p0() {
        return this.b;
    }

    @Override // defpackage.n71
    public String toString() {
        String str = p0().toString() + T().toString();
        if (T() != b0()) {
            return str + '[' + b0().toString() + ']';
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
        objectOutput.writeObject(this.d);
    }

    @Override // defpackage.n71, defpackage.p8b
    /* renamed from: z0 */
    public n71<D> H(u8b u8bVar, long j) {
        if (u8bVar instanceof h71) {
            h71 h71Var = (h71) u8bVar;
            int i = a.a[h71Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return J0(this.b.x0(u8bVar, j), this.d, this.c);
                }
                return F0(this.b.m0(wcc.h0(h71Var.x(j))), this.d);
            }
            return L(j - m0(), m71.SECONDS);
        }
        return o0().T().s(u8bVar.o(this, j));
    }
}
