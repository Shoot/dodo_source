package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lgp3;", "Lx54;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "b", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "onException", "", c.a, "Z", "hasErrors", "Lzma;", "delegate", "<init>", "(Lzma;Lkotlin/jvm/functions/Function1;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: gp3  reason: default package */
/* loaded from: classes3.dex */
public class gp3 extends x54 {
    private final Function1<IOException, Unit> b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gp3(zma zmaVar, Function1<? super IOException, Unit> function1) {
        super(zmaVar);
        z65.h(zmaVar, "delegate");
        z65.h(function1, "onException");
        this.b = function1;
    }

    @Override // defpackage.x54, defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.x54, defpackage.zma, java.io.Flushable
    public void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.x54, defpackage.zma
    public void r1(yg0 yg0Var, long j) {
        z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        if (this.c) {
            yg0Var.skip(j);
            return;
        }
        try {
            super.r1(yg0Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
