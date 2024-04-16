package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RealResponseBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lx79;", "Lkk9;", "", "contentLength", "Lqc6;", "contentType", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "a", "Ljava/lang/String;", "contentTypeString", "b", "J", c.a, "Lfh0;", "<init>", "(Ljava/lang/String;JLfh0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x79  reason: default package */
/* loaded from: classes3.dex */
public final class x79 extends kk9 {
    private final String a;
    private final long b;
    private final fh0 c;

    public x79(String str, long j, fh0 fh0Var) {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = str;
        this.b = j;
        this.c = fh0Var;
    }

    @Override // defpackage.kk9
    public long contentLength() {
        return this.b;
    }

    @Override // defpackage.kk9
    public qc6 contentType() {
        String str = this.a;
        if (str != null) {
            return qc6.e.b(str);
        }
        return null;
    }

    @Override // defpackage.kk9
    public fh0 source() {
        return this.c;
    }
}
