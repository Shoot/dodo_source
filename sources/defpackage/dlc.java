package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.sx7;
import defpackage.tx7;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: dlc  reason: default package */
/* loaded from: classes2.dex */
final class dlc implements sx7.a {
    final /* synthetic */ sx7 a;
    final /* synthetic */ a7b b;
    final /* synthetic */ tx7.a c;
    final /* synthetic */ glc d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dlc(sx7 sx7Var, a7b a7bVar, tx7.a aVar, glc glcVar) {
        this.a = sx7Var;
        this.b = a7bVar;
        this.c = aVar;
        this.d = glcVar;
    }

    @Override // defpackage.sx7.a
    public final void a(Status status) {
        if (status.v()) {
            this.b.c(this.c.a(this.a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.b(jm.a(status));
    }
}
