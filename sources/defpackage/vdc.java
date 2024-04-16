package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: -RequestBodyCommon.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0006\u001a\n\u0010\f\u001a\u00020\n*\u00020\u0006\u001a\u0014\u0010\u000e\u001a\u00020\u0006*\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u000f"}, d2 = {"", "Lqc6;", "contentType", "", "offset", "byteCount", "Lji9;", e.a, "", "a", "", "b", c.a, "Llk0;", DateTokenConverter.CONVERTER_KEY, "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: vdc  reason: default package */
/* loaded from: classes3.dex */
public final class vdc {

    /* compiled from: -RequestBodyCommon.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"vdc$a", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vdc$a */
    /* loaded from: classes3.dex */
    public static final class a extends ji9 {
        final /* synthetic */ qc6 a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        a(qc6 qc6Var, int i, byte[] bArr, int i2) {
            this.a = qc6Var;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // defpackage.ji9
        public long contentLength() {
            return this.b;
        }

        @Override // defpackage.ji9
        public qc6 contentType() {
            return this.a;
        }

        @Override // defpackage.ji9
        public void writeTo(eh0 eh0Var) {
            z65.h(eh0Var, "sink");
            eh0Var.p1(this.c, this.d, this.b);
        }
    }

    /* compiled from: -RequestBodyCommon.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"vdc$b", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vdc$b */
    /* loaded from: classes3.dex */
    public static final class b extends ji9 {
        final /* synthetic */ qc6 a;
        final /* synthetic */ lk0 b;

        b(qc6 qc6Var, lk0 lk0Var) {
            this.a = qc6Var;
            this.b = lk0Var;
        }

        @Override // defpackage.ji9
        public long contentLength() {
            return this.b.n0();
        }

        @Override // defpackage.ji9
        public qc6 contentType() {
            return this.a;
        }

        @Override // defpackage.ji9
        public void writeTo(eh0 eh0Var) {
            z65.h(eh0Var, "sink");
            eh0Var.d0(this.b);
        }
    }

    public static final long a(ji9 ji9Var) {
        z65.h(ji9Var, "<this>");
        return -1L;
    }

    public static final boolean b(ji9 ji9Var) {
        z65.h(ji9Var, "<this>");
        return false;
    }

    public static final boolean c(ji9 ji9Var) {
        z65.h(ji9Var, "<this>");
        return false;
    }

    public static final ji9 d(lk0 lk0Var, qc6 qc6Var) {
        z65.h(lk0Var, "<this>");
        return new b(qc6Var, lk0Var);
    }

    public static final ji9 e(byte[] bArr, qc6 qc6Var, int i, int i2) {
        z65.h(bArr, "<this>");
        zdc.e(bArr.length, i, i2);
        return new a(qc6Var, i2, bArr, i);
    }
}
