package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SemanticsConfiguration.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Ltaa;", "Liba;", Action.KEY_ATTRIBUTE, "a", "(Ltaa;Liba;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: uaa  reason: default package */
/* loaded from: classes.dex */
public final class uaa {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: uaa$a */
    /* loaded from: classes.dex */
    static final class a<T> extends ej5 implements Function0<T> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(taa taaVar, iba<T> ibaVar) {
        z65.h(taaVar, "<this>");
        z65.h(ibaVar, Action.KEY_ATTRIBUTE);
        return (T) taaVar.u(ibaVar, a.a);
    }
}
