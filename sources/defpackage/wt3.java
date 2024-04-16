package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: FileHandle.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0006\u0010\t\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H$J\b\u0010\u0013\u001a\u00020\u0003H$J\b\u0010\u0014\u001a\u00020\fH$R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010&\u001a\u00060 j\u0002`!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lwt3;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "fileOffset", "Lyg0;", "sink", "byteCount", Image.TYPE_MEDIUM, "n", "Lpqa;", "o", "", "close", "", "array", "", "arrayOffset", "k", "l", "j", "", "a", "Z", "getReadWrite", "()Z", "readWrite", "b", "closed", c.a, "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "i", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(Z)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: wt3  reason: default package */
/* loaded from: classes3.dex */
public abstract class wt3 implements Closeable {
    private final boolean a;
    private boolean b;
    private int c;
    private final ReentrantLock d = sdc.b();

    /* compiled from: FileHandle.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lwt3$a;", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "Lxgb;", "timeout", "", "close", "Lwt3;", "a", "Lwt3;", "getFileHandle", "()Lwt3;", "fileHandle", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "position", "", c.a, "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "<init>", "(Lwt3;J)V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wt3$a */
    /* loaded from: classes3.dex */
    private static final class a implements pqa {
        private final wt3 a;
        private long b;
        private boolean c;

        public a(wt3 wt3Var, long j) {
            z65.h(wt3Var, "fileHandle");
            this.a = wt3Var;
            this.b = j;
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            ReentrantLock i = this.a.i();
            i.lock();
            try {
                wt3 wt3Var = this.a;
                wt3Var.c--;
                if (this.a.c == 0 && this.a.b) {
                    Unit unit = Unit.a;
                    i.unlock();
                    this.a.j();
                }
            } finally {
                i.unlock();
            }
        }

        @Override // defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            if (!this.c) {
                long m = this.a.m(this.b, yg0Var, j);
                if (m != -1) {
                    this.b += m;
                }
                return m;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // defpackage.pqa
        public xgb timeout() {
            return xgb.e;
        }
    }

    public wt3(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long m(long j, yg0 yg0Var, long j2) {
        int i;
        if (j2 >= 0) {
            long j3 = j2 + j;
            long j4 = j;
            while (true) {
                if (j4 >= j3) {
                    break;
                }
                r3a T = yg0Var.T(1);
                int k = k(j4, T.a, T.c, (int) Math.min(j3 - j4, 8192 - i));
                if (k == -1) {
                    if (T.b == T.c) {
                        yg0Var.a = T.b();
                        t3a.b(T);
                    }
                    if (j == j4) {
                        return -1L;
                    }
                } else {
                    T.c += k;
                    long j5 = k;
                    j4 += j5;
                    yg0Var.N(yg0Var.P() + j5);
                }
            }
            return j4 - j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock i() {
        return this.d;
    }

    protected abstract void j() throws IOException;

    protected abstract int k(long j, byte[] bArr, int i, int i2) throws IOException;

    protected abstract long l() throws IOException;

    public final long n() throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!this.b) {
                Unit unit = Unit.a;
                reentrantLock.unlock();
                return l();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final pqa o(long j) throws IOException {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (!this.b) {
                this.c++;
                reentrantLock.unlock();
                return new a(this, j);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
