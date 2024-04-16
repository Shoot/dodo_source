package defpackage;

import io.realm.RealmFieldType;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* compiled from: InvalidRow.java */
/* renamed from: g75  reason: default package */
/* loaded from: classes3.dex */
public enum g75 implements fp9 {
    INSTANCE;

    private RuntimeException F0() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    @Override // defpackage.fp9
    public NativeRealmAny E(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public long E0() {
        throw F0();
    }

    @Override // defpackage.fp9
    public void G(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public byte[] H(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public double K(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public long L(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public float M(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsList N(long j, RealmFieldType realmFieldType) {
        throw F0();
    }

    @Override // defpackage.fp9
    public Decimal128 P(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void Q(long j, boolean z) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsSet T(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public ObjectId W(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public boolean a() {
        return false;
    }

    @Override // defpackage.fp9
    public boolean b0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public long e0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsList f0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public String[] getColumnNames() {
        throw F0();
    }

    @Override // defpackage.fp9
    public Date h0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void i(long j, String str) {
        throw F0();
    }

    @Override // defpackage.fp9
    public boolean isLoaded() {
        return true;
    }

    @Override // defpackage.fp9
    public void k(long j, float f) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void l0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public long m0(String str) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsMap n0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public Table o() {
        throw F0();
    }

    @Override // defpackage.fp9
    public boolean o0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public String p0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public UUID q(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsMap q0(long j, RealmFieldType realmFieldType) {
        throw F0();
    }

    @Override // defpackage.fp9
    public RealmFieldType r0(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void s(long j, long j2) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void u(long j, long j2) {
        throw F0();
    }

    @Override // defpackage.fp9
    public boolean w(long j) {
        throw F0();
    }

    @Override // defpackage.fp9
    public OsSet x(long j, RealmFieldType realmFieldType) {
        throw F0();
    }

    @Override // defpackage.fp9
    public void x0(long j, double d) {
        throw F0();
    }

    @Override // defpackage.fp9
    public fp9 z0(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }
}
