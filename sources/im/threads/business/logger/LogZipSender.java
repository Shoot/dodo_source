package im.threads.business.logger;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.business.logger.LoggerConfig;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.FileProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: LogZipSender.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J'\u0010\u000b\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lim/threads/business/logger/LogZipSender;", "", "", "onFileSavingFinished", "", "srcFolder", "destZipFile", "zipFolder", "", "filesToZip", "zipFileName", "zip", "([Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "shareLogs", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lim/threads/business/utils/FileProvider;", "fileProvider", "Lim/threads/business/utils/FileProvider;", "Lqx1;", "coroutineScope", "Lqx1;", "", "isSharingWindowWaiting", "Z", "<init>", "(Landroid/content/Context;Lim/threads/business/utils/FileProvider;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LogZipSender {
    private final Context context;
    private final qx1 coroutineScope;
    private final FileProvider fileProvider;
    private boolean isSharingWindowWaiting;

    /* compiled from: LogZipSender.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "im.threads.business.logger.LogZipSender$1", f = "LogZipSender.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: im.threads.business.logger.LogZipSender$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int label;

        AnonymousClass1(cv1<? super AnonymousClass1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new AnonymousClass1(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((AnonymousClass1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                cr6<Boolean> flushIsFinishedFlow = LoggerFileThread.Companion.getFlushIsFinishedFlow();
                final LogZipSender logZipSender = LogZipSender.this;
                pz3<? super Boolean> pz3Var = new pz3() { // from class: im.threads.business.logger.LogZipSender.1.1
                    @Override // defpackage.pz3
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                        return emit(((Boolean) obj2).booleanValue(), cv1Var);
                    }

                    public final Object emit(boolean z, cv1<? super Unit> cv1Var) {
                        if (LogZipSender.this.isSharingWindowWaiting) {
                            LogZipSender.this.onFileSavingFinished();
                        }
                        return Unit.a;
                    }
                };
                this.label = 1;
                if (flushIsFinishedFlow.collect(pz3Var, this) == d) {
                    return d;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public LogZipSender(Context context, FileProvider fileProvider) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(fileProvider, "fileProvider");
        this.context = context;
        this.fileProvider = fileProvider;
        qx1 a = rx1.a(v33.b());
        this.coroutineScope = a;
        sh0.d(a, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFileSavingFinished() {
        String str;
        LoggerConfig.Builder builder;
        LoggerConfig config = LoggerConfig.Companion.getConfig();
        if (config != null && (builder = config.getBuilder()) != null) {
            str = builder.getDirPath$threads_release();
        } else {
            str = null;
        }
        if (str != null) {
            sh0.d(this.coroutineScope, null, null, new LogZipSender$onFileSavingFinished$1(this, str, null), 3, null);
        } else {
            Balloon.show(this.context, "Cannot send logs. Logs directory is null");
        }
    }

    private final void zip(String[] strArr, String str) {
        int e0;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
            byte[] bArr = new byte[80000];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                LoggerEdna.verbose("Compress", "Adding: " + str2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(strArr[i]));
                String str3 = strArr[i];
                e0 = m0b.e0(str3, "/", 0, false, 6, null);
                String substring = str3.substring(e0 + 1);
                z65.g(substring, "this as java.lang.String).substring(startIndex)");
                zipOutputStream.putNextEntry(new ZipEntry(substring));
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                bufferedInputStream.close();
            }
            zipOutputStream.close();
            LoggerEdna.info("Logs zipped");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zipFolder(String str, String str2) {
        String[] strArr;
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file2 : listFiles) {
                    arrayList.add(file2.getAbsolutePath());
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            } else {
                strArr = null;
            }
            if (strArr != null && str2 != null) {
                zip(strArr, str2);
            }
        }
    }

    public final void shareLogs() {
        LoggerConfig.Builder builder;
        LoggerConfig config = LoggerConfig.Companion.getConfig();
        if (((config == null || (builder = config.getBuilder()) == null) ? null : builder.getDirPath$threads_release()) == null) {
            Balloon.show(this.context, "Cannot send logs. Logs directory is null");
            return;
        }
        this.isSharingWindowWaiting = true;
        LoggerEdna.flushLogs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareLogs(File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        String absolutePath = file.getAbsolutePath();
        LoggerEdna.info("Sharing zipped logs with path: " + absolutePath);
        if (file.exists()) {
            intent.setType("application/zip");
            intent.setFlags(268435456);
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", this.fileProvider.getUriForFile(this.context, file));
            this.context.startActivity(Intent.createChooser(intent, "Share file"));
        }
    }
}
