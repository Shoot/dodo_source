package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TracesImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lzjb;", "Lyjb;", "T", "", Action.NAME_ATTRIBUTE, "Lkotlin/Function0;", "action", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ltjb;", "b", "Lvjb;", "Lvjb;", "traceFactory", "<init>", "(Lvjb;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zjb  reason: default package */
/* loaded from: classes4.dex */
public final class zjb implements yjb {
    private final vjb a;

    public zjb(vjb vjbVar) {
        z65.h(vjbVar, "traceFactory");
        this.a = vjbVar;
    }

    @Override // defpackage.yjb
    public <T> T a(String str, Function0<? extends T> function0) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "action");
        return b(str, function0).call();
    }

    public <T> tjb<T> b(String str, Function0<? extends T> function0) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "action");
        return new tjb<>(this.a.a(str), function0);
    }
}
