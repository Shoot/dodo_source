package im.threads.business.logger;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogZipSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.logger.LogZipSender$onFileSavingFinished$1", f = "LogZipSender.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LogZipSender$onFileSavingFinished$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $dirPath;
    int label;
    final /* synthetic */ LogZipSender this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LogZipSender.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.business.logger.LogZipSender$onFileSavingFinished$1$1", f = "LogZipSender.kt", l = {}, m = "invokeSuspend")
    /* renamed from: im.threads.business.logger.LogZipSender$onFileSavingFinished$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        final /* synthetic */ File $destinationFile;
        int label;
        final /* synthetic */ LogZipSender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LogZipSender logZipSender, File file, cv1<? super AnonymousClass1> cv1Var) {
            super(2, cv1Var);
            this.this$0 = logZipSender;
            this.$destinationFile = file;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new AnonymousClass1(this.this$0, this.$destinationFile, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.label == 0) {
                vk9.b(obj);
                this.this$0.isSharingWindowWaiting = false;
                this.this$0.shareLogs(this.$destinationFile);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogZipSender$onFileSavingFinished$1(LogZipSender logZipSender, String str, cv1<? super LogZipSender$onFileSavingFinished$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = logZipSender;
        this.$dirPath = str;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new LogZipSender$onFileSavingFinished$1(this.this$0, this.$dirPath, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((LogZipSender$onFileSavingFinished$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        Context context;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            context = this.this$0.context;
            File file = new File(context.getFilesDir(), "zippedLogs.zip");
            this.this$0.zipFolder(this.$dirPath, file.getAbsolutePath());
            t46 c = v33.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, file, null);
            this.label = 1;
            if (qh0.g(c, anonymousClass1, this) == d) {
                return d;
            }
        }
        return Unit.a;
    }
}
