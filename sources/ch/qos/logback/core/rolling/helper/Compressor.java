package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.util.concurrent.Future;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public class Compressor extends ContextAwareBase {
    static final int BUFFER_SIZE = 8192;
    final CompressionMode compressionMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.rolling.helper.Compressor$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    class CompressionRunnable implements Runnable {
        final String innerEntryName;
        final String nameOfCompressedFile;
        final String nameOfFile2Compress;

        CompressionRunnable(String str, String str2, String str3) {
            this.nameOfFile2Compress = str;
            this.nameOfCompressedFile = str2;
            this.innerEntryName = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Compressor.this.compress(this.nameOfFile2Compress, this.nameOfCompressedFile, this.innerEntryName);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int i;
        int length = str.length();
        int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[compressionMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return str;
                }
                throw new IllegalStateException("Execution should not reach this point");
            } else if (str.endsWith(".zip")) {
                i = length - 4;
            } else {
                return str;
            }
        } else if (str.endsWith(".gz")) {
            i = length - 3;
        } else {
            return str;
        }
        return str.substring(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void gzCompress(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.gzCompress(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zipCompress(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.zipCompress(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public Future<?> asyncCompress(String str, String str2, String str3) throws RolloverFailure {
        return this.context.getScheduledExecutorService().submit(new CompressionRunnable(str, str2, str3));
    }

    public void compress(String str, String str2, String str3) {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[this.compressionMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw new UnsupportedOperationException("compress method called in NONE compression mode");
                }
                return;
            }
            zipCompress(str, str2, str3);
            return;
        }
        gzCompress(str, str2);
    }

    ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }

    void createMissingTargetDirsIfNecessary(File file) {
        if (!FileUtil.createMissingParentDirectories(file)) {
            addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
        }
    }

    public String toString() {
        return getClass().getName();
    }

    ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.compressionMode));
    }
}
