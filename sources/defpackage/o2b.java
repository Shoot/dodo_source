package defpackage;

import android.os.Bundle;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SupportDialog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001b\u0010&\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001b\u0010)\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001c¨\u0006/"}, d2 = {"Lo2b;", "Lip6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "isVisible", "oh", "mh", "nh", "Lo2b$b;", "listener", "ph", DateTokenConverter.CONVERTER_KEY, "Lo2b$b;", com.huawei.hms.push.e.a, "Z", "hasPhone", "f", "hasChat", "g", "hasEmail", Image.TYPE_HIGH, "Lk79;", "jh", "()Landroid/view/View;", "phoneButton", "i", "hh", "chatButton", "j", "ih", "emailButton", "k", "kh", "separatorTopChat", "l", "lh", "separatorTopEmail", "<init>", "()V", Image.TYPE_MEDIUM, "a", "b", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o2b  reason: default package */
/* loaded from: classes2.dex */
public final class o2b extends ip6 {
    private b d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(o2b.class, "phoneButton", "getPhoneButton()Landroid/view/View;", 0)), bc9.f(new ar8(o2b.class, "chatButton", "getChatButton()Landroid/view/View;", 0)), bc9.f(new ar8(o2b.class, "emailButton", "getEmailButton()Landroid/view/View;", 0)), bc9.f(new ar8(o2b.class, "separatorTopChat", "getSeparatorTopChat()Landroid/view/View;", 0)), bc9.f(new ar8(o2b.class, "separatorTopEmail", "getSeparatorTopEmail()Landroid/view/View;", 0))};
    public static final a m = new a(null);

    /* compiled from: SupportDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lo2b$a;", "", "Lo2b;", "a", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o2b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o2b a() {
            return new o2b();
        }
    }

    /* compiled from: SupportDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lo2b$b;", "", "", com.huawei.hms.opendevice.c.a, "b", "a", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o2b$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    /* compiled from: SupportDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o2b$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b bVar = o2b.this.d;
            if (bVar != null) {
                bVar.c();
            }
            o2b.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SupportDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o2b$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b bVar = o2b.this.d;
            if (bVar != null) {
                bVar.b();
            }
            o2b.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SupportDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o2b$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b bVar = o2b.this.d;
            if (bVar != null) {
                bVar.a();
            }
            o2b.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public o2b() {
        super(iz8.support_bottom_sheet_dialog);
        this.h = kb0.e(this, iy8.support_bottom_sheet_container_phone);
        this.i = kb0.e(this, iy8.support_bottom_sheet_container_chat);
        this.j = kb0.e(this, iy8.support_bottom_sheet_container_email);
        this.k = kb0.e(this, iy8.support_separator_top_chat);
        this.l = kb0.e(this, iy8.support_separator_top_email);
    }

    private final View hh() {
        return (View) this.i.a(this, n[1]);
    }

    private final View ih() {
        return (View) this.j.a(this, n[2]);
    }

    private final View jh() {
        return (View) this.h.a(this, n[0]);
    }

    private final View kh() {
        return (View) this.k.a(this, n[3]);
    }

    private final View lh() {
        return (View) this.l.a(this, n[4]);
    }

    public final o2b mh(boolean z) {
        this.f = z;
        return this;
    }

    public final o2b nh(boolean z) {
        this.g = z;
        return this;
    }

    public final o2b oh(boolean z) {
        this.e = z;
        return this;
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        un3.o(jh(), this.e);
        un3.o(hh(), this.f);
        un3.o(ih(), this.g);
        View kh = kh();
        boolean z2 = false;
        if (this.e && this.f) {
            z = true;
        } else {
            z = false;
        }
        un3.o(kh, z);
        View lh = lh();
        if ((this.e && this.g) || (this.f && this.g)) {
            z2 = true;
        }
        un3.o(lh, z2);
        oma.a(jh(), new c());
        oma.a(hh(), new d());
        oma.a(ih(), new e());
    }

    public final o2b ph(b bVar) {
        z65.h(bVar, "listener");
        this.d = bVar;
        return this;
    }
}
