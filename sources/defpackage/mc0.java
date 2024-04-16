package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lmc0;", "Lzma;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "Lxgb;", "timeout", "close", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: mc0  reason: default package */
/* loaded from: classes3.dex */
public final class mc0 implements zma {
    @Override // defpackage.zma
    public void r1(yg0 yg0Var, long j) {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        yg0Var.skip(j);
    }

    @Override // defpackage.zma
    public xgb timeout() {
        return xgb.e;
    }

    @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.zma, java.io.Flushable
    public void flush() {
    }
}
