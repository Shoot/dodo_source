package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.m91;
import defpackage.rw5;
import defpackage.t3b;
import defpackage.wk3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: SQLiteEventStore.java */
/* renamed from: gs9  reason: default package */
/* loaded from: classes2.dex */
public class gs9 implements el3, t3b, k91 {
    private static final eh3 f = eh3.b("proto");
    private final ow9 a;
    private final x91 b;
    private final x91 c;
    private final fl3 d;
    private final as8<String> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: gs9$b */
    /* loaded from: classes2.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: gs9$c */
    /* loaded from: classes2.dex */
    public static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: gs9$d */
    /* loaded from: classes2.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gs9(x91 x91Var, x91 x91Var2, fl3 fl3Var, ow9 ow9Var, as8<String> as8Var) {
        this.a = ow9Var;
        this.b = x91Var;
        this.c = x91Var2;
        this.d = fl3Var;
        this.e = as8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object A1(String str, rw5.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) R1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())}), new b() { // from class: or9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Boolean y1;
                y1 = gs9.y1((Cursor) obj);
                return y1;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.e()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object D1(long j, wlb wlbVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{wlbVar.b(), String.valueOf(ak8.a(wlbVar.d()))}) < 1) {
            contentValues.put("backend_name", wlbVar.b());
            contentValues.put("priority", Integer.valueOf(ak8.a(wlbVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List<xy7> E0(List<xy7> list, Map<Long, Set<c>> map) {
        ListIterator<xy7> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            xy7 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                wk3.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(xy7.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object E1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.b.a()).execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object F0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            e(i, rw5.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private List<xy7> F1(SQLiteDatabase sQLiteDatabase, final wlb wlbVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long r0 = r0(sQLiteDatabase, wlbVar);
        if (r0 == null) {
            return arrayList;
        }
        R1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{r0.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: rr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object o1;
                o1 = gs9.this.o1(arrayList, wlbVar, (Cursor) obj);
                return o1;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> G1(SQLiteDatabase sQLiteDatabase, List<xy7> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        R1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", Action.NAME_ATTRIBUTE, "value"}, sb.toString(), null, null, null, null), new b() { // from class: mr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object q1;
                q1 = gs9.q1(hashMap, (Cursor) obj);
                return q1;
            }
        });
        return hashMap;
    }

    private static byte[] H1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer I0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        R1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: lr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object F0;
                F0 = gs9.this.F0((Cursor) obj);
                return F0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    private void I1(m91.a aVar, Map<String, List<rw5>> map) {
        for (Map.Entry<String, List<rw5>> entry : map.entrySet()) {
            aVar.a(ex5.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] J1(long j) {
        return (byte[]) R1(m0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: ur9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                byte[] t1;
                t1 = gs9.t1((Cursor) obj);
                return t1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object K0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private <T> T K1(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.c.a() >= this.d.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object M0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase N0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long O0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private static eh3 P1(String str) {
        if (str == null) {
            return f;
        }
        return eh3.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ugb Q0(long j, Cursor cursor) {
        cursor.moveToNext();
        return ugb.c().c(cursor.getLong(0)).b(j).a();
    }

    private static String Q1(Iterable<xy7> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<xy7> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    static <T> T R1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ugb S0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (ugb) R1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: xr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                ugb Q0;
                Q0 = gs9.Q0(j, (Cursor) obj);
                return Q0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long Y0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Z0(wlb wlbVar, SQLiteDatabase sQLiteDatabase) {
        Long r0 = r0(sQLiteDatabase, wlbVar);
        if (r0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) R1(m0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{r0.toString()}), new b() { // from class: sr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private rw5.b e0(int i) {
        rw5.b bVar = rw5.b.REASON_UNKNOWN;
        if (i == bVar.e()) {
            return bVar;
        }
        rw5.b bVar2 = rw5.b.MESSAGE_TOO_OLD;
        if (i == bVar2.e()) {
            return bVar2;
        }
        rw5.b bVar3 = rw5.b.CACHE_FULL;
        if (i == bVar3.e()) {
            return bVar3;
        }
        rw5.b bVar4 = rw5.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.e()) {
            return bVar4;
        }
        rw5.b bVar5 = rw5.b.MAX_RETRIES_REACHED;
        if (i == bVar5.e()) {
            return bVar5;
        }
        rw5.b bVar6 = rw5.b.INVALID_PAYLOD;
        if (i == bVar6.e()) {
            return bVar6;
        }
        rw5.b bVar7 = rw5.b.SERVER_ERROR;
        if (i == bVar7.e()) {
            return bVar7;
        }
        wx5.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List e1(SQLiteDatabase sQLiteDatabase) {
        return (List) R1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: ds9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                List f1;
                f1 = gs9.f1((Cursor) obj);
                return f1;
            }
        });
    }

    private void f0(final SQLiteDatabase sQLiteDatabase) {
        K1(new d() { // from class: as9
            @Override // defpackage.gs9.d
            public final Object a() {
                Object K0;
                K0 = gs9.K0(sQLiteDatabase);
                return K0;
            }
        }, new b() { // from class: bs9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object M0;
                M0 = gs9.M0((Throwable) obj);
                return M0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List f1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(wlb.a().b(cursor.getString(1)).d(ak8.b(cursor.getInt(2))).c(H1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g1(wlb wlbVar, SQLiteDatabase sQLiteDatabase) {
        xj8[] values;
        List<xy7> F1 = F1(sQLiteDatabase, wlbVar, this.d.d());
        for (xj8 xj8Var : xj8.values()) {
            if (xj8Var != wlbVar.d()) {
                int d2 = this.d.d() - F1.size();
                if (d2 <= 0) {
                    break;
                }
                F1.addAll(F1(sQLiteDatabase, wlbVar.f(xj8Var), d2));
            }
        }
        return E0(F1, G1(sQLiteDatabase, F1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m91 i1(Map map, m91.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            rw5.b e0 = e0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(rw5.c().c(e0).b(j).a());
        }
        I1(aVar, map);
        aVar.e(q0());
        aVar.d(n0());
        aVar.c(this.e.get());
        return aVar.b();
    }

    private long j0(SQLiteDatabase sQLiteDatabase, wlb wlbVar) {
        Long r0 = r0(sQLiteDatabase, wlbVar);
        if (r0 != null) {
            return r0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", wlbVar.b());
        contentValues.put("priority", Integer.valueOf(ak8.a(wlbVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (wlbVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(wlbVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m91 j1(String str, final Map map, final m91.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (m91) R1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: vr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                m91 i1;
                i1 = gs9.this.i1(map, aVar, (Cursor) obj);
                return i1;
            }
        });
    }

    private ig4 n0() {
        return ig4.b().b(qxa.c().b(l0()).c(fl3.a.f()).a()).a();
    }

    private long o0() {
        return m0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o1(List list, wlb wlbVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            wk3.a k = wk3.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                k.h(new zg3(P1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.h(new zg3(P1(cursor.getString(4)), J1(j)));
            }
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(xy7.a(j, wlbVar, k.d()));
        }
        return null;
    }

    private long p0() {
        return m0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private ugb q0() {
        final long a2 = this.b.a();
        return (ugb) x0(new b() { // from class: wr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                ugb S0;
                S0 = gs9.S0(a2, (SQLiteDatabase) obj);
                return S0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private Long r0(SQLiteDatabase sQLiteDatabase, wlb wlbVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(wlbVar.b(), String.valueOf(ak8.a(wlbVar.d()))));
        if (wlbVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(wlbVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) R1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: tr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Long Y0;
                Y0 = gs9.Y0((Cursor) obj);
                return Y0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long s1(wk3 wk3Var, wlb wlbVar, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (z0()) {
            e(1L, rw5.b.CACHE_FULL, wk3Var.j());
            return -1L;
        }
        long j0 = j0(sQLiteDatabase, wlbVar);
        int e = this.d.e();
        byte[] a2 = wk3Var.e().a();
        if (a2.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(j0));
        contentValues.put("transport_name", wk3Var.j());
        contentValues.put("timestamp_ms", Long.valueOf(wk3Var.f()));
        contentValues.put("uptime_ms", Long.valueOf(wk3Var.k()));
        contentValues.put("payload_encoding", wk3Var.e().b().a());
        contentValues.put("code", wk3Var.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a2;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : wk3Var.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(Action.NAME_ATTRIBUTE, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] t1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            e(i, rw5.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        R1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: pr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object w1;
                w1 = gs9.this.w1((Cursor) obj);
                return w1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean y1(Cursor cursor) {
        boolean z;
        if (cursor.getCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private boolean z0() {
        if (o0() * p0() >= this.d.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.el3
    public void A0(Iterable<xy7> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Q1(iterable);
        x0(new b() { // from class: kr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object x1;
                x1 = gs9.this.x1(str, r3, (SQLiteDatabase) obj);
                return x1;
            }
        });
    }

    @Override // defpackage.el3
    public Iterable<xy7> B(final wlb wlbVar) {
        return (Iterable) x0(new b() { // from class: jr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                List g1;
                g1 = gs9.this.g1(wlbVar, (SQLiteDatabase) obj);
                return g1;
            }
        });
    }

    @Override // defpackage.el3
    public xy7 B1(final wlb wlbVar, final wk3 wk3Var) {
        wx5.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", wlbVar.d(), wk3Var.j(), wlbVar.b());
        long longValue = ((Long) x0(new b() { // from class: fs9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Long s1;
                s1 = gs9.this.s1(wk3Var, wlbVar, (SQLiteDatabase) obj);
                return s1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return xy7.a(longValue, wlbVar, wk3Var);
    }

    @Override // defpackage.el3
    public void N1(final wlb wlbVar, final long j) {
        x0(new b() { // from class: hr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object D1;
                D1 = gs9.D1(j, wlbVar, (SQLiteDatabase) obj);
                return D1;
            }
        });
    }

    @Override // defpackage.el3
    public Iterable<wlb> R() {
        return (Iterable) x0(new b() { // from class: fr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                List e1;
                e1 = gs9.e1((SQLiteDatabase) obj);
                return e1;
            }
        });
    }

    @Override // defpackage.el3
    public long X0(wlb wlbVar) {
        return ((Long) R1(m0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{wlbVar.b(), String.valueOf(ak8.a(wlbVar.d()))}), new b() { // from class: zr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Long O0;
                O0 = gs9.O0((Cursor) obj);
                return O0;
            }
        })).longValue();
    }

    @Override // defpackage.k91
    public void a() {
        x0(new b() { // from class: ir9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object E1;
                E1 = gs9.this.E1((SQLiteDatabase) obj);
                return E1;
            }
        });
    }

    @Override // defpackage.t3b
    public <T> T b(t3b.a<T> aVar) {
        SQLiteDatabase m0 = m0();
        f0(m0);
        try {
            T execute = aVar.execute();
            m0.setTransactionSuccessful();
            return execute;
        } finally {
            m0.endTransaction();
        }
    }

    @Override // defpackage.k91
    public m91 c() {
        final m91.a e = m91.e();
        final HashMap hashMap = new HashMap();
        return (m91) x0(new b() { // from class: nr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                m91 j1;
                j1 = gs9.this.j1(r2, hashMap, e, (SQLiteDatabase) obj);
                return j1;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.k91
    public void e(final long j, final rw5.b bVar, final String str) {
        x0(new b() { // from class: gr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Object A1;
                A1 = gs9.A1(str, bVar, j, (SQLiteDatabase) obj);
                return A1;
            }
        });
    }

    long l0() {
        return o0() * p0();
    }

    SQLiteDatabase m0() {
        final ow9 ow9Var = this.a;
        Objects.requireNonNull(ow9Var);
        return (SQLiteDatabase) K1(new d() { // from class: qr9
            @Override // defpackage.gs9.d
            public final Object a() {
                return ow9.this.getWritableDatabase();
            }
        }, new b() { // from class: yr9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                SQLiteDatabase N0;
                N0 = gs9.N0((Throwable) obj);
                return N0;
            }
        });
    }

    @Override // defpackage.el3
    public int p() {
        final long a2 = this.b.a() - this.d.c();
        return ((Integer) x0(new b() { // from class: cs9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Integer I0;
                I0 = gs9.this.I0(a2, (SQLiteDatabase) obj);
                return I0;
            }
        })).intValue();
    }

    @Override // defpackage.el3
    public boolean t0(final wlb wlbVar) {
        return ((Boolean) x0(new b() { // from class: es9
            @Override // defpackage.gs9.b
            public final Object apply(Object obj) {
                Boolean Z0;
                Z0 = gs9.this.Z0(wlbVar, (SQLiteDatabase) obj);
                return Z0;
            }
        })).booleanValue();
    }

    @Override // defpackage.el3
    public void v(Iterable<xy7> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m0().compileStatement("DELETE FROM events WHERE _id in " + Q1(iterable)).execute();
    }

    <T> T x0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m0 = m0();
        m0.beginTransaction();
        try {
            T apply = bVar.apply(m0);
            m0.setTransactionSuccessful();
            return apply;
        } finally {
            m0.endTransaction();
        }
    }
}
