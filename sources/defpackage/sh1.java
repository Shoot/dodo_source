package defpackage;

import defpackage.ym;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies;
/* compiled from: ComboProductCardComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lsh1;", "", "Lru/dodopizza/app/presentation/product/card/combo/a;", "fragment", "", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sh1  reason: default package */
/* loaded from: classes3.dex */
public interface sh1 {
    public static final a a = a.a;

    /* compiled from: ComboProductCardComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lsh1$a;", "", "Lsh1$b;", "b", "Lsh1$b;", "a", "()Lsh1$b;", "factory", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sh1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = uc2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: ComboProductCardComponent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J>\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000e"}, d2 = {"Lsh1$b;", "", "Lru/dodopizza/app/di/modules/presentation/product/card/combo/ComboProductCardFeatureDependencies;", "dependencies", "", "menuItemId", "cartItemId", "Lym$d;", "screen", "", "Lsi8;", "preferredSlotProducts", "Lsh1;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sh1$b */
    /* loaded from: classes3.dex */
    public interface b {
        sh1 a(ComboProductCardFeatureDependencies comboProductCardFeatureDependencies, String str, String str2, ym.d dVar, List<si8> list);
    }

    void a(ru.dodopizza.app.presentation.product.card.combo.a aVar);
}
