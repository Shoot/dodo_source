package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: vpc  reason: default package */
/* loaded from: classes2.dex */
public abstract class vpc {
    final List<ksc> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bpc a(String str) {
        if (this.a.contains(eyc.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract bpc b(String str, xzc xzcVar, List<bpc> list);
}
