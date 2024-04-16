package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import defpackage.wm3;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: ExifInterface.java */
/* renamed from: um3  reason: default package */
/* loaded from: classes.dex */
public class um3 {
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    private static final d[] Y;
    private static final d[] Z;
    private static final d[] a0;
    private static final d[] b0;
    private static final d[] c0;
    private static final d d0;
    private static final d[] e0;
    private static final d[] f0;
    private static final d[] g0;
    private static final d[] h0;
    static final d[][] i0;
    private static final d[] j0;
    private static final HashMap<Integer, d>[] k0;
    private static final HashMap<String, d>[] l0;
    private static final HashSet<String> m0;
    private static final HashMap<Integer, Integer> n0;
    static final Charset o0;
    static final byte[] p0;
    private static final byte[] q0;
    private static final Pattern r0;
    private static final Pattern s0;
    private static final Pattern t0;
    private static final Pattern u0;
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private boolean e;
    private final HashMap<String, c>[] f;
    private Set<Integer> g;
    private ByteOrder h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private static final boolean u = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> v = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> w = Arrays.asList(2, 7, 4, 5);
    public static final int[] x = {8, 8, 8};
    public static final int[] y = {4};
    public static final int[] z = {8};
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {
        private static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder f = ByteOrder.BIG_ENDIAN;
        final DataInputStream a;
        private ByteOrder b;
        int c;
        private byte[] d;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.c;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.a.available();
        }

        public long b() throws IOException {
            return readInt() & 4294967295L;
        }

