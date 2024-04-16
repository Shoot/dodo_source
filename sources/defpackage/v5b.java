package defpackage;

import android.database.Cursor;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.u5b;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.PushMessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0017"}, d2 = {"Ly2b;", "database", "", "tableName", "Lu5b;", "f", "", "Lu5b$c;", c.a, "Landroid/database/Cursor;", "cursor", "", "Lu5b$d;", "b", "", "Lu5b$a;", "a", "Lu5b$e;", e.a, Action.NAME_ATTRIBUTE, "", "unique", DateTokenConverter.CONVERTER_KEY, "room-runtime_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: v5b  reason: default package */
/* loaded from: classes.dex */
public final class v5b {
    private static final Map<String, u5b.a> a(y2b y2bVar, String str) {
        Map c;
        Map<String, u5b.a> b;
        boolean z;
        Map<String, u5b.a> h;
        Cursor m1 = y2bVar.m1("PRAGMA table_info(`" + str + "`)");
        try {
            if (m1.getColumnCount() <= 0) {
                h = g86.h();
                aa1.a(m1, null);
                return h;
            }
            int columnIndex = m1.getColumnIndex(Action.NAME_ATTRIBUTE);
            int columnIndex2 = m1.getColumnIndex(MessageAttributes.TYPE);
            int columnIndex3 = m1.getColumnIndex("notnull");
            int columnIndex4 = m1.getColumnIndex("pk");
            int columnIndex5 = m1.getColumnIndex("dflt_value");
            c = f86.c();
            while (m1.moveToNext()) {
                String string = m1.getString(columnIndex);
                String string2 = m1.getString(columnIndex2);
                if (m1.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = m1.getInt(columnIndex4);
                String string3 = m1.getString(columnIndex5);
                z65.g(string, Action.NAME_ATTRIBUTE);
                z65.g(string2, MessageAttributes.TYPE);
                c.put(string, new u5b.a(string, string2, z, i, string3, 2));
            }
            b = f86.b(c);
            aa1.a(m1, null);
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(m1, th);
                throw th2;
            }
        }
    }

    private static final List<u5b.d> b(Cursor cursor) {
        List c;
        List a;
        List<u5b.d> x0;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(RemoteMessageConst.FROM);
        int columnIndex4 = cursor.getColumnIndex(RemoteMessageConst.TO);
        c = jc1.c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            z65.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            z65.g(string2, "cursor.getString(toColumnIndex)");
            c.add(new u5b.d(i, i2, string, string2));
        }
        a = jc1.a(c);
        x0 = sc1.x0(a);
        return x0;
    }

    private static final Set<u5b.c> c(y2b y2bVar, String str) {
        Set b;
        Set<u5b.c> a;
        Cursor m1 = y2bVar.m1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = m1.getColumnIndex("id");
            int columnIndex2 = m1.getColumnIndex("seq");
            int columnIndex3 = m1.getColumnIndex("table");
            int columnIndex4 = m1.getColumnIndex("on_delete");
            int columnIndex5 = m1.getColumnIndex("on_update");
            List<u5b.d> b2 = b(m1);
            m1.moveToPosition(-1);
            b = rfa.b();
            while (m1.moveToNext()) {
                if (m1.getInt(columnIndex2) == 0) {
                    int i = m1.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<u5b.d> arrayList3 = new ArrayList();
                    for (Object obj : b2) {
                        if (((u5b.d) obj).h() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (u5b.d dVar : arrayList3) {
                        arrayList.add(dVar.g());
                        arrayList2.add(dVar.i());
                    }
                    String string = m1.getString(columnIndex3);
                    z65.g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = m1.getString(columnIndex4);
                    z65.g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = m1.getString(columnIndex5);
                    z65.g(string3, "cursor.getString(onUpdateColumnIndex)");
                    b.add(new u5b.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            a = rfa.a(b);
            aa1.a(m1, null);
            return a;
        } finally {
        }
    }

    private static final u5b.e d(y2b y2bVar, String str, boolean z) {
        List F0;
        List F02;
        String str2;
        Cursor m1 = y2bVar.m1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = m1.getColumnIndex("seqno");
            int columnIndex2 = m1.getColumnIndex("cid");
            int columnIndex3 = m1.getColumnIndex(Action.NAME_ATTRIBUTE);
            int columnIndex4 = m1.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (m1.moveToNext()) {
                    if (m1.getInt(columnIndex2) >= 0) {
                        int i = m1.getInt(columnIndex);
                        String string = m1.getString(columnIndex3);
                        if (m1.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i);
                        z65.g(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                z65.g(values, "columnsMap.values");
                F0 = sc1.F0(values);
                Collection values2 = treeMap2.values();
                z65.g(values2, "ordersMap.values");
                F02 = sc1.F0(values2);
                u5b.e eVar = new u5b.e(str, z, F0, F02);
                aa1.a(m1, null);
                return eVar;
            }
            aa1.a(m1, null);
            return null;
        } finally {
        }
    }

    private static final Set<u5b.e> e(y2b y2bVar, String str) {
        Set b;
        Set<u5b.e> a;
        Cursor m1 = y2bVar.m1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = m1.getColumnIndex(Action.NAME_ATTRIBUTE);
            int columnIndex2 = m1.getColumnIndex(PushMessageAttributes.ORIGIN);
            int columnIndex3 = m1.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                b = rfa.b();
                while (m1.moveToNext()) {
                    if (z65.c(c.a, m1.getString(columnIndex2))) {
                        String string = m1.getString(columnIndex);
                        boolean z = true;
                        if (m1.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        z65.g(string, Action.NAME_ATTRIBUTE);
                        u5b.e d = d(y2bVar, string, z);
                        if (d == null) {
                            aa1.a(m1, null);
                            return null;
                        }
                        b.add(d);
                    }
                }
                a = rfa.a(b);
                aa1.a(m1, null);
                return a;
            }
            aa1.a(m1, null);
            return null;
        } finally {
        }
    }

    public static final u5b f(y2b y2bVar, String str) {
        z65.h(y2bVar, "database");
        z65.h(str, "tableName");
        return new u5b(str, a(y2bVar, str), c(y2bVar, str), e(y2bVar, str));
    }
}
