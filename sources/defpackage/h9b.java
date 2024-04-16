package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextActionModeCallback.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0014R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lh9b;", "", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "onActionModeDestroy", "Lk99;", "b", "Lk99;", "getRect", "()Lk99;", "setRect", "(Lk99;)V", "rect", c.a, "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "onCopyRequested", DateTokenConverter.CONVERTER_KEY, "getOnPasteRequested", "setOnPasteRequested", "onPasteRequested", e.a, "getOnCutRequested", "setOnCutRequested", "onCutRequested", "f", "getOnSelectAllRequested", "setOnSelectAllRequested", "onSelectAllRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Lk99;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h9b  reason: default package */
/* loaded from: classes.dex */
public final class h9b {
    private final Function0<Unit> a;
    private k99 b;
    private Function0<Unit> c;
    private Function0<Unit> d;
    private Function0<Unit> e;
    private Function0<Unit> f;

    public h9b(Function0<Unit> function0, k99 k99Var, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        z65.h(k99Var, "rect");
        this.a = function0;
        this.b = k99Var;
        this.c = function02;
        this.d = function03;
        this.e = function04;
        this.f = function05;
    }

    public /* synthetic */ h9b(Function0 function0, k99 k99Var, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? k99.e.a() : k99Var, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05);
    }
}
