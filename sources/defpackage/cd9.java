package defpackage;

import com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies;
import com.dodopizza.core.feature.remoteconfig.presentation.RemoteConfigInitializer;
import kotlin.Metadata;
/* compiled from: RemoteConfigComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcd9;", "", "Lcom/dodopizza/core/feature/remoteconfig/presentation/RemoteConfigInitializer;", "initializer", "", "a", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cd9  reason: default package */
/* loaded from: classes.dex */
public interface cd9 {
    public static final a a = a.a;

    /* compiled from: RemoteConfigComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcd9$a;", "", "Lcd9$b;", "b", "Lcd9$b;", "a", "()Lcd9$b;", "factory", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cd9$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = li2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: RemoteConfigComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lcd9$b;", "", "Lcom/dodopizza/core/feature/remoteconfig/RemoteConfigFeatureDependencies;", "dependencies", "Lcd9;", "a", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cd9$b */
    /* loaded from: classes.dex */
    public interface b {
        cd9 a(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies);
    }

    void a(RemoteConfigInitializer remoteConfigInitializer);
}
