package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmException;
import io.realm.internal.e;
import java.util.UUID;
import org.bson.types.ObjectId;
@Keep
/* loaded from: classes3.dex */
public class OsObject implements ku6 {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private e<b> observerPairs = new e<>();

    /* loaded from: classes3.dex */
    private static class a implements e.a<b> {
        private final String[] a;

        a(String[] strArr) {
            this.a = strArr;
        }

        private p47 b() {
            boolean z;
            String[] strArr = this.a;
            if (strArr == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strArr = new String[0];
            }
            return new c(strArr, z);
        }

        @Override // io.realm.internal.e.a
        /* renamed from: c */
        public void a(b bVar, Object obj) {
            bVar.a((o89) obj, b());
        }
    }

    /* loaded from: classes3.dex */
    public static class b<T extends o89> extends e.b<T, q89<T>> {
        public b(T t, q89<T> q89Var) {
            super(t, q89Var);
        }

        public void a(T t, p47 p47Var) {
            ((q89) this.b).a(t, p47Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c implements p47 {
        final String[] a;
        final boolean b;

        c(String[] strArr, boolean z) {
            this.a = strArr;
            this.b = z;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.p().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j, long j2) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j, j2);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j, Object obj) {
        long parseLong;
        boolean z;
        RealmFieldType m = table.m(j);
        OsSharedRealm p = table.p();
        if (m == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return nativeCreateRowWithStringPrimaryKey(p.getNativePtr(), table.getNativePtr(), j, (String) obj);
        } else if (m == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j2 = parseLong;
            long nativePtr = p.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return nativeCreateRowWithLongPrimaryKey(nativePtr, nativePtr2, j, j2, z);
        } else {
            String str = null;
            if (m == RealmFieldType.OBJECT_ID) {
                if (obj != null && !(obj instanceof ObjectId)) {
                    throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithObjectIdPrimaryKey(p.getNativePtr(), table.getNativePtr(), j, str);
            } else if (m == RealmFieldType.UUID) {
                if (obj != null && !(obj instanceof UUID)) {
                    throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithUUIDPrimaryKey(p.getNativePtr(), table.getNativePtr(), j, str);
            } else {
                throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + m);
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        String obj2;
        String obj3;
        long parseLong;
        boolean z;
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType m = table.m(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm p = table.p();
        if (m == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return new UncheckedRow(p.context, table, nativeCreateNewObjectWithStringPrimaryKey(p.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        } else if (m == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j = parseLong;
            io.realm.internal.c cVar = p.context;
            long nativePtr = p.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return new UncheckedRow(cVar, table, nativeCreateNewObjectWithLongPrimaryKey(nativePtr, nativePtr2, andVerifyPrimaryKeyColumnIndex, j, z));
        } else if (m == RealmFieldType.OBJECT_ID) {
            if (obj == null) {
                obj3 = null;
            } else {
                obj3 = obj.toString();
            }
            return new UncheckedRow(p.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(p.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj3));
        } else if (m == RealmFieldType.UUID) {
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj.toString();
            }
            return new UncheckedRow(p.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(p.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj2));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + m);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b2 = OsObjectStore.b(table.p(), table.g());
        if (b2 != null) {
            return table.j(b2);
        }
        throw new IllegalStateException(table.o() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateEmbeddedObject(long j, long j2, long j3);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.c(new a(strArr));
    }

    public <T extends o89> void addListener(T t, q89<T> q89Var) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new b(t, q89Var));
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends o89> void removeListener(T t) {
        this.observerPairs.f(t);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(e<b> eVar) {
        if (this.observerPairs.d()) {
            this.observerPairs = eVar;
            if (!eVar.d()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }

    public <T extends o89> void removeListener(T t, q89<T> q89Var) {
        this.observerPairs.e(t, q89Var);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
