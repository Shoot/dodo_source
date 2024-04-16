package im.threads.ui.serviceLocator;

import android.content.Context;
import im.threads.business.preferences.Preferences;
import im.threads.business.serviceLocator.core.LocatorContext;
import im.threads.business.serviceLocator.core.LocatorModule;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.styles.StyleUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: ServiceLocatorModules.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lim/threads/business/serviceLocator/core/LocatorModule;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ServiceLocatorModulesKt$uiSLModule$1 extends ej5 implements Function1<LocatorModule, Unit> {
    public static final ServiceLocatorModulesKt$uiSLModule$1 INSTANCE = new ServiceLocatorModulesKt$uiSLModule$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceLocatorModules.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/ui/ChatCenterPushMessageHelper;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.ui.serviceLocator.ServiceLocatorModulesKt$uiSLModule$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function0<ChatCenterPushMessageHelper> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChatCenterPushMessageHelper invoke() {
            return new ChatCenterPushMessageHelper();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceLocatorModules.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/ui/styles/StyleUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.ui.serviceLocator.ServiceLocatorModulesKt$uiSLModule$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends ej5 implements Function0<StyleUseCase> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StyleUseCase invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03 = this.$this_module.getDeclarationRegistry().get(bc9.b(Preferences.class));
            Object invoke = function03 != null ? function03.invoke() : null;
            if (invoke == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Preferences.class))) == null || (invoke = function02.invoke()) == null)) {
                String c = bc9.b(Preferences.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            Preferences preferences = (Preferences) invoke;
            Function0<Object> function04 = this.$this_module.getDeclarationRegistry().get(bc9.b(Context.class));
            Object invoke2 = function04 != null ? function04.invoke() : null;
            if (invoke2 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Context.class))) == null || (invoke2 = function0.invoke()) == null)) {
                String c2 = bc9.b(Context.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            return new StyleUseCase(preferences, (Context) invoke2);
        }
    }

    ServiceLocatorModulesKt$uiSLModule$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocatorModule locatorModule) {
        invoke2(locatorModule);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LocatorModule locatorModule) {
        z65.h(locatorModule, "$this$module");
        locatorModule.getDeclarationRegistry().put(bc9.b(ChatCenterPushMessageHelper.class), AnonymousClass1.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(StyleUseCase.class), new AnonymousClass2(locatorModule));
    }
}
