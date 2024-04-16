package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lxj9;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", c.a, DateTokenConverter.CONVERTER_KEY, "(Lxj9;Landroid/content/Context;Lcv1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tg  reason: default package */
/* loaded from: classes.dex */
public final class tg {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Landroid/graphics/Typeface;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tg$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Typeface>, Object> {
        int a;
        final /* synthetic */ xj9 b;
        final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xj9 xj9Var, Context context, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = xj9Var;
            this.c = context;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Typeface> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return tg.c(this.b, this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(xj9 xj9Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return zj9.a.a(context, xj9Var);
        }
        Typeface h = ek9.h(context, xj9Var.d());
        z65.e(h);
        z65.g(h, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(xj9 xj9Var, Context context, cv1<? super Typeface> cv1Var) {
        return qh0.g(v33.b(), new a(xj9Var, context, null), cv1Var);
    }
}
