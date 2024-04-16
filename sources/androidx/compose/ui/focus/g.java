package androidx.compose.ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FocusRequester.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "", com.huawei.hms.opendevice.c.a, "()Z", "Lgr6;", "Lj24;", "a", "Lgr6;", DateTokenConverter.CONVERTER_KEY, "()Lgr6;", "focusRequesterNodes", "<init>", "()V", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class g {
    public static final a b = new a(null);
    private static final g c = new g();
    private static final g d = new g();
    private final gr6<j24> a = new gr6<>(new j24[16], 0);

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/g$a;", "", "Landroidx/compose/ui/focus/g;", "Default", "Landroidx/compose/ui/focus/g;", "b", "()Landroidx/compose/ui/focus/g;", "Cancel", "a", "getCancel$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.d;
        }

        public final g b() {
            return g.c;
        }
    }

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<FocusTargetNode, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            z65.h(focusTargetNode, "it");
            return Boolean.valueOf(i.j(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0059, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.g.c():boolean");
    }

    public final gr6<j24> d() {
        return this.a;
    }
}
