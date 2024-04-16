package defpackage;

import defpackage.ym;
import kotlin.Metadata;
import ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies;
/* compiled from: VariableProductCardComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Ltwb;", "", "Lru/dodopizza/app/presentation/product/card/variable/a;", "fragment", "", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: twb  reason: default package */
/* loaded from: classes3.dex */
public interface twb {
    public static final a a = a.a;

    /* compiled from: VariableProductCardComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Ltwb$a;", "", "Ltwb$b;", "b", "Ltwb$b;", "a", "()Ltwb$b;", "factory", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: twb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = bk2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: VariableProductCardComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Ltwb$b;", "", "Lru/dodopizza/app/di/modules/presentation/product/card/variable/VariableProductCardFeatureDependencies;", "dependencies", "", "cartItemId", "menuItemId", "defaultShoppingId", "Lym$d;", "screen", "Ltwb;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: twb$b */
    /* loaded from: classes3.dex */
    public interface b {
        twb a(VariableProductCardFeatureDependencies variableProductCardFeatureDependencies, String str, String str2, String str3, ym.d dVar);
    }

    void a(ru.dodopizza.app.presentation.product.card.variable.a aVar);
}
