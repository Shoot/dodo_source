package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class i4 extends x2 {
    private final h4 c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i4(u5 u5Var) {
        super(u5Var);
        this.c = new h4(this, zza(), "google_app_measurement_local.db");
    }

    private static long A(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bc, TRY_ENTER, TryCatch #6 {SQLiteDatabaseLockedException -> 0x00bc, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:23:0x004b, B:25:0x0051, B:36:0x006b, B:38:0x008f, B:39:0x00a9), top: B:90:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean C(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.C(int, byte[]):boolean");
    }

    private final SQLiteDatabase J() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
            return null;
        }
        return writableDatabase;
    }

    private final boolean K() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> B(int r23) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.B(int):java.util.List");
    }

    public final boolean D(zzae zzaeVar) {
        h();
        byte[] p0 = jb.p0(zzaeVar);
        if (p0.length > 131072) {
            n().H().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return C(2, p0);
    }

    public final boolean E(zzbe zzbeVar) {
        Parcel obtain = Parcel.obtain();
        zzbeVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            n().H().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return C(0, marshall);
    }

    public final boolean F(zznb zznbVar) {
        Parcel obtain = Parcel.obtain();
        zznbVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            n().H().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return C(1, marshall);
    }

    public final void G() {
        int delete;
        l();
        try {
            SQLiteDatabase J = J();
            if (J != null && (delete = J.delete("messages", null, null)) > 0) {
                n().J().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            n().F().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean H() {
        return C(3, new byte[0]);
    }

    public final boolean I() {
        l();
        if (this.d || !K()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase J = J();
                    if (J == null) {
                        this.d = true;
                        if (J != null) {
                            J.close();
                        }
                        return false;
                    }
                    J.beginTransaction();
                    J.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    J.setTransactionSuccessful();
                    J.endTransaction();
                    J.close();
                    return true;
                } catch (SQLiteFullException e) {
                    n().F().b("Error deleting app launch break from local database", e);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                n().F().b("Error deleting app launch break from local database", e2);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        n().K().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ f4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ i4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ z6 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ o8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x8 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ ea t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.x2
    protected final boolean z() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
