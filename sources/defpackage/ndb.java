package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: ThaiBuddhistEra.java */
/* renamed from: ndb  reason: default package */
/* loaded from: classes3.dex */
public enum ndb implements ek3 {
    BEFORE_BE,
    BE;

    public static ndb a(int i) {
        if (i != 0) {
            if (i == 1) {
                return BE;
            }
            throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
        }
        return BEFORE_BE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ndb k(DataInput dataInput) throws IOException {
        return a(dataInput.readByte());
    }

    private Object writeReplace() {
        return new hca((byte) 8, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.Z) {
                return false;
            }
            return true;
        } else if (u8bVar == null || !u8bVar.i(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return u8bVar.s();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.ERAS;
        }
        if (w8bVar != v8b.a() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d() && w8bVar != v8b.b() && w8bVar != v8b.c()) {
            return w8bVar.a(this);
        }
        return null;
    }

    @Override // defpackage.ek3
    public int getValue() {
        return ordinal();
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.Z, getValue());
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return getValue();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.q(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return getValue();
        }
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
