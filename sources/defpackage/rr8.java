package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.encoders.EncodingException;
import defpackage.pr8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufDataEncoderContext.java */
/* renamed from: rr8  reason: default package */
/* loaded from: classes2.dex */
public final class rr8 implements w47 {
    private static final Charset f = Charset.forName("UTF-8");
    private static final hs3 g = hs3.a(Action.KEY_ATTRIBUTE).b(qy.b().c(1).a()).a();
    private static final hs3 h = hs3.a("value").b(qy.b().c(2).a()).a();
    private static final v47<Map.Entry<Object, Object>> i = new v47() { // from class: qr8
        @Override // defpackage.v47
        public final void a(Object obj, Object obj2) {
            rr8.w((Map.Entry) obj, (w47) obj2);
        }
    };
    private OutputStream a;
    private final Map<Class<?>, v47<?>> b;
    private final Map<Class<?>, gwb<?>> c;
    private final v47<Object> d;
    private final ur8 e = new ur8(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtobufDataEncoderContext.java */
    /* renamed from: rr8$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[pr8.a.values().length];
            a = iArr;
            try {
                iArr[pr8.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[pr8.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[pr8.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rr8(OutputStream outputStream, Map<Class<?>, v47<?>> map, Map<Class<?>, gwb<?>> map2, v47<Object> v47Var) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = v47Var;
    }

    private static ByteBuffer p(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(v47<T> v47Var, T t) throws IOException {
        xo5 xo5Var = new xo5();
        try {
            OutputStream outputStream = this.a;
            this.a = xo5Var;
            v47Var.a(t, this);
            this.a = outputStream;
            long a2 = xo5Var.a();
            xo5Var.close();
            return a2;
        } catch (Throwable th) {
            try {
                xo5Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> rr8 r(v47<T> v47Var, hs3 hs3Var, T t, boolean z) throws IOException {
        long q = q(v47Var, t);
        if (z && q == 0) {
            return this;
        }
        x((v(hs3Var) << 3) | 2);
        y(q);
        v47Var.a(t, this);
        return this;
    }

    private <T> rr8 s(gwb<T> gwbVar, hs3 hs3Var, T t, boolean z) throws IOException {
        this.e.d(hs3Var, z);
        gwbVar.a(t, this.e);
        return this;
    }

    private static pr8 u(hs3 hs3Var) {
        pr8 pr8Var = (pr8) hs3Var.c(pr8.class);
        if (pr8Var != null) {
            return pr8Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(hs3 hs3Var) {
        pr8 pr8Var = (pr8) hs3Var.c(pr8.class);
        if (pr8Var != null) {
            return pr8Var.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, w47 w47Var) throws IOException {
        w47Var.a(g, entry.getKey());
        w47Var.a(h, entry.getValue());
    }

    private void x(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    private void y(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    @Override // defpackage.w47
    @NonNull
    public w47 a(@NonNull hs3 hs3Var, Object obj) throws IOException {
        return i(hs3Var, obj, true);
    }

    w47 c(@NonNull hs3 hs3Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        x((v(hs3Var) << 3) | 1);
        this.a.write(p(8).putDouble(d).array());
        return this;
    }

    @Override // defpackage.w47
    @NonNull
    public w47 f(@NonNull hs3 hs3Var, double d) throws IOException {
        return c(hs3Var, d, true);
    }

    w47 h(@NonNull hs3 hs3Var, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        x((v(hs3Var) << 3) | 5);
        this.a.write(p(4).putFloat(f2).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w47 i(@NonNull hs3 hs3Var, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            x((v(hs3Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            x(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                i(hs3Var, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                r(i, hs3Var, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return c(hs3Var, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return h(hs3Var, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m(hs3Var, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return o(hs3Var, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                x((v(hs3Var) << 3) | 2);
                x(bArr.length);
                this.a.write(bArr);
                return this;
            }
            v47<?> v47Var = this.b.get(obj.getClass());
            if (v47Var != null) {
                return r(v47Var, hs3Var, obj, z);
            }
            gwb<?> gwbVar = this.c.get(obj.getClass());
            if (gwbVar != null) {
                return s(gwbVar, hs3Var, obj, z);
            }
            if (obj instanceof jr8) {
                return e(hs3Var, ((jr8) obj).e());
            }
            if (obj instanceof Enum) {
                return e(hs3Var, ((Enum) obj).ordinal());
            }
            return r(this.d, hs3Var, obj, z);
        }
    }

    @Override // defpackage.w47
    @NonNull
    /* renamed from: j */
    public rr8 e(@NonNull hs3 hs3Var, int i2) throws IOException {
        return k(hs3Var, i2, true);
    }

    rr8 k(@NonNull hs3 hs3Var, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        pr8 u = u(hs3Var);
        int i3 = a.a[u.intEncoding().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    x((u.tag() << 3) | 5);
                    this.a.write(p(4).putInt(i2).array());
                }
            } else {
                x(u.tag() << 3);
                x((i2 << 1) ^ (i2 >> 31));
            }
        } else {
            x(u.tag() << 3);
            x(i2);
        }
        return this;
    }

    @Override // defpackage.w47
    @NonNull
    /* renamed from: l */
    public rr8 g(@NonNull hs3 hs3Var, long j) throws IOException {
        return m(hs3Var, j, true);
    }

    rr8 m(@NonNull hs3 hs3Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        pr8 u = u(hs3Var);
        int i2 = a.a[u.intEncoding().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    x((u.tag() << 3) | 1);
                    this.a.write(p(8).putLong(j).array());
                }
            } else {
                x(u.tag() << 3);
                y((j >> 63) ^ (j << 1));
            }
        } else {
            x(u.tag() << 3);
            y(j);
        }
        return this;
    }

    @Override // defpackage.w47
    @NonNull
    /* renamed from: n */
    public rr8 d(@NonNull hs3 hs3Var, boolean z) throws IOException {
        return o(hs3Var, z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rr8 o(@NonNull hs3 hs3Var, boolean z, boolean z2) throws IOException {
        return k(hs3Var, z ? 1 : 0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rr8 t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        v47<?> v47Var = this.b.get(obj.getClass());
        if (v47Var != null) {
            v47Var.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
