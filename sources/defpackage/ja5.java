package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import im.threads.business.models.CampaignMessageKt;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: JsonDataEncoderBuilder.java */
/* renamed from: ja5  reason: default package */
/* loaded from: classes2.dex */
public final class ja5 implements ch3<ja5> {
    private static final v47<Object> e = new v47() { // from class: ga5
        @Override // defpackage.v47
        public final void a(Object obj, Object obj2) {
            ja5.l(obj, (w47) obj2);
        }
    };
    private static final gwb<String> f = new gwb() { // from class: ha5
        @Override // defpackage.gwb
        public final void a(Object obj, Object obj2) {
            ((hwb) obj2).b((String) obj);
        }
    };
    private static final gwb<Boolean> g = new gwb() { // from class: ia5
        @Override // defpackage.gwb
        public final void a(Object obj, Object obj2) {
            ja5.n((Boolean) obj, (hwb) obj2);
        }
    };
    private static final b h = new b(null);
    private final Map<Class<?>, v47<?>> a = new HashMap();
    private final Map<Class<?>, gwb<?>> b = new HashMap();
    private v47<Object> c = e;
    private boolean d = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: ja5$a */
    /* loaded from: classes2.dex */
    class a implements tk2 {
        a() {
        }

        @Override // defpackage.tk2
        public void a(@NonNull Object obj, @NonNull Writer writer) throws IOException {
            zc5 zc5Var = new zc5(writer, ja5.this.a, ja5.this.b, ja5.this.c, ja5.this.d);
            zc5Var.k(obj, false);
            zc5Var.u();
        }

        @Override // defpackage.tk2
        public String encode(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: ja5$b */
    /* loaded from: classes2.dex */
    private static final class b implements gwb<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CampaignMessageKt.CAMPAIGN_DATE_FORMAT, Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // defpackage.gwb
        /* renamed from: b */
        public void a(@NonNull Date date, @NonNull hwb hwbVar) throws IOException {
            hwbVar.b(a.format(date));
        }
    }

    public ja5() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, w47 w47Var) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, hwb hwbVar) throws IOException {
        hwbVar.c(bool.booleanValue());
    }

    @NonNull
    public tk2 i() {
        return new a();
    }

    @NonNull
    public ja5 j(@NonNull hq1 hq1Var) {
        hq1Var.a(this);
        return this;
    }

    @NonNull
    public ja5 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.ch3
    @NonNull
    /* renamed from: o */
    public <T> ja5 a(@NonNull Class<T> cls, @NonNull v47<? super T> v47Var) {
        this.a.put(cls, v47Var);
        this.b.remove(cls);
        return this;
    }

    @NonNull
    public <T> ja5 p(@NonNull Class<T> cls, @NonNull gwb<? super T> gwbVar) {
        this.b.put(cls, gwbVar);
        this.a.remove(cls);
        return this;
    }
}
