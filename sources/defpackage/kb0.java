package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Bindings.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003\u001a(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003\u001a(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000b\u001a(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003\u001a(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002\u001aH\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\"\u0004\b\u0000\u0010\u0016\"\b\b\u0001\u0010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017H\u0002\u001a\\\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\"\u0004\b\u0000\u0010\u0016\"\b\b\u0001\u0010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00172\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0002\",\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\",\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \",\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\",\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\",\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0017*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroid/view/View;", "V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "id", "Lk79;", "g", "Landroid/app/Activity;", com.huawei.hms.opendevice.c.a, "Landroidx/fragment/app/Fragment;", com.huawei.hms.push.e.a, "Lkotlin/Function1;", "", "action", "f", "Ljn;", "b", DateTokenConverter.CONVERTER_KEY, "Lje5;", "desc", "", "o", "T", "Lkotlin/Function2;", "finder", "Lpn5;", Image.TYPE_MEDIUM, "n", "j", "(Landroid/view/View;)Lkotlin/jvm/functions/Function2;", "viewFinder", "i", "(Landroid/app/Activity;)Lkotlin/jvm/functions/Function2;", "l", "(Landroidx/recyclerview/widget/RecyclerView$d0;)Lkotlin/jvm/functions/Function2;", "k", "(Landroidx/fragment/app/Fragment;)Lkotlin/jvm/functions/Function2;", Image.TYPE_HIGH, "(Ljn;)Lkotlin/jvm/functions/Function2;", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: kb0  reason: default package */
/* loaded from: classes.dex */
public final class kb0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroid/view/View;", "V", "t", "Lje5;", "desc", "a", "(Ljava/lang/Object;Lje5;)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$a */
    /* loaded from: classes.dex */
    public static final class a<T, V> extends ej5 implements Function2<T, je5<?>, V> {
        final /* synthetic */ Function2<T, Integer, View> a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super T, ? super Integer, ? extends View> function2, int i) {
            super(2);
            this.a = function2;
            this.b = i;
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Lje5<*>;)TV; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final View invoke(Object obj, je5 je5Var) {
            View view;
            z65.h(je5Var, "desc");
            View invoke = this.a.invoke(obj, Integer.valueOf(this.b));
            if (invoke instanceof View) {
                view = invoke;
            } else {
                view = null;
            }
            if (view == null) {
                kb0.o(this.b, je5Var);
                throw new KotlinNothingValueException();
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroid/view/View;", "V", "t", "Lje5;", "desc", "a", "(Ljava/lang/Object;Lje5;)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$b */
    /* loaded from: classes.dex */
    public static final class b<T, V> extends ej5 implements Function2<T, je5<?>, V> {
        final /* synthetic */ Function2<T, Integer, View> a;
        final /* synthetic */ int b;
        final /* synthetic */ Function1<V, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super T, ? super Integer, ? extends View> function2, int i, Function1<? super V, Unit> function1) {
            super(2);
            this.a = function2;
            this.b = i;
            this.c = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Lje5<*>;)TV; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final View invoke(Object obj, je5 je5Var) {
            View view;
            z65.h(je5Var, "desc");
            View invoke = this.a.invoke(obj, Integer.valueOf(this.b));
            if (invoke instanceof View) {
                view = invoke;
            } else {
                view = null;
            }
            if (view == null) {
                kb0.o(this.b, je5Var);
                throw new KotlinNothingValueException();
            }
            this.c.invoke(view);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "", "it", "kotlin.jvm.PlatformType", "a", "(Landroid/view/View;I)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function2<View, Integer, View> {
        public static final c a = new c();

        c() {
            super(2);
        }

        public final View a(View view, int i) {
            z65.h(view, "$this$null");
            return view.findViewById(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ View invoke(View view, Integer num) {
            return a(view, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/app/Activity;", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "a", "(Landroid/app/Activity;I)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function2<Activity, Integer, View> {
        public static final d a = new d();

        d() {
            super(2);
        }

        public final View a(Activity activity, int i) {
            z65.h(activity, "$this$null");
            return activity.findViewById(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ View invoke(Activity activity, Integer num) {
            return a(activity, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$d0;", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "a", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function2<RecyclerView.d0, Integer, View> {
        public static final e a = new e();

        e() {
            super(2);
        }

        public final View a(RecyclerView.d0 d0Var, int i) {
            z65.h(d0Var, "$this$null");
            return d0Var.itemView.findViewById(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ View invoke(RecyclerView.d0 d0Var, Integer num) {
            return a(d0Var, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "it", "Landroid/view/View;", "a", "(Landroidx/fragment/app/Fragment;I)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function2<Fragment, Integer, View> {
        public static final f a = new f();

        f() {
            super(2);
        }

        public final View a(Fragment fragment, int i) {
            z65.h(fragment, "$this$null");
            View view = fragment.getView();
            if (view != null) {
                return view.findViewById(i);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ View invoke(Fragment fragment, Integer num) {
            return a(fragment, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Bindings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljn;", "", "it", "Landroid/view/View;", "a", "(Ljn;I)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kb0$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function2<jn, Integer, View> {
        public static final g a = new g();

        g() {
            super(2);
        }

        public final View a(jn jnVar, int i) {
            z65.h(jnVar, "$this$null");
            return jnVar.findViewById(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ View invoke(jn jnVar, Integer num) {
            return a(jnVar, num.intValue());
        }
    }

    public static final <V extends View> k79<jn, V> b(jn jnVar, int i) {
        z65.h(jnVar, "<this>");
        return m(i, h(jnVar));
    }

    public static final <V extends View> k79<Activity, V> c(Activity activity, int i) {
        z65.h(activity, "<this>");
        return m(i, i(activity));
    }

    public static final <V extends View> k79<View, V> d(View view, int i) {
        z65.h(view, "<this>");
        return m(i, j(view));
    }

    public static final <V extends View> k79<Fragment, V> e(Fragment fragment, int i) {
        z65.h(fragment, "<this>");
        return m(i, k(fragment));
    }

    public static final <V extends View> k79<Fragment, V> f(Fragment fragment, int i, Function1<? super V, Unit> function1) {
        z65.h(fragment, "<this>");
        z65.h(function1, "action");
        return n(i, k(fragment), function1);
    }

    public static final <V extends View> k79<RecyclerView.d0, V> g(RecyclerView.d0 d0Var, int i) {
        z65.h(d0Var, "<this>");
        return m(i, l(d0Var));
    }

    private static final Function2<jn, Integer, View> h(jn jnVar) {
        return g.a;
    }

    private static final Function2<Activity, Integer, View> i(Activity activity) {
        return d.a;
    }

    private static final Function2<View, Integer, View> j(View view) {
        return c.a;
    }

    private static final Function2<Fragment, Integer, View> k(Fragment fragment) {
        return f.a;
    }

    private static final Function2<RecyclerView.d0, Integer, View> l(RecyclerView.d0 d0Var) {
        return e.a;
    }

    private static final <T, V extends View> pn5<T, V> m(int i, Function2<? super T, ? super Integer, ? extends View> function2) {
        return new pn5<>(new a(function2, i));
    }

    private static final <T, V extends View> pn5<T, V> n(int i, Function2<? super T, ? super Integer, ? extends View> function2, Function1<? super V, Unit> function1) {
        return new pn5<>(new b(function2, i, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void o(int i, je5<?> je5Var) {
        String name = je5Var.getName();
        throw new IllegalStateException("View ID " + i + " for '" + name + "' not found.");
    }
}
