package im.threads.ui.fragments;

import im.threads.business.logger.LoggerEdna;
import im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1", f = "ChatFragment.kt", l = {845, 850}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$configureUserTypingSubscription$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1$2", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        final /* synthetic */ ca9 $typingIntervalSeconds;
        int label;
        final /* synthetic */ ChatFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "charSequence", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1$2$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends ej5 implements Function1<String, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str) {
                z65.h(str, "charSequence");
                return Boolean.valueOf(str.length() > 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "input", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03632 extends ej5 implements Function1<String, Unit> {
            final /* synthetic */ ChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03632(ChatFragment chatFragment) {
                super(1);
                this.this$0 = chatFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                this.this$0.onInputChanged(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1$2$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends ej5 implements Function1<Throwable, Unit> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                LoggerEdna.error("configureInputChangesSubscription ", th);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChatFragment chatFragment, ca9 ca9Var, cv1<? super AnonymousClass2> cv1Var) {
            super(2, cv1Var);
            this.this$0 = chatFragment;
            this.$typingIntervalSeconds = ca9Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new AnonymousClass2(this.this$0, this.$typingIntervalSeconds, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass2) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            ta0 ta0Var;
            c75.d();
            if (this.label == 0) {
                vk9.b(obj);
                ChatFragment chatFragment = this.this$0;
                ta0Var = chatFragment.inputTextObservable;
                r57<T> t = ta0Var.t(this.$typingIntervalSeconds.a, TimeUnit.SECONDS);
                final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                r57 m = t.k(new oh8() { // from class: im.threads.ui.fragments.h
                    @Override // defpackage.oh8
                    public final boolean b(Object obj2) {
                        boolean invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = ChatFragment$configureUserTypingSubscription$1.AnonymousClass2.invokeSuspend$lambda$0(Function1.this, obj2);
                        return invokeSuspend$lambda$0;
                    }
                }).m(ti.c());
                final C03632 c03632 = new C03632(this.this$0);
                wr1 wr1Var = new wr1() { // from class: im.threads.ui.fragments.i
                    @Override // defpackage.wr1
                    public final void accept(Object obj2) {
                        Function1.this.invoke(obj2);
                    }
                };
                final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
                chatFragment.subscribe(m.p(wr1Var, new wr1() { // from class: im.threads.ui.fragments.j
                    @Override // defpackage.wr1
                    public final void accept(Object obj2) {
                        Function1.this.invoke(obj2);
                    }
                }));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$configureUserTypingSubscription$1(ChatFragment chatFragment, cv1<? super ChatFragment$configureUserTypingSubscription$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$configureUserTypingSubscription$1(this.this$0, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$configureUserTypingSubscription$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(2:57|(1:59))|12|13|14|(5:18|(1:20)(1:25)|21|22|(1:24))|26|(4:28|29|(2:31|(2:33|(1:35)(2:46|47)))|(1:49)(2:50|51))(2:52|(2:54|55))|36|(2:38|39)|40|(1:42)|43|(1:45)|6|7) */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ChatFragment$configureUserTypingSubscription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
