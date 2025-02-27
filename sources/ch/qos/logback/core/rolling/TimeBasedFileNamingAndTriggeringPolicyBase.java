package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class TimeBasedFileNamingAndTriggeringPolicyBase<E> extends ContextAwareBase implements TimeBasedFileNamingAndTriggeringPolicy<E> {
    private static String COLLIDING_DATE_FORMAT_URL = "http://logback.qos.ch/codes.html#rfa_collision_in_dateFormat";
    protected String elapsedPeriodsFileName;
    protected long nextCheck;
    protected RollingCalendar rc;
    protected TimeBasedRollingPolicy<E> tbrp;
    protected ArchiveRemover archiveRemover = null;
    protected long artificialCurrentTime = -1;
    protected Date dateInCurrentPeriod = null;
    protected boolean started = false;
    protected boolean errorFree = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public void computeNextCheck() {
        this.nextCheck = this.rc.getNextTriggeringDate(this.dateInCurrentPeriod).getTime();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public ArchiveRemover getArchiveRemover() {
        return this.archiveRemover;
    }

    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convert(this.dateInCurrentPeriod);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public long getCurrentTime() {
        long j = this.artificialCurrentTime;
        if (j >= 0) {
            return j;
        }
        return System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getElapsedPeriodsFileName() {
        return this.elapsedPeriodsFileName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isErrorFree() {
        return this.errorFree;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setCurrentTime(long j) {
        this.artificialCurrentTime = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDateInCurrentPeriod(long j) {
        this.dateInCurrentPeriod.setTime(j);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy<E> timeBasedRollingPolicy) {
        this.tbrp = timeBasedRollingPolicy;
    }

    public void start() {
        RollingCalendar rollingCalendar;
        DateTokenConverter<Object> primaryDateTokenConverter = this.tbrp.fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter != null) {
            if (primaryDateTokenConverter.getTimeZone() != null) {
                rollingCalendar = new RollingCalendar(primaryDateTokenConverter.getDatePattern(), primaryDateTokenConverter.getTimeZone(), Locale.US);
            } else {
                rollingCalendar = new RollingCalendar(primaryDateTokenConverter.getDatePattern());
            }
            this.rc = rollingCalendar;
            addInfo("The date pattern is '" + primaryDateTokenConverter.getDatePattern() + "' from file name pattern '" + this.tbrp.fileNamePattern.getPattern() + "'.");
            this.rc.printPeriodicity(this);
            if (!this.rc.isCollisionFree()) {
                addError("The date format in FileNamePattern will result in collisions in the names of archived log files.");
                addError(COLLIDING_DATE_FORMAT_URL);
                withErrors();
                return;
            }
            setDateInCurrentPeriod(new Date(getCurrentTime()));
            if (this.tbrp.getParentsRawFileProperty() != null) {
                File file = new File(this.tbrp.getParentsRawFileProperty());
                if (file.exists() && file.canRead()) {
                    setDateInCurrentPeriod(new Date(file.lastModified()));
                }
            }
            addInfo("Setting initial period to " + this.dateInCurrentPeriod);
            computeNextCheck();
            return;
        }
        throw new IllegalStateException("FileNamePattern [" + this.tbrp.fileNamePattern.getPattern() + "] does not contain a valid DateToken");
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void withErrors() {
        this.errorFree = false;
    }

    public void setDateInCurrentPeriod(Date date) {
        this.dateInCurrentPeriod = date;
    }
}
