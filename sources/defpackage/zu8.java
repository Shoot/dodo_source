package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueueFile.java */
/* renamed from: zu8  reason: default package */
/* loaded from: classes2.dex */
public class zu8 implements Closeable {
    private static final Logger g = Logger.getLogger(zu8.class.getName());
    private final RandomAccessFile a;
    int b;
    private int c;
    private b d;
    private b e;
    private final byte[] f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: zu8$a */
    /* loaded from: classes2.dex */
    public class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // defpackage.zu8.d
        public void a(InputStream inputStream, int i) throws IOException {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: zu8$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* renamed from: zu8$c */
    /* loaded from: classes2.dex */
    public final class c extends InputStream {
        private int a;
        private int b;

        /* synthetic */ c(zu8 zu8Var, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            zu8.q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 > 0) {
                if (i2 > i3) {
                    i2 = i3;
                }
                zu8.this.H(this.a, bArr, i, i2);
                this.a = zu8.this.N(this.a + i2);
                this.b -= i2;
                return i2;
            }
            return -1;
        }

        private c(b bVar) {
            this.a = zu8.this.N(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            zu8.this.a.seek(this.a);
            int read = zu8.this.a.read();
            this.a = zu8.this.N(this.a + 1);
            this.b--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: zu8$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(InputStream inputStream, int i) throws IOException;
    }

    public zu8(File file) throws IOException {
        if (!file.exists()) {
            n(file);
        }
        this.a = r(file);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i, byte[] bArr, int i2, int i3) throws IOException {
        int N = N(i);
        int i4 = N + i3;
        int i5 = this.b;
        if (i4 <= i5) {
            this.a.seek(N);
            this.a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - N;
        this.a.seek(N);
        this.a.readFully(bArr, i2, i6);
        this.a.seek(16L);
        this.a.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void K(int i, byte[] bArr, int i2, int i3) throws IOException {
        int N = N(i);
        int i4 = N + i3;
        int i5 = this.b;
        if (i4 <= i5) {
            this.a.seek(N);
            this.a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - N;
        this.a.seek(N);
        this.a.write(bArr, i2, i6);
        this.a.seek(16L);
        this.a.write(bArr, i2 + i6, i3 - i6);
    }

    private void L(int i) throws IOException {
        this.a.setLength(i);
        this.a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return (i + 16) - i2;
        }
        return i;
    }

    private void P(int i, int i2, int i3, int i4) throws IOException {
        S(this.f, i, i2, i3, i4);
        this.a.seek(0L);
        this.a.write(this.f);
    }

    private static void Q(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void S(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            Q(bArr, i, i2);
            i += 4;
        }
    }

    private void l(int i) throws IOException {
        int i2 = i + 4;
        int y = y();
        if (y >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            y += i3;
            i3 <<= 1;
        } while (y < i2);
        L(i3);
        b bVar = this.e;
        int N = N(bVar.a + 4 + bVar.b);
        if (N < this.d.a) {
            FileChannel channel = this.a.getChannel();
            channel.position(this.b);
            long j = N - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.e.a;
        int i5 = this.d.a;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            P(i3, this.c, i5, i6);
            this.e = new b(i6, this.e.b);
        } else {
            P(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    private static void n(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile r = r(file2);
        try {
            r.setLength(4096L);
            r.seek(0L);
            byte[] bArr = new byte[16];
            S(bArr, 4096, 0, 0, 0);
            r.write(bArr);
            r.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            r.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T q(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile r(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b s(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        this.a.seek(i);
        return new b(i, this.a.readInt());
    }

    private void u() throws IOException {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int x = x(this.f, 0);
        this.b = x;
        if (x <= this.a.length()) {
            this.c = x(this.f, 4);
            int x2 = x(this.f, 8);
            int x3 = x(this.f, 12);
            this.d = s(x2);
            this.e = s(x3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
    }

    private static int x(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int y() {
        return this.b - M();
    }

    public synchronized void E() throws IOException {
        try {
            if (!o()) {
                if (this.c == 1) {
                    k();
                } else {
                    b bVar = this.d;
                    int N = N(bVar.a + 4 + bVar.b);
                    H(N, this.f, 0, 4);
                    int x = x(this.f, 0);
                    P(this.b, this.c - 1, N, this.e.a);
                    this.c--;
                    this.d = new b(N, x);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int M() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i = bVar.a;
        int i2 = this.d.a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.b + 16;
        }
        return (((i + 4) + bVar.b) + this.b) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.a.close();
    }

    public void i(byte[] bArr) throws IOException {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i, int i2) throws IOException {
        int N;
        int i3;
        try {
            q(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                l(i2);
                boolean o = o();
                if (o) {
                    N = 16;
                } else {
                    b bVar = this.e;
                    N = N(bVar.a + 4 + bVar.b);
                }
                b bVar2 = new b(N, i2);
                Q(this.f, 0, i2);
                K(bVar2.a, this.f, 0, 4);
                K(bVar2.a + 4, bArr, i, i2);
                if (o) {
                    i3 = bVar2.a;
                } else {
                    i3 = this.d.a;
                }
                P(this.b, this.c + 1, i3, bVar2.a);
                this.e = bVar2;
                this.c++;
                if (o) {
                    this.d = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k() throws IOException {
        try {
            P(4096, 0, 0, 0);
            this.c = 0;
            b bVar = b.c;
            this.d = bVar;
            this.e = bVar;
            if (this.b > 4096) {
                L(4096);
            }
            this.b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m(d dVar) throws IOException {
        int i = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b s = s(i);
            dVar.a(new c(this, s, null), s.b);
            i = N(s.a + 4 + s.b);
        }
    }

    public synchronized boolean o() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            m(new a(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
