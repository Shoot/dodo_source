package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* compiled from: PendingRow.java */
/* loaded from: classes3.dex */
public class f implements fp9 {
    private OsSharedRealm a;
    private OsResults b;
    private d89<f> c;
    private WeakReference<a> d;
    private boolean e;

    /* compiled from: PendingRow.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(fp9 fp9Var);
    }

    private void b() {
        this.b.m(this, this.c);
        this.b = null;
        this.c = null;
        this.a.removePendingRow(this);
    }

    private void d() {
        WeakReference<a> weakReference = this.d;
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar == null) {
                b();
                return;
            } else if (this.b.j()) {
                UncheckedRow e = this.b.e();
                b();
                if (e != null) {
                    if (this.e) {
                        e = CheckedRow.g(e);
                    }
                    aVar.a(e);
                    return;
                }
                aVar.a(g75.INSTANCE);
                return;
            } else {
                b();
                return;
            }
        }
        throw new IllegalStateException("The 'frontEnd' has not been set.");
    }

    @Override // defpackage.fp9
    public NativeRealmAny E(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public long E0() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void G(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public byte[] H(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public double K(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public long L(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public float M(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsList N(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public Decimal128 P(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void Q(long j, boolean z) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsSet T(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public ObjectId W(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public boolean a() {
        return false;
    }

    @Override // defpackage.fp9
    public boolean b0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void c() {
        if (this.b != null) {
            d();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    @Override // defpackage.fp9
    public long e0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsList f0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public Date h0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void i(long j, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public boolean isLoaded() {
        return false;
    }

    @Override // defpackage.fp9
    public void k(long j, float f) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void l0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public long m0(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsMap n0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public Table o() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public boolean o0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public String p0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public UUID q(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsMap q0(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public RealmFieldType r0(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void s(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void u(long j, long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public boolean w(long j) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public OsSet x(long j, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public void x0(long j, double d) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // defpackage.fp9
    public fp9 z0(OsSharedRealm osSharedRealm) {
        return s74.INSTANCE;
    }
}
