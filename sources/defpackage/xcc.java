package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ZoneOffsetTransition.java */
/* renamed from: xcc  reason: default package */
/* loaded from: classes3.dex */
public final class xcc implements Comparable<xcc>, Serializable {
    private final es5 a;
    private final wcc b;
    private final wcc c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xcc(es5 es5Var, wcc wccVar, wcc wccVar2) {
        this.a = es5Var;
        this.b = wccVar;
        this.c = wccVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xcc G(DataInput dataInput) throws IOException {
        long b = ica.b(dataInput);
        wcc d = ica.d(dataInput);
        wcc d2 = ica.d(dataInput);
        if (!d.equals(d2)) {
            return new xcc(b, d, d2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private int q() {
        return u().b0() - w().b0();
    }

    private Object writeReplace() {
        return new ica((byte) 2, this);
    }

    public boolean E() {
        if (u().b0() > w().b0()) {
            return true;
        }
        return false;
    }

    public long H() {
        return this.a.l0(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(DataOutput dataOutput) throws IOException {
        ica.e(H(), dataOutput);
        ica.i(this.b, dataOutput);
        ica.i(this.c, dataOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(xcc xccVar) {
        return s().compareTo(xccVar.s());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xcc)) {
            return false;
        }
        xcc xccVar = (xcc) obj;
        if (this.a.equals(xccVar.a) && this.b.equals(xccVar.b) && this.c.equals(xccVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public es5 i() {
        return this.a.X0(q());
    }

    public es5 k() {
        return this.a;
    }

    public j93 o() {
        return j93.s(q());
    }

    public b55 s() {
        return this.a.m0(this.b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        if (E()) {
            str = "Gap";
        } else {
            str = "Overlap";
        }
        sb.append(str);
        sb.append(" at ");
        sb.append(this.a);
        sb.append(this.b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    public wcc u() {
        return this.c;
    }

    public wcc w() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<wcc> x() {
        if (E()) {
            return Collections.emptyList();
        }
        return Arrays.asList(w(), u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xcc(long j, wcc wccVar, wcc wccVar2) {
        this.a = es5.Q0(j, 0, wccVar);
        this.b = wccVar;
        this.c = wccVar2;
    }
}
