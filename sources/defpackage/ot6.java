package defpackage;

import com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies;
import com.dodopizza.chat.feature.initializer.presentation.NativeChatInitializer;
import kotlin.Metadata;
/* compiled from: NativeChatInitializerComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lot6;", "", "Lcom/dodopizza/chat/feature/initializer/presentation/NativeChatInitializer;", "initializer", "", "a", "b", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ot6  reason: default package */
/* loaded from: classes.dex */
public interface ot6 {
    public static final a a = a.a;

    /* compiled from: NativeChatInitializerComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lot6$a;", "", "Lot6$b;", "a", "()Lot6$b;", "factory", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ot6$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = cg2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: NativeChatInitializerComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lot6$b;", "", "Lcom/dodopizza/chat/feature/initializer/NativeChatInitializerDependencies;", "dependencies", "Lot6;", "a", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ot6$b */
    /* loaded from: classes.dex */
    public interface b {
        ot6 a(NativeChatInitializerDependencies nativeChatInitializerDependencies);
    }

    void a(NativeChatInitializer nativeChatInitializer);
}
