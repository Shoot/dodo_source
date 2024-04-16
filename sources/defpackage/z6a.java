package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.checkout.presentation.PackagingTypeHolder;
import defpackage.k6;
import defpackage.ok9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: SelectPackagingTypeDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0002$\u000fB\u0007¢\u0006\u0004\b!\u0010\"J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lz6a;", "Landroidx/fragment/app/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onResume", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Lk79;", "ih", "()Landroidx/recyclerview/widget/RecyclerView;", "packagingTypeList", "Landroidx/appcompat/widget/AppCompatTextView;", com.huawei.hms.opendevice.c.a, "gh", "()Landroidx/appcompat/widget/AppCompatTextView;", "cancel", "Lz6a$b;", DateTokenConverter.CONVERTER_KEY, "Lz6a$b;", "hh", "()Lz6a$b;", "jh", "(Lz6a$b;)V", "listener", "<init>", "()V", com.huawei.hms.push.e.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z6a  reason: default package */
/* loaded from: classes4.dex */
public final class z6a extends androidx.fragment.app.c {
    private final k79 b = kb0.e(this, R.id.packaging_type_list);
    private final k79 c = kb0.e(this, R.id.cancel);
    private b d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(z6a.class, "packagingTypeList", "getPackagingTypeList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(z6a.class, "cancel", "getCancel()Landroidx/appcompat/widget/AppCompatTextView;", 0))};
    public static final a e = new a(null);

    /* compiled from: SelectPackagingTypeDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lz6a$a;", "", "", "Lok9;", "serviceTypes", "Lz6a;", "a", "", "EXTRA_KEY_SERVICE_TYPES", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z6a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z6a a(List<? extends ok9> list) {
            z65.h(list, "serviceTypes");
            return (z6a) y64.d(new z6a(), bi0.c(bi0.d("serviceTypes", list)));
        }
    }

    /* compiled from: SelectPackagingTypeDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lz6a$b;", "", "", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z6a$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();
    }

    /* compiled from: SelectPackagingTypeDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z6a$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            Dialog dialog = z6a.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            b hh = z6a.this.hh();
            if (hh != null) {
                hh.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SelectPackagingTypeDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lok9;", "serviceType", "", "a", "(Lok9;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z6a$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<ok9, Unit> {
        d() {
            super(1);
        }

        public final void a(ok9 ok9Var) {
            b hh;
            z65.h(ok9Var, "serviceType");
            Dialog dialog = z6a.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            if (z65.c(ok9Var, ok9.b.a)) {
                b hh2 = z6a.this.hh();
                if (hh2 != null) {
                    hh2.d();
                }
            } else if (z65.c(ok9Var, ok9.c.a)) {
                b hh3 = z6a.this.hh();
                if (hh3 != null) {
                    hh3.c();
                }
            } else if (z65.c(ok9Var, ok9.a.a) && (hh = z6a.this.hh()) != null) {
                hh.b();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ok9 ok9Var) {
            a(ok9Var);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z6a$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ok9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z6a$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PackagingTypeHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    private final AppCompatTextView gh() {
        return (AppCompatTextView) this.c.a(this, f[1]);
    }

    private final RecyclerView ih() {
        return (RecyclerView) this.b.a(this, f[0]);
    }

    public final b hh() {
        return this.d;
    }

    public final void jh(b bVar) {
        this.d = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_select_packaging_type, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        Window window2 = null;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            ((ViewGroup.LayoutParams) layoutParams).width = -1;
        }
        if (layoutParams != null) {
            ((ViewGroup.LayoutParams) layoutParams).height = -2;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            window2 = dialog2.getWindow();
        }
        if (window2 != null) {
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            window2.setAttributes(layoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        oma.a(gh(), new c());
        ih().addItemDecoration(new qta(0, R.color.strokeSecondaryColor, 1, false, 0));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("serviceTypes")) == null) ? null : null;
        if (obj != null && !(obj instanceof List)) {
            throw new ClassCastException("Property serviceTypes has different class type");
        } else if (obj != null) {
            RecyclerView ih = ih();
            k6 k6Var = new k6(new l6((List) obj));
            new k6.a(k6Var, e.a, new cp7(new d()), f.a).b();
            ih.setAdapter(k6Var.d());
        } else {
            throw new IllegalArgumentException("Argument with key = serviceTypes not found in bundle");
        }
    }
}
