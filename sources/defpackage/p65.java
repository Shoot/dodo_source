package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.qc6;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: internal.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007*\u0004\u0018\u00010\u0006H\u0000\u001a\u000e\u0010\n\u001a\u00020\b*\u0004\u0018\u00010\u0006H\u0000¨\u0006\u000b"}, d2 = {"Lsq1;", "", "", "socketEnabledCipherSuites", c.a, "(Lsq1;[Ljava/lang/String;)[Ljava/lang/String;", "Lqc6;", "Lkotlin/Pair;", "Ljava/nio/charset/Charset;", "b", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: p65  reason: default package */
/* loaded from: classes3.dex */
public final class p65 {
    public static final Charset a(qc6 qc6Var) {
        Charset b;
        if (qc6Var == null || (b = qc6.b(qc6Var, null, 1, null)) == null) {
            return rw0.b;
        }
        return b;
    }

    public static final Pair<Charset, qc6> b(qc6 qc6Var) {
        Charset charset = rw0.b;
        if (qc6Var != null) {
            Charset b = qc6.b(qc6Var, null, 1, null);
            if (b == null) {
                qc6.a aVar = qc6.e;
                qc6Var = aVar.b(qc6Var + "; charset=utf-8");
            } else {
                charset = b;
            }
        }
        return lnb.a(charset, qc6Var);
    }

    public static final String[] c(sq1 sq1Var, String[] strArr) {
        z65.h(sq1Var, "<this>");
        z65.h(strArr, "socketEnabledCipherSuites");
        if (sq1Var.d() != null) {
            return zdc.z(sq1Var.d(), strArr, w71.b.c());
        }
        return strArr;
    }
}
