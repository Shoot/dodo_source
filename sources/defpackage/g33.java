package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DiskLruCache.java */
/* renamed from: g33  reason: default package */
/* loaded from: classes.dex */
public final class g33 implements Closeable {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> n = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: g33$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (g33.this) {
                try {
                    if (g33.this.i != null) {
                        g33.this.S();
                        if (g33.this.E()) {
                            g33.this.N();
                            g33.this.k = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: g33$b */
    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: g33$c */
    /* loaded from: classes.dex */
    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;

        /* synthetic */ c(g33 g33Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            g33.this.o(this, false);
        }

        public void b() {
            if (!this.c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            g33.this.o(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File k;
            synchronized (g33.this) {
                try {
                    if (this.a.f == this) {
                        if (!this.a.e) {
                            this.b[i] = true;
                        }
                        k = this.a.k(i);
                        g33.this.a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[g33.this.g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: g33$d */
    /* loaded from: classes.dex */
    public final class d {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;

        /* synthetic */ d(g33 g33Var, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == g33.this.g) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.b = new long[g33.this.g];
            this.c = new File[g33.this.g];
            this.d = new File[g33.this.g];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            for (int i = 0; i < g33.this.g; i++) {
                sb.append(i);
                this.c[i] = new File(g33.this.a, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(g33.this.a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: g33$e */
    /* loaded from: classes.dex */
    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;

        /* synthetic */ e(g33 g33Var, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    private g33(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E() {
        int i = this.k;
        if (i >= 2000 && i >= this.j.size()) {
            return true;
        }
        return false;
    }

    public static g33 H(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        Q(file2, file3, false);
                    }
                }
                g33 g33Var = new g33(file, i, i2, j);
                if (g33Var.b.exists()) {
                    try {
                        g33Var.L();
                        g33Var.K();
                        return g33Var;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        g33Var.q();
                    }
                }
                file.mkdirs();
                g33 g33Var2 = new g33(file, i, i2, j);
                g33Var2.N();
                return g33Var2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void K() throws IOException {
        r(this.c);
        Iterator<d> it = this.j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f != null) {
                next.f = null;
                while (i < this.g) {
                    r(next.j(i));
                    r(next.k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            }
        }
    }

    private void L() throws IOException {
        hza hzaVar = new hza(new FileInputStream(this.b), yub.a);
        try {
            String e2 = hzaVar.e();
            String e3 = hzaVar.e();
            String e4 = hzaVar.e();
            String e5 = hzaVar.e();
            String e6 = hzaVar.e();
            if ("libcore.io.DiskLruCache".equals(e2) && "1".equals(e3) && Integer.toString(this.e).equals(e4) && Integer.toString(this.g).equals(e5) && "".equals(e6)) {
                int i = 0;
                while (true) {
                    try {
                        M(hzaVar.e());
                        i++;
                    } catch (EOFException unused) {
                        this.k = i - this.j.size();
                        if (hzaVar.c()) {
                            N();
                        } else {
                            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), yub.a));
                        }
                        yub.a(hzaVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + e2 + ", " + e3 + ", " + e5 + ", " + e6 + "]");
            }
        } catch (Throwable th) {
            yub.a(hzaVar);
            throw th;
        }
    }

    private void M(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.j.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void N() throws IOException {
        try {
            Writer writer = this.i;
            if (writer != null) {
                n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), yub.a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.j.values()) {
                if (dVar.f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                }
            }
            n(bufferedWriter);
            if (this.b.exists()) {
                Q(this.b, this.d, true);
            }
            Q(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), yub.a));
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void Q(File file, File file2, boolean z) throws IOException {
        if (z) {
            r(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() throws IOException {
        while (this.h > this.f) {
            P(this.j.entrySet().iterator().next().getKey());
        }
    }

    private void m() {
        if (this.i != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    @TargetApi(26)
    private static void n(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f == cVar) {
            if (z && !dVar.e) {
                for (int i = 0; i < this.g; i++) {
                    if (cVar.b[i]) {
                        if (!dVar.k(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                File k = dVar.k(i2);
                if (z) {
                    if (k.exists()) {
                        File j = dVar.j(i2);
                        k.renameTo(j);
                        long j2 = dVar.b[i2];
                        long length = j.length();
                        dVar.b[i2] = length;
                        this.h = (this.h - j2) + length;
                    }
                } else {
                    r(k);
                }
            }
            this.k++;
            dVar.f = null;
            if (dVar.e | z) {
                dVar.e = true;
                this.i.append((CharSequence) "CLEAN");
                this.i.append(' ');
                this.i.append((CharSequence) dVar.a);
                this.i.append((CharSequence) dVar.l());
                this.i.append('\n');
                if (z) {
                    long j3 = this.l;
                    this.l = 1 + j3;
                    dVar.g = j3;
                }
            } else {
                this.j.remove(dVar.a);
                this.i.append((CharSequence) "REMOVE");
                this.i.append(' ');
                this.i.append((CharSequence) dVar.a);
                this.i.append('\n');
            }
            x(this.i);
            if (this.h > this.f || E()) {
                this.m.submit(this.n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void r(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c u(String str, long j) throws IOException {
        m();
        d dVar = this.j.get(str);
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, null);
            this.j.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, null);
        dVar.f = cVar;
        this.i.append((CharSequence) "DIRTY");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        x(this.i);
        return cVar;
    }

    @TargetApi(26)
    private static void x(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public synchronized boolean P(String str) throws IOException {
        try {
            m();
            d dVar = this.j.get(str);
            if (dVar != null && dVar.f == null) {
                for (int i = 0; i < this.g; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.h -= dVar.b[i];
                    dVar.b[i] = 0;
                }
                this.k++;
                this.i.append((CharSequence) "REMOVE");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                this.j.remove(str);
                if (E()) {
                    this.m.submit(this.n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            S();
            n(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void q() throws IOException {
        close();
        yub.b(this.a);
    }

    public c s(String str) throws IOException {
        return u(str, -1L);
    }

    public synchronized e y(String str) throws IOException {
        m();
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (E()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.g, dVar.c, dVar.b, null);
    }
}
