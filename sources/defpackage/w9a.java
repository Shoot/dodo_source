package defpackage;

import com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies;
import com.dodopizza.order.feature.selectionmap.presentation.e;
import com.dodopizza.order.feature.selectionmap.presentation.f;
import kotlin.Metadata;
/* compiled from: SelectionMapComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lw9a;", "", "Lcom/dodopizza/order/feature/selectionmap/presentation/e;", "fragment", "", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w9a  reason: default package */
/* loaded from: classes2.dex */
public interface w9a {
    public static final a a = a.a;

    /* compiled from: SelectionMapComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lw9a$a;", "", "Lw9a$b;", "b", "Lw9a$b;", "a", "()Lw9a$b;", "factory", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w9a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = fj2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: SelectionMapComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lw9a$b;", "", "Lcom/dodopizza/order/feature/selectionmap/SelectionMapFeatureDependencies;", "dependencies", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "initialData", "Lw9a;", "a", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w9a$b */
    /* loaded from: classes2.dex */
    public interface b {
        w9a a(SelectionMapFeatureDependencies selectionMapFeatureDependencies, f fVar);
    }

    void a(e eVar);
}
