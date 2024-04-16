package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: NewYearFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lvx6;", "Lf70;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/widget/ImageView;", com.huawei.hms.opendevice.c.a, "Lk79;", "ph", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, DateTokenConverter.CONVERTER_KEY, "nh", "()Landroid/view/View;", "button", e.a, "oh", "closeButton", "Lf63;", "f", "Lrn5;", "qh", "()Lf63;", "router", "<init>", "()V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vx6  reason: default package */
/* loaded from: classes4.dex */
public final class vx6 extends f70 {
    private static final List<Integer> i;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final rn5 f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(vx6.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(vx6.class, "button", "getButton()Landroid/view/View;", 0)), bc9.f(new ar8(vx6.class, "closeButton", "getCloseButton()Landroid/widget/ImageView;", 0))};
    public static final a g = new a(null);

    /* compiled from: NewYearFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lvx6$a;", "", "Lvx6;", "a", "", "", "IMAGES", "Ljava/util/List;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vx6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vx6 a() {
            return new vx6();
        }
    }

    /* compiled from: NewYearFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vx6$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            vx6.this.qh().d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: NewYearFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vx6$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            vx6.this.qh().d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: NewYearFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf63;", "a", "()Lf63;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vx6$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<f63> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final f63 invoke() {
            return ((AppComponent) vx6.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).A1();
        }
    }

    static {
        List<Integer> o;
        o = kc1.o(Integer.valueOf((int) R.mipmap.new_year_1), Integer.valueOf((int) R.mipmap.new_year_2), Integer.valueOf((int) R.mipmap.new_year_3));
        i = o;
    }

    public vx6() {
        super(R.layout.fragment_new_year);
        rn5 b2;
        this.c = kb0.e(this, R.id.image);
        this.d = kb0.e(this, R.id.button);
        this.e = kb0.e(this, R.id.back_button);
        b2 = yn5.b(new d());
        this.f = b2;
    }

    private final View nh() {
        return (View) this.d.a(this, h[1]);
    }

    private final ImageView oh() {
        return (ImageView) this.e.a(this, h[2]);
    }

    private final ImageView ph() {
        return (ImageView) this.c.a(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f63 qh() {
        return (f63) this.f.getValue();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object s0;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        s0 = sc1.s0(i, b49.a);
        ph().setImageResource(((Number) s0).intValue());
        oma.a(nh(), new b());
        oma.a(oh(), new c());
    }
}
