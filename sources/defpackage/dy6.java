package defpackage;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dy6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NiceBonusInfoFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Ldy6;", "Lip6;", "", "nh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "lh", "()Landroid/widget/TextView;", "text", e.a, "kh", "()Landroid/view/View;", "rules", "f", "jh", "okButton", "g", "hh", "closeButton", "Landroid/widget/ImageView;", Image.TYPE_HIGH, "ih", "()Landroid/widget/ImageView;", "niceBonusBanner", "<init>", "()V", "i", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dy6  reason: default package */
/* loaded from: classes2.dex */
public final class dy6 extends ip6 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(dy6.class, "text", "getText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(dy6.class, "rules", "getRules()Landroid/view/View;", 0)), bc9.f(new ar8(dy6.class, "okButton", "getOkButton()Landroid/view/View;", 0)), bc9.f(new ar8(dy6.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(dy6.class, "niceBonusBanner", "getNiceBonusBanner()Landroid/widget/ImageView;", 0))};
    public static final a i = new a(null);
    public static final int k = 8;

    /* compiled from: NiceBonusInfoFragment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ldy6$a;", "", "Ldy6;", "b", "Landroidx/fragment/app/Fragment;", "recipient", "Lkotlin/Function0;", "", "resultListener", com.huawei.hms.opendevice.c.a, "", "ON_RULES_CLICKED_RESULT_KEY", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dy6$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0, String str, Bundle bundle) {
            z65.h(function0, "$resultListener");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "<anonymous parameter 1>");
            function0.invoke();
        }

        public final dy6 b() {
            return new dy6();
        }

        public final dy6 c(dy6 dy6Var, Fragment fragment, final Function0<Unit> function0) {
            z65.h(dy6Var, "<this>");
            z65.h(fragment, "recipient");
            z65.h(function0, "resultListener");
            fragment.getChildFragmentManager().A1("on_rules_clicked_result_key", fragment, new r64() { // from class: cy6
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    dy6.a.d(Function0.this, str, bundle);
                }
            });
            return dy6Var;
        }
    }

    /* compiled from: NiceBonusInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dy6$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dy6.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: NiceBonusInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dy6$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dy6.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public dy6() {
        super(gz8.dialog_nice_bonus_info);
        this.d = kb0.e(this, gy8.nice_bonus_fragment_text);
        this.e = kb0.e(this, gy8.nice_bonus_fragment_rules);
        this.f = kb0.e(this, gy8.nice_bonus_fragment_ok_button);
        this.g = kb0.e(this, gy8.nice_bonus_fragment_close_button);
        this.h = kb0.e(this, gy8.nice_bonus_fragment_image);
    }

    private final View hh() {
        return (View) this.g.a(this, j[3]);
    }

    private final ImageView ih() {
        return (ImageView) this.h.a(this, j[4]);
    }

    private final View jh() {
        return (View) this.f.a(this, j[2]);
    }

    private final View kh() {
        return (View) this.e.a(this, j[1]);
    }

    private final TextView lh() {
        return (TextView) this.d.a(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mh(dy6 dy6Var, View view) {
        z65.h(dy6Var, "this$0");
        i64.a(dy6Var, "on_rules_clicked_result_key", new Bundle());
    }

    private final void nh() {
        com.bumptech.glide.b.v(this).s(Integer.valueOf(b09.ic_nice_bonus_info_img)).s0(new wt0(), new gi4(kx9.a(16), kx9.a(16), 0.0f, 0.0f)).G0(ih());
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        nh();
        View findViewById = requireDialog().findViewById(gy8.c0);
        z65.g(findViewById, "findViewById(...)");
        BottomSheetBehavior B = BottomSheetBehavior.B(findViewById);
        z65.g(B, "from(...)");
        if (B.F() <= view.getHeight()) {
            B.f0(3);
        }
        lh().setMovementMethod(new ScrollingMovementMethod());
        oma.a(jh(), new b());
        oma.a(hh(), new c());
        kh().setOnClickListener(new View.OnClickListener() { // from class: by6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dy6.mh(dy6.this, view2);
            }
        });
    }
}
