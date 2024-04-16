package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.c5c;
import kotlin.Metadata;
/* compiled from: BaseAssistantFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0004J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0004J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"La70;", "Lf70;", "Lw50;", "", "hh", "gh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "rootView", "ih", "", RemoteMessageConst.Notification.URL, "oh", c.a, "I", "contentLayoutId", "Landroid/view/ViewGroup;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "nh", "()Landroid/view/ViewGroup;", "contentContainer", "Lcom/airbnb/lottie/LottieAnimationView;", e.a, "mh", "()Lcom/airbnb/lottie/LottieAnimationView;", "animationContainer", "<init>", "(I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a70  reason: default package */
/* loaded from: classes2.dex */
public abstract class a70 extends f70 implements w50 {
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(a70.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(a70.class, "animationContainer", "getAnimationContainer()Lcom/airbnb/lottie/LottieAnimationView;", 0))};
    public static final int g = 8;
    private final int c;
    private final k79 d;
    private final k79 e;

    /* compiled from: BaseAssistantFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "thisView", "Lc5c;", "insets", "Landroid/graphics/Rect;", "initialPadding", "a", "(Landroid/view/View;Lc5c;Landroid/graphics/Rect;)Lc5c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a70$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements y84<View, c5c, Rect, c5c> {
        public static final a a = new a();

        a() {
            super(3);
        }

        @Override // defpackage.y84
        /* renamed from: a */
        public final c5c invoke(View view, c5c c5cVar, Rect rect) {
            z65.h(view, "thisView");
            z65.h(c5cVar, "insets");
            z65.h(rect, "initialPadding");
            n45 f = c5cVar.f(c5c.m.d());
            z65.g(f, "getInsets(...)");
            p45.l(view, 0, rect.top + f.b, 0, rect.bottom + f.d, 5, null);
            c5c c = c5cVar.c();
            z65.g(c, "consumeSystemWindowInsets(...)");
            return c;
        }
    }

    public a70(int i) {
        super(gz8.fragment_assistant_base);
        this.c = i;
        this.d = kb0.e(this, gy8.content_container);
        this.e = kb0.e(this, gy8.animation_container);
    }

    private final LottieAnimationView mh() {
        return (LottieAnimationView) this.e.a(this, f[1]);
    }

    private final ViewGroup nh() {
        return (ViewGroup) this.d.a(this, f[0]);
    }

    @Override // defpackage.f70
    protected final int gh() {
        return ew8.assistant_system_bar;
    }

    @Override // defpackage.f70
    protected final int hh() {
        return ew8.assistant_system_bar;
    }

    @Override // defpackage.f70
    protected final void ih(View view) {
        z65.h(view, "rootView");
        p45.d(nh(), a.a);
    }

    public final void oh(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        mh().setAnimationFromUrl(str);
        mh().x();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        getLayoutInflater().inflate(this.c, nh());
    }
}
