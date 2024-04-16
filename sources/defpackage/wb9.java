package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ReferralSystemShareQrFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010'R\u001c\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062"}, d2 = {"Lwb9;", "Lf70;", "", "sh", "vh", "wh", "Eh", "uh", "Dh", "th", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Bh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "yh", "()Landroid/widget/TextView;", "inviteCode", com.huawei.hms.push.e.a, "xh", "()Landroid/view/View;", "copyView", "Landroid/widget/ImageView;", "f", "zh", "()Landroid/widget/ImageView;", "qrCode", "Landroid/widget/Button;", "g", "Ah", "()Landroid/widget/Button;", "shareButton", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "i", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wb9  reason: default package */
/* loaded from: classes2.dex */
public final class wb9 extends f70 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final Logger h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(wb9.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(wb9.class, "inviteCode", "getInviteCode()Landroid/widget/TextView;", 0)), bc9.f(new ar8(wb9.class, "copyView", "getCopyView()Landroid/view/View;", 0)), bc9.f(new ar8(wb9.class, "qrCode", "getQrCode()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(wb9.class, "shareButton", "getShareButton()Landroid/widget/Button;", 0))};
    public static final a i = new a(null);

    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lwb9$a;", "", "", "inviteCode", "inviteLink", "inviteMessage", "", "showStaticCode", "Lwb9;", "a", "ARG_INVITE_CODE", "Ljava/lang/String;", "ARG_INVITE_LINK", "ARG_INVITE_MESSAGE", "ARG_SHOW_STATIC_QR_CODE", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wb9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wb9 a(String str, String str2, String str3, boolean z) {
            z65.h(str, "inviteCode");
            z65.h(str2, "inviteLink");
            z65.h(str3, "inviteMessage");
            return (wb9) y64.d(new wb9(), bi0.c(bi0.d("arg_invite_code", str), bi0.d("arg_invite_link", str2), bi0.d("arg_invite_message", str3), bi0.d("arg_show_static_qr_code", Boolean.valueOf(z))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemShareQrFragment$generateInviteQrCode$1", f = "ReferralSystemShareQrFragment.kt", l = {128}, m = "invokeSuspend")
    /* renamed from: wb9$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function1<cv1<? super Bitmap>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReferralSystemShareQrFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemShareQrFragment$generateInviteQrCode$1$1", f = "ReferralSystemShareQrFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: wb9$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Bitmap>, Object> {
            int a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Bitmap> cv1Var) {
                return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    Object e = au8.i(new au8(this.b, null, null, 6, null), 0, 0, 0, 0, 0, 31, null).e();
                    z65.f(e, "null cannot be cast to non-null type android.graphics.Bitmap");
                    return (Bitmap) e;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Bitmap> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object obj2;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                Bundle arguments = wb9.this.getArguments();
                if (arguments == null || (obj2 = arguments.get("arg_invite_link")) == null) {
                    obj2 = null;
                }
                if (obj2 != null && !(obj2 instanceof String)) {
                    throw new ClassCastException("Property arg_invite_link has different class type");
                } else if (obj2 != null) {
                    kx1 b = v33.b();
                    a aVar = new a((String) obj2, null);
                    this.a = 1;
                    obj = qh0.g(b, aVar, this);
                    if (obj == d) {
                        return d;
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_invite_link not found in bundle");
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemShareQrFragment$generateInviteQrCode$2", f = "ReferralSystemShareQrFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wb9$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<Bitmap, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Bitmap bitmap, cv1<? super Unit> cv1Var) {
            return ((c) create(bitmap, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wb9.this.zh().setImageBitmap((Bitmap) this.b);
                wb9.this.sh();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemShareQrFragment$generateInviteQrCode$3", f = "ReferralSystemShareQrFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wb9$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wb9.this.h.error("Can`t generate QR-code", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wb9$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ wb9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(gc gcVar, wb9 wb9Var) {
            super(1);
            this.a = gcVar;
            this.b = wb9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(hb9.a);
            this.b.Eh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wb9$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ wb9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(gc gcVar, wb9 wb9Var) {
            super(1);
            this.a = gcVar;
            this.b = wb9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(fb9.a);
            this.b.th();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wb9$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ gc a;
        final /* synthetic */ wb9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(gc gcVar, wb9 wb9Var) {
            super(1);
            this.a = gcVar;
            this.b = wb9Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.a(fb9.a);
            this.b.th();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemShareQrFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wb9$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReferralSystemShareQrFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wb9$h$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ wb9 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(wb9 wb9Var) {
                super(0);
                this.a = wb9Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReferralSystemShareQrFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wb9$h$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ wb9 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(wb9 wb9Var) {
                super(0);
                this.a = wb9Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(p09.referral_system_copied_invite_code_title);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReferralSystemShareQrFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: wb9$h$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReferralSystemShareQrFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: wb9$h$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        h() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(wb9.this));
            uoaVar.h(new b(wb9.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    public wb9() {
        super(ez8.fragment_referral_system_share_qr);
        this.c = kb0.e(this, ey8.referral_system_qr_toolbar);
        this.d = kb0.e(this, ey8.referral_system_qr_invite_code);
        this.e = kb0.e(this, ey8.referral_system_qr_copy);
        this.f = kb0.e(this, ey8.referral_system_qr_code);
        this.g = kb0.e(this, ey8.referral_system_qr_share_button);
        this.h = LoggerFactory.getLogger("ReferralSystemShareQrFragment");
    }

    private final Button Ah() {
        return (Button) this.g.a(this, j[4]);
    }

    private final Toolbar Bh() {
        return (Toolbar) this.c.a(this, j[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(wb9 wb9Var, View view) {
        z65.h(wb9Var, "this$0");
        wb9Var.requireActivity().onBackPressed();
    }

    private final void Dh() {
        soa.a.a(new h()).U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Eh() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments == null || (obj = arguments.get("arg_invite_message")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_invite_message has different class type");
        } else if (obj != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", (String) obj);
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, null));
        } else {
            throw new IllegalArgumentException("Argument with key = arg_invite_message not found in bundle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sh() {
        WindowManager.LayoutParams layoutParams;
        Window window = requireActivity().getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.screenBrightness = 1.0f;
        }
        Window window2 = requireActivity().getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void th() {
        uh();
        if (Build.VERSION.SDK_INT <= 32) {
            Dh();
        }
    }

    private final void uh() {
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_invite_code")) == null) ? null : null;
        if (obj != null && !(obj instanceof CharSequence)) {
            throw new ClassCastException("Property arg_invite_code has different class type");
        } else if (obj != null) {
            Object systemService = requireContext().getSystemService("clipboard");
            z65.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("inviteCode", (CharSequence) obj));
        } else {
            throw new IllegalArgumentException("Argument with key = arg_invite_code not found in bundle");
        }
    }

    private final void vh() {
        WindowManager.LayoutParams layoutParams;
        Window window = requireActivity().getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.screenBrightness = -1.0f;
        }
        Window window2 = requireActivity().getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    private final void wh() {
        Object obj;
        Boolean bool = Boolean.FALSE;
        Bundle arguments = getArguments();
        if (arguments != null && (obj = arguments.get("arg_show_static_qr_code")) != null) {
            bool = obj;
        }
        if (bool != null && !(bool instanceof Boolean)) {
            throw new ClassCastException("Property arg_show_static_qr_code has different class type");
        } else if (bool != null) {
            if (bool.booleanValue()) {
                zh().setImageResource(zw8.static_share_qr_code);
                sh();
                return;
            }
            wj1.b(z77.a(y87.a(hy.a(new b(null)), new c(null)), new d(null)), pp5.a(this));
        } else {
            throw new IllegalArgumentException("Argument with key = arg_show_static_qr_code not found in bundle");
        }
    }

    private final View xh() {
        return (View) this.e.a(this, j[2]);
    }

    private final TextView yh() {
        return (TextView) this.d.a(this, j[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView zh() {
        return (ImageView) this.f.a(this, j[3]);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        vh();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        gc a2 = ((ReferralSystemFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ReferralSystemFeatureDependencies.class))).a();
        a2.a(ib9.a);
        Bh().setNavigationOnClickListener(new View.OnClickListener() { // from class: vb9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                wb9.Ch(wb9.this, view2);
            }
        });
        oma.a(Ah(), new e(a2, this));
        TextView yh = yh();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_invite_code")) == null) ? null : null;
        if (obj != null && !(obj instanceof CharSequence)) {
            throw new ClassCastException("Property arg_invite_code has different class type");
        } else if (obj != null) {
            yh.setText((CharSequence) obj);
            oma.a(yh(), new f(a2, this));
            oma.a(xh(), new g(a2, this));
            wh();
        } else {
            throw new IllegalArgumentException("Argument with key = arg_invite_code not found in bundle");
        }
    }
}
