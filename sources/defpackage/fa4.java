package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: GEMFFile.java */
/* renamed from: fa4  reason: default package */
/* loaded from: classes3.dex */
public class fa4 {
    private final String a;
    private final List<RandomAccessFile> b;
    private final List<String> c;
    private final List<c> d;
    private final List<Long> e;
    private final LinkedHashMap<Integer, String> f;
    private boolean g;
    private int h;

    /* compiled from: GEMFFile.java */
    /* renamed from: fa4$b */
    /* loaded from: classes3.dex */
    class b extends InputStream {
        RandomAccessFile a;
        int b;

        b(String str, long j, int i) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.a = randomAccessFile;
            randomAccessFile.seek(j);
            this.b = i;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.b;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.a.close();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = this.b;
            if (i2 > i3) {
                i2 = i3;
            }
            int read = randomAccessFile.read(bArr, i, i2);
            this.b -= read;
            return read;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            return 0L;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.b;
            if (i > 0) {
                this.b = i - 1;
                return this.a.read();
            }
            throw new IOException("End of stream");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GEMFFile.java */
    /* renamed from: fa4$c */
    /* loaded from: classes3.dex */
    public class c {
        Integer a;
        Integer b;
        Integer c;
        Integer d;
        Integer e;
        Integer f;
        Long g;

        private c() {
        }

        public String toString() {
            return String.format("GEMF Range: source=%d, zoom=%d, x=%d-%d, y=%d-%d, offset=0x%08X", this.f, this.a, this.b, this.c, this.d, this.e, this.g);
        }
    }

    public fa4(File file) throws FileNotFoundException, IOException {
        this(file.getAbsolutePath());
    }

    private void d() throws FileNotFoundException {
        File file = new File(this.a);
        this.b.add(new RandomAccessFile(file, "r"));
        this.c.add(file.getPath());
        int i = 0;
        while (true) {
            i++;
            File file2 = new File(this.a + "-" + i);
            if (file2.exists()) {
                this.b.add(new RandomAccessFile(file2, "r"));
                this.c.add(file2.getPath());
            } else {
                return;
            }
        }
    }

    private void e() throws IOException {
        RandomAccessFile randomAccessFile = this.b.get(0);
        for (RandomAccessFile randomAccessFile2 : this.b) {
            this.e.add(Long.valueOf(randomAccessFile2.length()));
        }
        int readInt = randomAccessFile.readInt();
        if (readInt == 4) {
            int readInt2 = randomAccessFile.readInt();
            if (readInt2 == 256) {
                int readInt3 = randomAccessFile.readInt();
                for (int i = 0; i < readInt3; i++) {
                    int readInt4 = randomAccessFile.readInt();
                    int readInt5 = randomAccessFile.readInt();
                    byte[] bArr = new byte[readInt5];
                    randomAccessFile.read(bArr, 0, readInt5);
                    this.f.put(new Integer(readInt4), new String(bArr));
                }
                int readInt6 = randomAccessFile.readInt();
                for (int i2 = 0; i2 < readInt6; i2++) {
                    c cVar = new c();
                    cVar.a = Integer.valueOf(randomAccessFile.readInt());
                    cVar.b = Integer.valueOf(randomAccessFile.readInt());
                    cVar.c = Integer.valueOf(randomAccessFile.readInt());
                    cVar.d = Integer.valueOf(randomAccessFile.readInt());
                    cVar.e = Integer.valueOf(randomAccessFile.readInt());
                    cVar.f = Integer.valueOf(randomAccessFile.readInt());
                    cVar.g = Long.valueOf(randomAccessFile.readLong());
                    this.d.add(cVar);
                }
                return;
            }
            throw new IOException("Bad tile size: " + readInt2);
        }
        throw new IOException("Bad file version: " + readInt);
    }

    public void a() throws IOException {
        for (RandomAccessFile randomAccessFile : this.b) {
            randomAccessFile.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream b(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa4.b(int, int, int):java.io.InputStream");
    }

    public String c() {
        return this.a;
    }

    public fa4(String str) throws FileNotFoundException, IOException {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new LinkedHashMap<>();
        this.g = false;
        this.h = 0;
        this.a = str;
        d();
        e();
    }
}
