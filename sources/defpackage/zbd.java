package defpackage;

import com.google.android.gms.internal.measurement.y1;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: zbd  reason: default package */
/* loaded from: classes2.dex */
public final class zbd extends ioc {
    private final Callable<Object> c;

    public zbd(String str, Callable<Object> callable) {
        super(str);
        this.c = callable;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        try {
            return y1.b(this.c.call());
        } catch (Exception unused) {
            return bpc.K4;
        }
    }
}
