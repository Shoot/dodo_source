package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.a;
import com.android.volley.f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: DiskBasedCache.java */
/* renamed from: a33  reason: default package */
/* loaded from: classes.dex */
public class a33 implements com.android.volley.a {
    private final Map<String, a> a;
    private long b;
    private final c c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    /* renamed from: a33$b */
    /* loaded from: classes.dex */
    public static class b extends FilterInputStream {
        private final long a;
        private long b;

        b(InputStream inputStream, long j) {
            super(inputStream);
            this.a = j;
        }

        long a() {
            return this.a - this.b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.b += read;
            }
            return read;
        }
    }

    /* compiled from: DiskBasedCache.java */
    /* renamed from: a33$c */
    /* loaded from: classes.dex */
    public interface c {
        File get();
    }

    public a33(c cVar, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = cVar;
        this.d = i;
    }

    private String f(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (!this.c.get().exists()) {
            f.b("Re-initializing cache after external clearing.", new Object[0]);
            this.a.clear();
            this.b = 0L;
            initialize();
        }
    }

    private void h() {
        if (this.b < this.d) {
            return;
        }
        if (f.b) {
            f.e("Pruning old cache entries.", new Object[0]);
        }
        long j = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (e(value.b).delete()) {
                this.b -= value.a;
            } else {
                String str = value.b;
                f.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i++;
            if (((float) this.b) < this.d * 0.9f) {
                break;
            }
        }
        if (f.b) {
            f.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void i(String str, a aVar) {
        if (!this.a.containsKey(str)) {
            this.b += aVar.a;
        } else {
            this.b += aVar.a - this.a.get(str).a;
        }
        this.a.put(str, aVar);
    }

    private static int j(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static List<en4> k(b bVar) throws IOException {
        List<en4> arrayList;
        int l = l(bVar);
        if (l >= 0) {
            if (l == 0) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i = 0; i < l; i++) {
                arrayList.add(new en4(n(bVar).intern(), n(bVar).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + l);
    }

    static int l(InputStream inputStream) throws IOException {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) throws IOException {
        return (j(inputStream) & 255) | ((j(inputStream) & 255) << 8) | ((j(inputStream) & 255) << 16) | ((j(inputStream) & 255) << 24) | ((j(inputStream) & 255) << 32) | ((j(inputStream) & 255) << 40) | ((j(inputStream) & 255) << 48) | ((255 & j(inputStream)) << 56);
    }

    static String n(b bVar) throws IOException {
        return new String(q(bVar, m(bVar)), "UTF-8");
    }

    private void p(String str) {
        a remove = this.a.remove(str);
        if (remove != null) {
            this.b -= remove.a;
        }
    }

    static byte[] q(b bVar, long j) throws IOException {
        long a2 = bVar.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a2);
    }

    static void r(List<en4> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            s(outputStream, list.size());
            for (en4 en4Var : list) {
                u(outputStream, en4Var.a());
                u(outputStream, en4Var.b());
            }
            return;
        }
        s(outputStream, 0);
    }

    static void s(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.a
    public synchronized void a(String str, boolean z) {
        try {
            a.C0093a c0093a = get(str);
            if (c0093a != null) {
                c0093a.f = 0L;
                if (z) {
                    c0093a.e = 0L;
                }
                b(str, c0093a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.a
    public synchronized void b(String str, a.C0093a c0093a) {
        BufferedOutputStream bufferedOutputStream;
        a aVar;
        long j = this.b;
        byte[] bArr = c0093a.a;
        long length = j + bArr.length;
        int i = this.d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File e = e(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(d(e));
            aVar = new a(str, c0093a);
        } catch (IOException unused) {
            if (!e.delete()) {
                f.b("Could not clean up file %s", e.getAbsolutePath());
            }
            g();
        }
        if (aVar.d(bufferedOutputStream)) {
            bufferedOutputStream.write(c0093a.a);
            bufferedOutputStream.close();
            aVar.a = e.length();
            i(str, aVar);
            h();
            return;
        }
        bufferedOutputStream.close();
        f.b("Failed to write header for %s", e.getAbsolutePath());
        throw new IOException();
    }

    InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    OutputStream d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.c.get(), f(str));
    }

    @Override // com.android.volley.a
    public synchronized a.C0093a get(String str) {
        a aVar = this.a.get(str);
        if (aVar == null) {
            return null;
        }
        File e = e(str);
        try {
            b bVar = new b(new BufferedInputStream(c(e)), e.length());
            try {
                a b2 = a.b(bVar);
                if (!TextUtils.equals(str, b2.b)) {
                    f.b("%s: key=%s, found=%s", e.getAbsolutePath(), str, b2.b);
                    p(str);
                    return null;
                }
                return aVar.c(q(bVar, bVar.a()));
            } finally {
                bVar.close();
            }
        } catch (IOException e2) {
            f.b("%s: %s", e.getAbsolutePath(), e2.toString());
            o(str);
            return null;
        }
    }

    @Override // com.android.volley.a
    public synchronized void initialize() {
        long length;
        b bVar;
        File file = this.c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                f.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                bVar = new b(new BufferedInputStream(c(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                a b2 = a.b(bVar);
                b2.a = length;
                i(b2.b, b2);
                bVar.close();
            } catch (Throwable th) {
                bVar.close();
                throw th;
                break;
            }
        }
    }

    public synchronized void o(String str) {
        boolean delete = e(str).delete();
        p(str);
        if (!delete) {
            f.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    /* renamed from: a33$a */
    /* loaded from: classes.dex */
    public static class a {
        long a;
        final String b;
        final String c;
        final long d;
        final long e;
        final long f;
        final long g;
        final List<en4> h;

        private a(String str, String str2, long j, long j2, long j3, long j4, List<en4> list) {
            this.b = str;
            this.c = "".equals(str2) ? null : str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
        }

        private static List<en4> a(a.C0093a c0093a) {
            List<en4> list = c0093a.h;
            if (list != null) {
                return list;
            }
            return kq4.i(c0093a.g);
        }

        static a b(b bVar) throws IOException {
            if (a33.l(bVar) == 538247942) {
                return new a(a33.n(bVar), a33.n(bVar), a33.m(bVar), a33.m(bVar), a33.m(bVar), a33.m(bVar), a33.k(bVar));
            }
            throw new IOException();
        }

        a.C0093a c(byte[] bArr) {
            a.C0093a c0093a = new a.C0093a();
            c0093a.a = bArr;
            c0093a.b = this.c;
            c0093a.c = this.d;
            c0093a.d = this.e;
            c0093a.e = this.f;
            c0093a.f = this.g;
            c0093a.g = kq4.j(this.h);
            c0093a.h = Collections.unmodifiableList(this.h);
            return c0093a;
        }

        boolean d(OutputStream outputStream) {
            try {
                a33.s(outputStream, 538247942);
                a33.u(outputStream, this.b);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                a33.u(outputStream, str);
                a33.t(outputStream, this.d);
                a33.t(outputStream, this.e);
                a33.t(outputStream, this.f);
                a33.t(outputStream, this.g);
                a33.r(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                f.b("%s", e.toString());
                return false;
            }
        }

        a(String str, a.C0093a c0093a) {
            this(str, c0093a.b, c0093a.c, c0093a.d, c0093a.e, c0093a.f, a(c0093a));
        }
    }

    public a33(c cVar) {
        this(cVar, 5242880);
    }
}
