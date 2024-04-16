package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
/* compiled from: BufferedSink.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&J \u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tH&J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\tH&J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000eH&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000eH&J\b\u0010\"\u001a\u00020!H&J\b\u0010#\u001a\u00020\u0000H&J\b\u0010$\u001a\u00020\u0000H&J\b\u0010&\u001a\u00020%H&R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0001\u0002'+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Leh0;", "Lzma;", "Ljava/nio/channels/WritableByteChannel;", "Llk0;", "byteString", "d0", "", KustoStorage.KustoTable.COLUMN_SOURCE, "v0", "", "offset", "byteCount", "p1", "Lpqa;", "", "a1", "", "string", "a0", "beginIndex", "endIndex", "k0", "codePoint", "G", "b", "V0", Image.TYPE_SMALL, "P0", "i", "J", "v", "C0", "u1", "", "flush", "F", "U", "Ljava/io/OutputStream;", "S1", "Lyg0;", DateTokenConverter.CONVERTER_KEY, "()Lyg0;", "buffer", "Lr79;", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: eh0  reason: default package */
/* loaded from: classes3.dex */
public interface eh0 extends zma, WritableByteChannel {
    eh0 C0(long j) throws IOException;

    eh0 F() throws IOException;

    eh0 G(int i) throws IOException;

    eh0 J(int i) throws IOException;

    eh0 P0(int i) throws IOException;

    OutputStream S1();

    eh0 U() throws IOException;

    eh0 V0(int i) throws IOException;

    eh0 a0(String str) throws IOException;

    long a1(pqa pqaVar) throws IOException;

    yg0 d();

    eh0 d0(lk0 lk0Var) throws IOException;

    @Override // defpackage.zma, java.io.Flushable
    void flush() throws IOException;

    eh0 k0(String str, int i, int i2) throws IOException;

    eh0 p1(byte[] bArr, int i, int i2) throws IOException;

    eh0 u1(long j) throws IOException;

    eh0 v0(byte[] bArr) throws IOException;
}
