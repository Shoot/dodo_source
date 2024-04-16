package io.realm.internal;

import io.realm.internal.ObservableCollection;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes3.dex */
public class OsList implements ku6, ObservableCollection, em7 {
    private static final long e = nativeGetFinalizerPtr();
    private final long a;
    private final c b;
    private final Table c;
    private final e<ObservableCollection.b> d = new e<>();

    public OsList(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm p = uncheckedRow.o().p();
        long[] nativeCreate = nativeCreate(p.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.a = nativeCreate[0];
        c cVar = p.context;
        this.b = cVar;
        cVar.a(this);
        if (nativeCreate[1] != 0) {
            this.c = new Table(p, nativeCreate[1]);
        } else {
            this.c = null;
        }
    }

    private static native void nativeAddBinary(long j, byte[] bArr);

    private static native void nativeAddBoolean(long j, boolean z);

    private static native void nativeAddDate(long j, long j2);

    private static native void nativeAddDecimal128(long j, long j2, long j3);

    private static native void nativeAddDouble(long j, double d);

    private static native void nativeAddFloat(long j, float f);

    private static native void nativeAddLong(long j, long j2);

    private static native void nativeAddNull(long j);

    private static native void nativeAddObjectId(long j, String str);

    private static native void nativeAddRealmAny(long j, long j2);

    private static native void nativeAddRow(long j, long j2);

    private static native void nativeAddString(long j, String str);

    private static native void nativeAddUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeCreateAndAddEmbeddedObject(long j, long j2);

    private static native long nativeCreateAndSetEmbeddedObject(long j, long j2);

    private static native void nativeDeleteAll(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRow(long j, long j2);

    private static native Object nativeGetValue(long j, long j2);

    private static native void nativeInsertBinary(long j, long j2, byte[] bArr);

    private static native void nativeInsertBoolean(long j, long j2, boolean z);

    private static native void nativeInsertDate(long j, long j2, long j3);

    private static native void nativeInsertDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeInsertDouble(long j, long j2, double d);

    private static native void nativeInsertFloat(long j, long j2, float f);

    private static native void nativeInsertLong(long j, long j2, long j3);

    private static native void nativeInsertNull(long j, long j2);

    private static native void nativeInsertObjectId(long j, long j2, String str);

    private static native void nativeInsertRealmAny(long j, long j2, long j3);

    private static native void nativeInsertRow(long j, long j2, long j3);

    private static native void nativeInsertString(long j, long j2, String str);

    private static native void nativeInsertUUID(long j, long j2, String str);

    private static native boolean nativeIsValid(long j);

    private static native void nativeRemove(long j, long j2);

    private static native void nativeRemoveAll(long j);

    private static native void nativeSetBinary(long j, long j2, byte[] bArr);

    private static native void nativeSetBoolean(long j, long j2, boolean z);

    private static native void nativeSetDate(long j, long j2, long j3);

    private static native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeSetDouble(long j, long j2, double d);

    private static native void nativeSetFloat(long j, long j2, float f);

    private static native void nativeSetLong(long j, long j2, long j3);

    private static native void nativeSetNull(long j, long j2);

    private static native void nativeSetObjectId(long j, long j2, String str);

    private static native void nativeSetRealmAny(long j, long j2, long j3);

    private static native void nativeSetRow(long j, long j2, long j3);

    private static native void nativeSetString(long j, long j2, String str);

    private static native void nativeSetUUID(long j, long j2, String str);

    private static native long nativeSize(long j);

    public void A(long j) {
        nativeInsertNull(this.a, j);
    }

    public void B(long j, ObjectId objectId) {
        if (objectId == null) {
            nativeInsertNull(this.a, j);
        } else {
            nativeInsertObjectId(this.a, j, objectId.toString());
        }
    }

    public void C(long j, long j2) {
        nativeInsertRealmAny(this.a, j, j2);
    }

    public void D(long j, long j2) {
        nativeInsertRow(this.a, j, j2);
    }

    public void E(long j, String str) {
        nativeInsertString(this.a, j, str);
    }

    public void F(long j, UUID uuid) {
        if (uuid == null) {
            nativeInsertNull(this.a, j);
        } else {
            nativeInsertUUID(this.a, j, uuid.toString());
        }
    }

    public boolean G() {
        if (nativeSize(this.a) <= 0) {
            return true;
        }
        return false;
    }

    public boolean H() {
        return nativeIsValid(this.a);
    }

    public void I(long j) {
        nativeRemove(this.a, j);
    }

    public void J() {
        nativeRemoveAll(this.a);
    }

    public void K(long j, byte[] bArr) {
        nativeSetBinary(this.a, j, bArr);
    }

    public void L(long j, boolean z) {
        nativeSetBoolean(this.a, j, z);
    }

    public void M(long j, Date date) {
        if (date == null) {
            nativeSetNull(this.a, j);
        } else {
            nativeSetDate(this.a, j, date.getTime());
        }
    }

    public void N(long j, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.a, j);
        } else {
            nativeSetDecimal128(this.a, j, decimal128.s(), decimal128.q());
        }
    }

