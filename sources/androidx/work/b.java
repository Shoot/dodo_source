package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class b {
    private static final String b = nx5.f("Data");
    public static final b c = new a().a();
    Map<String, Object> a;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {
        private Map<String, Object> a = new HashMap();

        @NonNull
        public b a() {
            b bVar = new b(this.a);
            b.o(bVar);
            return bVar;
        }

        @NonNull
        public a b(@NonNull String str, Object obj) {
            if (obj == null) {
                this.a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.a.put(str, b.a((boolean[]) obj));
                    } else if (cls == byte[].class) {
                        this.a.put(str, b.b((byte[]) obj));
                    } else if (cls == int[].class) {
                        this.a.put(str, b.e((int[]) obj));
                    } else if (cls == long[].class) {
                        this.a.put(str, b.f((long[]) obj));
                    } else if (cls == float[].class) {
                        this.a.put(str, b.d((float[]) obj));
                    } else if (cls == double[].class) {
                        this.a.put(str, b.c((double[]) obj));
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                } else {
                    this.a.put(str, obj);
                }
            }
            return this;
        }

        @NonNull
        public a c(@NonNull b bVar) {
            d(bVar.a);
            return this;
        }

        @NonNull
        public a d(@NonNull Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NonNull
        public a e(@NonNull String str, boolean z) {
            this.a.put(str, Boolean.valueOf(z));
            return this;
        }

        @NonNull
        public a f(@NonNull String str, @NonNull byte[] bArr) {
            this.a.put(str, b.b(bArr));
            return this;
        }

        @NonNull
        public a g(@NonNull String str, int i) {
            this.a.put(str, Integer.valueOf(i));
            return this;
        }

        @NonNull
        public a h(@NonNull String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        @NonNull
        public a i(@NonNull String str, @NonNull String[] strArr) {
            this.a.put(str, strArr);
            return this;
        }
    }

    b() {
    }

    @NonNull
    public static Boolean[] a(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NonNull
    public static Byte[] b(@NonNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @NonNull
    public static Double[] c(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @NonNull
    public static Float[] d(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NonNull
    public static Integer[] e(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NonNull
    public static Long[] f(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NonNull
    public static byte[] g(@NonNull Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x0065). Please submit an issue!!! */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.b h(@androidx.annotation.NonNull byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L82
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
        L1b:
            if (r7 <= 0) goto L31
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            r7 = move-exception
            goto L51
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.b
            android.util.Log.e(r3, r0, r7)
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L65
        L3f:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.b
            android.util.Log.e(r2, r0, r7)
            goto L65
        L46:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L6b
        L4a:
            r3 = move-exception
        L4b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L51
        L4f:
            r3 = move-exception
            goto L4b
        L51:
            java.lang.String r4 = androidx.work.b.b     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.b
            android.util.Log.e(r3, r0, r7)
        L62:
            r2.close()     // Catch: java.io.IOException -> L3f
        L65:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L6b:
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.io.IOException -> L71
            goto L77
        L71:
            r1 = move-exception
            java.lang.String r3 = androidx.work.b.b
            android.util.Log.e(r3, r0, r1)
        L77:
            r2.close()     // Catch: java.io.IOException -> L7b
            goto L81
        L7b:
            r1 = move-exception
            java.lang.String r2 = androidx.work.b.b
            android.util.Log.e(r2, r0, r1)
        L81:
            throw r7
        L82:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.h(byte[]):androidx.work.b");
    }

    @NonNull
    public static byte[] o(@NonNull b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(bVar.n());
            for (Map.Entry<String, Object> entry : bVar.a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(b, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(b, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(b, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(b, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    Log.e(b, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e8) {
                Log.e(b, "Error in Data#toByteArray: ", e8);
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.a.keySet();
        if (!keySet.equals(bVar.a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.a.get(str);
            Object obj3 = bVar.a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    equals = obj2.equals(obj3);
                }
                if (!equals) {
                    return false;
                }
            } else if (obj2 != obj3) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public boolean i(@NonNull String str, boolean z) {
        Object obj = this.a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public byte[] j(@NonNull String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public int k(@NonNull String str, int i) {
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i;
    }

    @NonNull
    public Map<String, Object> l() {
        return Collections.unmodifiableMap(this.a);
    }

    public String m(@NonNull String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int n() {
        return this.a.size();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b(@NonNull b bVar) {
        this.a = new HashMap(bVar.a);
    }

    public b(@NonNull Map<String, ?> map) {
        this.a = new HashMap(map);
    }
}
