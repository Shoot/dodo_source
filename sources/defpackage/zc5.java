package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonValueObjectEncoderContext.java */
/* renamed from: zc5  reason: default package */
/* loaded from: classes2.dex */
public final class zc5 implements w47, hwb {
    private zc5 a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, v47<?>> d;
    private final Map<Class<?>, gwb<?>> e;
    private final v47<Object> f;
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zc5(@NonNull Writer writer, @NonNull Map<Class<?>, v47<?>> map, @NonNull Map<Class<?>, gwb<?>> map2, v47<Object> v47Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = v47Var;
        this.g = z;
    }

    private boolean t(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    private zc5 w(@NonNull String str, Object obj) throws IOException, EncodingException {
        y();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        return k(obj, false);
    }

    private zc5 x(@NonNull String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        y();
        this.c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (this.b) {
            zc5 zc5Var = this.a;
            if (zc5Var != null) {
                zc5Var.y();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.w47
    @NonNull
    public w47 a(@NonNull hs3 hs3Var, Object obj) throws IOException {
        return p(hs3Var.b(), obj);
    }

    @Override // defpackage.w47
    @NonNull
    public w47 d(@NonNull hs3 hs3Var, boolean z) throws IOException {
        return q(hs3Var.b(), z);
    }

    @Override // defpackage.w47
    @NonNull
    public w47 e(@NonNull hs3 hs3Var, int i) throws IOException {
        return n(hs3Var.b(), i);
    }

    @Override // defpackage.w47
    @NonNull
    public w47 f(@NonNull hs3 hs3Var, double d) throws IOException {
        return m(hs3Var.b(), d);
    }

    @Override // defpackage.w47
    @NonNull
    public w47 g(@NonNull hs3 hs3Var, long j) throws IOException {
        return o(hs3Var.b(), j);
    }

    @NonNull
    public zc5 h(double d) throws IOException {
        y();
        this.c.value(d);
        return this;
    }

    @NonNull
    public zc5 i(int i) throws IOException {
        y();
        this.c.value(i);
        return this;
    }

    @NonNull
    public zc5 j(long j) throws IOException {
        y();
        this.c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public zc5 k(Object obj, boolean z) throws IOException {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && t(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return s((byte[]) obj);
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    j(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    k(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    k(obj2, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object obj3 : (Collection) obj) {
                k(obj3, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    p((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.c.endObject();
            return this;
        } else {
            v47<?> v47Var = this.d.get(obj.getClass());
            if (v47Var != null) {
                return v(v47Var, obj, z);
            }
            gwb<?> gwbVar = this.e.get(obj.getClass());
            if (gwbVar != null) {
                gwbVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof b47) {
                    i(((b47) obj).e());
                } else {
                    b(((Enum) obj).name());
                }
                return this;
            } else {
                return v(this.f, obj, z);
            }
        }
    }

    @Override // defpackage.hwb
    @NonNull
    /* renamed from: l */
    public zc5 b(String str) throws IOException {
        y();
        this.c.value(str);
        return this;
    }

    @NonNull
    public zc5 m(@NonNull String str, double d) throws IOException {
        y();
        this.c.name(str);
        return h(d);
    }

    @NonNull
    public zc5 n(@NonNull String str, int i) throws IOException {
        y();
        this.c.name(str);
        return i(i);
    }

    @NonNull
    public zc5 o(@NonNull String str, long j) throws IOException {
        y();
        this.c.name(str);
        return j(j);
    }

    @NonNull
    public zc5 p(@NonNull String str, Object obj) throws IOException {
        if (this.g) {
            return x(str, obj);
        }
        return w(str, obj);
    }

    @NonNull
    public zc5 q(@NonNull String str, boolean z) throws IOException {
        y();
        this.c.name(str);
        return c(z);
    }

    @Override // defpackage.hwb
    @NonNull
    /* renamed from: r */
    public zc5 c(boolean z) throws IOException {
        y();
        this.c.value(z);
        return this;
    }

    @NonNull
    public zc5 s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() throws IOException {
        y();
        this.c.flush();
    }

    zc5 v(v47<Object> v47Var, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        v47Var.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