    public void O(long j, double d) {
        nativeSetDouble(this.a, j, d);
    }

    public void P(long j, float f) {
        nativeSetFloat(this.a, j, f);
    }

    public void Q(long j, long j2) {
        nativeSetLong(this.a, j, j2);
    }

    public void R(long j) {
        nativeSetNull(this.a, j);
    }

    public void S(long j, ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.a, j);
        } else {
            nativeSetObjectId(this.a, j, objectId.toString());
        }
    }

    public void T(long j, long j2) {
        nativeSetRealmAny(this.a, j, j2);
    }

    public void U(long j, long j2) {
        nativeSetRow(this.a, j, j2);
    }

    public void V(long j, String str) {
        nativeSetString(this.a, j, str);
    }

    public void W(long j, UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.a, j);
        } else {
            nativeSetUUID(this.a, j, uuid.toString());
        }
    }

    public long X() {
        return nativeSize(this.a);
    }

    public void a(byte[] bArr) {
        nativeAddBinary(this.a, bArr);
    }

    public void b(boolean z) {
        nativeAddBoolean(this.a, z);
    }

    public void c(Date date) {
        if (date == null) {
            nativeAddNull(this.a);
        } else {
            nativeAddDate(this.a, date.getTime());
        }
    }

    public void d(Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.a);
        } else {
            nativeAddDecimal128(this.a, decimal128.s(), decimal128.q());
        }
    }

    public void e(double d) {
        nativeAddDouble(this.a, d);
    }

    public void f(float f) {
        nativeAddFloat(this.a, f);
    }

    public void g(long j) {
        nativeAddLong(this.a, j);
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return e;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    public void h() {
        nativeAddNull(this.a);
    }

    public void i(ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.a);
        } else {
            nativeAddObjectId(this.a, objectId.toString());
        }
    }

    public void j(long j) {
        nativeAddRealmAny(this.a, j);
    }

    public void k(long j) {
        nativeAddRow(this.a, j);
    }

    public void l(String str) {
        nativeAddString(this.a, str);
    }

    public void m(UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.a);
        } else {
            nativeAddUUID(this.a, uuid.toString());
        }
    }

    public long n() {
        return nativeCreateAndAddEmbeddedObject(this.a, X());
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j, false);
        if (osCollectionChangeSet.e()) {
            return;
        }
        this.d.c(new ObservableCollection.a(osCollectionChangeSet));
    }

    public long o(long j) {
        return nativeCreateAndAddEmbeddedObject(this.a, j);
    }

    public long p(long j) {
        return nativeCreateAndSetEmbeddedObject(this.a, j);
    }

    public void q() {
        nativeDeleteAll(this.a);
    }

    public UncheckedRow r(long j) {
        return this.c.s(nativeGetRow(this.a, j));
    }

    public Object s(long j) {
        return nativeGetValue(this.a, j);
    }

    public void t(long j, byte[] bArr) {
        nativeInsertBinary(this.a, j, bArr);
    }

    public void u(long j, boolean z) {
        nativeInsertBoolean(this.a, j, z);
    }

    public void v(long j, Date date) {
        if (date == null) {
            nativeInsertNull(this.a, j);
        } else {
            nativeInsertDate(this.a, j, date.getTime());
        }
    }

    public void w(long j, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.a, j);
        } else {
            nativeInsertDecimal128(this.a, j, decimal128.s(), decimal128.q());
        }
    }

    public void x(long j, double d) {
        nativeInsertDouble(this.a, j, d);
    }

    public void y(long j, float f) {
        nativeInsertFloat(this.a, j, f);
    }

    public void z(long j, long j2) {
        nativeInsertLong(this.a, j, j2);
    }
}
