package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import defpackage.tr8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProtobufEncoder.java */
/* renamed from: tr8  reason: default package */
/* loaded from: classes2.dex */
public class tr8 {
    private final Map<Class<?>, v47<?>> a;
    private final Map<Class<?>, gwb<?>> b;
    private final v47<Object> c;

    /* compiled from: ProtobufEncoder.java */
    /* renamed from: tr8$a */
    /* loaded from: classes2.dex */
    public static final class a implements ch3<a> {
        private static final v47<Object> d = new v47() { // from class: sr8
            @Override // defpackage.v47
            public final void a(Object obj, Object obj2) {
                tr8.a.e(obj, (w47) obj2);
            }
        };
        private final Map<Class<?>, v47<?>> a = new HashMap();
        private final Map<Class<?>, gwb<?>> b = new HashMap();
        private v47<Object> c = d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, w47 w47Var) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public tr8 c() {
            return new tr8(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        @NonNull
        public a d(@NonNull hq1 hq1Var) {
            hq1Var.a(this);
            return this;
        }

        @Override // defpackage.ch3
        @NonNull
        /* renamed from: f */
        public <U> a a(@NonNull Class<U> cls, @NonNull v47<? super U> v47Var) {
            this.a.put(cls, v47Var);
            this.b.remove(cls);
            return this;
        }
    }

    tr8(Map<Class<?>, v47<?>> map, Map<Class<?>, gwb<?>> map2, v47<Object> v47Var) {
        this.a = map;
        this.b = map2;
        this.c = v47Var;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new rr8(outputStream, this.a, this.b, this.c).t(obj);
    }

    @NonNull
    public byte[] c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
