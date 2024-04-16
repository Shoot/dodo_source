package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.bottomchooser.presentation.OptionItemViewHolder;
import defpackage.k6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChooserBottomDialog.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0004!\u0014\u001a B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lf71;", "Lcom/google/android/material/bottomsheet/b;", "Lnb7;", "selectedItem", "", "jh", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Landroid/widget/TextView;", "b", "Lk79;", "hh", "()Landroid/widget/TextView;", "chooserTitle", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "ih", "()Landroidx/recyclerview/widget/RecyclerView;", "optionList", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f71  reason: default package */
/* loaded from: classes.dex */
public final class f71 extends com.google.android.material.bottomsheet.b {
    private final k79 b = kb0.e(this, zx8.bottom_chooser_title);
    private final k79 c = kb0.e(this, zx8.bottom_chooser_option_list);
    static final /* synthetic */ je5<Object>[] e = {bc9.f(new ar8(f71.class, "chooserTitle", "getChooserTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(f71.class, "optionList", "getOptionList()Landroidx/recyclerview/widget/RecyclerView;", 0))};
    private static final b d = new b(null);

    /* compiled from: ChooserBottomDialog.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Lf71$a;", "", "", "title", "b", "Lnb7;", "option", "a", "Landroidx/fragment/app/Fragment;", "parentFragment", "", com.huawei.hms.opendevice.c.a, "Landroid/os/Bundle;", "Landroid/os/Bundle;", "bundle", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "optionList", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f71$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final Bundle a = new Bundle();
        private final ArrayList<nb7> b = new ArrayList<>();

        public final a a(nb7 nb7Var) {
            z65.h(nb7Var, "option");
            this.b.add(nb7Var);
            return this;
        }

        public final a b(CharSequence charSequence) {
            z65.h(charSequence, "title");
            if (charSequence.length() > 0) {
                this.a.putCharSequence("title_char", charSequence);
            }
            return this;
        }

        public final void c(Fragment fragment) {
            z65.h(fragment, "parentFragment");
            this.a.putSerializable("option_list", this.b);
            ((f71) y64.d(new f71(), this.a)).show(fragment.getChildFragmentManager(), "TAG");
        }
    }

    /* compiled from: ChooserBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lf71$b;", "", "", "IS_CANCELABLE", "Ljava/lang/String;", "OPTION_LIST", "TITLE_CHAR", "TITLE_RES", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f71$b */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ChooserBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lf71$c;", "", "", "l0", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f71$c */
    /* loaded from: classes.dex */
    public interface c {
        void l0();
    }

    /* compiled from: ChooserBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lf71$d;", "", "", "optionId", "", "xe", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f71$d */
    /* loaded from: classes.dex */
    public interface d {
        void xe(String str);
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f71$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof nb7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f71$f */
    /* loaded from: classes.dex */
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
            Object newInstance = OptionItemViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: ChooserBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnb7;", "optionItem", "", "a", "(Lnb7;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f71$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<nb7, Unit> {
        g() {
            super(1);
        }

        public final void a(nb7 nb7Var) {
            z65.h(nb7Var, "optionItem");
            f71.this.jh(nb7Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nb7 nb7Var) {
            a(nb7Var);
            return Unit.a;
        }
    }

    private final TextView hh() {
        return (TextView) this.b.a(this, e[0]);
    }

    private final RecyclerView ih() {
        return (RecyclerView) this.c.a(this, e[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jh(nb7 nb7Var) {
        d dVar;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof d) {
            dVar = (d) parentFragment;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.xe(nb7Var.getId());
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(wz8.dialog_bottom_chooser, viewGroup, false);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        c cVar;
        z65.h(dialogInterface, "dialog");
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof c) {
            cVar = (c) parentFragment;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar.l0();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        jb0.a.a(this);
        Boolean bool = Boolean.TRUE;
        Bundle arguments = getArguments();
        if (arguments != null && (obj3 = arguments.get("is_cancelable")) != null) {
            bool = obj3;
        }
        if (bool != null && !(bool instanceof Boolean)) {
            throw new ClassCastException("Property is_cancelable has different class type");
        } else if (bool != null) {
            setCancelable(bool.booleanValue());
            Integer num = 0;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("title_res")) != null) {
                num = obj2;
            }
            if (num != null && !(num instanceof Integer)) {
                throw new ClassCastException("Property title_res has different class type");
            } else if (num != null) {
                int intValue = num.intValue();
                Bundle arguments3 = getArguments();
                String str = (arguments3 == null || (str = arguments3.get("title_char")) == null) ? "" : "";
                if (str instanceof CharSequence) {
                    CharSequence charSequence = (CharSequence) str;
                    ArrayList arrayList = new ArrayList();
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null && (obj = arguments4.get("option_list")) != null) {
                        arrayList = obj;
                    }
                    if (arrayList instanceof ArrayList) {
                        ArrayList arrayList2 = arrayList;
                        if (intValue > 0) {
                            un3.k(hh());
                            hh().setText(intValue);
                        } else if (charSequence.length() > 0) {
                            un3.k(hh());
                            hh().setText(charSequence);
                        } else {
                            un3.e(hh());
                        }
                        ih().setLayoutManager(new LinearLayoutManager(requireContext()));
                        ih().setHasFixedSize(true);
                        ih().setAdapter(new k6.a(new k6(arrayList2), e.a, new ob7(new g()), f.a).b().d());
                        return;
                    }
                    throw new ClassCastException("Property option_list has different class type");
                }
                throw new ClassCastException("Property title_char has different class type");
            } else {
                throw new IllegalArgumentException("Argument with key = title_res not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = is_cancelable not found in bundle");
        }
    }
}
