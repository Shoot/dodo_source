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
/* compiled from: Row.java */
/* renamed from: fp9  reason: default package */
/* loaded from: classes3.dex */
public interface fp9 {
    NativeRealmAny E(long j);

    long E0();

    void G(long j);

    byte[] H(long j);

    double K(long j);

    long L(long j);

    float M(long j);

    OsList N(long j, RealmFieldType realmFieldType);

    Decimal128 P(long j);

    void Q(long j, boolean z);

    OsSet T(long j);

    ObjectId W(long j);

    boolean a();

    boolean b0(long j);

    long e0(long j);

    OsList f0(long j);

    String[] getColumnNames();

    Date h0(long j);

    void i(long j, String str);

    boolean isLoaded();

    void k(long j, float f);

    void l0(long j);

    long m0(String str);

    OsMap n0(long j);

    Table o();

    boolean o0(long j);

    String p0(long j);

    UUID q(long j);

    OsMap q0(long j, RealmFieldType realmFieldType);

    RealmFieldType r0(long j);

    void s(long j, long j2);

    void u(long j, long j2);

    boolean w(long j);

    OsSet x(long j, RealmFieldType realmFieldType);

    void x0(long j, double d);

    fp9 z0(OsSharedRealm osSharedRealm);
}
