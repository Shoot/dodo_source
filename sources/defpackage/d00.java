package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
/* compiled from: AuthorizationIsNotAvailableDialog.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0002\u000f\u0012B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0014\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, d2 = {"Ld00;", "Ljn;", "", "o", "", "siteUrlForMessage", "n", "g", "l", "Landroid/widget/TextView;", "a", "Lk79;", "j", "()Landroid/widget/TextView;", "callCenterPhoneTextView", "b", Image.TYPE_HIGH, "authErrorTextView", com.huawei.hms.opendevice.c.a, "k", "closeButton", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "value", com.huawei.hms.push.e.a, "Ljava/lang/String;", "i", "()Ljava/lang/String;", Image.TYPE_MEDIUM, "(Ljava/lang/String;)V", "callCenterPhoneNumber", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "dismissAction", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d00  reason: default package */
/* loaded from: classes4.dex */
public final class d00 extends jn {
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final Logger d;
    private String e;
    private Function0<Unit> f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(d00.class, "callCenterPhoneTextView", "getCallCenterPhoneTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d00.class, "authErrorTextView", "getAuthErrorTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d00.class, "closeButton", "getCloseButton()Landroid/widget/TextView;", 0))};
    public static final c g = new c(null);

    /* compiled from: AuthorizationIsNotAvailableDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d00$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        a() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d00.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AuthorizationIsNotAvailableDialog.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\b\u0010\u0018¨\u0006\u001c"}, d2 = {"Ld00$b;", "", "Ld00;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", "getSiteUrlForMessage", "()Ljava/lang/String;", "setSiteUrlForMessage", "(Ljava/lang/String;)V", "siteUrlForMessage", com.huawei.hms.opendevice.c.a, "getPhoneNumber", "phoneNumber", "Lkotlin/Function0;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onDismiss", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d00$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final Context a;
        private String b;
        private String c;
        private Function0<Unit> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AuthorizationIsNotAvailableDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: d00$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            public static final a a = new a();

            a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }
        }

        public b(Context context, String str, String str2, Function0<Unit> function0) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(str2, "phoneNumber");
            z65.h(function0, "onDismiss");
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = function0;
        }

        public final d00 a() {
            d00 d00Var = new d00(this.a);
            d00Var.n(this.b);
            d00Var.m(this.c);
            d00Var.f = this.d;
            return d00Var;
        }

        public final void b(Function0<Unit> function0) {
            z65.h(function0, "<set-?>");
            this.d = function0;
        }

        public final void c(String str) {
            z65.h(str, "<set-?>");
            this.c = str;
        }

        public /* synthetic */ b(Context context, String str, String str2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? a.a : function0);
        }
    }

    /* compiled from: AuthorizationIsNotAvailableDialog.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\u000e"}, d2 = {"Ld00$c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "siteUrlForMessage", "Lkotlin/Function1;", "Ld00$b;", "", "buildDialog", "Ld00;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d00$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d00 a(Context context, String str, Function1<? super b, Unit> function1) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(function1, "buildDialog");
            b bVar = new b(context, str, null, null, 12, null);
            function1.invoke(bVar);
            return bVar.a();
        }
    }

    /* compiled from: AuthorizationIsNotAvailableDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d00$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<Unit> {
        public static final d a = new d();

        d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthorizationIsNotAvailableDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d00$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            try {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:" + d00.this.i()));
                d00.this.getContext().startActivity(intent);
            } catch (Exception e) {
                d00.this.d.error("Failed to start call intent", (Throwable) e);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.b(this, R.id.auth_error_phone);
        this.b = kb0.b(this, R.id.auth_error_message);
        this.c = kb0.b(this, R.id.close_button);
        this.d = LoggerFactory.getLogger("AuthorizationIsNotAvailableDialog");
        setContentView(R.layout.authorization_is_not_available_layout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: c00
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d00.c(d00.this, dialogInterface);
            }
        });
        oma.a(k(), new a());
        this.e = "";
        this.f = d.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d00 d00Var, DialogInterface dialogInterface) {
        z65.h(d00Var, "this$0");
        d00Var.f.invoke();
    }

    private final String g(String str) {
        String F;
        if (str == null) {
            String string = getContext().getString(R.string.auth_not_available_error_desc);
            z65.e(string);
            return string;
        }
        Context context = getContext();
        F = l0b.F(str, "https://", "", false, 4, null);
        String string2 = context.getString(R.string.auth_not_available_error_desc_site, F);
        z65.e(string2);
        return string2;
    }

    private final TextView h() {
        return (TextView) this.b.a(this, h[1]);
    }

    private final TextView j() {
        return (TextView) this.a.a(this, h[0]);
    }

    private final TextView k() {
        return (TextView) this.c.a(this, h[2]);
    }

    private final void l() {
        if (this.e.length() > 0) {
            oma.a(j(), new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String str) {
        h().setText(g(str));
    }

    private final void o() {
        j().setText(this.e);
    }

    public final String i() {
        return this.e;
    }

    public final void m(String str) {
        z65.h(str, "value");
        this.e = str;
        o();
        l();
    }
}
