package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.inapp.domain.models.InAppContentFetchingError;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.sk9;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: InAppGlideImageLoaderImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR<\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lyx4;", "Lay4;", "", "inAppId", RemoteMessageConst.Notification.URL, "", "a", "(Ljava/lang/String;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/HashMap;", "Ln6b;", "Landroid/graphics/drawable/Drawable;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "requests", "<init>", "(Landroid/content/Context;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yx4  reason: default package */
/* loaded from: classes.dex */
public final class yx4 implements ay4 {
    private final Context a;
    private final HashMap<String, n6b<Drawable>> b;

    /* compiled from: InAppGlideImageLoaderImpl.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0004\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000e\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"yx4$a", "Lvi9;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", e.a, "", "model", "Ln6b;", "target", "", "isFirstResource", "resource", "Ldl2;", "dataSource", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: yx4$a */
    /* loaded from: classes.dex */
    public static final class a implements vi9<Drawable> {
        final /* synthetic */ String a;
        final /* synthetic */ fn0<Boolean> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, fn0<? super Boolean> fn0Var) {
            this.a = str;
            this.b = fn0Var;
        }

        @Override // defpackage.vi9
        /* renamed from: a */
        public boolean f(Drawable drawable, Object obj, n6b<Drawable> n6bVar, dl2 dl2Var, boolean z) {
            gk6.a(this, "loading image for inapp with id " + this.a + " succeeded");
            fn0<Boolean> fn0Var = this.b;
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(Boolean.TRUE));
            return true;
        }

        @Override // defpackage.vi9
        public boolean e(GlideException glideException, Object obj, n6b<Drawable> n6bVar, boolean z) {
            gk6.a(this, "loading image for inapp with id " + this.a + " failed");
            fn0<Boolean> fn0Var = this.b;
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(vk9.a(new InAppContentFetchingError(glideException))));
            return true;
        }
    }

    public yx4(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        this.b = new HashMap<>();
    }

    @Override // defpackage.ay4
    public Object a(String str, String str2, cv1<? super Boolean> cv1Var) {
        cv1 c;
        Object d;
        gk6.a(this, "loading image for inapp with id " + str + " started");
        c = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c, 1);
        gn0Var.w();
        g<Drawable> t = b.t(this.a).t(str2);
        String string = this.a.getString(c19.mindbox_inapp_fetching_timeout);
        z65.g(string, "context.getString(R.stri…x_inapp_fetching_timeout)");
        n6b P0 = t.l0(Integer.parseInt(string)).J0(new a(str, gn0Var)).P0();
        z65.g(P0, "inAppId: String, url: St…             }).preload()");
        this.b.put(str, P0);
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    @Override // defpackage.ay4
    public void b(String str) {
        z65.h(str, "inAppId");
        b.t(this.a).m(this.b.get(str));
        this.b.remove(str);
    }
}
