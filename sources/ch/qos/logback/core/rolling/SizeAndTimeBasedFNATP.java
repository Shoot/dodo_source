package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
@NoAutoStart
/* loaded from: classes.dex */
public class SizeAndTimeBasedFNATP<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    static String MISSING_DATE_TOKEN = "Missing date token, that is %d, in FileNamePattern [";
    static String MISSING_INT_TOKEN = "Missing integer token, that is %i, in FileNamePattern [";
    int currentPeriodsCounter;
    FileSize maxFileSize;
    private final Usage usage;

    /* loaded from: classes.dex */
    enum Usage {
        EMBEDDED,
        DIRECT
    }

    public SizeAndTimeBasedFNATP() {
        this(Usage.DIRECT);
    }

    private boolean validDateAndIntegerTokens() {
        boolean z;
        if (this.tbrp.fileNamePattern.getIntegerTokenConverter() == null) {
            addError(MISSING_INT_TOKEN + this.tbrp.fileNamePatternStr + "]");
            addError(CoreConstants.SEE_MISSING_INTEGER_TOKEN);
            z = true;
        } else {
            z = false;
        }
        if (this.tbrp.fileNamePattern.getPrimaryDateTokenConverter() == null) {
            addError(MISSING_DATE_TOKEN + this.tbrp.fileNamePatternStr + "]");
            z = true;
        }
        return !z;
    }

    void computeCurrentPeriodsHighestCounterValue(String str) {
        File[] filesInFolderMatchingStemRegex = FileFilterUtil.filesInFolderMatchingStemRegex(new File(getCurrentPeriodsFileNameWithoutCompressionSuffix()).getParentFile(), str);
        if (filesInFolderMatchingStemRegex != null && filesInFolderMatchingStemRegex.length != 0) {
            this.currentPeriodsCounter = FileFilterUtil.findHighestCounter(filesInFolderMatchingStemRegex, str);
            if (this.tbrp.getParentsRawFileProperty() != null || this.tbrp.compressionMode != CompressionMode.NONE) {
                this.currentPeriodsCounter++;
                return;
            }
            return;
        }
        this.currentPeriodsCounter = 0;
    }

    protected ArchiveRemover createArchiveRemover() {
        return new SizeAndTimeBasedArchiveRemover(this.tbrp.fileNamePattern, this.rc, new DefaultFileProvider());
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        String str;
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
            this.currentPeriodsCounter = 0;
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        }
        if (file == null) {
            str = "activeFile == null";
        } else if (this.maxFileSize == null) {
            str = "maxFileSize = null";
        } else if (file.length() < this.maxFileSize.getSize()) {
            return false;
        } else {
            this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
            this.currentPeriodsCounter++;
            return true;
        }
        addWarn(str);
        return false;
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (this.usage == Usage.DIRECT) {
            addWarn(CoreConstants.SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED);
            addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (!super.isErrorFree()) {
            return;
        }
        if (this.maxFileSize == null) {
            addError("maxFileSize property is mandatory.");
            withErrors();
        }
        if (!validDateAndIntegerTokens()) {
            withErrors();
            return;
        }
        ArchiveRemover createArchiveRemover = createArchiveRemover();
        this.archiveRemover = createArchiveRemover;
        createArchiveRemover.setContext(this.context);
        computeCurrentPeriodsHighestCounterValue(FileFilterUtil.afterLastSlash(this.tbrp.fileNamePattern.toRegexForFixedDate(this.dateInCurrentPeriod)));
        if (isErrorFree()) {
            this.started = true;
        }
    }

    public SizeAndTimeBasedFNATP(Usage usage) {
        this.currentPeriodsCounter = 0;
        this.usage = usage;
    }
}
