package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DelegatingComponentDependenciesRegistry.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u001a\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0082\u0010¨\u0006\n"}, d2 = {"Landroid/content/Context;", "Lkm1;", "b", "Landroidx/fragment/app/Fragment;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", com.huawei.hms.opendevice.c.a, CoreConstants.CONTEXT_SCOPE_VALUE, "Llm1;", e.a, "di_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: eu2  reason: default package */
/* loaded from: classes.dex */
public final class eu2 {

    /* compiled from: DelegatingComponentDependenciesRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llm1;", "a", "()Llm1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: eu2$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<lm1> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final lm1 invoke() {
            Context applicationContext = this.a.getApplicationContext();
            z65.f(applicationContext, "null cannot be cast to non-null type com.dodopizza.di.ComponentDependenciesRegistryProvider");
            return (lm1) applicationContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingComponentDependenciesRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llm1;", "a", "()Llm1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: eu2$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<lm1> {
        final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final lm1 invoke() {
            nt9 parentFragment = this.a.getParentFragment();
            if (parentFragment == null) {
                parentFragment = this.a.requireActivity();
                z65.g(parentFragment, "requireActivity(...)");
            }
            return (lm1) parentFragment;
        }
    }

    /* compiled from: DelegatingComponentDependenciesRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llm1;", "a", "()Llm1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: eu2$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<lm1> {
        final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.a = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final lm1 invoke() {
            Context context = this.a.getContext();
            z65.g(context, "getContext(...)");
            return eu2.e(context);
        }
    }

    public static final km1 b(Context context) {
        z65.h(context, "<this>");
        return new du2(new a(context));
    }

    public static final km1 c(View view) {
        z65.h(view, "<this>");
        return new du2(new c(view));
    }

    public static final km1 d(Fragment fragment) {
        z65.h(fragment, "<this>");
        return new du2(new b(fragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lm1 e(Context context) {
        lm1 lm1Var;
        while (true) {
            if (context instanceof lm1) {
                lm1Var = (lm1) context;
            } else {
                lm1Var = null;
            }
            if (lm1Var == null) {
                z65.f(context, "null cannot be cast to non-null type android.content.ContextWrapper");
                context = ((ContextWrapper) context).getBaseContext();
                z65.g(context, "getBaseContext(...)");
            } else {
                return lm1Var;
            }
        }
    }
}
