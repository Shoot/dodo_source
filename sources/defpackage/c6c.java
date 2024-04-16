package defpackage;

import android.view.View;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import kotlin.Metadata;
/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lc6c;", "", "Landroid/view/View;", "windowRootView", "Lh99;", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: c6c  reason: default package */
/* loaded from: classes.dex */
public interface c6c {
    public static final a a = a.a;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lc6c$a;", "", "Lc6c;", "b", "Lc6c;", "a", "()Lc6c;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: c6c$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final c6c b = C0082a.b;

        /* compiled from: WindowRecomposer.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "rootView", "Lh99;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: c6c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0082a implements c6c {
            public static final C0082a b = new C0082a();

            C0082a() {
            }

            @Override // defpackage.c6c
            public final h99 a(View view) {
                z65.h(view, "rootView");
                return WindowRecomposer_androidKt.c(view, null, null, 3, null);
            }
        }

        private a() {
        }

        public final c6c a() {
            return b;
        }
    }

    h99 a(View view);
}
