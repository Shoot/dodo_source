package androidx.emoji2.text;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
class k {

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    private static class a implements c {
        @NonNull
        private final ByteBuffer a;

        a(@NonNull ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public int a() throws IOException {
            return this.a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public void b(int i) throws IOException {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.k.c
        public long c() throws IOException {
            return k.c(this.a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() throws IOException {
            return k.d(this.a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class b {
        private final long a;
        private final long b;

        b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        long a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public interface c {
        int a() throws IOException;

        void b(int i) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long j;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.b(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int a2 = cVar.a();
                    cVar.b(4);
                    j = cVar.c();
                    cVar.b(4);
                    if (1835365473 == a2) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                cVar.b((int) (j - cVar.getPosition()));
                cVar.b(12);
                long c2 = cVar.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    int a3 = cVar.a();
                    long c3 = cVar.c();
                    long c4 = cVar.c();
                    if (1164798569 == a3 || 1701669481 == a3) {
                        return new b(c3 + j, c4);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ri6 b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return ri6.h(duplicate);
    }

    static long c(int i) {
        return i & 4294967295L;
    }

    static int d(short s) {
        return s & 65535;
    }
}
