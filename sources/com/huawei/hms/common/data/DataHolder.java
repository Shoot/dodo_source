package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    /* loaded from: classes3.dex */
    public static class Builder {
        private String[] builderColumns;
        private final ArrayList<HashMap<String, Object>> dataCollectionList;
        private final String type;
        private final HashMap<Object, Integer> typeAndDataCollectionCountMapping;

        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.huawei.hms.common.data.DataHolder.Builder setDataForContentValuesHashMap(java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "contentValuesHashMap cannot be null"
                com.huawei.hms.common.internal.Preconditions.checkNotNull(r4, r0)
                java.lang.String r0 = r3.type
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r4.get(r0)
                if (r0 == 0) goto L2e
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.typeAndDataCollectionCountMapping
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L1f
                int r0 = r1.intValue()
                r1 = 1
                goto L30
            L1f:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.typeAndDataCollectionCountMapping
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r3.dataCollectionList
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.put(r0, r2)
            L2e:
                r0 = 0
                r1 = 0
            L30:
                if (r1 == 0) goto L3d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.dataCollectionList
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.dataCollectionList
                r1.add(r0, r4)
                goto L42
            L3d:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r3.dataCollectionList
                r0.add(r4)
            L42:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.Builder.setDataForContentValuesHashMap(java.util.HashMap):com.huawei.hms.common.data.DataHolder$Builder");
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.builderColumns = strArr;
            this.dataCollectionList = new ArrayList<>();
            this.type = str;
            this.typeAndDataCollectionCountMapping = new HashMap<>();
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle != null && bundle.containsKey(str)) {
            if (isClosed()) {
                str2 = "buffer has been closed";
            } else if (i >= 0 && i < this.dataCount) {
                str2 = "";
            } else {
                str2 = "row is out of index:" + i;
            }
        } else {
            str2 = "cannot find column: " + str;
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(BUILDER, i, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<android.database.CursorWindow> iterCursorWindow(com.huawei.hms.common.data.DataHolder.Builder r10, int r11, java.util.List r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.CursorWindow r1 = new android.database.CursorWindow
            r2 = 0
            r1.<init>(r2)
            java.lang.String[] r3 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)
            int r3 = r3.length
            r1.setNumColumns(r3)
            r0.add(r1)
            r3 = 0
            r4 = 0
        L18:
            if (r4 >= r11) goto Lb1
            boolean r5 = r1.allocRow()     // Catch: java.lang.RuntimeException -> L43
            java.lang.String r6 = "DataHolder"
            if (r5 != 0) goto L48
            java.lang.String r1 = "Failed to allocate a row"
            com.huawei.hms.support.log.HMSLog.d(r6, r1)     // Catch: java.lang.RuntimeException -> L43
            android.database.CursorWindow r1 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L43
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L43
            r1.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L43
            java.lang.String[] r5 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L43
            int r5 = r5.length     // Catch: java.lang.RuntimeException -> L43
            r1.setNumColumns(r5)     // Catch: java.lang.RuntimeException -> L43
            boolean r5 = r1.allocRow()     // Catch: java.lang.RuntimeException -> L43
            if (r5 != 0) goto L45
            java.lang.String r10 = "Failed to retry to allocate a row"
            com.huawei.hms.support.log.HMSLog.e(r6, r10)     // Catch: java.lang.RuntimeException -> L43
            return r0
        L43:
            r10 = move-exception
            goto L9c
        L45:
            r0.add(r1)     // Catch: java.lang.RuntimeException -> L43
        L48:
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.RuntimeException -> L43
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.RuntimeException -> L43
            r7 = 1
            r8 = 0
        L50:
            java.lang.String[] r9 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L43
            int r9 = r9.length     // Catch: java.lang.RuntimeException -> L43
            if (r8 >= r9) goto L6b
            java.lang.String[] r7 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L43
            r7 = r7[r8]     // Catch: java.lang.RuntimeException -> L43
            java.lang.Object r7 = r5.get(r7)     // Catch: java.lang.RuntimeException -> L43
            boolean r7 = putValue(r1, r7, r4, r8)     // Catch: java.lang.RuntimeException -> L43
            if (r7 != 0) goto L68
            goto L6b
        L68:
            int r8 = r8 + 1
            goto L50
        L6b:
            if (r7 != 0) goto L98
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L43
            r11.<init>()     // Catch: java.lang.RuntimeException -> L43
            java.lang.String r12 = "fail to put data for row "
            r11.append(r12)     // Catch: java.lang.RuntimeException -> L43
            r11.append(r4)     // Catch: java.lang.RuntimeException -> L43
            java.lang.String r11 = r11.toString()     // Catch: java.lang.RuntimeException -> L43
            com.huawei.hms.support.log.HMSLog.d(r6, r11)     // Catch: java.lang.RuntimeException -> L43
            r1.freeLastRow()     // Catch: java.lang.RuntimeException -> L43
            android.database.CursorWindow r11 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L43
            r11.<init>(r2)     // Catch: java.lang.RuntimeException -> L43
            r11.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L43
            java.lang.String[] r10 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L43
            int r10 = r10.length     // Catch: java.lang.RuntimeException -> L43
            r11.setNumColumns(r10)     // Catch: java.lang.RuntimeException -> L43
            r0.add(r11)     // Catch: java.lang.RuntimeException -> L43
            goto Lb1
        L98:
            int r4 = r4 + 1
            goto L18
        L9c:
            java.util.Iterator r11 = r0.iterator()
        La0:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb0
            java.lang.Object r12 = r11.next()
            android.database.CursorWindow r12 = (android.database.CursorWindow) r12
            r12.close()
            goto La0
        Lb0:
            throw r10
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.iterCursorWindow(com.huawei.hms.common.data.DataHolder$Builder, int, java.util.List):java.util.ArrayList");
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i, int i2) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i < i2 && hMSCursorWrapper.moveToPosition(i)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i);
                hMSCursorWrapper.fillWindow(i, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i, int i2) throws IllegalArgumentException {
        long j;
        if (obj == null) {
            return cursorWindow.putNull(i, i2);
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            return cursorWindow.putLong(j, i, i2);
        } else if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
        } else {
            if (obj instanceof Long) {
                return cursorWindow.putLong(((Long) obj).longValue(), i, i2);
            }
            if (obj instanceof Float) {
                return cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
            }
            if (obj instanceof Double) {
                return cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
            }
            if (obj instanceof String) {
                return cursorWindow.putString((String) obj, i, i2);
            }
            if (obj instanceof byte[]) {
                return cursorWindow.putBlob((byte[]) obj, i, i2);
            }
            throw new IllegalArgumentException("unsupported type for column: " + obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.mClosed) {
                for (CursorWindow cursorWindow : this.cursorWindows) {
                    cursorWindow.close();
                }
                this.mClosed = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.columns;
            if (i2 >= strArr.length) {
                break;
            }
            this.columnsBundle.putInt(strArr[i2], i2);
            i2++;
        }
        this.perCursorCounts = new int[this.cursorWindows.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.cursorWindows;
            if (i < cursorWindowArr.length) {
                this.perCursorCounts[i] = i3;
                i3 = cursorWindowArr[i].getStartPosition() + this.cursorWindows[i].getNumRows();
                i++;
            } else {
                this.dataCount = i3;
                return;
            }
        }
    }

    public final void copyToBuffer(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i);
        this.cursorWindows[i2].copyStringToBuffer(i, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i, int i2, String str2) {
        str2.hashCode();
        boolean z = true;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1092271849:
                if (str2.equals(TYPE_FLOAT)) {
                    c = 0;
                    break;
                }
                break;
            case -870070237:
                if (str2.equals(TYPE_BOOLEAN)) {
                    c = 1;
                    break;
                }
                break;
            case -675993238:
                if (str2.equals(TYPE_INT)) {
                    c = 2;
                    break;
                }
                break;
            case 445002870:
                if (str2.equals(TYPE_DOUBLE)) {
                    c = 3;
                    break;
                }
                break;
            case 519136353:
                if (str2.equals(TYPE_LONG)) {
                    c = 4;
                    break;
                }
                break;
            case 878975158:
                if (str2.equals(TYPE_STRING)) {
                    c = 5;
                    break;
                }
                break;
            case 1300508295:
                if (str2.equals(TYPE_BYTE_ARRAY)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                checkAvailable(str, i);
                return Float.valueOf(this.cursorWindows[i2].getFloat(i, this.columnsBundle.getInt(str)));
            case 1:
                checkAvailable(str, i);
                if (this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                checkAvailable(str, i);
                return Integer.valueOf(this.cursorWindows[i2].getInt(i, this.columnsBundle.getInt(str)));
            case 3:
                checkAvailable(str, i);
                return Double.valueOf(this.cursorWindows[i2].getDouble(i, this.columnsBundle.getInt(str)));
            case 4:
                checkAvailable(str, i);
                return Long.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)));
            case 5:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getString(i, this.columnsBundle.getInt(str));
            case 6:
                checkAvailable(str, i);
                return this.cursorWindows[i2].getBlob(i, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i) {
        boolean z;
        int[] iArr;
        int i2 = 0;
        if (i < 0 && i >= this.dataCount) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "rowIndex is out of index:" + i);
        while (true) {
            iArr = this.perCursorCounts;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == iArr.length) {
            return i2 - 1;
        }
        return i2;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i, int i2) {
        checkAvailable(str, i);
        if (this.cursorWindows[i2].getType(i, this.columnsBundle.getInt(str)) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i2;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i, bundle);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i, bundle);
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i) {
        if (builder.builderColumns.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= builder.dataCollectionList.size()) {
            i = builder.dataCollectionList.size();
        }
        ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder, i, builder.dataCollectionList.subList(0, i));
        return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
    }
}
