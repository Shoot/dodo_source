package im.threads.business.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.core.ThreadsLibBase$Companion$loadRamPrefs$1", f = "ThreadsLibBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThreadsLibBase$Companion$loadRamPrefs$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $migratePreference;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLibBase$Companion$loadRamPrefs$1(Function0<Unit> function0, Context context, cv1<? super ThreadsLibBase$Companion$loadRamPrefs$1> cv1Var) {
        super(2, cv1Var);
        this.$migratePreference = function0;
        this.$context = context;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ThreadsLibBase$Companion$loadRamPrefs$1(this.$migratePreference, this.$context, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsLibBase$Companion$loadRamPrefs$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            ThreadsLibBase.Companion.loadPreferencesInRam(this.$migratePreference, this.$context);
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
