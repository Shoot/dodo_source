package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
/* compiled from: MessageInflater.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzh6;", "Ljava/io/Closeable;", "Lyg0;", "buffer", "", "a", "close", "", "Z", "noContextTakeover", "b", "Lyg0;", "deflatedBytes", "Ljava/util/zip/Inflater;", c.a, "Ljava/util/zip/Inflater;", "inflater", "La15;", DateTokenConverter.CONVERTER_KEY, "La15;", "inflaterSource", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: zh6  reason: default package */
/* loaded from: classes3.dex */
public final class zh6 implements Closeable {
    private final boolean a;
    private final yg0 b;
    private final Inflater c;
    private final a15 d;

    public zh6(boolean z) {
        this.a = z;
        yg0 yg0Var = new yg0();
        this.b = yg0Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new a15((pqa) yg0Var, inflater);
    }

    public final void a(yg0 yg0Var) throws IOException {
        z65.h(yg0Var, "buffer");
        if (this.b.P() == 0) {
            if (this.a) {
                this.c.reset();
            }
            this.b.a1(yg0Var);
            this.b.J(65535);
            long bytesRead = this.c.getBytesRead() + this.b.P();
            do {
                this.d.a(yg0Var, Long.MAX_VALUE);
                if (this.c.getBytesRead() >= bytesRead) {
                    return;
                }
            } while (!this.c.finished());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }
}
