package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.k0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.business.transport.PushMessageAttributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class k extends ua {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {PushMessageAttributes.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    private static final String[] o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final p d;
    private final oa e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(va vaVar) {
        super(vaVar);
        this.e = new oa(b());
        this.d = new p(this, zza(), "google_app_measurement.db");
    }

    private final long F(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = A().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j3 = cursor.getLong(0);
                    cursor.close();
                    return j3;
                }
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                n().F().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object L(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            n().F().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        n().F().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i2);
                }
                return Double.valueOf(cursor.getDouble(i2));
            }
            return Long.valueOf(cursor.getLong(i2));
        }
        n().F().a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T M(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.q<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.A()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.k4 r4 = r2.n()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.m4 r4 = r4.J()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.k4 r5 = r2.n()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.m4 r5 = r5.F()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.M(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.q):java.lang.Object");
    }

    private final String O(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = A().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e) {
                n().F().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void S(ContentValues contentValues, String str, Object obj) {
        gh8.f(str);
        gh8.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final void X(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase A = A();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                n().G().b("Value of the primary key is not set.", k4.u(str2));
                return;
            }
            if (A.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && A.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                n().F().c("Failed to insert/update table (got -1). key", k4.u(str), k4.u(str2));
            }
        } catch (SQLiteException e) {
            n().F().d("Error storing into table. key", k4.u(str), k4.u(str2), e);
        }
    }

    private final boolean e0(String str, int i2, com.google.android.gms.internal.measurement.c cVar) {
        Integer num;
        Boolean bool;
        t();
        l();
        gh8.f(str);
        gh8.j(cVar);
        Integer num2 = null;
        if (cVar.Q().isEmpty()) {
            m4 K = n().K();
            Object u = k4.u(str);
            Integer valueOf = Integer.valueOf(i2);
            if (cVar.X()) {
                num2 = Integer.valueOf(cVar.M());
            }
            K.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", u, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] k2 = cVar.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (cVar.X()) {
            num = Integer.valueOf(cVar.M());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", cVar.Q());
        if (cVar.Y()) {
            bool = Boolean.valueOf(cVar.U());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", k2);
        try {
            if (A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert event filter (got -1). appId", k4.u(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing event filter. appId", k4.u(str), e);
            return false;
        }
    }

    private final boolean f0(String str, int i2, com.google.android.gms.internal.measurement.f fVar) {
        Integer num;
        Boolean bool;
        t();
        l();
        gh8.f(str);
        gh8.j(fVar);
        Integer num2 = null;
        if (fVar.M().isEmpty()) {
            m4 K = n().K();
            Object u = k4.u(str);
            Integer valueOf = Integer.valueOf(i2);
            if (fVar.Q()) {
                num2 = Integer.valueOf(fVar.m());
            }
            K.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", u, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] k2 = fVar.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (fVar.Q()) {
            num = Integer.valueOf(fVar.m());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", fVar.M());
        if (fVar.R()) {
            bool = Boolean.valueOf(fVar.P());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", k2);
        try {
            if (A().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert property filter (got -1). appId", k4.u(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing property filter. appId", k4.u(str), e);
            return false;
        }
    }

    private final boolean t0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long w0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                n().F().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean y0(String str, List<Integer> list) {
        gh8.f(str);
        t();
        l();
        SQLiteDatabase A = A();
        try {
            long w0 = w0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, a().u(str, b0.H)));
            if (w0 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            if (A.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)}) <= 0) {
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Database error querying filters. appId", k4.u(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase A() {
        l();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            n().K().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzae A0(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.A0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.k4 r3 = r6.n()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.B():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.y B0(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.B0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.y");
    }

    public final int C(String str, String str2) {
        gh8.f(str);
        gh8.f(str2);
        l();
        t();
        try {
            return A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            n().F().d("Error deleting conditional property", k4.u(str), f().g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01cd A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0222 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0231 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0249 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0270 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029c A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bd A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e1 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0307 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0334 A[Catch: all -> 0x0180, SQLiteException -> 0x0184, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:10:0x011a, B:12:0x0177, B:21:0x0188, B:25:0x01d2, B:27:0x0201, B:32:0x020b, B:36:0x0226, B:38:0x0231, B:39:0x0243, B:41:0x0249, B:43:0x0255, B:45:0x0261, B:46:0x026a, B:48:0x0270, B:50:0x027c, B:52:0x0284, B:56:0x028d, B:58:0x029c, B:59:0x02a5, B:61:0x02bd, B:63:0x02c9, B:64:0x02db, B:66:0x02e1, B:68:0x02ed, B:70:0x02f5, B:74:0x02fe, B:75:0x0301, B:77:0x0307, B:79:0x0313, B:86:0x0328, B:82:0x031d, B:85:0x0324, B:87:0x032b, B:89:0x0334, B:35:0x0222, B:24:0x01cd, B:100:0x035a), top: B:107:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.u4 C0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.C0(java.lang.String):com.google.android.gms.measurement.internal.u4");
    }

    public final long D(com.google.android.gms.internal.measurement.i0 i0Var) throws IOException {
        l();
        t();
        gh8.j(i0Var);
        gh8.f(i0Var.G3());
        byte[] k2 = i0Var.k();
        long z = m().z(k2);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, i0Var.G3());
        contentValues.put("metadata_fingerprint", Long.valueOf(z));
        contentValues.put("metadata", k2);
        try {
            A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return z;
        } catch (SQLiteException e) {
            n().F().c("Error storing raw event metadata. appId", k4.u(i0Var.G3()), e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.l D0(java.lang.String r13) {
        /*
            r12 = this;
            defpackage.gh8.f(r13)
            r12.l()
            r12.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.A()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r2 != 0) goto L39
            r1.close()
            return r0
        L39:
            byte[] r2 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r3 = r1.getString(r10)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r4 = r1.getString(r11)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r5 == 0) goto L62
            com.google.android.gms.measurement.internal.k4 r5 = r12.n()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            com.google.android.gms.measurement.internal.m4 r5 = r5.F()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.k4.u(r13)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            goto L62
        L5d:
            r13 = move-exception
            r0 = r1
            goto L8c
        L60:
            r2 = move-exception
            goto L75
        L62:
            if (r2 != 0) goto L68
            r1.close()
            return r0
        L68:
            com.google.android.gms.measurement.internal.l r5 = new com.google.android.gms.measurement.internal.l     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r1.close()
            return r5
        L71:
            r13 = move-exception
            goto L8c
        L73:
            r2 = move-exception
            r1 = r0
        L75:
            com.google.android.gms.measurement.internal.k4 r3 = r12.n()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.k4.u(r13)     // Catch: java.lang.Throwable -> L5d
            r3.c(r4, r13, r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L8b
            r1.close()
        L8b:
            return r0
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.D0(java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    public final long E(String str) {
        gh8.f(str);
        l();
        t();
        try {
            return A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, a().u(str, b0.r))))});
        } catch (SQLiteException e) {
            n().F().c("Error deleting over the limit events. appId", k4.u(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.gb E0(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            defpackage.gh8.f(r14)
            defpackage.gh8.f(r15)
            r13.l()
            r13.t()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.A()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.Object r9 = r13.L(r2, r11)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            com.google.android.gms.measurement.internal.gb r0 = new com.google.android.gms.measurement.internal.gb     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r3 == 0) goto L73
            com.google.android.gms.measurement.internal.k4 r3 = r13.n()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.k4.u(r14)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            goto L73
        L6e:
            r0 = move-exception
            r1 = r2
            goto L9a
        L71:
            r0 = move-exception
            goto L7b
        L73:
            r2.close()
            return r0
        L77:
            r0 = move-exception
            goto L9a
        L79:
            r0 = move-exception
            r2 = r1
        L7b:
            com.google.android.gms.measurement.internal.k4 r3 = r13.n()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.k4.u(r14)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.measurement.internal.j4 r6 = r13.f()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.g(r15)     // Catch: java.lang.Throwable -> L6e
            r3.d(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L99
            r2.close()
        L99:
            return r1
        L9a:
            if (r1 == 0) goto L9f
            r1.close()
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.E0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.gb");
    }

    public final t F0(String str) {
        if (y5d.a() && a().s(b0.Q0)) {
            gh8.j(str);
            l();
            t();
            return t.c(O("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
        }
        return t.f;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0036: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.d0, java.lang.Long> G(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.l()
            r7.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.A()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            if (r2 != 0) goto L3a
            com.google.android.gms.measurement.internal.k4 r8 = r7.n()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.measurement.internal.m4 r8 = r8.J()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L35:
            r8 = move-exception
            r0 = r1
            goto L8d
        L38:
            r8 = move-exception
            goto L7a
        L3a:
            byte[] r2 = r1.getBlob(r4)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            long r3 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.internal.measurement.d0$a r4 = com.google.android.gms.internal.measurement.d0.b0()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            j3d r2 = com.google.android.gms.measurement.internal.db.P(r4, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.d0$a r2 = (com.google.android.gms.internal.measurement.d0.a) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            h3d r2 = r2.u()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.b2 r2 = (com.google.android.gms.internal.measurement.b2) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.d0 r2 = (com.google.android.gms.internal.measurement.d0) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r8
        L60:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k4 r3 = r7.n()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.k4.u(r8)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r3.d(r4, r8, r9, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L76:
            r8 = move-exception
            goto L8d
        L78:
            r8 = move-exception
            r1 = r0
        L7a:
            com.google.android.gms.measurement.internal.k4 r9 = r7.n()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.measurement.internal.m4 r9 = r9.F()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            return r0
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.G(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<com.google.android.gms.internal.measurement.c>> G0(String str, String str2) {
        t();
        l();
        gh8.f(str);
        gh8.f(str2);
        lr lrVar = new lr();
        Cursor cursor = null;
        try {
            try {
                Cursor query = A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.c>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.b2) ((c.a) db.P(com.google.android.gms.internal.measurement.c.N(), query.getBlob(1))).u());
                        int i2 = query.getInt(0);
                        List list = (List) lrVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            lrVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(cVar);
                    } catch (IOException e) {
                        n().F().c("Failed to merge filter. appId", k4.u(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return lrVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            n().F().c("Database error querying filters. appId", k4.u(str), e2);
            Map<Integer, List<com.google.android.gms.internal.measurement.c>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.o H(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.H(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.o");
    }

    public final w6 H0(String str) {
        gh8.j(str);
        l();
        t();
        if (y5d.a() && a().s(b0.Q0)) {
            w6 w6Var = (w6) M("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new q() { // from class: com.google.android.gms.measurement.internal.m
                @Override // com.google.android.gms.measurement.internal.q
                public final Object a(Cursor cursor) {
                    w6 f2;
                    f2 = w6.f(cursor.getString(0), cursor.getInt(1));
                    return f2;
                }
            });
            if (w6Var == null) {
                return w6.c;
            }
            return w6Var;
        }
        return w6.e(O("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    public final o I(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return H(j2, str, 1L, false, false, z3, false, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<com.google.android.gms.internal.measurement.f>> I0(String str, String str2) {
        t();
        l();
        gh8.f(str);
        gh8.f(str2);
        lr lrVar = new lr();
        Cursor cursor = null;
        try {
            try {
                Cursor query = A().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.f>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.f fVar = (com.google.android.gms.internal.measurement.f) ((com.google.android.gms.internal.measurement.b2) ((f.a) db.P(com.google.android.gms.internal.measurement.f.K(), query.getBlob(1))).u());
                        int i2 = query.getInt(0);
                        List list = (List) lrVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            lrVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(fVar);
                    } catch (IOException e) {
                        n().F().c("Failed to merge filter", k4.u(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return lrVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            n().F().c("Database error querying filters. appId", k4.u(str), e2);
            Map<Integer, List<com.google.android.gms.internal.measurement.f>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    public final List<zzmh> J0(String str) {
        gh8.f(str);
        l();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = A().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", KustoStorage.KustoTable.COLUMN_SOURCE}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzmh(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                n().F().c("Error querying trigger uris. appId", k4.u(str), e);
                List<zzmh> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void K0(String str, String str2) {
        gh8.f(str);
        gh8.f(str2);
        l();
        t();
        try {
            A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            n().F().d("Error deleting user property. appId", k4.u(str), f().g(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.gb> L0(java.lang.String r16) {
        /*
            r15 = this;
            defpackage.gh8.f(r16)
            r15.l()
            r15.t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.A()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto Lab
        L57:
            r0 = move-exception
            r2 = r15
            goto L90
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.L(r1, r14)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r9 != 0) goto L7b
            com.google.android.gms.measurement.internal.k4 r3 = r15.n()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.k4.u(r16)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            goto L86
        L77:
            r0 = move-exception
            goto Lab
        L79:
            r0 = move-exception
            goto L90
        L7b:
            com.google.android.gms.measurement.internal.gb r10 = new com.google.android.gms.measurement.internal.gb     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0.add(r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
        L86:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L90:
            com.google.android.gms.measurement.internal.k4 r3 = r15.n()     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.k4.u(r16)     // Catch: java.lang.Throwable -> L77
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L77
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.L0(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, com.google.android.gms.internal.measurement.k0> M0(String str) {
        t();
        l();
        gh8.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, com.google.android.gms.internal.measurement.k0> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                lr lrVar = new lr();
                do {
                    int i2 = query.getInt(0);
                    try {
                        lrVar.put(Integer.valueOf(i2), (com.google.android.gms.internal.measurement.k0) ((com.google.android.gms.internal.measurement.b2) ((k0.a) db.P(com.google.android.gms.internal.measurement.k0.X(), query.getBlob(1))).u()));
                    } catch (IOException e) {
                        n().F().d("Failed to merge filter results. appId, audienceId, error", k4.u(str), Integer.valueOf(i2), e);
                    }
                } while (query.moveToNext());
                query.close();
                return lrVar;
            } catch (SQLiteException e2) {
                n().F().c("Database error querying filter results. appId", k4.u(str), e2);
                Map<Integer, com.google.android.gms.internal.measurement.k0> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String N(long r5) {
        /*
            r4 = this;
            r4.l()
            r4.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.A()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            if (r1 != 0) goto L37
            com.google.android.gms.measurement.internal.k4 r6 = r4.n()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            com.google.android.gms.measurement.internal.m4 r6 = r6.J()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r0
        L32:
            r6 = move-exception
            r0 = r5
            goto L56
        L35:
            r6 = move-exception
            goto L43
        L37:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r6
        L3f:
            r6 = move-exception
            goto L56
        L41:
            r6 = move-exception
            r5 = r0
        L43:
            com.google.android.gms.measurement.internal.k4 r1 = r4.n()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.measurement.internal.m4 r1 = r1.F()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L55
            r5.close()
        L55:
            return r0
        L56:
            if (r0 == 0) goto L5b
            r0.close()
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.N(long):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<com.google.android.gms.internal.measurement.c>> N0(String str) {
        gh8.f(str);
        lr lrVar = new lr();
        Cursor cursor = null;
        try {
            try {
                Cursor query = A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.c>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.b2) ((c.a) db.P(com.google.android.gms.internal.measurement.c.N(), query.getBlob(1))).u());
                        if (cVar.V()) {
                            int i2 = query.getInt(0);
                            List list = (List) lrVar.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                lrVar.put(Integer.valueOf(i2), list);
                            }
                            list.add(cVar);
                        }
                    } catch (IOException e) {
                        n().F().c("Failed to merge filter. appId", k4.u(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return lrVar;
            } catch (SQLiteException e2) {
                n().F().c("Database error querying filters. appId", k4.u(str), e2);
                Map<Integer, List<com.google.android.gms.internal.measurement.c>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> O0(String str) {
        t();
        l();
        gh8.f(str);
        lr lrVar = new lr();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i2 = rawQuery.getInt(0);
                    List list = (List) lrVar.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        lrVar.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return lrVar;
            } catch (SQLiteException e) {
                n().F().c("Database error querying scoped filters. appId", k4.u(str), e);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<Pair<com.google.android.gms.internal.measurement.i0, Long>> P(String str, int i2, int i3) {
        boolean z;
        boolean z2;
        byte[] l0;
        long j2;
        long j3;
        l();
        t();
        int i4 = 1;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        gh8.a(z);
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gh8.a(z2);
        gh8.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = A().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List<Pair<com.google.android.gms.internal.measurement.i0, Long>> emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    long j4 = query.getLong(0);
                    try {
                        l0 = m().l0(query.getBlob(i4));
                    } catch (IOException e) {
                        n().F().c("Failed to unzip queued bundle. appId", k4.u(str), e);
                    }
                    if (!arrayList.isEmpty() && l0.length + i5 > i3) {
                        break;
                    }
                    try {
                        i0.a aVar = (i0.a) db.P(com.google.android.gms.internal.measurement.i0.D3(), l0);
                        if (y5d.a() && a().s(b0.U0) && !arrayList.isEmpty()) {
                            com.google.android.gms.internal.measurement.i0 i0Var = (com.google.android.gms.internal.measurement.i0) ((Pair) arrayList.get(0)).first;
                            com.google.android.gms.internal.measurement.i0 i0Var2 = (com.google.android.gms.internal.measurement.i0) ((com.google.android.gms.internal.measurement.b2) aVar.u());
                            if (!i0Var.h0().equals(i0Var2.h0()) || !i0Var.g0().equals(i0Var2.g0()) || i0Var.x0() != i0Var2.x0() || !i0Var.i0().equals(i0Var2.i0())) {
                                break;
                            }
                            Iterator<com.google.android.gms.internal.measurement.m0> it = i0Var.v0().iterator();
                            while (true) {
                                j2 = -1;
                                if (it.hasNext()) {
                                    com.google.android.gms.internal.measurement.m0 next = it.next();
                                    if ("_npa".equals(next.b0())) {
                                        j3 = next.V();
                                        break;
                                    }
                                } else {
                                    j3 = -1;
                                    break;
                                }
                            }
                            Iterator<com.google.android.gms.internal.measurement.m0> it2 = i0Var2.v0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.m0 next2 = it2.next();
                                if ("_npa".equals(next2.b0())) {
                                    j2 = next2.V();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.w0(query.getInt(2));
                        }
                        i5 += l0.length;
                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.i0) ((com.google.android.gms.internal.measurement.b2) aVar.u()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        n().F().c("Failed to merge queued bundle. appId", k4.u(str), e2);
                    }
                    if (!query.moveToNext() || i5 > i3) {
                        break;
                    }
                    i4 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                n().F().c("Error querying bundles. appId", k4.u(str), e3);
                List<Pair<com.google.android.gms.internal.measurement.i0, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void P0() {
        t();
        A().beginTransaction();
    }

    public final List<zzae> Q(String str, String str2, String str3) {
        gh8.f(str);
        l();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + Marker.ANY_MARKER);
            sb.append(" and name glob ?");
        }
        return R(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void Q0() {
        t();
        A().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
        n().F().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> R(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.R(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R0() {
        int delete;
        l();
        t();
        if (!t0()) {
            return;
        }
        long a = r().e.a();
        long b = b().b();
        if (Math.abs(b - a) > b0.A.a(null).longValue()) {
            r().e.b(b);
            l();
            t();
            if (t0() && (delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().currentTimeMillis()), String.valueOf(g.L())})) > 0) {
                n().J().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void S0() {
        t();
        A().setTransactionSuccessful();
    }

    public final void T(y yVar) {
        Long l2;
        gh8.j(yVar);
        l();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, yVar.a);
        contentValues.put(Action.NAME_ATTRIBUTE, yVar.b);
        contentValues.put("lifetime_count", Long.valueOf(yVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(yVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(yVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(yVar.g));
        contentValues.put("last_bundled_day", yVar.h);
        contentValues.put("last_sampled_complex_event_id", yVar.i);
        contentValues.put("last_sampling_rate", yVar.j);
        contentValues.put("current_session_count", Long.valueOf(yVar.e));
        Boolean bool = yVar.k;
        if (bool != null && bool.booleanValue()) {
            l2 = 1L;
        } else {
            l2 = null;
        }
        contentValues.put("last_exempt_from_sampling", l2);
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert/update event aggregates (got -1). appId", k4.u(yVar.a));
            }
        } catch (SQLiteException e) {
            n().F().c("Error storing event aggregates. appId", k4.u(yVar.a), e);
        }
    }

    public final boolean T0() {
        if (w0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final void U(u4 u4Var) {
        gh8.j(u4Var);
        l();
        t();
        String v0 = u4Var.v0();
        gh8.j(v0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, v0);
        contentValues.put("app_instance_id", u4Var.w0());
        contentValues.put("gmp_app_id", u4Var.j());
        contentValues.put("resettable_device_id_hash", u4Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(u4Var.m0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(u4Var.o0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(u4Var.k0()));
        contentValues.put("app_version", u4Var.h());
        contentValues.put("app_store", u4Var.x0());
        contentValues.put("gmp_version", Long.valueOf(u4Var.i0()));
        contentValues.put("dev_cert_hash", Long.valueOf(u4Var.c0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(u4Var.s()));
        contentValues.put("day", Long.valueOf(u4Var.a0()));
        contentValues.put("daily_public_events_count", Long.valueOf(u4Var.U()));
        contentValues.put("daily_events_count", Long.valueOf(u4Var.R()));
        contentValues.put("daily_conversions_count", Long.valueOf(u4Var.L()));
        contentValues.put("config_fetched_time", Long.valueOf(u4Var.I()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(u4Var.g0()));
        contentValues.put("app_version_int", Long.valueOf(u4Var.A()));
        contentValues.put("firebase_instance_id", u4Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(u4Var.O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(u4Var.X()));
        contentValues.put("health_monitor_sample", u4Var.k());
        contentValues.put("android_id", Long.valueOf(u4Var.w()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(u4Var.r()));
        contentValues.put("admob_app_id", u4Var.t0());
        contentValues.put("dynamite_version", Long.valueOf(u4Var.e0()));
        contentValues.put("session_stitching_token", u4Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(u4Var.u()));
        contentValues.put("target_os_version", Long.valueOf(u4Var.r0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(u4Var.q0()));
        if (g8d.a() && a().C(v0, b0.H0)) {
            contentValues.put("ad_services_version", Integer.valueOf(u4Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(u4Var.E()));
        }
        if (s5d.a() && a().C(v0, b0.V0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(u4Var.v()));
        }
        if (i9d.a() && a().C(v0, b0.w0)) {
            contentValues.put("sgtm_preview_key", u4Var.n());
        }
        List<String> o2 = u4Var.o();
        if (o2 != null) {
            if (o2.isEmpty()) {
                n().K().b("Safelisted events should not be an empty list. appId", v0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", o2));
            }
        }
        if (d6d.a() && a().s(b0.p0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (y5d.a() && a().C(v0, b0.Q0)) {
            contentValues.put("npa_metadata_value", u4Var.s0());
        }
        try {
            SQLiteDatabase A = A();
            if (A.update("apps", contentValues, "app_id = ?", new String[]{v0}) == 0 && A.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert/update app (got -1). appId", k4.u(v0));
            }
        } catch (SQLiteException e) {
            n().F().c("Error storing app. appId", k4.u(v0), e);
        }
    }

    public final boolean U0() {
        if (w0("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final void V(String str, t tVar) {
        if (y5d.a() && a().s(b0.Q0)) {
            gh8.j(str);
            gh8.j(tVar);
            l();
            t();
            ContentValues contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
            contentValues.put("dma_consent_settings", tVar.i());
            X("consent_settings", HiAnalyticsConstant.BI_KEY_APP_ID, contentValues);
        }
    }

    public final boolean V0() {
        if (w0("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final void W(String str, w6 w6Var) {
        gh8.j(str);
        gh8.j(w6Var);
        l();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("consent_state", w6Var.v());
        if (y5d.a() && a().s(b0.Q0)) {
            contentValues.put("consent_source", Integer.valueOf(w6Var.b()));
            X("consent_settings", HiAnalyticsConstant.BI_KEY_APP_ID, contentValues);
            return;
        }
        try {
            if (A().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert/update consent setting (got -1). appId", k4.u(str));
            }
        } catch (SQLiteException e) {
            n().F().c("Error storing consent setting. appId, error", k4.u(str), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(String str, List<com.google.android.gms.internal.measurement.b> list) {
        Integer num;
        boolean z;
        boolean z2;
        gh8.j(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            b.a z3 = list.get(i2).z();
            if (z3.s() != 0) {
                for (int i3 = 0; i3 < z3.s(); i3++) {
                    c.a z4 = z3.w(i3).z();
                    c.a aVar = (c.a) ((b2.b) z4.clone());
                    String b = d1d.b(z4.y());
                    if (b != null) {
                        aVar.v(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < z4.s(); i4++) {
                        com.google.android.gms.internal.measurement.d w = z4.w(i4);
                        String a = g1d.a(w.N());
                        if (a != null) {
                            aVar.t(i4, (com.google.android.gms.internal.measurement.d) ((com.google.android.gms.internal.measurement.b2) w.z().s(a).u()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        b.a t = z3.t(i3, aVar);
                        list.set(i2, (com.google.android.gms.internal.measurement.b) ((com.google.android.gms.internal.measurement.b2) t.u()));
                        z3 = t;
                    }
                }
            }
            if (z3.y() != 0) {
                for (int i5 = 0; i5 < z3.y(); i5++) {
                    com.google.android.gms.internal.measurement.f z5 = z3.z(i5);
                    String a2 = f1d.a(z5.M());
                    if (a2 != null) {
                        z3 = z3.v(i5, z5.z().s(a2));
                        list.set(i2, (com.google.android.gms.internal.measurement.b) ((com.google.android.gms.internal.measurement.b2) z3.u()));
                    }
                }
            }
        }
        t();
        l();
        gh8.f(str);
        gh8.j(list);
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            t();
            l();
            gh8.f(str);
            SQLiteDatabase A2 = A();
            A2.delete("property_filters", "app_id=?", new String[]{str});
            A2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.b bVar : list) {
                t();
                l();
                gh8.f(str);
                gh8.j(bVar);
                if (!bVar.S()) {
                    n().K().b("Audience with no ID. appId", k4.u(str));
                } else {
                    int m2 = bVar.m();
                    Iterator<com.google.android.gms.internal.measurement.c> it = bVar.Q().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().X()) {
                                n().K().c("Event filter with no ID. Audience definition ignored. appId, audienceId", k4.u(str), Integer.valueOf(m2));
                                break;
                            }
                        } else {
                            Iterator<com.google.android.gms.internal.measurement.f> it2 = bVar.R().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().Q()) {
                                        n().K().c("Property filter with no ID. Audience definition ignored. appId, audienceId", k4.u(str), Integer.valueOf(m2));
                                        break;
                                    }
                                } else {
                                    Iterator<com.google.android.gms.internal.measurement.c> it3 = bVar.Q().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!e0(str, m2, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        for (com.google.android.gms.internal.measurement.f fVar : bVar.R()) {
                                            if (!f0(str, m2, fVar)) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        t();
                                        l();
                                        gh8.f(str);
                                        SQLiteDatabase A3 = A();
                                        A3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m2)});
                                        A3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m2)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.b bVar2 : list) {
                if (bVar2.S()) {
                    num = Integer.valueOf(bVar2.m());
                } else {
                    num = null;
                }
                arrayList.add(num);
            }
            y0(str, arrayList);
            A.setTransactionSuccessful();
            A.endTransaction();
        } catch (Throwable th) {
            A.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(List<Long> list) {
        l();
        t();
        gh8.j(list);
        gh8.l(list.size());
        if (!t0()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (w0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            n().K().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            A().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e) {
            n().F().b("Error incrementing retry count. error", e);
        }
    }

    public final boolean a0(com.google.android.gms.internal.measurement.i0 i0Var, boolean z) {
        l();
        t();
        gh8.j(i0Var);
        gh8.f(i0Var.G3());
        gh8.m(i0Var.V0());
        R0();
        long currentTimeMillis = b().currentTimeMillis();
        if (i0Var.a3() < currentTimeMillis - g.L() || i0Var.a3() > g.L() + currentTimeMillis) {
            n().K().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", k4.u(i0Var.G3()), Long.valueOf(currentTimeMillis), Long.valueOf(i0Var.a3()));
        }
        try {
            byte[] i0 = m().i0(i0Var.k());
            n().J().b("Saving bundle, size", Integer.valueOf(i0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, i0Var.G3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(i0Var.a3()));
            contentValues.put("data", i0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (i0Var.c1()) {
                contentValues.put("retry_count", Integer.valueOf(i0Var.h2()));
            }
            try {
                if (A().insert("queue", null, contentValues) == -1) {
                    n().F().b("Failed to insert bundle (got -1). appId", k4.u(i0Var.G3()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                n().F().c("Error storing bundle. appId", k4.u(i0Var.G3()), e);
                return false;
            }
        } catch (IOException e2) {
            n().F().c("Data loss. Failed to serialize bundle. appId", k4.u(i0Var.G3()), e2);
            return false;
        }
    }

    public final boolean b0(zzae zzaeVar) {
        gh8.j(zzaeVar);
        l();
        t();
        String str = zzaeVar.a;
        gh8.j(str);
        if (E0(str, zzaeVar.c.b) == null && w0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put(PushMessageAttributes.ORIGIN, zzaeVar.b);
        contentValues.put(Action.NAME_ATTRIBUTE, zzaeVar.c.b);
        S(contentValues, "value", gh8.j(zzaeVar.c.h()));
        contentValues.put("active", Boolean.valueOf(zzaeVar.e));
        contentValues.put("trigger_event_name", zzaeVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzaeVar.h));
        h();
        contentValues.put("timed_out_event", jb.p0(zzaeVar.g));
        contentValues.put("creation_timestamp", Long.valueOf(zzaeVar.d));
        h();
        contentValues.put("triggered_event", jb.p0(zzaeVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaeVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzaeVar.j));
        h();
        contentValues.put("expired_event", jb.p0(zzaeVar.k));
        try {
            if (A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert/update conditional user property (got -1)", k4.u(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing conditional user property", k4.u(str), e);
            return true;
        }
    }

    public final boolean c0(v vVar, long j2, boolean z) {
        l();
        t();
        gh8.j(vVar);
        gh8.f(vVar.a);
        byte[] k2 = m().D(vVar).k();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, vVar.a);
        contentValues.put(Action.NAME_ATTRIBUTE, vVar.b);
        contentValues.put("timestamp", Long.valueOf(vVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", k2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (A().insert("raw_events", null, contentValues) == -1) {
                n().F().b("Failed to insert raw event (got -1). appId", k4.u(vVar.a));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing raw event. appId", k4.u(vVar.a), e);
            return false;
        }
    }

    public final boolean d0(gb gbVar) {
        gh8.j(gbVar);
        l();
        t();
        if (E0(gbVar.a, gbVar.c) == null) {
            if (jb.I0(gbVar.c)) {
                if (w0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{gbVar.a}) >= a().p(gbVar.a, b0.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(gbVar.c) && w0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{gbVar.a, gbVar.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, gbVar.a);
        contentValues.put(PushMessageAttributes.ORIGIN, gbVar.b);
        contentValues.put(Action.NAME_ATTRIBUTE, gbVar.c);
        contentValues.put("set_timestamp", Long.valueOf(gbVar.d));
        S(contentValues, "value", gbVar.e);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert/update user property (got -1). appId", k4.u(gbVar.a));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing user property. appId", k4.u(gbVar.a), e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g0(String str, Bundle bundle) {
        l();
        t();
        byte[] k2 = m().D(new v(this.a, "", str, "dep", 0L, 0L, bundle)).k();
        n().J().c("Saving default event parameters, appId, data size", f().c(str), Integer.valueOf(k2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("parameters", k2);
        try {
            if (A().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert default event parameters (got -1). appId", k4.u(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing default event parameters. appId", k4.u(str), e);
            return false;
        }
    }

    public final boolean h0(String str, zzmh zzmhVar) {
        l();
        t();
        gh8.j(zzmhVar);
        gh8.f(str);
        long currentTimeMillis = b().currentTimeMillis();
        if (zzmhVar.b < currentTimeMillis - g.L() || zzmhVar.b > g.L() + currentTimeMillis) {
            n().K().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", k4.u(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzmhVar.b));
        }
        n().J().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("trigger_uri", zzmhVar.a);
        contentValues.put(KustoStorage.KustoTable.COLUMN_SOURCE, Integer.valueOf(zzmhVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(zzmhVar.b));
        try {
            if (A().insert("trigger_uris", null, contentValues) == -1) {
                n().F().b("Failed to insert trigger URI (got -1). appId", k4.u(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing trigger URI. appId", k4.u(str), e);
            return false;
        }
    }

    public final boolean i0(String str, Long l2, long j2, com.google.android.gms.internal.measurement.d0 d0Var) {
        l();
        t();
        gh8.j(d0Var);
        gh8.f(str);
        gh8.j(l2);
        byte[] k2 = d0Var.k();
        n().J().c("Saving complex main event, appId, data size", f().c(str), Integer.valueOf(k2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", k2);
        try {
            if (A().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                n().F().b("Failed to insert complex main event (got -1). appId", k4.u(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            n().F().c("Error storing complex main event. appId", k4.u(str), e);
            return false;
        }
    }

    public final long u0(String str) {
        gh8.f(str);
        return F("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long v0(String str, String str2) {
        gh8.f(str);
        gh8.f(str2);
        l();
        t();
        SQLiteDatabase A = A();
        A.beginTransaction();
        long j2 = 0;
        try {
            try {
                try {
                    long F = F("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                    if (F == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (A.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            n().F().c("Failed to insert column (got -1). appId", k4.u(str), str2);
                            A.endTransaction();
                            return -1L;
                        }
                        F = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                        contentValues2.put(str2, Long.valueOf(1 + F));
                        if (A.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            n().F().c("Failed to update column (got 0). appId", k4.u(str), str2);
                            A.endTransaction();
                            return -1L;
                        }
                        A.setTransactionSuccessful();
                        A.endTransaction();
                        return F;
                    } catch (SQLiteException e) {
                        e = e;
                        j2 = F;
                        n().F().d("Error inserting column. appId", k4.u(str), str2, e);
                        A.endTransaction();
                        return j2;
                    }
                } catch (Throwable th) {
                    th = th;
                    A.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    public final long x() {
        Cursor cursor = null;
        try {
            try {
                cursor = A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                n().F().b("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
        n().F().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.gb> x0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.x0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long y() {
        return F("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long z() {
        return F("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle z0(java.lang.String r6) {
        /*
            r5 = this;
            r5.l()
            r5.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.A()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.k4 r6 = r5.n()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.m4 r6 = r6.J()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.d0$a r3 = com.google.android.gms.internal.measurement.d0.b0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            j3d r2 = com.google.android.gms.measurement.internal.db.P(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.d0$a r2 = (com.google.android.gms.internal.measurement.d0.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            h3d r2 = r2.u()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.b2 r2 = (com.google.android.gms.internal.measurement.b2) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.d0 r2 = (com.google.android.gms.internal.measurement.d0) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.m()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.e0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.db.A(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k4 r3 = r5.n()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.m4 r3 = r3.F()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.k4.u(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.k4 r2 = r5.n()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.m4 r2 = r2.F()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.z0(java.lang.String):android.os.Bundle");
    }
}
