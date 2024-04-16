package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i) throws IOException;

        short c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* loaded from: classes.dex */
    private static final class a implements Reader {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            if (this.a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        int d() {
            return this.a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements Reader {
        private final InputStream a;

        c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static int e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private int f(Reader reader, mr mrVar) throws IOException {
        try {
            int a2 = reader.a();
            if (!h(a2)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a2);
                }
                return -1;
            }
            int j = j(reader);
            if (j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) mrVar.c(j, byte[].class);
            int l = l(reader, bArr, j);
            mrVar.put(bArr);
            return l;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @NonNull
    private ImageHeaderParser.ImageType g(Reader reader) throws IOException {
        try {
            int a2 = reader.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c2 = (a2 << 8) | reader.c();
            if (c2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c3 = (c2 << 8) | reader.c();
            if (c3 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c3 != 1380533830) {
                return m(reader, c3);
            } else {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (reader.a() << 16) | reader.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short c4 = reader.c();
                    if ((c4 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((c4 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.skip(4L);
                    if ((reader.c() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i) {
        if ((i & 65496) != 65496 && i != 19789 && i != 18761) {
            return false;
        }
        return true;
    }

    private boolean i(byte[] bArr, int i) {
        boolean z;
        if (bArr != null && i > a.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private int j(Reader reader) throws IOException {
        short c2;
        short c3;
        int a2;
        long j;
        long skip;
        do {
            if (reader.c() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c2));
                }
                return -1;
            }
            c3 = reader.c();
            if (c3 == 218) {
                return -1;
            }
            if (c3 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = reader.a() - 2;
            if (c3 != 225) {
                j = a2;
                skip = reader.skip(j);
            } else {
                return a2;
            }
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c3) + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a2 = bVar.a(6);
        if (a2 != 18761) {
            if (a2 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a2));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int e = e(b2, i);
            short a4 = bVar.a(e);
            if (a4 == 274) {
                short a5 = bVar.a(e + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b3 = bVar.b(e + 4);
                    if (b3 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) a4) + " formatCode=" + ((int) a5) + " componentCount=" + b3);
                        }
                        int i2 = b3 + b[a5];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a5));
                            }
                        } else {
                            int i3 = e + 8;
                            if (i3 >= 0 && i3 <= bVar.d()) {
                                if (i2 >= 0 && i2 + i3 <= bVar.d()) {
                                    return bVar.a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) a4));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a5));
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i) throws IOException {
        int b2 = reader.b(bArr, i);
        if (b2 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b2);
            }
            return -1;
        } else if (i(bArr, i)) {
            return k(new b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i) throws IOException {
        boolean z;
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a2 = (reader.a() << 16) | reader.a();
        if (a2 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        if (a2 == 1635150182) {
            z = true;
        } else {
            z = false;
        }
        reader.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int a3 = (reader.a() << 16) | reader.a();
                if (a3 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a3 == 1635150182) {
                    z = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        if (z) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@NonNull InputStream inputStream, @NonNull mr mrVar) throws IOException {
        return f(new c((InputStream) eh8.d(inputStream)), (mr) eh8.d(mrVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType b(@NonNull ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) eh8.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) throws IOException {
        return g(new c((InputStream) eh8.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull ByteBuffer byteBuffer, @NonNull mr mrVar) throws IOException {
        return f(new a((ByteBuffer) eh8.d(byteBuffer)), (mr) eh8.d(mrVar));
    }
}