        public void c(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void e(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.a.skip(i3);
                if (skip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    skip = this.a.read(this.d, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.c += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.c++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.c++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.c++;
            int read = this.a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.c += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.c += i2;
            this.a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.c += 4;
            int read = this.a.read();
            int read2 = this.a.read();
            int read3 = this.a.read();
            int read4 = this.a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.b;
                if (byteOrder == e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.c += 8;
            int read = this.a.read();
            int read2 = this.a.read();
            int read3 = this.a.read();
            int read4 = this.a.read();
            int read5 = this.a.read();
            int read6 = this.a.read();
            int read7 = this.a.read();
            int read8 = this.a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.b;
                if (byteOrder == e) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.c += 2;
            int read = this.a.read();
            int read2 = this.a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.b;
                if (byteOrder == e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.c += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.c++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.c += 2;
            int read = this.a.read();
            int read2 = this.a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.b;
                if (byteOrder == e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.b);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.a.read(bArr, i, i2);
            this.c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.c += bArr.length;
            this.a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            dataInputStream.mark(0);
            this.c = 0;
            this.b = byteOrder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$c */
    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        c(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(um3.o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[um3.W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[um3.W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.a);
                wrap.putInt((int) eVar.b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i, ByteOrder byteOrder) {
            return g(new int[]{i}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[um3.W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k != null) {
                if (k instanceof String) {
                    return Double.parseDouble((String) k);
                }
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof e[]) {
                    e[] eVarArr = (e[]) k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k != null) {
                if (k instanceof String) {
                    return Integer.parseInt((String) k);
                }
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) k;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].a);
                    sb.append('/');
                    sb.append(eVarArr[i].b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.um3.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + um3.V[this.a] + ", data length:" + this.d.length + ")";
        }

        c(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$d */
    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        d(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        d(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$e */
    /* loaded from: classes.dex */
    public static class e {
        public final long a;
        public final long b;

        e(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        d[] dVarArr;
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Y = dVarArr2;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr3;
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        a0 = dVarArr4;
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        b0 = dVarArr5;
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        c0 = dVarArr6;
        d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr7 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        e0 = dVarArr7;
        d[] dVarArr8 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f0 = dVarArr8;
        d[] dVarArr9 = {new d("AspectFrame", 4371, 3)};
        g0 = dVarArr9;
        d[] dVarArr10 = {new d("ColorSpace", 55, 3)};
        h0 = dVarArr10;
        d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        i0 = dVarArr11;
        j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        k0 = new HashMap[dVarArr11.length];
        l0 = new HashMap[dVarArr11.length];
        m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        n0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        o0 = forName;
        p0 = "Exif\u0000\u0000".getBytes(forName);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr12 = i0;
            if (i >= dVarArr12.length) {
                HashMap<Integer, Integer> hashMap = n0;
                d[] dVarArr13 = j0;
                hashMap.put(Integer.valueOf(dVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].a), 8);
                r0 = Pattern.compile(".*[1-9].*");
                s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            k0[i] = new HashMap<>();
            l0[i] = new HashMap<>();
            for (d dVar : dVarArr12[i]) {
                k0[i].put(Integer.valueOf(dVar.a), dVar);
                l0[i].put(dVar.b, dVar);
            }
            i++;
        }
    }

    public um3(@NonNull String str) throws IOException {
        d[][] dVarArr = i0;
        this.f = new HashMap[dVarArr.length];
        this.g = new HashSet(dVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            q(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    private boolean A(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int i = cVar.i(this.h);
            int i2 = cVar2.i(this.h);
            if (i <= 512 && i2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean B(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i2 < bArr3.length) {
                        if (bArr[K.length + i2 + 4] != bArr3[i2]) {
                            return false;
                        }
                        i2++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C(@androidx.annotation.NonNull java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = 0
        L4:
            um3$d[][] r2 = defpackage.um3.i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, um3$c>[] r2 = r4.f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = L(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            um3$f r0 = new um3$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.e(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.l(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.K(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            um3$b r1 = new um3$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.n(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = defpackage.um3.u
            if (r5 == 0) goto Lac
        L97:
            r4.E()
            goto Lac
        L9b:
            boolean r0 = defpackage.um3.u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.a()
            boolean r0 = defpackage.um3.u
            if (r0 == 0) goto Lb7
            r4.E()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um3.C(java.io.InputStream):void");
    }

    private void D(b bVar) throws IOException {
        ByteOrder F2 = F(bVar);
        this.h = F2;
        bVar.c(F2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                bVar.e(i2);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    private void E() {
        for (int i = 0; i < this.f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f[i].size());
            for (Map.Entry<String, c> entry : this.f[i].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.h) + "'");
            }
        }
    }

    private ByteOrder F(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (u) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (u) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void G(byte[] bArr, int i) throws IOException {
        f fVar = new f(bArr);
        D(fVar);
        H(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H(defpackage.um3.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um3.H(um3$f, int):void");
    }

    private void I(int i, String str, String str2) {
        if (!this.f[i].isEmpty() && this.f[i].get(str) != null) {
            HashMap<String, c> hashMap = this.f[i];
            hashMap.put(str2, hashMap.get(str));
            this.f[i].remove(str);
        }
    }

    private void J(f fVar, int i) throws IOException {
        c cVar = this.f[i].get("ImageLength");
        c cVar2 = this.f[i].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f[i].get("JPEGInterchangeFormat");
            c cVar4 = this.f[i].get("JPEGInterchangeFormatLength");
            if (cVar3 != null && cVar4 != null) {
                int i2 = cVar3.i(this.h);
                int i3 = cVar3.i(this.h);
                fVar.i(i2);
                byte[] bArr = new byte[i3];
                fVar.read(bArr);
                f(new b(bArr), i2, i);
            }
        }
    }

    private void K(b bVar) throws IOException {
        HashMap<String, c> hashMap = this.f[4];
        c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i = cVar.i(this.h);
            this.o = i;
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else {
                    o(bVar, hashMap);
                    return;
                }
            }
            if (z(hashMap)) {
                p(bVar, hashMap);
                return;
            }
            return;
        }
        this.o = 6;
        o(bVar, hashMap);
    }

    private static boolean L(int i) {
        if (i != 4 && i != 9 && i != 13 && i != 14) {
            return true;
        }
        return false;
    }

    private void M(int i, int i2) throws IOException {
        if (!this.f[i].isEmpty() && !this.f[i2].isEmpty()) {
            c cVar = this.f[i].get("ImageLength");
            c cVar2 = this.f[i].get("ImageWidth");
            c cVar3 = this.f[i2].get("ImageLength");
            c cVar4 = this.f[i2].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int i3 = cVar.i(this.h);
                    int i4 = cVar2.i(this.h);
                    int i5 = cVar3.i(this.h);
                    int i6 = cVar4.i(this.h);
                    if (i3 < i5 && i4 < i6) {
                        HashMap<String, c>[] hashMapArr = this.f;
                        HashMap<String, c> hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (u) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void N(f fVar, int i) throws IOException {
        c f2;
        c f3;
        c cVar = this.f[i].get("DefaultCropSize");
        c cVar2 = this.f[i].get("SensorTopBorder");
        c cVar3 = this.f[i].get("SensorLeftBorder");
        c cVar4 = this.f[i].get("SensorBottomBorder");
        c cVar5 = this.f[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.k(this.h);
                if (eVarArr != null && eVarArr.length == 2) {
                    f2 = c.d(eVarArr[0], this.h);
                    f3 = c.d(eVarArr[1], this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.k(this.h);
                if (iArr != null && iArr.length == 2) {
                    f2 = c.f(iArr[0], this.h);
                    f3 = c.f(iArr[1], this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f[i].put("ImageWidth", f2);
            this.f[i].put("ImageLength", f3);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int i2 = cVar2.i(this.h);
            int i3 = cVar4.i(this.h);
            int i4 = cVar5.i(this.h);
            int i5 = cVar3.i(this.h);
            if (i3 > i2 && i4 > i5) {
                c f4 = c.f(i3 - i2, this.h);
                c f5 = c.f(i4 - i5, this.h);
                this.f[i].put("ImageLength", f4);
                this.f[i].put("ImageWidth", f5);
            }
        } else {
            J(fVar, i);
        }
    }

    private void O() throws IOException {
        M(0, 5);
        M(0, 4);
        M(5, 4);
        c cVar = this.f[1].get("PixelXDimension");
        c cVar2 = this.f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f[0].put("ImageWidth", cVar);
            this.f[0].put("ImageLength", cVar2);
        }
        if (this.f[4].isEmpty() && A(this.f[5])) {
            HashMap<String, c>[] hashMapArr = this.f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!A(this.f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        I(0, "ThumbnailOrientation", "Orientation");
        I(0, "ThumbnailImageLength", "ImageLength");
        I(0, "ThumbnailImageWidth", "ImageWidth");
        I(5, "ThumbnailOrientation", "Orientation");
        I(5, "ThumbnailImageLength", "ImageLength");
        I(5, "ThumbnailImageWidth", "ImageWidth");
        I(4, "Orientation", "ThumbnailOrientation");
        I(4, "ImageLength", "ThumbnailImageLength");
        I(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.f[0].put("DateTime", c.a(b2));
        }
        if (b("ImageWidth") == null) {
            this.f[0].put("ImageWidth", c.b(0L, this.h));
        }
        if (b("ImageLength") == null) {
            this.f[0].put("ImageLength", c.b(0L, this.h));
        }
        if (b("Orientation") == null) {
            this.f[0].put("Orientation", c.b(0L, this.h));
        }
        if (b("LightSource") == null) {
            this.f[1].put("LightSource", c.b(0L, this.h));
        }
    }

    private c d(@NonNull String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (u) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < i0.length; i++) {
                c cVar = this.f[i].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void e(f fVar) throws IOException {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    wm3.b.a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.f[0].put("ImageWidth", c.f(Integer.parseInt(str), this.h));
                    }
                    if (str2 != null) {
                        this.f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.h));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        this.f[0].put("Orientation", c.f(i, this.h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.i(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, p0)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (fVar.read(bArr2) == i3) {
                                        this.p = i2;
                                        G(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (u) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
        r22.c(r21.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0196, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[LOOP:0: B:10:0x0037->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(defpackage.um3.b r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um3.f(um3$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(Level.TRACE_INT);
        byte[] bArr = new byte[Level.TRACE_INT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (t(bArr)) {
            return 4;
        }
        if (w(bArr)) {
            return 9;
        }
        if (s(bArr)) {
            return 12;
        }
        if (u(bArr)) {
            return 7;
        }
        if (x(bArr)) {
            return 10;
        }
        if (v(bArr)) {
            return 13;
        }
        if (B(bArr)) {
            return 14;
        }
        return 0;
    }

    private void h(f fVar) throws IOException {
        int i;
        int i2;
        k(fVar);
        c cVar = this.f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.c(this.h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.i(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.i(12L);
            }
            H(fVar2, 6);
            c cVar2 = this.f[7].get("PreviewImageStart");
            c cVar3 = this.f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f[5].put("JPEGInterchangeFormat", cVar2);
                this.f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.h);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        c f2 = c.f(i5, this.h);
                        c f3 = c.f(i6, this.h);
                        this.f[0].put("ImageWidth", f2);
                        this.f[0].put("ImageLength", f3);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void i(b bVar) throws IOException {
        if (u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.e(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i = length + 8;
                    if (i == 16 && !Arrays.equals(bArr2, I)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, J)) {
                        if (Arrays.equals(bArr2, H)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.p = i;
                                    G(bArr3, 0);
                                    O();
                                    K(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + wm3.a(bArr2));
                        }
                        int i2 = readInt + 4;
                        bVar.e(i2);
                        length = i + i2;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws IOException {
        boolean z2 = u;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.e(i - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i, 5);
        bVar.e(i3 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == d0.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f2 = c.f(readShort, this.h);
                c f3 = c.f(readShort2, this.h);
                this.f[0].put("ImageLength", f2);
                this.f[0].put("ImageWidth", f3);
                if (u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.e(readUnsignedShort2);
        }
    }

    private void k(f fVar) throws IOException {
        c cVar;
        D(fVar);
        H(fVar, 0);
        N(fVar, 0);
        N(fVar, 5);
        N(fVar, 4);
        O();
        if (this.d == 8 && (cVar = this.f[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.d);
            fVar2.c(this.h);
            fVar2.e(6);
            H(fVar2, 9);
            c cVar2 = this.f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f[1].put("ColorSpace", cVar2);
            }
        }
    }

    private void l(f fVar) throws IOException {
        if (u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = this.f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.d), (int) cVar.c, 5);
        }
        c cVar2 = this.f[0].get("ISO");
        c cVar3 = this.f[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f[1].put("PhotographicSensitivity", cVar2);
        }
    }

    private void m(f fVar) throws IOException {
        byte[] bArr = p0;
        fVar.e(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.p = bArr.length;
        G(bArr2, 0);
    }

    private void n(b bVar) throws IOException {
        if (u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.e(K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 8;
                    if (Arrays.equals(M, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.p = i;
                            G(bArr3, 0);
                            K(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + wm3.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.e(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void o(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i = cVar.i(this.h);
            int i2 = cVar2.i(this.h);
            if (this.d == 7) {
                i += this.q;
            }
            if (i > 0 && i2 > 0) {
                this.i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[i2];
                    bVar.skip(i);
                    bVar.read(bArr);
                    this.n = bArr;
                }
                this.l = i;
                this.m = i2;
            }
            if (u) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i2);
            }
        }
    }

    private void p(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] c2 = wm3.c(cVar.k(this.h));
            long[] c3 = wm3.c(cVar2.k(this.h));
            if (c2 != null && c2.length != 0) {
                if (c3 != null && c3.length != 0) {
                    if (c2.length != c3.length) {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j = 0;
                    for (long j2 : c3) {
                        j += j2;
                    }
                    int i = (int) j;
                    byte[] bArr = new byte[i];
                    int i2 = 1;
                    this.k = true;
                    this.j = true;
                    this.i = true;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < c2.length) {
                        int i6 = (int) c2[i3];
                        int i7 = (int) c3[i3];
                        if (i3 < c2.length - i2 && i6 + i7 != c2[i3 + 1]) {
                            this.k = false;
                        }
                        int i8 = i6 - i4;
                        if (i8 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                            return;
                        }
                        long j3 = i8;
                        if (bVar.skip(j3) != j3) {
                            Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                            return;
                        }
                        int i9 = i4 + i8;
                        byte[] bArr2 = new byte[i7];
                        if (bVar.read(bArr2) != i7) {
                            Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                            return;
                        }
                        i4 = i9 + i7;
                        System.arraycopy(bArr2, 0, bArr, i5, i7);
                        i5 += i7;
                        i3++;
                        i2 = 1;
                    }
                    this.n = bArr;
                    if (this.k) {
                        this.l = (int) c2[0];
                        this.m = i;
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }

    private void q(String str) throws IOException {
        FileInputStream fileInputStream;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.c = null;
            this.a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (y(fileInputStream.getFD())) {
                    this.b = fileInputStream.getFD();
                } else {
                    this.b = null;
                }
                C(fileInputStream);
                wm3.b(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                wm3.b(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = p0;
            if (i < bArr3.length) {
                if (bArr2[i] != bArr3[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    private boolean s(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e3) {
            e = e3;
            bVar2 = bVar;
            if (u) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, B)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, C)) {
                    z2 = true;
                } else if (Arrays.equals(bArr3, D)) {
                    z3 = true;
                }
                if (z2 && z3) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean t(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    private boolean u(byte[] bArr) throws IOException {
        boolean z2 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder F2 = F(bVar2);
                this.h = F2;
                bVar2.c(F2);
                short readShort = bVar2.readShort();
                z2 = (readShort == 20306 || readShort == 21330) ? true : true;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean v(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    private boolean w(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean x(byte[] bArr) throws IOException {
        boolean z2 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder F2 = F(bVar2);
                this.h = F2;
                bVar2.c(F2);
                if (bVar2.readShort() == 85) {
                    z2 = true;
                }
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean y(FileDescriptor fileDescriptor) {
        try {
            wm3.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (u) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    private boolean z(HashMap hashMap) throws IOException {
        c cVar;
        int i;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.h);
            int[] iArr2 = x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i = cVar.i(this.h)) == 1 && Arrays.equals(iArr, z)) || (i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (u) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    public String b(@NonNull String str) {
        if (str != null) {
            c d2 = d(str);
            if (d2 != null) {
                if (!m0.contains(str)) {
                    return d2.j(this.h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = d2.a;
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d2.a);
                        return null;
                    }
                    e[] eVarArr = (e[]) d2.k(this.h);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.a) / ((float) eVar.b))), Integer.valueOf((int) (((float) eVar2.a) / ((float) eVar2.b))), Integer.valueOf((int) (((float) eVar3.a) / ((float) eVar3.b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                try {
                    return Double.toString(d2.h(this.h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int c(@NonNull String str, int i) {
        if (str != null) {
            c d2 = d(str);
            if (d2 == null) {
                return i;
            }
            try {
                return d2.i(this.h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$f */
    /* loaded from: classes.dex */
    public static class f extends b {
        f(byte[] bArr) throws IOException {
            super(bArr);
            this.a.mark(Integer.MAX_VALUE);
        }

        public void i(long j) throws IOException {
            int i = this.c;
            if (i > j) {
                this.c = 0;
                this.a.reset();
            } else {
                j -= i;
            }
            e((int) j);
        }

        f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public um3(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public um3(@NonNull InputStream inputStream, int i) throws IOException {
        d[][] dVarArr = i0;
        this.f = new HashMap[dVarArr.length];
        this.g = new HashSet(dVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, p0.length);
                if (!r(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.e = true;
                this.c = null;
                this.b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (y(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.b = null;
            }
            C(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: um3$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {
        long a;
        final /* synthetic */ f b;

        a(f fVar) {
            this.b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.b.available()) {
                        return -1;
                    }
                    this.b.i(j);
                    this.a = j;
                }
                if (i2 > this.b.available()) {
                    i2 = this.b.available();
                }
                int read = this.b.read(bArr, i, i2);
                if (read >= 0) {
                    this.a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
