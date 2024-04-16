package im.threads.ui.fragments;

import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$initSearch$1$1", f = "ChatFragment.kt", l = {2218}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$initSearch$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ fr6<String> $searchQueryChannel;
    final /* synthetic */ EccFragmentChatBinding $this_apply;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$initSearch$1$1(fr6<String> fr6Var, EccFragmentChatBinding eccFragmentChatBinding, cv1<? super ChatFragment$initSearch$1$1> cv1Var) {
        super(2, cv1Var);
        this.$searchQueryChannel = fr6Var;
        this.$this_apply = eccFragmentChatBinding;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$initSearch$1$1(this.$searchQueryChannel, this.$this_apply, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$initSearch$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            fr6<String> fr6Var = this.$searchQueryChannel;
            final EccFragmentChatBinding eccFragmentChatBinding = this.$this_apply;
            pz3<? super String> pz3Var = new pz3() { // from class: im.threads.ui.fragments.ChatFragment$initSearch$1$1.1
                @Override // defpackage.pz3
                public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                    return emit((String) obj2, (cv1<? super Unit>) cv1Var);
                }

                public final Object emit(String str, cv1<? super Unit> cv1Var) {
                    boolean y;
                    if (str != null) {
                        y = l0b.y(str);
                        if (!y && str.length() > 2) {
                            ViewExtensionsKt.visible(EccFragmentChatBinding.this.searchListView);
                            return Unit.a;
                        }
                    }
                    ViewExtensionsKt.gone(EccFragmentChatBinding.this.searchListView);
                    return Unit.a;
                }
            };
            this.label = 1;
            if (fr6Var.collect(pz3Var, this) == d) {
                return d;
            }
        }
        throw new KotlinNothingValueException();
    }
}
