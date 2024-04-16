package defpackage;

import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
import defpackage.b77;
import kotlin.Metadata;
/* compiled from: DebugOkHttpClientConfiguratorImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lsn2;", "Lrn2;", "Lb77$a;", "builder", "", "logTag", "", "a", "Lmh0;", "Lmh0;", "buildInfo", "Las8;", "Lcom/facebook/flipper/plugins/network/FlipperOkhttpInterceptor;", "b", "Las8;", "flipperOkhttpInterceptorProvider", "<init>", "(Lmh0;Las8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sn2  reason: default package */
/* loaded from: classes4.dex */
public final class sn2 implements rn2 {
    private final mh0 a;
    private final as8<FlipperOkhttpInterceptor> b;

    public sn2(mh0 mh0Var, as8<FlipperOkhttpInterceptor> as8Var) {
        z65.h(mh0Var, "buildInfo");
        z65.h(as8Var, "flipperOkhttpInterceptorProvider");
        this.a = mh0Var;
        this.b = as8Var;
    }

    @Override // defpackage.rn2
    public void a(b77.a aVar, String str) {
        z65.h(aVar, "builder");
        z65.h(str, "logTag");
        if (!this.a.i()) {
            return;
        }
        aVar.a(new ay5(str, by5.d));
        FlipperOkhttpInterceptor flipperOkhttpInterceptor = this.b.get();
        z65.g(flipperOkhttpInterceptor, "get(...)");
        aVar.a(flipperOkhttpInterceptor);
    }
}
