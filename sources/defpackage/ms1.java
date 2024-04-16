package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.contacts.ContactsPresenter;
/* compiled from: ContactsFragment.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001bB\u0007¢\u0006\u0004\b_\u0010`J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016R\u001b\u0010#\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b$\u0010\"R\u001b\u0010(\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R\u001b\u0010+\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u001b\u0010.\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\"R\u001b\u00100\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b/\u0010\"R\u001b\u00102\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b1\u0010\"R\u001b\u00105\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u001b\u00108\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"R\u001b\u0010;\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b:\u0010\"R\u001b\u0010>\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u0010\"R\u001b\u0010A\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\"R\u001b\u0010D\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010 \u001a\u0004\bC\u0010\"R\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010 \u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010 \u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010 \u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006c"}, d2 = {"Lms1;", "Lf70;", "Lzs1;", "Lcom/google/android/material/badge/a;", "qh", "badge", "", "ph", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "count", Image.TYPE_HIGH, "i", "", "isError", "L", "Las1;", "contactInfoVO", "isSupportInProfile", "G9", "text", "Ec", "", "phone", "a0", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "Lk79;", "Ch", "()Landroid/view/View;", "pizzeriasOnMapButton", "uh", "contactSupport", com.huawei.hms.push.e.a, "vh", "contactViaCallButton", "f", "wh", "contactViaChatButton", "g", "xh", "contactViaEmailButton", "th", "contactSeparatorSupport", "sh", "contactInfoSupport", "j", "Fh", "socialNetworksButtons", "k", "Hh", "vkButton", "l", "zh", "fbButton", Image.TYPE_MEDIUM, "Ah", "igButton", "n", "Ih", "ytButton", "o", "Gh", "twButton", "Lcom/dodopizza/android/view/custom/InfoMessage;", "p", "Bh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "Landroid/widget/Button;", "q", "Eh", "()Landroid/widget/Button;", "refreshButton", "Landroid/widget/RelativeLayout;", "r", "yh", "()Landroid/widget/RelativeLayout;", "errorMessage", Image.TYPE_SMALL, "Lrn5;", "rh", "()Lcom/google/android/material/badge/a;", "chatBadgeDrawable", "Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", "t", "Lmoxy/ktx/MoxyKtxDelegate;", "Dh", "()Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", "presenter", "<init>", "()V", "u", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ms1  reason: default package */
/* loaded from: classes4.dex */
public final class ms1 extends f70 implements zs1 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    private final rn5 s;
    private final MoxyKtxDelegate t;
    static final /* synthetic */ je5<Object>[] v = {bc9.f(new ar8(ms1.class, "pizzeriasOnMapButton", "getPizzeriasOnMapButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactSupport", "getContactSupport()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactViaCallButton", "getContactViaCallButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactViaChatButton", "getContactViaChatButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactViaEmailButton", "getContactViaEmailButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactSeparatorSupport", "getContactSeparatorSupport()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "contactInfoSupport", "getContactInfoSupport()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "socialNetworksButtons", "getSocialNetworksButtons()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "vkButton", "getVkButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "fbButton", "getFbButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "igButton", "getIgButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "ytButton", "getYtButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "twButton", "getTwButton()Landroid/view/View;", 0)), bc9.f(new ar8(ms1.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(ms1.class, "refreshButton", "getRefreshButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ms1.class, "errorMessage", "getErrorMessage()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(ms1.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", 0))};
    public static final a u = new a(null);
    private static final int w = (int) kx9.a(5);

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lms1$a;", "", "Lms1;", "a", "", "HORIZONTAL_OFFSET", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ms1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ms1 a() {
            return new ms1();
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/badge/a;", "a", "()Lcom/google/android/material/badge/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<com.google.android.material.badge.a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.google.android.material.badge.a invoke() {
            return ms1.this.qh();
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().N(bqa.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().M();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().L();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().J();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$h */
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function1<View, Unit> {
        h() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().K();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$i */
    /* loaded from: classes4.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().N(bqa.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$j */
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().N(bqa.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$k */
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().N(bqa.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ms1.this.Dh().N(bqa.d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ContactsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", "a", "()Lru/dodopizza/app/presentation/contacts/ContactsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ms1$m */
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function0<ContactsPresenter> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ContactsPresenter invoke() {
            return ((LocalityComponent) ms1.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).o3().a();
        }
    }

    public ms1() {
        super(R.layout.fragment_contacts);
        rn5 b2;
        this.c = kb0.e(this, R.id.pizzerias_on_map_button);
        this.d = kb0.e(this, R.id.contact_support);
        this.e = kb0.e(this, R.id.contact_via_call_button);
        this.f = kb0.e(this, R.id.contact_via_chat_button);
        this.g = kb0.e(this, R.id.contact_via_email_button);
        this.h = kb0.e(this, R.id.contact_separator_support);
        this.i = kb0.e(this, R.id.contact_info_support);
        this.j = kb0.e(this, R.id.social_networks_buttons);
        this.k = kb0.e(this, R.id.vk_button);
        this.l = kb0.e(this, R.id.facebook_button);
        this.m = kb0.e(this, R.id.instagram_button);
        this.n = kb0.e(this, R.id.youtube_button);
        this.o = kb0.e(this, R.id.twitter_button);
        this.p = kb0.e(this, R.id.info);
        this.q = kb0.e(this, R.id.refresh_button);
        this.r = kb0.e(this, R.id.alert_message);
        b2 = yn5.b(new b());
        this.s = b2;
        m mVar = new m();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.t = new MoxyKtxDelegate(mvpDelegate, ContactsPresenter.class.getName() + ".presenter", mVar);
    }

    private final View Ah() {
        return (View) this.m.a(this, v[10]);
    }

    private final InfoMessage Bh() {
        return (InfoMessage) this.p.a(this, v[13]);
    }

    private final View Ch() {
        return (View) this.c.a(this, v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactsPresenter Dh() {
        return (ContactsPresenter) this.t.getValue(this, v[16]);
    }

    private final Button Eh() {
        return (Button) this.q.a(this, v[14]);
    }

    private final View Fh() {
        return (View) this.j.a(this, v[7]);
    }

    private final View Gh() {
        return (View) this.o.a(this, v[12]);
    }

    private final View Hh() {
        return (View) this.k.a(this, v[8]);
    }

    private final View Ih() {
        return (View) this.n.a(this, v[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jh(ms1 ms1Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        z65.h(ms1Var, "this$0");
        com.google.android.material.badge.b.a(ms1Var.rh(), ms1Var.wh());
    }

    private final int ph(com.google.android.material.badge.a aVar) {
        m60 m60Var = m60.a;
        int a2 = m60Var.a(aVar, w);
        Resources resources = getResources();
        z65.g(resources, "getResources(...)");
        return a2 - m60Var.b(resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.material.badge.a qh() {
        com.google.android.material.badge.a e2 = com.google.android.material.badge.a.e(requireContext(), R.xml.contacts_screen_badge);
        z65.g(e2, "createFromResource(...)");
        m60.a.c(e2, R.style.ContactsScreenBadgeTextAppearance);
        e2.D(3);
        e2.K(false);
        return e2;
    }

    private final com.google.android.material.badge.a rh() {
        return (com.google.android.material.badge.a) this.s.getValue();
    }

    private final View sh() {
        return (View) this.i.a(this, v[6]);
    }

    private final View th() {
        return (View) this.h.a(this, v[5]);
    }

    private final View uh() {
        return (View) this.d.a(this, v[1]);
    }

    private final View vh() {
        return (View) this.e.a(this, v[2]);
    }

    private final View wh() {
        return (View) this.f.a(this, v[3]);
    }

    private final View xh() {
        return (View) this.g.a(this, v[4]);
    }

    private final RelativeLayout yh() {
        return (RelativeLayout) this.r.a(this, v[15]);
    }

    private final View zh() {
        return (View) this.l.a(this, v[9]);
    }

    @Override // defpackage.zs1
    public void Ec(int i2) {
        Bh().m(i2, 3000);
    }

    @Override // defpackage.zs1
    public void G9(as1 as1Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        z65.h(as1Var, "contactInfoVO");
        un3.o(Ch(), as1Var.e());
        View uh = uh();
        boolean z5 = false;
        if (z && as1Var.d()) {
            z2 = true;
        } else {
            z2 = false;
        }
        un3.o(uh, z2);
        un3.o(sh(), !z);
        un3.o(th(), z);
        if (as1Var.d()) {
            if (as1Var.b().h().length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            un3.o(vh(), z3);
            boolean a2 = bs1.a(as1Var);
            if (as1Var.b().d().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            un3.o(wh(), a2);
            View xh = xh();
            if (!a2 && z4) {
                z5 = true;
            }
            un3.o(xh, z5);
        }
        List<bqa> a3 = as1Var.a();
        un3.o(Fh(), !a3.isEmpty());
        un3.o(Hh(), a3.contains(bqa.a));
        un3.o(zh(), a3.contains(bqa.b));
        un3.o(Ah(), a3.contains(bqa.c));
        un3.o(Ih(), a3.contains(bqa.d));
        un3.o(Gh(), a3.contains(bqa.e));
    }

    @Override // defpackage.zs1
    public void L(boolean z) {
        un3.o(yh(), z);
    }

    @Override // defpackage.zs1
    public void a0(String str) {
        z65.h(str, "phone");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.f(requireContext, str);
    }

    @Override // defpackage.zs1
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.g(requireContext, str);
    }

    @Override // defpackage.zs1
    public void h(int i2) {
        rh().E(i2);
        rh().A(ph(rh()));
        rh().K(true);
    }

    @Override // defpackage.zs1
    public void i() {
        rh().K(false);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(Ch(), new e());
        oma.a(vh(), new f());
        oma.a(wh(), new g());
        wh().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ls1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                ms1.Jh(ms1.this, view2, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        oma.a(xh(), new h());
        oma.a(Hh(), new i());
        oma.a(zh(), new j());
        oma.a(Ah(), new k());
        oma.a(Ih(), new l());
        oma.a(Gh(), new c());
        oma.a(Eh(), new d());
    }
}
