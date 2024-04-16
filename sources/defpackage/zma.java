package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: Sink.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lzma;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "Lxgb;", "timeout", "close", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: zma  reason: default package */
/* loaded from: classes3.dex */
public interface zma extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void r1(yg0 yg0Var, long j) throws IOException;

    xgb timeout();
}
