package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ResponseBody.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH&J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkk9;", "Ljava/io/Closeable;", "Ljava/nio/charset/Charset;", "charset", "Lqc6;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "bytes", "Llk0;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "a", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: kk9  reason: default package */
/* loaded from: classes3.dex */
public abstract class kk9 implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lkk9$a;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "", "close", "Lfh0;", "a", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "charset", "", c.a, "Z", "closed", DateTokenConverter.CONVERTER_KEY, "Ljava/io/Reader;", "delegate", "<init>", "(Lfh0;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kk9$a */
    /* loaded from: classes3.dex */
    public static final class a extends Reader {
        private final fh0 a;
        private final Charset b;
        private boolean c;
        private Reader d;

        public a(fh0 fh0Var, Charset charset) {
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            z65.h(charset, "charset");
            this.a = fh0Var;
            this.b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            z65.h(cArr, "cbuf");
            if (!this.c) {
                Reader reader = this.d;
                if (reader == null) {
                    reader = new InputStreamReader(this.a.z(), cec.o(this.a, this.b));
                    this.d = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, d2 = {"Lkk9$b;", "", "", "Lqc6;", "contentType", "Lkk9;", "g", "(Ljava/lang/String;Lqc6;)Lkk9;", "", Image.TYPE_HIGH, "([BLqc6;)Lkk9;", "Llk0;", "b", "(Llk0;Lqc6;)Lkk9;", "Lfh0;", "", "contentLength", "a", "(Lfh0;Lqc6;J)Lkk9;", RemoteMessageConst.Notification.CONTENT, e.a, "f", DateTokenConverter.CONVERTER_KEY, c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kk9$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ kk9 i(b bVar, byte[] bArr, qc6 qc6Var, int i, Object obj) {
            if ((i & 1) != 0) {
                qc6Var = null;
            }
            return bVar.h(bArr, qc6Var);
        }

        public final kk9 a(fh0 fh0Var, qc6 qc6Var, long j) {
            z65.h(fh0Var, "<this>");
            return xdc.a(fh0Var, qc6Var, j);
        }

        public final kk9 b(lk0 lk0Var, qc6 qc6Var) {
            z65.h(lk0Var, "<this>");
            return xdc.e(lk0Var, qc6Var);
        }

        public final kk9 c(qc6 qc6Var, long j, fh0 fh0Var) {
            z65.h(fh0Var, RemoteMessageConst.Notification.CONTENT);
            return a(fh0Var, qc6Var, j);
        }

        public final kk9 d(qc6 qc6Var, lk0 lk0Var) {
            z65.h(lk0Var, RemoteMessageConst.Notification.CONTENT);
            return b(lk0Var, qc6Var);
        }

        public final kk9 e(qc6 qc6Var, String str) {
            z65.h(str, RemoteMessageConst.Notification.CONTENT);
            return g(str, qc6Var);
        }

        public final kk9 f(qc6 qc6Var, byte[] bArr) {
            z65.h(bArr, RemoteMessageConst.Notification.CONTENT);
            return h(bArr, qc6Var);
        }

        public final kk9 g(String str, qc6 qc6Var) {
            z65.h(str, "<this>");
            Pair<Charset, qc6> b = p65.b(qc6Var);
            yg0 F0 = new yg0().F0(str, b.a());
            return a(F0, b.b(), F0.P());
        }

        public final kk9 h(byte[] bArr, qc6 qc6Var) {
            z65.h(bArr, "<this>");
            return xdc.f(bArr, qc6Var);
        }
    }

    private final Charset charset() {
        return p65.a(contentType());
    }

    public static final kk9 create(fh0 fh0Var, qc6 qc6Var, long j) {
        return Companion.a(fh0Var, qc6Var, j);
    }

    public final InputStream byteStream() {
        return source().z();
    }

    public final lk0 byteString() throws IOException {
        return xdc.b(this);
    }

    public final byte[] bytes() throws IOException {
        return xdc.c(this);
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            a aVar = new a(source(), charset());
            this.reader = aVar;
            return aVar;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.pqa
    public void close() {
        xdc.d(this);
    }

    public abstract long contentLength();

    public abstract qc6 contentType();

    public abstract fh0 source();

    public final String string() throws IOException {
        fh0 source = source();
        try {
            String n1 = source.n1(cec.o(source, charset()));
            aa1.a(source, null);
            return n1;
        } finally {
        }
    }

    public static final kk9 create(lk0 lk0Var, qc6 qc6Var) {
        return Companion.b(lk0Var, qc6Var);
    }

    public static final kk9 create(qc6 qc6Var, long j, fh0 fh0Var) {
        return Companion.c(qc6Var, j, fh0Var);
    }

    public static final kk9 create(qc6 qc6Var, lk0 lk0Var) {
        return Companion.d(qc6Var, lk0Var);
    }

    public static final kk9 create(qc6 qc6Var, String str) {
        return Companion.e(qc6Var, str);
    }

    public static final kk9 create(qc6 qc6Var, byte[] bArr) {
        return Companion.f(qc6Var, bArr);
    }

    public static final kk9 create(String str, qc6 qc6Var) {
        return Companion.g(str, qc6Var);
    }

    public static final kk9 create(byte[] bArr, qc6 qc6Var) {
        return Companion.h(bArr, qc6Var);
    }
}
