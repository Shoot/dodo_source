package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ElfParser.java */
/* renamed from: af3  reason: default package */
/* loaded from: classes2.dex */
public class af3 implements Closeable {
    private final int a = 1179403647;
    private final FileChannel b;

    public af3(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.b = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    private long a(ve3 ve3Var, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            we3 b = ve3Var.b(j3);
            if (b.a == 1) {
                long j4 = b.c;
                if (j4 <= j2 && j2 <= b.d + j4) {
                    return (j2 - j4) + b.b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public ve3 b() throws IOException {
        boolean z;
        this.b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m(allocate, 0L) == 1179403647) {
            short i = i(allocate, 4L);
            if (i(allocate, 5L) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i == 1) {
                return new ye3(z, this);
            }
            if (i == 2) {
                return new ze3(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> c() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.b.position(0L);
        ArrayList arrayList = new ArrayList();
        ve3 b = b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (b.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = b.f;
        int i = 0;
        if (j2 == 65535) {
            j2 = b.c(0).a;
        }
        long j3 = 0;
        while (true) {
            if (j3 < j2) {
                we3 b2 = b.b(j3);
                if (b2.a == 2) {
                    j = b2.b;
                    break;
                }
                j3++;
            } else {
                j = 0;
                break;
            }
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            ue3 a = b.a(j, i);
            long j5 = j;
            long j6 = a.a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a.b));
            } else if (j6 == 5) {
                j4 = a.b;
            }
            i++;
            if (a.a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a2 = a(b, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(l(allocate, l.longValue() + a2));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    protected void e(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    protected short i(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long k(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    protected String l(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short i = i(byteBuffer, j);
            if (i != 0) {
                sb.append((char) i);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long m(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
