package androidx.compose.ui.focus;

import androidx.compose.ui.focus.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u0010.R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u001b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\"\u0010\u001e\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u001d\u0010\u000fR\"\u0010!\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\"\u0010#\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010&\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\f\u001a\u0004\b\u001c\u0010\r\"\u0004\b%\u0010\u000fR7\u0010/\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n0'8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b\u0005\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b$\u0010*\"\u0004\b+\u0010,R7\u00102\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n0'8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b\u0012\u0010)\u0012\u0004\b1\u0010.\u001a\u0004\b\u0011\u0010*\"\u0004\b0\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/ui/focus/f;", "Landroidx/compose/ui/focus/e;", "", "a", "Z", "j", "()Z", Image.TYPE_HIGH, "(Z)V", "canFocus", "Landroidx/compose/ui/focus/g;", "b", "Landroidx/compose/ui/focus/g;", "()Landroidx/compose/ui/focus/g;", "setNext", "(Landroidx/compose/ui/focus/g;)V", StatisticManager.NEXT, com.huawei.hms.opendevice.c.a, "k", "setPrevious", "previous", DateTokenConverter.CONVERTER_KEY, "setUp", "up", com.huawei.hms.push.e.a, "g", "setDown", "down", "f", "setLeft", ElementGenerator.TEXT_ALIGN_LEFT, "u", "setRight", ElementGenerator.TEXT_ALIGN_RIGHT, "setStart", "start", "i", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/b;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "()V", "enter", "setExit", "getExit$annotations", "exit", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f implements e {
    private boolean a = true;
    private g b;
    private g c;
    private g d;
    private g e;
    private g f;
    private g g;
    private g h;
    private g i;
    private Function1<? super androidx.compose.ui.focus.b, g> j;
    private Function1<? super androidx.compose.ui.focus.b, g> k;

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/b;", "it", "Landroidx/compose/ui/focus/g;", "a", "(I)Landroidx/compose/ui/focus/g;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<androidx.compose.ui.focus.b, g> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final g a(int i) {
            return g.b.b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ g invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/b;", "it", "Landroidx/compose/ui/focus/g;", "a", "(I)Landroidx/compose/ui/focus/g;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<androidx.compose.ui.focus.b, g> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final g a(int i) {
            return g.b.b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ g invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    public f() {
        g.a aVar = g.b;
        this.b = aVar.b();
        this.c = aVar.b();
        this.d = aVar.b();
        this.e = aVar.b();
        this.f = aVar.b();
        this.g = aVar.b();
        this.h = aVar.b();
        this.i = aVar.b();
        this.j = a.a;
        this.k = b.a;
    }

    @Override // androidx.compose.ui.focus.e
    public g a() {
        return this.b;
    }

    @Override // androidx.compose.ui.focus.e
    public g b() {
        return this.d;
    }

    @Override // androidx.compose.ui.focus.e
    public Function1<androidx.compose.ui.focus.b, g> c() {
        return this.k;
    }

    @Override // androidx.compose.ui.focus.e
    public g d() {
        return this.h;
    }

    @Override // androidx.compose.ui.focus.e
    public g e() {
        return this.f;
    }

    @Override // androidx.compose.ui.focus.e
    public g f() {
        return this.i;
    }

    @Override // androidx.compose.ui.focus.e
    public g g() {
        return this.e;
    }

    @Override // androidx.compose.ui.focus.e
    public void h(boolean z) {
        this.a = z;
    }

    @Override // androidx.compose.ui.focus.e
    public Function1<androidx.compose.ui.focus.b, g> i() {
        return this.j;
    }

    @Override // androidx.compose.ui.focus.e
    public boolean j() {
        return this.a;
    }

    @Override // androidx.compose.ui.focus.e
    public g k() {
        return this.c;
    }

    @Override // androidx.compose.ui.focus.e
    public g u() {
        return this.g;
    }
}
