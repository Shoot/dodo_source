package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ReferralCodeStatusDialogFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\u0012R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\"¨\u0006+"}, d2 = {"Lqa9;", "Lip6;", "", "kh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/ViewGroup;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "sh", "()Landroid/view/ViewGroup;", "rewardContainer", "Landroid/widget/TextView;", com.huawei.hms.push.e.a, "th", "()Landroid/widget/TextView;", "rewardTitle", "Landroid/widget/ImageView;", "f", "qh", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "g", "vh", "title", Image.TYPE_HIGH, "ph", "description", "Landroid/widget/Button;", "i", "rh", "()Landroid/widget/Button;", "primaryButton", "j", "uh", "secondaryButton", "<init>", "()V", "k", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qa9  reason: default package */
/* loaded from: classes2.dex */
public final class qa9 extends ip6 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(qa9.class, "rewardContainer", "getRewardContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(qa9.class, "rewardTitle", "getRewardTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(qa9.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(qa9.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(qa9.class, "description", "getDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(qa9.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(qa9.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0))};
    public static final a k = new a(null);

    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lqa9$a;", "", "Lla9;", "codeStatus", "Lqa9;", "a", "", "ARG_REFERRAL_CODE_STATUS", "Ljava/lang/String;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qa9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qa9 a(la9 la9Var) {
            z65.h(la9Var, "codeStatus");
            return (qa9) y64.d(new qa9(), bi0.c(bi0.d("arg_referral_code_status", la9Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qa9$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ hq3 b;
        final /* synthetic */ lb9 c;
        final /* synthetic */ f63 d;
        final /* synthetic */ qa9 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gc gcVar, hq3 hq3Var, lb9 lb9Var, f63 f63Var, qa9 qa9Var) {
            super(1);
            this.a = gcVar;
            this.b = hq3Var;
            this.c = lb9Var;
            this.d = f63Var;
            this.e = qa9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(ua9.a);
            this.c.a(this.b.a(bq3.g7));
            this.d.e(new w26(new e06(rba.f, null, 2, null)));
            this.e.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qa9$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ qa9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(gc gcVar, qa9 qa9Var) {
            super(1);
            this.a = gcVar;
            this.b = qa9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(wa9.a);
            this.b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qa9$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ lb9 b;
        final /* synthetic */ qa9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gc gcVar, lb9 lb9Var, qa9 qa9Var) {
            super(1);
            this.a = gcVar;
            this.b = lb9Var;
            this.c = qa9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(va9.a);
            this.b.b();
            this.c.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qa9$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ la9 b;
        final /* synthetic */ qa9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(gc gcVar, la9 la9Var, qa9 qa9Var) {
            super(1);
            this.a = gcVar;
            this.b = la9Var;
            this.c = qa9Var;
        }

        public final void a(View view) {
            boolean y;
            boolean y2;
            z65.h(view, "it");
            this.a.a(ya9.a);
            String c = ((oy1) this.b).c();
            qa9 qa9Var = this.c;
            y = l0b.y(c);
            if (y) {
                c = qa9Var.getString(p09.referral_code_business_error_title);
                z65.g(c, "getString(...)");
            }
            String b = ((oy1) this.b).b();
            qa9 qa9Var2 = this.c;
            y2 = l0b.y(b);
            if (y2) {
                b = qa9Var2.getString(p09.referral_code_business_error_description);
                z65.g(b, "getString(...)");
            }
            qa9.k.a(new ci0(c, b)).show(this.c.getParentFragmentManager(), "PromoCodeDialog.REFERRAL_CODE_STATUS_DIALOG");
            this.c.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralCodeStatusDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qa9$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ qa9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(gc gcVar, qa9 qa9Var) {
            super(1);
            this.a = gcVar;
            this.b = qa9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(za9.a);
            this.b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public qa9() {
        super(ez8.dialog_referral_code_status);
        this.d = kb0.e(this, ey8.referral_code_status_reward_container);
        this.e = kb0.e(this, ey8.referral_code_status_reward_title);
        this.f = kb0.e(this, ey8.referral_code_status_image);
        this.g = kb0.e(this, ey8.referral_code_status_title);
        this.h = kb0.e(this, ey8.referral_code_status_description);
        this.i = kb0.e(this, ey8.referral_code_status_primary_button);
        this.j = kb0.e(this, ey8.referral_code_status_secondary_button);
    }

    private final void kh() {
        boolean y;
        boolean y2;
        ReferralSystemFeatureDependencies referralSystemFeatureDependencies = (ReferralSystemFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ReferralSystemFeatureDependencies.class));
        f63 b2 = referralSystemFeatureDependencies.b();
        lb9 T2 = referralSystemFeatureDependencies.T2();
        final gc a2 = referralSystemFeatureDependencies.a();
        hq3 c2 = referralSystemFeatureDependencies.c();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_referral_code_status")) == null) ? null : null;
        if (obj != null && !(obj instanceof la9)) {
            throw new ClassCastException("Property arg_referral_code_status has different class type");
        } else if (obj != null) {
            la9 la9Var = (la9) obj;
            if (la9Var instanceof ci0) {
                a2.a(bb9.a);
                un3.e(sh());
                qh().setImageResource(zw8.referral_code_business_error);
                un3.k(qh());
                TextView vh = vh();
                ci0 ci0Var = (ci0) la9Var;
                String b3 = ci0Var.b();
                y = l0b.y(b3);
                if (y) {
                    b3 = getString(p09.referral_code_business_error_title);
                    z65.g(b3, "getString(...)");
                }
                vh.setText(b3);
                TextView ph = ph();
                String a3 = ci0Var.a();
                y2 = l0b.y(a3);
                if (y2) {
                    a3 = getString(p09.referral_code_business_error_description);
                    z65.g(a3, "getString(...)");
                }
                ph.setText(a3);
                uh().setText(getString(p09.referral_code_error_button));
                oma.a(uh(), new c(a2, this));
                un3.k(uh());
                requireDialog().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ma9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        qa9.lh(gc.this, dialogInterface);
                    }
                });
            } else if (la9Var instanceof oy1) {
                a2.a(db9.a);
                un3.e(sh());
                qh().setImageResource(zw8.referral_code_country_error);
                un3.k(qh());
                vh().setText(getString(p09.referral_code_country_error_title));
                ph().setText(getString(p09.referral_code_country_error_description, ((oy1) la9Var).a()));
                rh().setText(getString(p09.referral_code_business_error_primary_button));
                oma.a(rh(), new d(a2, T2, this));
                un3.k(rh());
                uh().setText(getString(p09.referral_code_business_error_secondary_button));
                oma.a(uh(), new e(a2, la9Var, this));
                requireDialog().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: na9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        qa9.mh(gc.this, dialogInterface);
                    }
                });
                un3.k(uh());
            } else if (la9Var instanceof vqb) {
                a2.a(eb9.a);
                un3.e(sh());
                qh().setImageResource(zw8.referral_code_unknown_error);
                un3.k(qh());
                vh().setText(getString(p09.referral_code_unknown_error_title));
                ph().setText(getString(p09.referral_code_unknown_error_description));
                uh().setText(getString(p09.referral_code_error_button));
                oma.a(uh(), new f(a2, this));
                un3.k(uh());
                requireDialog().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: oa9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        qa9.nh(gc.this, dialogInterface);
                    }
                });
            } else if (la9Var instanceof t1b) {
                a2.a(cb9.a);
                t1b t1bVar = (t1b) la9Var;
                th().setText(getString(p09.x, String.valueOf((long) t1bVar.a())));
                un3.k(sh());
                un3.e(qh());
                vh().setText(getString(p09.referral_code_success_title));
                ph().setText(getResources().getQuantityString(d09.referral_code_success_description, t1bVar.b(), String.valueOf(t1bVar.b())));
                rh().setText(getString(p09.referral_code_success_button));
                oma.a(rh(), new b(a2, c2, T2, b2, this));
                un3.k(rh());
                requireDialog().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pa9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        qa9.oh(gc.this, dialogInterface);
                    }
                });
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_referral_code_status not found in bundle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(gc gcVar, DialogInterface dialogInterface) {
        z65.h(gcVar, "$analytics");
        gcVar.a(wa9.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mh(gc gcVar, DialogInterface dialogInterface) {
        z65.h(gcVar, "$analytics");
        gcVar.a(ya9.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nh(gc gcVar, DialogInterface dialogInterface) {
        z65.h(gcVar, "$analytics");
        gcVar.a(za9.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(gc gcVar, DialogInterface dialogInterface) {
        z65.h(gcVar, "$analytics");
        gcVar.a(xa9.a);
    }

    private final TextView ph() {
        return (TextView) this.h.a(this, l[4]);
    }

    private final ImageView qh() {
        return (ImageView) this.f.a(this, l[2]);
    }

    private final Button rh() {
        return (Button) this.i.a(this, l[5]);
    }

    private final ViewGroup sh() {
        return (ViewGroup) this.d.a(this, l[0]);
    }

    private final TextView th() {
        return (TextView) this.e.a(this, l[1]);
    }

    private final Button uh() {
        return (Button) this.j.a(this, l[6]);
    }

    private final TextView vh() {
        return (TextView) this.g.a(this, l[3]);
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        kh();
    }
}
