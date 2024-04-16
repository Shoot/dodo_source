package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: InfoStoryLauncher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\u000b"}, d2 = {"Ld15;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "storyId", "Lkotlin/Function0;", "", "onSuccess", "onFailure", "bf", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d15  reason: default package */
/* loaded from: classes2.dex */
public interface d15 {

    /* compiled from: InfoStoryLauncher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d15$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InfoStoryLauncher.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: d15$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0281a extends ej5 implements Function0<Unit> {
            public static final C0281a a = new C0281a();

            C0281a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InfoStoryLauncher.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: d15$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<Unit> {
            public static final b a = new b();

            b() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(d15 d15Var, Context context, String str, Function0 function0, Function0 function02, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function0 = C0281a.a;
                }
                if ((i & 8) != 0) {
                    function02 = b.a;
                }
                d15Var.bf(context, str, function0, function02);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStory");
        }
    }

    void bf(Context context, String str, Function0<Unit> function0, Function0<Unit> function02);
}
