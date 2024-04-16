package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class TimeBasedRollingPolicy<E> extends RollingPolicyBase implements TriggeringPolicy<E> {
    static final String FNP_NOT_SET = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";
    private ArchiveRemover archiveRemover;
    Future<?> cleanUpFuture;
    Future<?> compressionFuture;
    private Compressor compressor;
    FileNamePattern fileNamePatternWithoutCompSuffix;
    TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy;
    private RenameUtil renameUtil = new RenameUtil();
    private int maxHistory = 0;
    protected FileSize totalSizeCap = new FileSize(0);
    boolean cleanHistoryOnStart = false;

    private String transformFileNamePattern2ZipEntry(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str));
    }

    private void waitForAsynchronousJobToStop(Future<?> future, String str) {
        StringBuilder sb;
        String str2;
        if (future != null) {
            try {
                future.get(30L, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e = e;
                sb = new StringBuilder();
                str2 = "Timeout while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str2 = "Unexpected exception while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            }
        }
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        String parentsRawFileProperty = getParentsRawFileProperty();
        if (parentsRawFileProperty != null) {
            return parentsRawFileProperty;
        }
        return this.timeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix();
    }

    public int getMaxHistory() {
        return this.maxHistory;
    }

    public TimeBasedFileNamingAndTriggeringPolicy<E> getTimeBasedFileNamingAndTriggeringPolicy() {
        return this.timeBasedFileNamingAndTriggeringPolicy;
    }

    public boolean isCleanHistoryOnStart() {
        return this.cleanHistoryOnStart;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        return this.timeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(file, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isUnboundedTotalSizeCap() {
        if (this.totalSizeCap.getSize() == 0) {
            return true;
        }
        return false;
    }

    Future<?> renameRawAndAsyncCompress(String str, String str2) throws RolloverFailure {
        String str3 = str + System.nanoTime() + ".tmp";
        this.renameUtil.rename(getParentsRawFileProperty(), str3);
        return this.compressor.asyncCompress(str3, str, str2);
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        Future<?> renameRawAndAsyncCompress;
        String elapsedPeriodsFileName = this.timeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName();
        String afterLastSlash = FileFilterUtil.afterLastSlash(elapsedPeriodsFileName);
        if (this.compressionMode == CompressionMode.NONE) {
            if (getParentsRawFileProperty() != null) {
                this.renameUtil.rename(getParentsRawFileProperty(), elapsedPeriodsFileName);
            }
        } else {
            if (getParentsRawFileProperty() == null) {
                renameRawAndAsyncCompress = this.compressor.asyncCompress(elapsedPeriodsFileName, elapsedPeriodsFileName, afterLastSlash);
            } else {
                renameRawAndAsyncCompress = renameRawAndAsyncCompress(elapsedPeriodsFileName, afterLastSlash);
            }
            this.compressionFuture = renameRawAndAsyncCompress;
        }
        if (this.archiveRemover != null) {
            this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
        }
    }

    public void setCleanHistoryOnStart(boolean z) {
        this.cleanHistoryOnStart = z;
    }

    public void setMaxHistory(int i) {
        this.maxHistory = i;
    }

    public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy) {
        this.timeBasedFileNamingAndTriggeringPolicy = timeBasedFileNamingAndTriggeringPolicy;
    }

    public void setTotalSizeCap(FileSize fileSize) {
        addInfo("setting totalSizeCap to " + fileSize.toString());
        this.totalSizeCap = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.renameUtil.setContext(this.context);
        if (this.fileNamePatternStr != null) {
            this.fileNamePattern = new FileNamePattern(this.fileNamePatternStr, this.context);
            determineCompressionMode();
            Compressor compressor = new Compressor(this.compressionMode);
            this.compressor = compressor;
            compressor.setContext(this.context);
            this.fileNamePatternWithoutCompSuffix = new FileNamePattern(Compressor.computeFileNameStrWithoutCompSuffix(this.fileNamePatternStr, this.compressionMode), this.context);
            addInfo("Will use the pattern " + this.fileNamePatternWithoutCompSuffix + " for the active file");
            if (this.compressionMode == CompressionMode.ZIP) {
                this.zipEntryFileNamePattern = new FileNamePattern(transformFileNamePattern2ZipEntry(this.fileNamePatternStr), this.context);
            }
            if (this.timeBasedFileNamingAndTriggeringPolicy == null) {
                this.timeBasedFileNamingAndTriggeringPolicy = new DefaultTimeBasedFileNamingAndTriggeringPolicy();
            }
            this.timeBasedFileNamingAndTriggeringPolicy.setContext(this.context);
            this.timeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(this);
            this.timeBasedFileNamingAndTriggeringPolicy.start();
            if (!this.timeBasedFileNamingAndTriggeringPolicy.isStarted()) {
                addWarn("Subcomponent did not start. TimeBasedRollingPolicy will not start.");
                return;
            }
            if (this.maxHistory != 0) {
                ArchiveRemover archiveRemover = this.timeBasedFileNamingAndTriggeringPolicy.getArchiveRemover();
                this.archiveRemover = archiveRemover;
                archiveRemover.setMaxHistory(this.maxHistory);
                this.archiveRemover.setTotalSizeCap(this.totalSizeCap.getSize());
                if (this.cleanHistoryOnStart) {
                    addInfo("Cleaning on start up");
                    this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
                }
            } else if (!isUnboundedTotalSizeCap()) {
                addWarn("'maxHistory' is not set, ignoring 'totalSizeCap' option with value [" + this.totalSizeCap + "]");
            }
            super.start();
            return;
        }
        addWarn(FNP_NOT_SET);
        addWarn(CoreConstants.SEE_FNP_NOT_SET);
        throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (!isStarted()) {
            return;
        }
        waitForAsynchronousJobToStop(this.compressionFuture, "compression");
        waitForAsynchronousJobToStop(this.cleanUpFuture, "clean-up");
        super.stop();
    }

    public String toString() {
        return "c.q.l.core.rolling.TimeBasedRollingPolicy@" + hashCode();
    }
}
