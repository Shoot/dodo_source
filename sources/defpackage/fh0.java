package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
/* compiled from: BufferedSource.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH&J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020%H&J\u0010\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010)\u001a\u00020'H&J\u0010\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020'2\u0006\u0010-\u001a\u00020,H&J\u0010\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0019H&J\u0010\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0019H&J\u0018\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0019H&J\b\u00105\u001a\u00020\u0000H&J\b\u00107\u001a\u000206H&R\u0014\u0010:\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0001\u0002\u0003;ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006<À\u0006\u0001"}, d2 = {"Lfh0;", "Lpqa;", "Ljava/nio/channels/ReadableByteChannel;", "Lyg0;", "D", "", "U0", "", "byteCount", "", "B0", "w", "", "readByte", "", "readShort", "w0", "", "readInt", "C1", "readLong", "y0", "b1", "T1", "skip", "Llk0;", "v1", "J0", "Lzb7;", "options", "W0", "", "T0", "u0", "sink", "readFully", "c0", "Lzma;", "k1", "", "G0", "s0", "limit", "V", "Ljava/nio/charset/Charset;", "charset", "n1", "bytes", "h0", "targetBytes", "O1", "offset", "L1", "peek", "Ljava/io/InputStream;", "z", DateTokenConverter.CONVERTER_KEY, "()Lyg0;", "buffer", "Ls79;", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: fh0  reason: default package */
/* loaded from: classes3.dex */
public interface fh0 extends pqa, ReadableByteChannel {
    void B0(long j) throws IOException;

    int C1() throws IOException;

    yg0 D();

    String G0(long j) throws IOException;

    lk0 J0(long j) throws IOException;

    boolean L1(long j, lk0 lk0Var) throws IOException;

    long O1(lk0 lk0Var) throws IOException;

    byte[] T0() throws IOException;

    long T1() throws IOException;

    boolean U0() throws IOException;

    String V(long j) throws IOException;

    int W0(zb7 zb7Var) throws IOException;

    long b1() throws IOException;

    void c0(yg0 yg0Var, long j) throws IOException;

    yg0 d();

    long h0(lk0 lk0Var) throws IOException;

    long k1(zma zmaVar) throws IOException;

    String n1(Charset charset) throws IOException;

    fh0 peek();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    String s0() throws IOException;

    void skip(long j) throws IOException;

    byte[] u0(long j) throws IOException;

    lk0 v1() throws IOException;

    boolean w(long j) throws IOException;

    short w0() throws IOException;

    long y0() throws IOException;

    InputStream z();
}
