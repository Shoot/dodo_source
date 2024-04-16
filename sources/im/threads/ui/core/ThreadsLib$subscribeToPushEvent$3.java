package im.threads.ui.core;

import android.os.Bundle;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.config.Config;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLib.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.core.ThreadsLib$subscribeToPushEvent$3", f = "ThreadsLib.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThreadsLib$subscribeToPushEvent$3 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ThreadsLib this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLib$subscribeToPushEvent$3(ThreadsLib threadsLib, cv1<? super ThreadsLib$subscribeToPushEvent$3> cv1Var) {
        super(2, cv1Var);
        this.this$0 = threadsLib;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ThreadsLib$subscribeToPushEvent$3(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsLib$subscribeToPushEvent$3) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            cr6<Bundle> pushBundleStateFlow$threads_release = ChatCenterPushMessageHelper.Companion.getPushBundleStateFlow$threads_release();
            final ThreadsLib threadsLib = this.this$0;
            pz3<? super Bundle> pz3Var = new pz3() { // from class: im.threads.ui.core.ThreadsLib$subscribeToPushEvent$3.1
                @Override // defpackage.pz3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                    return emit((Bundle) obj2, (cv1<? super Unit>) cv1Var);
                }

                public final Object emit(Bundle bundle, cv1<? super Unit> cv1Var) {
                    ChatCenterPushMessageHelper chatCenterPushMessageHelper;
                    Config config;
                    if (bundle != null) {
                        chatCenterPushMessageHelper = ThreadsLib.this.getChatCenterPushMessageHelper();
                        config = ThreadsLib.this.getConfig();
                        chatCenterPushMessageHelper.processPush$threads_release(config.context, bundle);
                    }
                    return Unit.a;
                }
            };
            this.label = 1;
            if (pushBundleStateFlow$threads_release.collect(pz3Var, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }
}
