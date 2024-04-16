package im.threads.business.serviceLocator;

import android.content.Context;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.core.ContextHolder;
import im.threads.business.formatters.JsonFormatter;
import im.threads.business.imageLoading.ImageLoaderOkHttpProvider;
import im.threads.business.preferences.Preferences;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.serviceLocator.core.LocatorContext;
import im.threads.business.serviceLocator.core.LocatorModule;
import im.threads.business.state.ChatState;
import im.threads.business.transport.AuthHeadersProvider;
import im.threads.business.transport.AuthInterceptor;
import im.threads.business.transport.HistoryLoader;
import im.threads.business.transport.MessageParser;
import im.threads.business.transport.OutgoingMessageCreator;
import im.threads.business.transport.threadsGate.ThreadsGateMessageParser;
import im.threads.business.utils.AppInfo;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.ConsultWriter;
import im.threads.business.utils.DemoModeProvider;
import im.threads.business.utils.DeviceInfo;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.internet.NetworkInteractor;
import im.threads.business.utils.internet.NetworkInteractorImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: CoreSLModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lim/threads/business/serviceLocator/core/LocatorModule;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CoreSLModuleKt$coreSLModule$1 extends ej5 implements Function1<LocatorModule, Unit> {
    public static final CoreSLModuleKt$coreSLModule$1 INSTANCE = new CoreSLModuleKt$coreSLModule$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends ej5 implements Function0<Context> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            return ContextHolder.INSTANCE.getContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$10  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass10 extends ej5 implements Function0<ChatUpdateProcessor> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChatUpdateProcessor invoke() {
            return new ChatUpdateProcessor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/internet/NetworkInteractor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$11  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass11 extends ej5 implements Function0<NetworkInteractor> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final NetworkInteractor invoke() {
            return new NetworkInteractorImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/HistoryLoader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$12  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass12 extends ej5 implements Function0<HistoryLoader> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass12(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HistoryLoader invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03 = this.$this_module.getDeclarationRegistry().get(bc9.b(DemoModeProvider.class));
            Object invoke = function03 != null ? function03.invoke() : null;
            if (invoke == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(DemoModeProvider.class))) == null || (invoke = function02.invoke()) == null)) {
                String c = bc9.b(DemoModeProvider.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            DemoModeProvider demoModeProvider = (DemoModeProvider) invoke;
            Function0<Object> function04 = this.$this_module.getDeclarationRegistry().get(bc9.b(AppInfo.class));
            Object invoke2 = function04 != null ? function04.invoke() : null;
            if (invoke2 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(AppInfo.class))) == null || (invoke2 = function0.invoke()) == null)) {
                String c2 = bc9.b(AppInfo.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            return new HistoryLoader(demoModeProvider, (AppInfo) invoke2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/formatters/JsonFormatter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$13  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass13 extends ej5 implements Function0<JsonFormatter> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        AnonymousClass13() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final JsonFormatter invoke() {
            return new JsonFormatter();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/MessageParser;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$14  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass14 extends ej5 implements Function0<MessageParser> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        AnonymousClass14() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MessageParser invoke() {
            return new MessageParser();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/threadsGate/ThreadsGateMessageParser;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$15  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass15 extends ej5 implements Function0<ThreadsGateMessageParser> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass15(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ThreadsGateMessageParser invoke() {
            Function0<Object> function0;
            Function0<Object> function02 = this.$this_module.getDeclarationRegistry().get(bc9.b(MessageParser.class));
            Object invoke = function02 != null ? function02.invoke() : null;
            if (invoke == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(MessageParser.class))) == null || (invoke = function0.invoke()) == null)) {
                String c = bc9.b(MessageParser.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            return new ThreadsGateMessageParser((MessageParser) invoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/AppInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$16  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass16 extends ej5 implements Function0<AppInfo> {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        AnonymousClass16() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AppInfo invoke() {
            return new AppInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/DeviceInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$17  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass17 extends ej5 implements Function0<DeviceInfo> {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        AnonymousClass17() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DeviceInfo invoke() {
            return new DeviceInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/FileProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$18  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass18 extends ej5 implements Function0<FileProvider> {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        AnonymousClass18() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FileProvider invoke() {
            return new FileProvider();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/state/ChatState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$19  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass19 extends ej5 implements Function0<ChatState> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChatState invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03 = this.$this_module.getDeclarationRegistry().get(bc9.b(Preferences.class));
            Object invoke = function03 != null ? function03.invoke() : null;
            if (invoke == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Preferences.class))) == null || (invoke = function02.invoke()) == null)) {
                String c = bc9.b(Preferences.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            Preferences preferences = (Preferences) invoke;
            Function0<Object> function04 = this.$this_module.getDeclarationRegistry().get(bc9.b(ClientUseCase.class));
            Object invoke2 = function04 != null ? function04.invoke() : null;
            if (invoke2 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(ClientUseCase.class))) == null || (invoke2 = function0.invoke()) == null)) {
                String c2 = bc9.b(ClientUseCase.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            return new ChatState(preferences, (ClientUseCase) invoke2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/preferences/Preferences;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends ej5 implements Function0<Preferences> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Preferences invoke() {
            Function0<Object> function0;
            Function0<Object> function02 = this.$this_module.getDeclarationRegistry().get(bc9.b(Context.class));
            Object invoke = function02 != null ? function02.invoke() : null;
            if (invoke == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Context.class))) == null || (invoke = function0.invoke()) == null)) {
                String c = bc9.b(Context.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            return new Preferences((Context) invoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/DemoModeProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$20  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass20 extends ej5 implements Function0<DemoModeProvider> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DemoModeProvider invoke() {
            Function0<Object> function0;
            Function0<Object> function02 = this.$this_module.getDeclarationRegistry().get(bc9.b(Context.class));
            Object invoke = function02 != null ? function02.invoke() : null;
            if (invoke == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Context.class))) == null || (invoke = function0.invoke()) == null)) {
                String c = bc9.b(Context.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            return new DemoModeProvider((Context) invoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/secureDatabase/DatabaseHolder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends ej5 implements Function0<DatabaseHolder> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DatabaseHolder invoke() {
            Function0<Object> function0;
            Function0<Object> function02 = this.$this_module.getDeclarationRegistry().get(bc9.b(Context.class));
            Object invoke = function02 != null ? function02.invoke() : null;
            if (invoke == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Context.class))) == null || (invoke = function0.invoke()) == null)) {
                String c = bc9.b(Context.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            return new DatabaseHolder((Context) invoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/AuthHeadersProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends ej5 implements Function0<AuthHeadersProvider> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AuthHeadersProvider invoke() {
            return new AuthHeadersProvider();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/imageLoading/ImageLoaderOkHttpProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 extends ej5 implements Function0<ImageLoaderOkHttpProvider> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageLoaderOkHttpProvider invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03 = this.$this_module.getDeclarationRegistry().get(bc9.b(AuthHeadersProvider.class));
            Object invoke = function03 != null ? function03.invoke() : null;
            if (invoke == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(AuthHeadersProvider.class))) == null || (invoke = function02.invoke()) == null)) {
                String c = bc9.b(AuthHeadersProvider.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            AuthHeadersProvider authHeadersProvider = (AuthHeadersProvider) invoke;
            Function0<Object> function04 = this.$this_module.getDeclarationRegistry().get(bc9.b(ClientUseCase.class));
            Object invoke2 = function04 != null ? function04.invoke() : null;
            if (invoke2 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(ClientUseCase.class))) == null || (invoke2 = function0.invoke()) == null)) {
                String c2 = bc9.b(ClientUseCase.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            return new ImageLoaderOkHttpProvider(authHeadersProvider, (ClientUseCase) invoke2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/OutgoingMessageCreator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass6 extends ej5 implements Function0<OutgoingMessageCreator> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OutgoingMessageCreator invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03;
            Function0<Object> function04;
            Function0<Object> function05 = this.$this_module.getDeclarationRegistry().get(bc9.b(Preferences.class));
            Object invoke = function05 != null ? function05.invoke() : null;
            if (invoke == null && ((function04 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Preferences.class))) == null || (invoke = function04.invoke()) == null)) {
                String c = bc9.b(Preferences.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            Preferences preferences = (Preferences) invoke;
            Function0<Object> function06 = this.$this_module.getDeclarationRegistry().get(bc9.b(ClientUseCase.class));
            Object invoke2 = function06 != null ? function06.invoke() : null;
            if (invoke2 == null && ((function03 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(ClientUseCase.class))) == null || (invoke2 = function03.invoke()) == null)) {
                String c2 = bc9.b(ClientUseCase.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            ClientUseCase clientUseCase = (ClientUseCase) invoke2;
            Function0<Object> function07 = this.$this_module.getDeclarationRegistry().get(bc9.b(AppInfo.class));
            Object invoke3 = function07 != null ? function07.invoke() : null;
            if (invoke3 == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(AppInfo.class))) == null || (invoke3 = function02.invoke()) == null)) {
                String c3 = bc9.b(AppInfo.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c3).toString());
            }
            AppInfo appInfo = (AppInfo) invoke3;
            Function0<Object> function08 = this.$this_module.getDeclarationRegistry().get(bc9.b(DeviceInfo.class));
            Object invoke4 = function08 != null ? function08.invoke() : null;
            if (invoke4 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(DeviceInfo.class))) == null || (invoke4 = function0.invoke()) == null)) {
                String c4 = bc9.b(DeviceInfo.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c4).toString());
            }
            return new OutgoingMessageCreator(preferences, clientUseCase, appInfo, (DeviceInfo) invoke4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/ClientUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$7  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass7 extends ej5 implements Function0<ClientUseCase> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ClientUseCase invoke() {
            return new ClientUseCase();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/transport/AuthInterceptor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$8  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass8 extends ej5 implements Function0<AuthInterceptor> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AuthInterceptor invoke() {
            Function0<Object> function0;
            Function0<Object> function02;
            Function0<Object> function03 = this.$this_module.getDeclarationRegistry().get(bc9.b(AuthHeadersProvider.class));
            Object invoke = function03 != null ? function03.invoke() : null;
            if (invoke == null && ((function02 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(AuthHeadersProvider.class))) == null || (invoke = function02.invoke()) == null)) {
                String c = bc9.b(AuthHeadersProvider.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            AuthHeadersProvider authHeadersProvider = (AuthHeadersProvider) invoke;
            Function0<Object> function04 = this.$this_module.getDeclarationRegistry().get(bc9.b(ClientUseCase.class));
            Object invoke2 = function04 != null ? function04.invoke() : null;
            if (invoke2 == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(ClientUseCase.class))) == null || (invoke2 = function0.invoke()) == null)) {
                String c2 = bc9.b(ClientUseCase.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c2).toString());
            }
            return new AuthInterceptor(authHeadersProvider, (ClientUseCase) invoke2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreSLModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/utils/ConsultWriter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: im.threads.business.serviceLocator.CoreSLModuleKt$coreSLModule$1$9  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass9 extends ej5 implements Function0<ConsultWriter> {
        final /* synthetic */ LocatorModule $this_module;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(LocatorModule locatorModule) {
            super(0);
            this.$this_module = locatorModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConsultWriter invoke() {
            Function0<Object> function0;
            Function0<Object> function02 = this.$this_module.getDeclarationRegistry().get(bc9.b(Preferences.class));
            Object invoke = function02 != null ? function02.invoke() : null;
            if (invoke == null && ((function0 = LocatorContext.INSTANCE.getLocator().getDeclarations().get(bc9.b(Preferences.class))) == null || (invoke = function0.invoke()) == null)) {
                String c = bc9.b(Preferences.class).c();
                throw new IllegalStateException(("Unable to find declaration of type " + c).toString());
            }
            return new ConsultWriter((Preferences) invoke);
        }
    }

    CoreSLModuleKt$coreSLModule$1() {
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
        locatorModule.getDeclarationRegistry().put(bc9.b(Context.class), AnonymousClass1.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(Preferences.class), new AnonymousClass2(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(DatabaseHolder.class), new AnonymousClass3(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(AuthHeadersProvider.class), AnonymousClass4.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(ImageLoaderOkHttpProvider.class), new AnonymousClass5(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(OutgoingMessageCreator.class), new AnonymousClass6(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(ClientUseCase.class), AnonymousClass7.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(AuthInterceptor.class), new AnonymousClass8(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(ConsultWriter.class), new AnonymousClass9(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(ChatUpdateProcessor.class), AnonymousClass10.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(NetworkInteractor.class), AnonymousClass11.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(HistoryLoader.class), new AnonymousClass12(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(JsonFormatter.class), AnonymousClass13.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(MessageParser.class), AnonymousClass14.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(ThreadsGateMessageParser.class), new AnonymousClass15(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(AppInfo.class), AnonymousClass16.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(DeviceInfo.class), AnonymousClass17.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(FileProvider.class), AnonymousClass18.INSTANCE);
        locatorModule.getDeclarationRegistry().put(bc9.b(ChatState.class), new AnonymousClass19(locatorModule));
        locatorModule.getDeclarationRegistry().put(bc9.b(DemoModeProvider.class), new AnonymousClass20(locatorModule));
    }
}
