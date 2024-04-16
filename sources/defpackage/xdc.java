package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: -ResponseBodyCommon.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\u0000*\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0016\u0010\n\u001a\u00020\u0000*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u0000*\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0000¨\u0006\u000f"}, d2 = {"Lkk9;", "", c.a, "Llk0;", "b", "", DateTokenConverter.CONVERTER_KEY, "Lqc6;", "contentType", "f", e.a, "Lfh0;", "", "contentLength", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: xdc  reason: default package */
/* loaded from: classes3.dex */
public final class xdc {

    /* compiled from: -ResponseBodyCommon.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"xdc$a", "Lkk9;", "Lqc6;", "contentType", "", "contentLength", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xdc$a */
    /* loaded from: classes3.dex */
    public static final class a extends kk9 {
        final /* synthetic */ qc6 a;
        final /* synthetic */ long b;
        final /* synthetic */ fh0 c;

        a(qc6 qc6Var, long j, fh0 fh0Var) {
            this.a = qc6Var;
            this.b = j;
            this.c = fh0Var;
        }

        @Override // defpackage.kk9
        public long contentLength() {
            return this.b;
        }

        @Override // defpackage.kk9
        public qc6 contentType() {
            return this.a;
        }

        @Override // defpackage.kk9
        public fh0 source() {
            return this.c;
        }
    }

    public static final kk9 a(fh0 fh0Var, qc6 qc6Var, long j) {
        z65.h(fh0Var, "<this>");
        return new a(qc6Var, j, fh0Var);
    }

    public static final lk0 b(kk9 kk9Var) {
        lk0 lk0Var;
        z65.h(kk9Var, "<this>");
        long contentLength = kk9Var.contentLength();
        if (contentLength <= 2147483647L) {
            fh0 source = kk9Var.source();
            Throwable th = null;
            try {
                lk0Var = source.v1();
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th4) {
                        vl3.a(th3, th4);
                    }
                }
                lk0Var = null;
                th = th3;
            }
            if (th == null) {
                z65.e(lk0Var);
                int n0 = lk0Var.n0();
                if (contentLength != -1 && contentLength != n0) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + n0 + ") disagree");
                }
                return lk0Var;
            }
            throw th;
        }
        throw new IOException("Cannot buffer entire body for content length: " + contentLength);
    }

    public static final byte[] c(kk9 kk9Var) {
        byte[] bArr;
        z65.h(kk9Var, "<this>");
        long contentLength = kk9Var.contentLength();
        if (contentLength <= 2147483647L) {
            fh0 source = kk9Var.source();
            Throwable th = null;
            try {
                bArr = source.T0();
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th4) {
                        vl3.a(th3, th4);
                    }
                }
                bArr = null;
                th = th3;
            }
            if (th == null) {
                z65.e(bArr);
                int length = bArr.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return bArr;
            }
            throw th;
        }
        throw new IOException("Cannot buffer entire body for content length: " + contentLength);
    }

    public static final void d(kk9 kk9Var) {
        z65.h(kk9Var, "<this>");
        zdc.f(kk9Var.source());
    }

    public static final kk9 e(lk0 lk0Var, qc6 qc6Var) {
        z65.h(lk0Var, "<this>");
        return kk9.Companion.a(new yg0().d0(lk0Var), qc6Var, lk0Var.n0());
    }

    public static final kk9 f(byte[] bArr, qc6 qc6Var) {
        z65.h(bArr, "<this>");
        return kk9.Companion.a(new yg0().v0(bArr), qc6Var, bArr.length);
    }
}
