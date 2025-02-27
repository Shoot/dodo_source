package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    final int MAX_ERROR_COUNT = 4;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void checkRange() {
        StringBuilder sb;
        String str;
        int i;
        int i2 = this.depthStart;
        if (i2 >= 0 && (i = this.depthEnd) >= 0) {
            if (i2 >= i) {
                sb = new StringBuilder();
                sb.append("Invalid depthEnd range [");
                sb.append(this.depthStart);
                sb.append(", ");
                sb.append(this.depthEnd);
                str = "] (start greater or equal to end)";
            } else {
                return;
            }
        } else {
            sb = new StringBuilder();
            sb.append("Invalid depthStart/depthEnd range [");
            sb.append(this.depthStart);
            sb.append(", ");
            sb.append(this.depthEnd);
            str = "] (negative values are not allowed)";
        }
        sb.append(str);
        addError(sb.toString());
    }

    private boolean isRange(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        StringBuilder sb = new StringBuilder();
        if (this.evaluatorList != null) {
            for (int i = 0; i < this.evaluatorList.size(); i++) {
                try {
                } catch (EvaluationException e) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (!this.evaluatorList.get(i).evaluate(iLoggingEvent)) {
                }
            }
            return "";
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i2 = this.depthStart;
            if (length > i2) {
                int i3 = this.depthEnd;
                if (i3 >= callerData.length) {
                    i3 = callerData.length;
                }
                while (i2 < i3) {
                    sb.append(getCallerLinePrefix());
                    sb.append(i2);
                    sb.append("\t at ");
                    sb.append(callerData[i2]);
                    sb.append(CoreConstants.LINE_SEPARATOR);
                    i2++;
                }
                return sb.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    protected String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    protected String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (isRange(firstOption)) {
                String[] splitRange = splitRange(firstOption);
                if (splitRange.length == 2) {
                    this.depthStart = Integer.parseInt(splitRange[0]);
                    this.depthEnd = Integer.parseInt(splitRange[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.depthEnd = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e) {
            addError("Failed to parse depth option [" + firstOption + "]", e);
        }
        List<String> optionList = getOptionList();
        if (optionList != null && optionList.size() > 1) {
            int size = optionList.size();
            for (int i = 1; i < size; i++) {
                String str = optionList.get(i);
                Context context = getContext();
                if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                    addEvaluator(eventEvaluator);
                }
            }
        }
    }
}
